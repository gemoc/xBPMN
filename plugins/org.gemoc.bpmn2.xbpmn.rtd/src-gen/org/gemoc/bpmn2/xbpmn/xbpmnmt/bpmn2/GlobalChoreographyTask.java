/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getGlobalChoreographyTask()
 * @model
 * @generated
 */
public interface GlobalChoreographyTask extends Choreography {
	/**
	 * Returns the value of the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #setInitiatingParticipantRef(Participant)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getGlobalChoreographyTask_InitiatingParticipantRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getInitiatingParticipantRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiating Participant Ref</em>' reference.
	 * @see #getInitiatingParticipantRef()
	 * @generated
	 */
	void setInitiatingParticipantRef(Participant value);

} // GlobalChoreographyTask