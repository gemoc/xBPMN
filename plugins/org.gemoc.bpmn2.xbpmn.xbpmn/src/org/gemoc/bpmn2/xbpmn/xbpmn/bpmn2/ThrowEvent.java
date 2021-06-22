/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ThrowEvent#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ThrowEvent#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ThrowEvent#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ThrowEvent#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ThrowEvent#getEventDefinitions <em>Event Definitions</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getThrowEvent()
 * @model abstract="true"
 * @generated
 */
public interface ThrowEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set</em>' containment reference.
	 * @see #setInputSet(InputSet)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getThrowEvent_InputSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	InputSet getInputSet();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ThrowEvent#getInputSet <em>Input Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Set</em>' containment reference.
	 * @see #getInputSet()
	 * @generated
	 */
	void setInputSet(InputSet value);

	/**
	 * Returns the value of the '<em><b>Event Definition Refs</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definition Refs</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getThrowEvent_EventDefinitionRefs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EventDefinition> getEventDefinitionRefs();

	/**
	 * Returns the value of the '<em><b>Data Input Association</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInputAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input Association</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getThrowEvent_DataInputAssociation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataInputAssociation> getDataInputAssociation();

	/**
	 * Returns the value of the '<em><b>Data Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Inputs</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getThrowEvent_DataInputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataInput> getDataInputs();

	/**
	 * Returns the value of the '<em><b>Event Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definitions</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getThrowEvent_EventDefinitions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EventDefinition> getEventDefinitions();

} // ThrowEvent
