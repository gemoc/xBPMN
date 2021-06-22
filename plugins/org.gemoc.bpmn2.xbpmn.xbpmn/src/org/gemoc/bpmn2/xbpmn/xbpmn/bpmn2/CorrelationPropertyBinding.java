/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getCorrelationPropertyBinding()
 * @model
 * @generated
 */
public interface CorrelationPropertyBinding extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Data Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Path</em>' containment reference.
	 * @see #setDataPath(FormalExpression)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getCorrelationPropertyBinding_DataPath()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FormalExpression getDataPath();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Path</em>' containment reference.
	 * @see #getDataPath()
	 * @generated
	 */
	void setDataPath(FormalExpression value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Ref</em>' reference.
	 * @see #setCorrelationPropertyRef(CorrelationProperty)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getCorrelationPropertyBinding_CorrelationPropertyRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CorrelationProperty getCorrelationPropertyRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Property Ref</em>' reference.
	 * @see #getCorrelationPropertyRef()
	 * @generated
	 */
	void setCorrelationPropertyRef(CorrelationProperty value);

} // CorrelationPropertyBinding
