/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane#getFlowNodeRefs <em>Flow Node Refs</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane#getPartitionElement <em>Partition Element</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getLane()
 * @model
 * @generated
 */
public interface Lane extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getLane_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Child Lane Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Lane Set</em>' containment reference.
	 * @see #setChildLaneSet(LaneSet)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getLane_ChildLaneSet()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	LaneSet getChildLaneSet();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane#getChildLaneSet <em>Child Lane Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Lane Set</em>' containment reference.
	 * @see #getChildLaneSet()
	 * @generated
	 */
	void setChildLaneSet(LaneSet value);

	/**
	 * Returns the value of the '<em><b>Partition Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Element Ref</em>' reference.
	 * @see #setPartitionElementRef(BaseElement)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getLane_PartitionElementRef()
	 * @model ordered="false"
	 * @generated
	 */
	BaseElement getPartitionElementRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane#getPartitionElementRef <em>Partition Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Element Ref</em>' reference.
	 * @see #getPartitionElementRef()
	 * @generated
	 */
	void setPartitionElementRef(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Flow Node Refs</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowNode}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowNode#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Node Refs</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getLane_FlowNodeRefs()
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.FlowNode#getLanes
	 * @model opposite="lanes" resolveProxies="false" ordered="false"
	 * @generated
	 */
	EList<FlowNode> getFlowNodeRefs();

	/**
	 * Returns the value of the '<em><b>Partition Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Element</em>' containment reference.
	 * @see #setPartitionElement(BaseElement)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getLane_PartitionElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	BaseElement getPartitionElement();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Lane#getPartitionElement <em>Partition Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Element</em>' containment reference.
	 * @see #getPartitionElement()
	 * @generated
	 */
	void setPartitionElement(BaseElement value);

} // Lane
