/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputOutputBinding;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Operation;
import org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.InputOutputBindingImpl#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.InputOutputBindingImpl#getOutputDataRef <em>Output Data Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.InputOutputBindingImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.impl.InputOutputBindingImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputOutputBindingImpl extends EObjectImpl implements InputOutputBinding {
	/**
	 * The cached value of the '{@link #getInputDataRef() <em>Input Data Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataRef()
	 * @generated
	 * @ordered
	 */
	protected InputSet inputDataRef;

	/**
	 * The cached value of the '{@link #getOutputDataRef() <em>Output Data Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataRef()
	 * @generated
	 * @ordered
	 */
	protected OutputSet outputDataRef;

	/**
	 * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRef()
	 * @generated
	 * @ordered
	 */
	protected Operation operationRef;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getInputOutputBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputSet getInputDataRef() {
		if (inputDataRef != null && inputDataRef.eIsProxy()) {
			InternalEObject oldInputDataRef = (InternalEObject)inputDataRef;
			inputDataRef = (InputSet)eResolveProxy(oldInputDataRef);
			if (inputDataRef != oldInputDataRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, oldInputDataRef, inputDataRef));
			}
		}
		return inputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet basicGetInputDataRef() {
		return inputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputDataRef(InputSet newInputDataRef) {
		InputSet oldInputDataRef = inputDataRef;
		inputDataRef = newInputDataRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF, oldInputDataRef, inputDataRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputSet getOutputDataRef() {
		if (outputDataRef != null && outputDataRef.eIsProxy()) {
			InternalEObject oldOutputDataRef = (InternalEObject)outputDataRef;
			outputDataRef = (OutputSet)eResolveProxy(oldOutputDataRef);
			if (outputDataRef != oldOutputDataRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, oldOutputDataRef, outputDataRef));
			}
		}
		return outputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet basicGetOutputDataRef() {
		return outputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputDataRef(OutputSet newOutputDataRef) {
		OutputSet oldOutputDataRef = outputDataRef;
		outputDataRef = newOutputDataRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF, oldOutputDataRef, outputDataRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getOperationRef() {
		if (operationRef != null && operationRef.eIsProxy()) {
			InternalEObject oldOperationRef = (InternalEObject)operationRef;
			operationRef = (Operation)eResolveProxy(oldOperationRef);
			if (operationRef != oldOperationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF, oldOperationRef, operationRef));
			}
		}
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperationRef() {
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationRef(Operation newOperationRef) {
		Operation oldOperationRef = operationRef;
		operationRef = newOperationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF, oldOperationRef, operationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bpmn2Package.INPUT_OUTPUT_BINDING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				if (resolve) return getInputDataRef();
				return basicGetInputDataRef();
			case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				if (resolve) return getOutputDataRef();
				return basicGetOutputDataRef();
			case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
				if (resolve) return getOperationRef();
				return basicGetOperationRef();
			case Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
				return getId();
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
			case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				setInputDataRef((InputSet)newValue);
				return;
			case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				setOutputDataRef((OutputSet)newValue);
				return;
			case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
				setOperationRef((Operation)newValue);
				return;
			case Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
				setId((String)newValue);
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
			case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				setInputDataRef((InputSet)null);
				return;
			case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				setOutputDataRef((OutputSet)null);
				return;
			case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
				setOperationRef((Operation)null);
				return;
			case Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
				setId(ID_EDEFAULT);
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
			case Bpmn2Package.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				return inputDataRef != null;
			case Bpmn2Package.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				return outputDataRef != null;
			case Bpmn2Package.INPUT_OUTPUT_BINDING__OPERATION_REF:
				return operationRef != null;
			case Bpmn2Package.INPUT_OUTPUT_BINDING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //InputOutputBindingImpl
