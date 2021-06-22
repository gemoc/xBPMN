/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Transaction#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Transaction#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends SubProcess {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getTransaction_Protocol()
	 * @model ordered="false"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Transaction#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getTransaction_Method()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Transaction#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

} // Transaction
