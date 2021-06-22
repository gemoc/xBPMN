/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getSignalEventDefinition()
 * @model
 * @generated
 */
public interface SignalEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Signal Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Ref</em>' reference.
	 * @see #setSignalRef(Signal)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getSignalEventDefinition_SignalRef()
	 * @model ordered="false"
	 * @generated
	 */
	Signal getSignalRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Ref</em>' reference.
	 * @see #getSignalRef()
	 * @generated
	 */
	void setSignalRef(Signal value);

} // SignalEventDefinition
