/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput#getName <em>Name</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput#getInputSetWithOptional <em>Input Set With Optional</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput#getInputSetRefs <em>Input Set Refs</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getDataInput()
 * @model
 * @generated
 */
public interface DataInput extends ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getDataInput_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(boolean)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getDataInput_IsCollection()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsCollection();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.DataInput#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isIsCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Input Set With Optional</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet#getOptionalInputRefs <em>Optional Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set With Optional</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getDataInput_InputSetWithOptional()
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet#getOptionalInputRefs
	 * @model opposite="optionalInputRefs" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetWithOptional();

	/**
	 * Returns the value of the '<em><b>Input Set With While Executing</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set With While Executing</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getDataInput_InputSetWithWhileExecuting()
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet#getWhileExecutingInputRefs
	 * @model opposite="whileExecutingInputRefs" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetWithWhileExecuting();

	/**
	 * Returns the value of the '<em><b>Input Set Refs</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set Refs</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getDataInput_InputSetRefs()
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.InputSet#getDataInputRefs
	 * @model opposite="dataInputRefs" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetRefs();

} // DataInput