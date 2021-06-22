/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGateway#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getEventBasedGateway()
 * @model
 * @generated
 */
public interface EventBasedGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Instantiate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiate</em>' attribute.
	 * @see #setInstantiate(boolean)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getEventBasedGateway_Instantiate()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isInstantiate();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiate</em>' attribute.
	 * @see #isInstantiate()
	 * @generated
	 */
	void setInstantiate(boolean value);

	/**
	 * Returns the value of the '<em><b>Event Gateway Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGatewayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Gateway Type</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGatewayType
	 * @see #setEventGatewayType(EventBasedGatewayType)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getEventBasedGateway_EventGatewayType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EventBasedGatewayType getEventGatewayType();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Gateway Type</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventBasedGatewayType
	 * @see #getEventGatewayType()
	 * @generated
	 */
	void setEventGatewayType(EventBasedGatewayType value);

} // EventBasedGateway
