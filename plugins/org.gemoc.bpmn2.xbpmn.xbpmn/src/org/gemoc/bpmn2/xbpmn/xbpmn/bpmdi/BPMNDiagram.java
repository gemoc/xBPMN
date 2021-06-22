/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi;

import org.eclipse.emf.common.util.EList;

import org.gemoc.bpmn2.xbpmn.xbpmn.di.Diagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNDiagram#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNDiagram#getLabelStyle <em>Label Style</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage#getBPMNDiagram()
 * @model
 * @generated
 */
public interface BPMNDiagram extends Diagram {
	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference.
	 * @see #setPlane(BPMNPlane)
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage#getBPMNDiagram_Plane()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BPMNPlane getPlane();

	/**
	 * Sets the value of the '{@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNDiagram#getPlane <em>Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' containment reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(BPMNPlane value);

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BPMNLabelStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' containment reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.bpmdi.BpmdiPackage#getBPMNDiagram_LabelStyle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<BPMNLabelStyle> getLabelStyle();

} // BPMNDiagram
