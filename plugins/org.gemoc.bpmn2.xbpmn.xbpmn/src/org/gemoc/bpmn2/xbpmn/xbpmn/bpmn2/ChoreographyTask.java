/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ChoreographyTask#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getChoreographyTask()
 * @model
 * @generated
 */
public interface ChoreographyTask extends ChoreographyActivity {
	/**
	 * Returns the value of the '<em><b>Message Flow Ref</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Ref</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getChoreographyTask_MessageFlowRef()
	 * @model upper="2" ordered="false"
	 * @generated
	 */
	EList<MessageFlow> getMessageFlowRef();

} // ChoreographyTask
