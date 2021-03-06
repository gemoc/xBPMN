/**
 */
package org.gemoc.bpsim2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpsim2.ControlParameters#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ControlParameters#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ControlParameters#getInterTriggerTimer <em>Inter Trigger Timer</em>}</li>
 *   <li>{@link org.gemoc.bpsim2.ControlParameters#getTriggerCount <em>Trigger Count</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpsim2.Bpsim2Package#getControlParameters()
 * @model extendedMetaData="name='ControlParameters' kind='elementOnly'"
 * @generated
 */
public interface ControlParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' containment reference.
	 * @see #setProbability(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getControlParameters_Probability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Probability' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getProbability();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ControlParameters#getProbability <em>Probability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' containment reference.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(Parameter value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getControlParameters_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getCondition();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ControlParameters#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Parameter value);

	/**
	 * Returns the value of the '<em><b>Inter Trigger Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inter Trigger Timer</em>' containment reference.
	 * @see #setInterTriggerTimer(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getControlParameters_InterTriggerTimer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterTriggerTimer' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getInterTriggerTimer();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ControlParameters#getInterTriggerTimer <em>Inter Trigger Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inter Trigger Timer</em>' containment reference.
	 * @see #getInterTriggerTimer()
	 * @generated
	 */
	void setInterTriggerTimer(Parameter value);

	/**
	 * Returns the value of the '<em><b>Trigger Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Count</em>' containment reference.
	 * @see #setTriggerCount(Parameter)
	 * @see org.gemoc.bpsim2.Bpsim2Package#getControlParameters_TriggerCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TriggerCount' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameter getTriggerCount();

	/**
	 * Sets the value of the '{@link org.gemoc.bpsim2.ControlParameters#getTriggerCount <em>Trigger Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Count</em>' containment reference.
	 * @see #getTriggerCount()
	 * @generated
	 */
	void setTriggerCount(Parameter value);

} // ControlParameters
