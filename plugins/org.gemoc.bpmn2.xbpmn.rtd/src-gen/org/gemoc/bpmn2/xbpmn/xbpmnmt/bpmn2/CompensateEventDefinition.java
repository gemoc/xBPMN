/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compensate Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getCompensateEventDefinition()
 * @model
 * @generated
 */
public interface CompensateEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Wait For Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait For Completion</em>' attribute.
	 * @see #setWaitForCompletion(boolean)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getCompensateEventDefinition_WaitForCompletion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isWaitForCompletion();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait For Completion</em>' attribute.
	 * @see #isWaitForCompletion()
	 * @generated
	 */
	void setWaitForCompletion(boolean value);

	/**
	 * Returns the value of the '<em><b>Activity Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Ref</em>' reference.
	 * @see #setActivityRef(Activity)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getCompensateEventDefinition_ActivityRef()
	 * @model ordered="false"
	 * @generated
	 */
	Activity getActivityRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Ref</em>' reference.
	 * @see #getActivityRef()
	 * @generated
	 */
	void setActivityRef(Activity value);

} // CompensateEventDefinition
