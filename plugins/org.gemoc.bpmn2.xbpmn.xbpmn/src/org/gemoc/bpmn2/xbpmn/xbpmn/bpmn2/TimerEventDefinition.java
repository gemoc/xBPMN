/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TimerEventDefinition#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getTimerEventDefinition()
 * @model
 * @generated
 */
public interface TimerEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Time Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Date</em>' containment reference.
	 * @see #setTimeDate(Expression)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getTimerEventDefinition_TimeDate()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTimeDate();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TimerEventDefinition#getTimeDate <em>Time Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Date</em>' containment reference.
	 * @see #getTimeDate()
	 * @generated
	 */
	void setTimeDate(Expression value);

	/**
	 * Returns the value of the '<em><b>Time Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Cycle</em>' containment reference.
	 * @see #setTimeCycle(Expression)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getTimerEventDefinition_TimeCycle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTimeCycle();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Cycle</em>' containment reference.
	 * @see #getTimeCycle()
	 * @generated
	 */
	void setTimeCycle(Expression value);

	/**
	 * Returns the value of the '<em><b>Time Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Duration</em>' containment reference.
	 * @see #setTimeDuration(Expression)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getTimerEventDefinition_TimeDuration()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTimeDuration();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Duration</em>' containment reference.
	 * @see #getTimeDuration()
	 * @generated
	 */
	void setTimeDuration(Expression value);

} // TimerEventDefinition
