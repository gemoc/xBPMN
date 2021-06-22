/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CategoryValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CategoryValue#getCategorizedFlowElements <em>Categorized Flow Elements</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getCategoryValue()
 * @model
 * @generated
 */
public interface CategoryValue extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getCategoryValue_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CategoryValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Categorized Flow Elements</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowElement}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorized Flow Elements</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getCategoryValue_CategorizedFlowElements()
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowElement#getCategoryValueRef
	 * @model opposite="categoryValueRef" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList<FlowElement> getCategorizedFlowElements();

} // CategoryValue