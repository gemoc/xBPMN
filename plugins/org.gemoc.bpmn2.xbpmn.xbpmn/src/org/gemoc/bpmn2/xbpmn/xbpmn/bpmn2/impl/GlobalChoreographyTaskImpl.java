/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalChoreographyTask;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Participant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.GlobalChoreographyTaskImpl#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalChoreographyTaskImpl extends ChoreographyImpl implements GlobalChoreographyTask {
	/**
	 * The cached value of the '{@link #getInitiatingParticipantRef() <em>Initiating Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatingParticipantRef()
	 * @generated
	 * @ordered
	 */
	protected Participant initiatingParticipantRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalChoreographyTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getGlobalChoreographyTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Participant getInitiatingParticipantRef() {
		if (initiatingParticipantRef != null && initiatingParticipantRef.eIsProxy()) {
			InternalEObject oldInitiatingParticipantRef = (InternalEObject)initiatingParticipantRef;
			initiatingParticipantRef = (Participant)eResolveProxy(oldInitiatingParticipantRef);
			if (initiatingParticipantRef != oldInitiatingParticipantRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF, oldInitiatingParticipantRef, initiatingParticipantRef));
			}
		}
		return initiatingParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant basicGetInitiatingParticipantRef() {
		return initiatingParticipantRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitiatingParticipantRef(Participant newInitiatingParticipantRef) {
		Participant oldInitiatingParticipantRef = initiatingParticipantRef;
		initiatingParticipantRef = newInitiatingParticipantRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF, oldInitiatingParticipantRef, initiatingParticipantRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF:
				if (resolve) return getInitiatingParticipantRef();
				return basicGetInitiatingParticipantRef();
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
			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF:
				setInitiatingParticipantRef((Participant)newValue);
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
			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF:
				setInitiatingParticipantRef((Participant)null);
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
			case Bpmn2Package.GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF:
				return initiatingParticipantRef != null;
		}
		return super.eIsSet(featureID);
	}

} //GlobalChoreographyTaskImpl