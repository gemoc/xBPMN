/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getCorrelationPropertyRetrievalExpression()
 * @model
 * @generated
 */
public interface CorrelationPropertyRetrievalExpression extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Message Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Path</em>' containment reference.
	 * @see #setMessagePath(FormalExpression)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getCorrelationPropertyRetrievalExpression_MessagePath()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FormalExpression getMessagePath();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Path</em>' containment reference.
	 * @see #getMessagePath()
	 * @generated
	 */
	void setMessagePath(FormalExpression value);

	/**
	 * Returns the value of the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Ref</em>' reference.
	 * @see #setMessageRef(Message)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getCorrelationPropertyRetrievalExpression_MessageRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Message getMessageRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref</em>' reference.
	 * @see #getMessageRef()
	 * @generated
	 */
	void setMessageRef(Message value);

} // CorrelationPropertyRetrievalExpression
