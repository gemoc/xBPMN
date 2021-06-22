/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.di;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.di.LabeledEdge#getOwnedLabel <em>Owned Label</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage#getLabeledEdge()
 * @model abstract="true"
 * @generated
 */
public interface LabeledEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Owned Label</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.di.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Label</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage#getLabeledEdge_OwnedLabel()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList<Label> getOwnedLabel();

} // LabeledEdge
