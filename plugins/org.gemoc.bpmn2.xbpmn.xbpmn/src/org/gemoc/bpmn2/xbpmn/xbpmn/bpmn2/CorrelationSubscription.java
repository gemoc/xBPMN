/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationSubscription#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getCorrelationSubscription()
 * @model
 * @generated
 */
public interface CorrelationSubscription extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Correlation Key Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Key Ref</em>' reference.
	 * @see #setCorrelationKeyRef(CorrelationKey)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getCorrelationSubscription_CorrelationKeyRef()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CorrelationKey getCorrelationKeyRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Key Ref</em>' reference.
	 * @see #getCorrelationKeyRef()
	 * @generated
	 */
	void setCorrelationKeyRef(CorrelationKey value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.CorrelationPropertyBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Binding</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getCorrelationSubscription_CorrelationPropertyBinding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationPropertyBinding> getCorrelationPropertyBinding();

} // CorrelationSubscription
