/**
 * <copyright>
 * 
 * Copyright (c) 2011-2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 * 
 * </copyright>
 */
package org.obeonetwork.dsl.dd.di.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.obeonetwork.dsl.dd.di.*;
import org.obeonetwork.dsl.dd.di.DiPackage;
import org.obeonetwork.dsl.dd.di.Diagram;
import org.obeonetwork.dsl.dd.di.DiagramElement;
import org.obeonetwork.dsl.dd.di.Edge;
import org.obeonetwork.dsl.dd.di.Label;
import org.obeonetwork.dsl.dd.di.LabeledEdge;
import org.obeonetwork.dsl.dd.di.LabeledShape;
import org.obeonetwork.dsl.dd.di.Node;
import org.obeonetwork.dsl.dd.di.Plane;
import org.obeonetwork.dsl.dd.di.Shape;
import org.obeonetwork.dsl.dd.di.Style;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.dd.di.DiPackage
 * @generated
 */
public class DiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiSwitch() {
		if (modelPackage == null) {
			modelPackage = DiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DiPackage.DIAGRAM_ELEMENT: {
			DiagramElement diagramElement = (DiagramElement) theEObject;
			T result = caseDiagramElement(diagramElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.DIAGRAM: {
			Diagram diagram = (Diagram) theEObject;
			T result = caseDiagram(diagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.STYLE: {
			Style style = (Style) theEObject;
			T result = caseStyle(style);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.NODE: {
			Node node = (Node) theEObject;
			T result = caseNode(node);
			if (result == null)
				result = caseDiagramElement(node);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.EDGE: {
			Edge edge = (Edge) theEObject;
			T result = caseEdge(edge);
			if (result == null)
				result = caseDiagramElement(edge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.SHAPE: {
			Shape shape = (Shape) theEObject;
			T result = caseShape(shape);
			if (result == null)
				result = caseNode(shape);
			if (result == null)
				result = caseDiagramElement(shape);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.LABELED_EDGE: {
			LabeledEdge labeledEdge = (LabeledEdge) theEObject;
			T result = caseLabeledEdge(labeledEdge);
			if (result == null)
				result = caseEdge(labeledEdge);
			if (result == null)
				result = caseDiagramElement(labeledEdge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.LABEL: {
			Label label = (Label) theEObject;
			T result = caseLabel(label);
			if (result == null)
				result = caseNode(label);
			if (result == null)
				result = caseDiagramElement(label);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.LABELED_SHAPE: {
			LabeledShape labeledShape = (LabeledShape) theEObject;
			T result = caseLabeledShape(labeledShape);
			if (result == null)
				result = caseShape(labeledShape);
			if (result == null)
				result = caseNode(labeledShape);
			if (result == null)
				result = caseDiagramElement(labeledShape);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DiPackage.PLANE: {
			Plane plane = (Plane) theEObject;
			T result = casePlane(plane);
			if (result == null)
				result = caseNode(plane);
			if (result == null)
				result = caseDiagramElement(plane);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagramElement(DiagramElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyle(Style object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledEdge(LabeledEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledShape(LabeledShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plane</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plane</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlane(Plane object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiSwitch
