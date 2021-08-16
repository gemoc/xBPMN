/**
 */
package org.gemoc.bpsim2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getTransferTime <em>Transfer Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getQueueTime <em>Queue Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getWaitTime <em>Wait Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getSetUpTime <em>Set Up Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getProcessingTime <em>Processing Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getValidationTime <em>Validation Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getReworkTime <em>Rework Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getLagTime <em>Lag Time</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.TimeParameters#getElapsedTime <em>Elapsed Time</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters()
 * @model extendedMetaData="name='TimeParameters' kind='elementOnly'"
 * @generated
 */
public interface TimeParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Transfer Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Time</em>' containment reference.
	 * @see #setTransferTime(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_TransferTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TransferTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getTransferTime();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getTransferTime <em>Transfer Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Time</em>' containment reference.
	 * @see #getTransferTime()
	 * @generated
	 */
	void setTransferTime(Parameter value);

	/**
	 * Returns the value of the '<em><b>Queue Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Time</em>' containment reference.
	 * @see #setQueueTime(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_QueueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getQueueTime();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getQueueTime <em>Queue Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Time</em>' containment reference.
	 * @see #getQueueTime()
	 * @generated
	 */
	void setQueueTime(Parameter value);

	/**
	 * Returns the value of the '<em><b>Wait Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait Time</em>' containment reference.
	 * @see #setWaitTime(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_WaitTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WaitTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getWaitTime();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getWaitTime <em>Wait Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait Time</em>' containment reference.
	 * @see #getWaitTime()
	 * @generated
	 */
	void setWaitTime(Parameter value);

	/**
	 * Returns the value of the '<em><b>Set Up Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Up Time</em>' containment reference.
	 * @see #setSetUpTime(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_SetUpTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetUpTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getSetUpTime();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getSetUpTime <em>Set Up Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Up Time</em>' containment reference.
	 * @see #getSetUpTime()
	 * @generated
	 */
	void setSetUpTime(Parameter value);

	/**
	 * Returns the value of the '<em><b>Processing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Time</em>' containment reference.
	 * @see #setProcessingTime(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_ProcessingTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProcessingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getProcessingTime();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getProcessingTime <em>Processing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Time</em>' containment reference.
	 * @see #getProcessingTime()
	 * @generated
	 */
	void setProcessingTime(Parameter value);

	/**
	 * Returns the value of the '<em><b>Validation Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Time</em>' containment reference.
	 * @see #setValidationTime(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_ValidationTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValidationTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getValidationTime();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getValidationTime <em>Validation Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Time</em>' containment reference.
	 * @see #getValidationTime()
	 * @generated
	 */
	void setValidationTime(Parameter value);

	/**
	 * Returns the value of the '<em><b>Rework Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rework Time</em>' containment reference.
	 * @see #setReworkTime(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_ReworkTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReworkTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getReworkTime();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getReworkTime <em>Rework Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rework Time</em>' containment reference.
	 * @see #getReworkTime()
	 * @generated
	 */
	void setReworkTime(Parameter value);

	/**
	 * Returns the value of the '<em><b>Lag Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lag Time</em>' containment reference.
	 * @see #setLagTime(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_LagTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LagTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getLagTime();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getLagTime <em>Lag Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lag Time</em>' containment reference.
	 * @see #getLagTime()
	 * @generated
	 */
	void setLagTime(Parameter value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getDuration();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Parameter value);

	/**
	 * Returns the value of the '<em><b>Elapsed Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elapsed Time</em>' containment reference.
	 * @see #setElapsedTime(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getTimeParameters_ElapsedTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ElapsedTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getElapsedTime();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.TimeParameters#getElapsedTime <em>Elapsed Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed Time</em>' containment reference.
	 * @see #getElapsedTime()
	 * @generated
	 */
	void setElapsedTime(Parameter value);

} // TimeParameters
