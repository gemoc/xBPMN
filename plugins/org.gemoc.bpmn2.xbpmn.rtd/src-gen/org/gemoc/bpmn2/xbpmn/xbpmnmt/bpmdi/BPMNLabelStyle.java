/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi;

import org.gemoc.bpmn2.xbpmn.xbpmnmt.dc.Font;

import org.gemoc.bpmn2.xbpmn.xbpmnmt.di.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Label Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabelStyle#getFont <em>Font</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage#getBPMNLabelStyle()
 * @model
 * @generated
 */
public interface BPMNLabelStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(Font)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BpmdiPackage#getBPMNLabelStyle_Font()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Font getFont();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmnmt.bpmdi.BPMNLabelStyle#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(Font value);

} // BPMNLabelStyle
