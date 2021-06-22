/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.di;

import org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Bounds;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Shape#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage#getShape()
 * @model abstract="true"
 * @generated
 */
public interface Shape extends Node {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.di.DiPackage#getShape_Bounds()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Shape#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

} // Shape
