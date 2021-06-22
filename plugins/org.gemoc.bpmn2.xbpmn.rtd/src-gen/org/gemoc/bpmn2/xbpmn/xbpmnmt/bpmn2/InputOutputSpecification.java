/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Output Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification#getInputSets <em>Input Sets</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification#getOutputSets <em>Output Sets</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputOutputSpecification#getDataOutputs <em>Data Outputs</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getInputOutputSpecification()
 * @model
 * @generated
 */
public interface InputOutputSpecification extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Input Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.InputSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Sets</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getInputOutputSpecification_InputSets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSets();

	/**
	 * Returns the value of the '<em><b>Output Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.OutputSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Sets</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getInputOutputSpecification_OutputSets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OutputSet> getOutputSets();

	/**
	 * Returns the value of the '<em><b>Data Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Inputs</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getInputOutputSpecification_DataInputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataInput> getDataInputs();

	/**
	 * Returns the value of the '<em><b>Data Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.DataOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Outputs</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmn2.Bpmn2Package#getInputOutputSpecification_DataOutputs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataOutput> getDataOutputs();

} // InputOutputSpecification
