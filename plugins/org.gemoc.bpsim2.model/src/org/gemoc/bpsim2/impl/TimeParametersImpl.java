/**
 */
package org.gemoc.bpsim2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.Parameter;
import org.gemoc.bpsim2.TimeParameters;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getTransferTime <em>Transfer Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getQueueTime <em>Queue Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getWaitTime <em>Wait Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getSetUpTime <em>Set Up Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getValidationTime <em>Validation Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getReworkTime <em>Rework Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getLagTime <em>Lag Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.TimeParametersImpl#getElapsedTime <em>Elapsed Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeParametersImpl extends MinimalEObjectImpl.Container implements TimeParameters {
	/**
	 * The cached value of the '{@link #getTransferTime() <em>Transfer Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferTime()
	 * @generated
	 * @ordered
	 */
	protected Parameter transferTime;

	/**
	 * The cached value of the '{@link #getQueueTime() <em>Queue Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueTime()
	 * @generated
	 * @ordered
	 */
	protected Parameter queueTime;

	/**
	 * The cached value of the '{@link #getWaitTime() <em>Wait Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTime()
	 * @generated
	 * @ordered
	 */
	protected Parameter waitTime;

	/**
	 * The cached value of the '{@link #getSetUpTime() <em>Set Up Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetUpTime()
	 * @generated
	 * @ordered
	 */
	protected Parameter setUpTime;

	/**
	 * The cached value of the '{@link #getProcessingTime() <em>Processing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingTime()
	 * @generated
	 * @ordered
	 */
	protected Parameter processingTime;

	/**
	 * The cached value of the '{@link #getValidationTime() <em>Validation Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationTime()
	 * @generated
	 * @ordered
	 */
	protected Parameter validationTime;

	/**
	 * The cached value of the '{@link #getReworkTime() <em>Rework Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReworkTime()
	 * @generated
	 * @ordered
	 */
	protected Parameter reworkTime;

	/**
	 * The cached value of the '{@link #getLagTime() <em>Lag Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLagTime()
	 * @generated
	 * @ordered
	 */
	protected Parameter lagTime;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Parameter duration;

	/**
	 * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected Parameter elapsedTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpsim2Package.Literals.TIME_PARAMETERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getTransferTime() {
		return transferTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferTime(Parameter newTransferTime, NotificationChain msgs) {
		Parameter oldTransferTime = transferTime;
		transferTime = newTransferTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__TRANSFER_TIME, oldTransferTime, newTransferTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferTime(Parameter newTransferTime) {
		if (newTransferTime != transferTime) {
			NotificationChain msgs = null;
			if (transferTime != null)
				msgs = ((InternalEObject)transferTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__TRANSFER_TIME, null, msgs);
			if (newTransferTime != null)
				msgs = ((InternalEObject)newTransferTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__TRANSFER_TIME, null, msgs);
			msgs = basicSetTransferTime(newTransferTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__TRANSFER_TIME, newTransferTime, newTransferTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getQueueTime() {
		return queueTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueueTime(Parameter newQueueTime, NotificationChain msgs) {
		Parameter oldQueueTime = queueTime;
		queueTime = newQueueTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__QUEUE_TIME, oldQueueTime, newQueueTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueTime(Parameter newQueueTime) {
		if (newQueueTime != queueTime) {
			NotificationChain msgs = null;
			if (queueTime != null)
				msgs = ((InternalEObject)queueTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__QUEUE_TIME, null, msgs);
			if (newQueueTime != null)
				msgs = ((InternalEObject)newQueueTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__QUEUE_TIME, null, msgs);
			msgs = basicSetQueueTime(newQueueTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__QUEUE_TIME, newQueueTime, newQueueTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getWaitTime() {
		return waitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaitTime(Parameter newWaitTime, NotificationChain msgs) {
		Parameter oldWaitTime = waitTime;
		waitTime = newWaitTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__WAIT_TIME, oldWaitTime, newWaitTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaitTime(Parameter newWaitTime) {
		if (newWaitTime != waitTime) {
			NotificationChain msgs = null;
			if (waitTime != null)
				msgs = ((InternalEObject)waitTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__WAIT_TIME, null, msgs);
			if (newWaitTime != null)
				msgs = ((InternalEObject)newWaitTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__WAIT_TIME, null, msgs);
			msgs = basicSetWaitTime(newWaitTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__WAIT_TIME, newWaitTime, newWaitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getSetUpTime() {
		return setUpTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetUpTime(Parameter newSetUpTime, NotificationChain msgs) {
		Parameter oldSetUpTime = setUpTime;
		setUpTime = newSetUpTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__SET_UP_TIME, oldSetUpTime, newSetUpTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetUpTime(Parameter newSetUpTime) {
		if (newSetUpTime != setUpTime) {
			NotificationChain msgs = null;
			if (setUpTime != null)
				msgs = ((InternalEObject)setUpTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__SET_UP_TIME, null, msgs);
			if (newSetUpTime != null)
				msgs = ((InternalEObject)newSetUpTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__SET_UP_TIME, null, msgs);
			msgs = basicSetSetUpTime(newSetUpTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__SET_UP_TIME, newSetUpTime, newSetUpTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getProcessingTime() {
		return processingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingTime(Parameter newProcessingTime, NotificationChain msgs) {
		Parameter oldProcessingTime = processingTime;
		processingTime = newProcessingTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__PROCESSING_TIME, oldProcessingTime, newProcessingTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingTime(Parameter newProcessingTime) {
		if (newProcessingTime != processingTime) {
			NotificationChain msgs = null;
			if (processingTime != null)
				msgs = ((InternalEObject)processingTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__PROCESSING_TIME, null, msgs);
			if (newProcessingTime != null)
				msgs = ((InternalEObject)newProcessingTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__PROCESSING_TIME, null, msgs);
			msgs = basicSetProcessingTime(newProcessingTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__PROCESSING_TIME, newProcessingTime, newProcessingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getValidationTime() {
		return validationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidationTime(Parameter newValidationTime, NotificationChain msgs) {
		Parameter oldValidationTime = validationTime;
		validationTime = newValidationTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__VALIDATION_TIME, oldValidationTime, newValidationTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationTime(Parameter newValidationTime) {
		if (newValidationTime != validationTime) {
			NotificationChain msgs = null;
			if (validationTime != null)
				msgs = ((InternalEObject)validationTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__VALIDATION_TIME, null, msgs);
			if (newValidationTime != null)
				msgs = ((InternalEObject)newValidationTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__VALIDATION_TIME, null, msgs);
			msgs = basicSetValidationTime(newValidationTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__VALIDATION_TIME, newValidationTime, newValidationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getReworkTime() {
		return reworkTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReworkTime(Parameter newReworkTime, NotificationChain msgs) {
		Parameter oldReworkTime = reworkTime;
		reworkTime = newReworkTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__REWORK_TIME, oldReworkTime, newReworkTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReworkTime(Parameter newReworkTime) {
		if (newReworkTime != reworkTime) {
			NotificationChain msgs = null;
			if (reworkTime != null)
				msgs = ((InternalEObject)reworkTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__REWORK_TIME, null, msgs);
			if (newReworkTime != null)
				msgs = ((InternalEObject)newReworkTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__REWORK_TIME, null, msgs);
			msgs = basicSetReworkTime(newReworkTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__REWORK_TIME, newReworkTime, newReworkTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getLagTime() {
		return lagTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLagTime(Parameter newLagTime, NotificationChain msgs) {
		Parameter oldLagTime = lagTime;
		lagTime = newLagTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__LAG_TIME, oldLagTime, newLagTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLagTime(Parameter newLagTime) {
		if (newLagTime != lagTime) {
			NotificationChain msgs = null;
			if (lagTime != null)
				msgs = ((InternalEObject)lagTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__LAG_TIME, null, msgs);
			if (newLagTime != null)
				msgs = ((InternalEObject)newLagTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__LAG_TIME, null, msgs);
			msgs = basicSetLagTime(newLagTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__LAG_TIME, newLagTime, newLagTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Parameter newDuration, NotificationChain msgs) {
		Parameter oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Parameter newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElapsedTime(Parameter newElapsedTime, NotificationChain msgs) {
		Parameter oldElapsedTime = elapsedTime;
		elapsedTime = newElapsedTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__ELAPSED_TIME, oldElapsedTime, newElapsedTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElapsedTime(Parameter newElapsedTime) {
		if (newElapsedTime != elapsedTime) {
			NotificationChain msgs = null;
			if (elapsedTime != null)
				msgs = ((InternalEObject)elapsedTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__ELAPSED_TIME, null, msgs);
			if (newElapsedTime != null)
				msgs = ((InternalEObject)newElapsedTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Bpsim2Package.TIME_PARAMETERS__ELAPSED_TIME, null, msgs);
			msgs = basicSetElapsedTime(newElapsedTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.TIME_PARAMETERS__ELAPSED_TIME, newElapsedTime, newElapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bpsim2Package.TIME_PARAMETERS__TRANSFER_TIME:
				return basicSetTransferTime(null, msgs);
			case Bpsim2Package.TIME_PARAMETERS__QUEUE_TIME:
				return basicSetQueueTime(null, msgs);
			case Bpsim2Package.TIME_PARAMETERS__WAIT_TIME:
				return basicSetWaitTime(null, msgs);
			case Bpsim2Package.TIME_PARAMETERS__SET_UP_TIME:
				return basicSetSetUpTime(null, msgs);
			case Bpsim2Package.TIME_PARAMETERS__PROCESSING_TIME:
				return basicSetProcessingTime(null, msgs);
			case Bpsim2Package.TIME_PARAMETERS__VALIDATION_TIME:
				return basicSetValidationTime(null, msgs);
			case Bpsim2Package.TIME_PARAMETERS__REWORK_TIME:
				return basicSetReworkTime(null, msgs);
			case Bpsim2Package.TIME_PARAMETERS__LAG_TIME:
				return basicSetLagTime(null, msgs);
			case Bpsim2Package.TIME_PARAMETERS__DURATION:
				return basicSetDuration(null, msgs);
			case Bpsim2Package.TIME_PARAMETERS__ELAPSED_TIME:
				return basicSetElapsedTime(null, msgs);
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
			case Bpsim2Package.TIME_PARAMETERS__TRANSFER_TIME:
				return getTransferTime();
			case Bpsim2Package.TIME_PARAMETERS__QUEUE_TIME:
				return getQueueTime();
			case Bpsim2Package.TIME_PARAMETERS__WAIT_TIME:
				return getWaitTime();
			case Bpsim2Package.TIME_PARAMETERS__SET_UP_TIME:
				return getSetUpTime();
			case Bpsim2Package.TIME_PARAMETERS__PROCESSING_TIME:
				return getProcessingTime();
			case Bpsim2Package.TIME_PARAMETERS__VALIDATION_TIME:
				return getValidationTime();
			case Bpsim2Package.TIME_PARAMETERS__REWORK_TIME:
				return getReworkTime();
			case Bpsim2Package.TIME_PARAMETERS__LAG_TIME:
				return getLagTime();
			case Bpsim2Package.TIME_PARAMETERS__DURATION:
				return getDuration();
			case Bpsim2Package.TIME_PARAMETERS__ELAPSED_TIME:
				return getElapsedTime();
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
			case Bpsim2Package.TIME_PARAMETERS__TRANSFER_TIME:
				setTransferTime((Parameter)newValue);
				return;
			case Bpsim2Package.TIME_PARAMETERS__QUEUE_TIME:
				setQueueTime((Parameter)newValue);
				return;
			case Bpsim2Package.TIME_PARAMETERS__WAIT_TIME:
				setWaitTime((Parameter)newValue);
				return;
			case Bpsim2Package.TIME_PARAMETERS__SET_UP_TIME:
				setSetUpTime((Parameter)newValue);
				return;
			case Bpsim2Package.TIME_PARAMETERS__PROCESSING_TIME:
				setProcessingTime((Parameter)newValue);
				return;
			case Bpsim2Package.TIME_PARAMETERS__VALIDATION_TIME:
				setValidationTime((Parameter)newValue);
				return;
			case Bpsim2Package.TIME_PARAMETERS__REWORK_TIME:
				setReworkTime((Parameter)newValue);
				return;
			case Bpsim2Package.TIME_PARAMETERS__LAG_TIME:
				setLagTime((Parameter)newValue);
				return;
			case Bpsim2Package.TIME_PARAMETERS__DURATION:
				setDuration((Parameter)newValue);
				return;
			case Bpsim2Package.TIME_PARAMETERS__ELAPSED_TIME:
				setElapsedTime((Parameter)newValue);
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
			case Bpsim2Package.TIME_PARAMETERS__TRANSFER_TIME:
				setTransferTime((Parameter)null);
				return;
			case Bpsim2Package.TIME_PARAMETERS__QUEUE_TIME:
				setQueueTime((Parameter)null);
				return;
			case Bpsim2Package.TIME_PARAMETERS__WAIT_TIME:
				setWaitTime((Parameter)null);
				return;
			case Bpsim2Package.TIME_PARAMETERS__SET_UP_TIME:
				setSetUpTime((Parameter)null);
				return;
			case Bpsim2Package.TIME_PARAMETERS__PROCESSING_TIME:
				setProcessingTime((Parameter)null);
				return;
			case Bpsim2Package.TIME_PARAMETERS__VALIDATION_TIME:
				setValidationTime((Parameter)null);
				return;
			case Bpsim2Package.TIME_PARAMETERS__REWORK_TIME:
				setReworkTime((Parameter)null);
				return;
			case Bpsim2Package.TIME_PARAMETERS__LAG_TIME:
				setLagTime((Parameter)null);
				return;
			case Bpsim2Package.TIME_PARAMETERS__DURATION:
				setDuration((Parameter)null);
				return;
			case Bpsim2Package.TIME_PARAMETERS__ELAPSED_TIME:
				setElapsedTime((Parameter)null);
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
			case Bpsim2Package.TIME_PARAMETERS__TRANSFER_TIME:
				return transferTime != null;
			case Bpsim2Package.TIME_PARAMETERS__QUEUE_TIME:
				return queueTime != null;
			case Bpsim2Package.TIME_PARAMETERS__WAIT_TIME:
				return waitTime != null;
			case Bpsim2Package.TIME_PARAMETERS__SET_UP_TIME:
				return setUpTime != null;
			case Bpsim2Package.TIME_PARAMETERS__PROCESSING_TIME:
				return processingTime != null;
			case Bpsim2Package.TIME_PARAMETERS__VALIDATION_TIME:
				return validationTime != null;
			case Bpsim2Package.TIME_PARAMETERS__REWORK_TIME:
				return reworkTime != null;
			case Bpsim2Package.TIME_PARAMETERS__LAG_TIME:
				return lagTime != null;
			case Bpsim2Package.TIME_PARAMETERS__DURATION:
				return duration != null;
			case Bpsim2Package.TIME_PARAMETERS__ELAPSED_TIME:
				return elapsedTime != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeParametersImpl
