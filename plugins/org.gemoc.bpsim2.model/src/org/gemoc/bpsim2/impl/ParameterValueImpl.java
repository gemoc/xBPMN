/**
 */
package org.gemoc.bpsim2.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.ParameterValue;
import org.gemoc.bpsim2.ResultType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.impl.ParameterValueImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ParameterValueImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ParameterValueImpl#getResultTimeStamp <em>Result Time Stamp</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.impl.ParameterValueImpl#getValidFor <em>Valid For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterValueImpl extends MinimalEObjectImpl.Container implements ParameterValue {
	/**
	 * The default value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected String instance = INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final ResultType RESULT_EDEFAULT = ResultType.MIN;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected ResultType result = RESULT_EDEFAULT;

	/**
	 * This is true if the Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultESet;

	/**
	 * The default value of the '{@link #getResultTimeStamp() <em>Result Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RESULT_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultTimeStamp() <em>Result Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar resultTimeStamp = RESULT_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidFor() <em>Valid For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFor() <em>Valid For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFor()
	 * @generated
	 * @ordered
	 */
	protected String validFor = VALID_FOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpsim2Package.Literals.PARAMETER_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(String newInstance) {
		String oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.PARAMETER_VALUE__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(ResultType newResult) {
		ResultType oldResult = result;
		result = newResult == null ? RESULT_EDEFAULT : newResult;
		boolean oldResultESet = resultESet;
		resultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.PARAMETER_VALUE__RESULT, oldResult, result, !oldResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResult() {
		ResultType oldResult = result;
		boolean oldResultESet = resultESet;
		result = RESULT_EDEFAULT;
		resultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Bpsim2Package.PARAMETER_VALUE__RESULT, oldResult, RESULT_EDEFAULT, oldResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResult() {
		return resultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getResultTimeStamp() {
		return resultTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultTimeStamp(XMLGregorianCalendar newResultTimeStamp) {
		XMLGregorianCalendar oldResultTimeStamp = resultTimeStamp;
		resultTimeStamp = newResultTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.PARAMETER_VALUE__RESULT_TIME_STAMP, oldResultTimeStamp, resultTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidFor() {
		return validFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFor(String newValidFor) {
		String oldValidFor = validFor;
		validFor = newValidFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpsim2Package.PARAMETER_VALUE__VALID_FOR, oldValidFor, validFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpsim2Package.PARAMETER_VALUE__INSTANCE:
				return getInstance();
			case Bpsim2Package.PARAMETER_VALUE__RESULT:
				return getResult();
			case Bpsim2Package.PARAMETER_VALUE__RESULT_TIME_STAMP:
				return getResultTimeStamp();
			case Bpsim2Package.PARAMETER_VALUE__VALID_FOR:
				return getValidFor();
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
			case Bpsim2Package.PARAMETER_VALUE__INSTANCE:
				setInstance((String)newValue);
				return;
			case Bpsim2Package.PARAMETER_VALUE__RESULT:
				setResult((ResultType)newValue);
				return;
			case Bpsim2Package.PARAMETER_VALUE__RESULT_TIME_STAMP:
				setResultTimeStamp((XMLGregorianCalendar)newValue);
				return;
			case Bpsim2Package.PARAMETER_VALUE__VALID_FOR:
				setValidFor((String)newValue);
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
			case Bpsim2Package.PARAMETER_VALUE__INSTANCE:
				setInstance(INSTANCE_EDEFAULT);
				return;
			case Bpsim2Package.PARAMETER_VALUE__RESULT:
				unsetResult();
				return;
			case Bpsim2Package.PARAMETER_VALUE__RESULT_TIME_STAMP:
				setResultTimeStamp(RESULT_TIME_STAMP_EDEFAULT);
				return;
			case Bpsim2Package.PARAMETER_VALUE__VALID_FOR:
				setValidFor(VALID_FOR_EDEFAULT);
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
			case Bpsim2Package.PARAMETER_VALUE__INSTANCE:
				return INSTANCE_EDEFAULT == null ? instance != null : !INSTANCE_EDEFAULT.equals(instance);
			case Bpsim2Package.PARAMETER_VALUE__RESULT:
				return isSetResult();
			case Bpsim2Package.PARAMETER_VALUE__RESULT_TIME_STAMP:
				return RESULT_TIME_STAMP_EDEFAULT == null ? resultTimeStamp != null : !RESULT_TIME_STAMP_EDEFAULT.equals(resultTimeStamp);
			case Bpsim2Package.PARAMETER_VALUE__VALID_FOR:
				return VALID_FOR_EDEFAULT == null ? validFor != null : !VALID_FOR_EDEFAULT.equals(validFor);
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
		result.append(" (instance: ");
		result.append(instance);
		result.append(", result: ");
		if (resultESet) result.append(result); else result.append("<unset>");
		result.append(", resultTimeStamp: ");
		result.append(resultTimeStamp);
		result.append(", validFor: ");
		result.append(validFor);
		result.append(')');
		return result.toString();
	}

} //ParameterValueImpl
