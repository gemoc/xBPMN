/**
 */
package org.gemoc.bpmn2.xbpmn.xbpmn.di;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage#getDiagramElement()
 * @model abstract="true"
 * @generated
 */
public interface DiagramElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.bpmn2.xbpmn.xbpmn.di.Diagram#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Diagram</em>' reference.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage#getDiagramElement_OwningDiagram()
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.Diagram#getRootElement
	 * @model opposite="rootElement" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	Diagram getOwningDiagram();

	/**
	 * Returns the value of the '<em><b>Owning Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Element</em>' reference.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage#getDiagramElement_OwningElement()
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement#getOwnedElement
	 * @model opposite="ownedElement" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	DiagramElement getOwningElement();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement#getOwningElement <em>Owning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage#getDiagramElement_OwnedElement()
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiagramElement#getOwningElement
	 * @model opposite="owningElement" resolveProxies="false" transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList<DiagramElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage#getDiagramElement_ModelElement()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EObject getModelElement();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' reference.
	 * @see org.gemoc.bpmn2.xbpmn.xbpmn.di.DiPackage#getDiagramElement_Style()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	Style getStyle();

} // DiagramElement
