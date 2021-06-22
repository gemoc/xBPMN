/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getLoopCardinality <em>Loop Cardinality</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataInputRef <em>Loop Data Input Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataOutputRef <em>Loop Data Output Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getInputDataItem <em>Input Data Item</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getOutputDataItem <em>Output Data Item</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics()
 * @model
 * @generated
 */
public interface MultiInstanceLoopCharacteristics extends LoopCharacteristics {
	/**
	 * Returns the value of the '<em><b>Is Sequential</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sequential</em>' attribute.
	 * @see #setIsSequential(boolean)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_IsSequential()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsSequential();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sequential</em>' attribute.
	 * @see #isIsSequential()
	 * @generated
	 */
	void setIsSequential(boolean value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * The default value is <code>"All"</code>.
	 * The literals are from the enumeration {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceBehavior
	 * @see #setBehavior(MultiInstanceBehavior)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_Behavior()
	 * @model default="All" required="true" ordered="false"
	 * @generated
	 */
	MultiInstanceBehavior getBehavior();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceBehavior
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(MultiInstanceBehavior value);

	/**
	 * Returns the value of the '<em><b>Loop Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Cardinality</em>' containment reference.
	 * @see #setLoopCardinality(Expression)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_LoopCardinality()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getLoopCardinality();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getLoopCardinality <em>Loop Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Cardinality</em>' containment reference.
	 * @see #getLoopCardinality()
	 * @generated
	 */
	void setLoopCardinality(Expression value);

	/**
	 * Returns the value of the '<em><b>Loop Data Input Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Data Input Ref</em>' reference.
	 * @see #setLoopDataInputRef(ItemAwareElement)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_LoopDataInputRef()
	 * @model ordered="false"
	 * @generated
	 */
	ItemAwareElement getLoopDataInputRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataInputRef <em>Loop Data Input Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Data Input Ref</em>' reference.
	 * @see #getLoopDataInputRef()
	 * @generated
	 */
	void setLoopDataInputRef(ItemAwareElement value);

	/**
	 * Returns the value of the '<em><b>Loop Data Output Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Data Output Ref</em>' reference.
	 * @see #setLoopDataOutputRef(ItemAwareElement)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_LoopDataOutputRef()
	 * @model ordered="false"
	 * @generated
	 */
	ItemAwareElement getLoopDataOutputRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataOutputRef <em>Loop Data Output Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Data Output Ref</em>' reference.
	 * @see #getLoopDataOutputRef()
	 * @generated
	 */
	void setLoopDataOutputRef(ItemAwareElement value);

	/**
	 * Returns the value of the '<em><b>Input Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data Item</em>' containment reference.
	 * @see #setInputDataItem(DataInput)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_InputDataItem()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataInput getInputDataItem();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getInputDataItem <em>Input Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Data Item</em>' containment reference.
	 * @see #getInputDataItem()
	 * @generated
	 */
	void setInputDataItem(DataInput value);

	/**
	 * Returns the value of the '<em><b>Output Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data Item</em>' containment reference.
	 * @see #setOutputDataItem(DataOutput)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_OutputDataItem()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DataOutput getOutputDataItem();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getOutputDataItem <em>Output Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Data Item</em>' containment reference.
	 * @see #getOutputDataItem()
	 * @generated
	 */
	void setOutputDataItem(DataOutput value);

	/**
	 * Returns the value of the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Condition</em>' containment reference.
	 * @see #setCompletionCondition(Expression)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_CompletionCondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getCompletionCondition();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getCompletionCondition <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Condition</em>' containment reference.
	 * @see #getCompletionCondition()
	 * @generated
	 */
	void setCompletionCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Complex Behavior Definition</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.ComplexBehaviorDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Behavior Definition</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ComplexBehaviorDefinition> getComplexBehaviorDefinition();

	/**
	 * Returns the value of the '<em><b>One Behavior Event Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Behavior Event Ref</em>' reference.
	 * @see #setOneBehaviorEventRef(EventDefinition)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_OneBehaviorEventRef()
	 * @model ordered="false"
	 * @generated
	 */
	EventDefinition getOneBehaviorEventRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Behavior Event Ref</em>' reference.
	 * @see #getOneBehaviorEventRef()
	 * @generated
	 */
	void setOneBehaviorEventRef(EventDefinition value);

	/**
	 * Returns the value of the '<em><b>None Behavior Event Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>None Behavior Event Ref</em>' reference.
	 * @see #setNoneBehaviorEventRef(EventDefinition)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef()
	 * @model ordered="false"
	 * @generated
	 */
	EventDefinition getNoneBehaviorEventRef();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.MultiInstanceLoopCharacteristics#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>None Behavior Event Ref</em>' reference.
	 * @see #getNoneBehaviorEventRef()
	 * @generated
	 */
	void setNoneBehaviorEventRef(EventDefinition value);

} // MultiInstanceLoopCharacteristics
