/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameter#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getResourceParameter()
 * @model
 * @generated
 */
public interface ResourceParameter extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getResourceParameter_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(boolean)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getResourceParameter_IsRequired()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameter#isIsRequired <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #isIsRequired()
	 * @generated
	 */
	void setIsRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ItemDefinition)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getResourceParameter_Type()
	 * @model ordered="false"
	 * @generated
	 */
	ItemDefinition getType();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.ResourceParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ItemDefinition value);

} // ResourceParameter
