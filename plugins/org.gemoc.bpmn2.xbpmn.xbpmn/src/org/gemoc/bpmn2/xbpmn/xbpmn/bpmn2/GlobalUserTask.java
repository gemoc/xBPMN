/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalUserTask#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalUserTask#getRenderings <em>Renderings</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getGlobalUserTask()
 * @model
 * @generated
 */
public interface GlobalUserTask extends GlobalTask {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getGlobalUserTask_Implementation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.GlobalUserTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Renderings</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Rendering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renderings</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmn2.Bpmn2Package#getGlobalUserTask_Renderings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Rendering> getRenderings();

} // GlobalUserTask