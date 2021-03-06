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
package org.obeonetwork.dsl.bpmn2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.bpmn2.Bpmn2Factory
 * @model kind="package"
 *        annotation="http://www.obeonetwork.com/bpmn2/addons"
 * @generated
 */
public interface Bpmn2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpmn2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/BPMN/20100524/MODEL-EMF";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bpmn2Package eINSTANCE = org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.BaseElementImpl <em>Base Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.BaseElementImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getBaseElement()
	 * @generated
	 */
	int BASE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__EXTENSION_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__EXTENSION_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.RootElementImpl <em>Root Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.RootElementImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getRootElement()
	 * @generated
	 */
	int ROOT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Root Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.InterfaceImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATIONS = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IMPLEMENTATION_REF = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionDefinitionImpl <em>Extension Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ExtensionDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExtensionDefinition()
	 * @generated
	 */
	int EXTENSION_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extension Attribute Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION__ID = 2;

	/**
	 * The number of structural features of the '<em>Extension Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl <em>Extension Attribute Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExtensionAttributeDefinition()
	 * @generated
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Extension Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION__ID = 4;

	/**
	 * The number of structural features of the '<em>Extension Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl <em>Extension Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExtensionAttributeValue()
	 * @generated
	 */
	int EXTENSION_ATTRIBUTE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_VALUE__VALUE_REF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Extension Attribute Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_VALUE__ID = 3;

	/**
	 * The number of structural features of the '<em>Extension Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ATTRIBUTE_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DocumentationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TEXT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__TEXT_FORMAT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.OperationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IN_MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUT_MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Error Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ERROR_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implementation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IMPLEMENTATION_REF = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.MessageImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ITEM_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ItemDefinitionImpl <em>Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ItemDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getItemDefinition()
	 * @generated
	 */
	int ITEM_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Item Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__ITEM_KIND = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__IS_COLLECTION = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION__IMPORT = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_DEFINITION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ImportImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 10;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAMESPACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ID = 3;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ErrorImpl <em>Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ErrorImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getError()
	 * @generated
	 */
	int ERROR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR__ERROR_CODE = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.EndPointImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.AuditingImpl <em>Auditing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.AuditingImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAuditing()
	 * @generated
	 */
	int AUDITING = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Auditing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDITING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CallableElementImpl <em>Callable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CallableElementImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCallableElement()
	 * @generated
	 */
	int CALLABLE_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__IO_SPECIFICATION = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT__IO_BINDING = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Callable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_ELEMENT_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalTaskImpl <em>Global Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalTask()
	 * @generated
	 */
	int GLOBAL_TASK = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__ID = CALLABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__EXTENSION_DEFINITIONS = CALLABLE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__EXTENSION_VALUES = CALLABLE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__DESCRIPTION = CALLABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__NAME = CALLABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__SUPPORTED_INTERFACE_REFS = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK__RESOURCES = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_TASK_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl <em>Input Output Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInputOutputSpecification()
	 * @generated
	 */
	int INPUT_OUTPUT_SPECIFICATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Input Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__INPUT_SETS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input Output Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_SPECIFICATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.InputSetImpl <em>Input Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.InputSetImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInputSet()
	 * @generated
	 */
	int INPUT_SET = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Input Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__DATA_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional Input Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__OPTIONAL_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>While Executing Input Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__WHILE_EXECUTING_INPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Set Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET__OUTPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Input Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ItemAwareElementImpl <em>Item Aware Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ItemAwareElementImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getItemAwareElement()
	 * @generated
	 */
	int ITEM_AWARE_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT__DATA_STATE = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item Aware Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_AWARE_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataInputImpl <em>Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataInputImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataInput()
	 * @generated
	 */
	int DATA_INPUT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__ID = ITEM_AWARE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__EXTENSION_DEFINITIONS = ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__EXTENSION_VALUES = ITEM_AWARE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__DOCUMENTATION = ITEM_AWARE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__DESCRIPTION = ITEM_AWARE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__ITEM_SUBJECT_REF = ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__DATA_STATE = ITEM_AWARE_ELEMENT__DATA_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__NAME = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__IS_COLLECTION = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Set With Optional</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__INPUT_SET_WITH_OPTIONAL = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Set With While Executing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Set Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__INPUT_SET_REFS = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_FEATURE_COUNT = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataStateImpl <em>Data State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataStateImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataState()
	 * @generated
	 */
	int DATA_STATE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STATE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.OutputSetImpl <em>Output Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.OutputSetImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getOutputSet()
	 * @generated
	 */
	int OUTPUT_SET = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Output Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__DATA_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Output Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__OPTIONAL_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>While Executing Output Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Set Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET__INPUT_SET_REFS = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Output Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl <em>Data Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataOutput()
	 * @generated
	 */
	int DATA_OUTPUT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__ID = ITEM_AWARE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__EXTENSION_DEFINITIONS = ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__EXTENSION_VALUES = ITEM_AWARE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__DOCUMENTATION = ITEM_AWARE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__DESCRIPTION = ITEM_AWARE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__ITEM_SUBJECT_REF = ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__DATA_STATE = ITEM_AWARE_ELEMENT__DATA_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__NAME = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__IS_COLLECTION = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Set With Optional</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Set With While Executing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Set Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__OUTPUT_SET_REFS = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_FEATURE_COUNT = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl <em>Input Output Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInputOutputBinding()
	 * @generated
	 */
	int INPUT_OUTPUT_BINDING = 23;

	/**
	 * The feature id for the '<em><b>Input Data Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_BINDING__INPUT_DATA_REF = 0;

	/**
	 * The feature id for the '<em><b>Output Data Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF = 1;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_BINDING__OPERATION_REF = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_BINDING__ID = 3;

	/**
	 * The number of structural features of the '<em>Input Output Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OUTPUT_BINDING_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl <em>Resource Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResourceRole()
	 * @generated
	 */
	int RESOURCE_ROLE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__RESOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE__NAME = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ROLE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_PARAMETERS = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterImpl <em>Resource Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceParameterImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResourceParameter()
	 * @generated
	 */
	int RESOURCE_PARAMETER = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__IS_REQUIRED = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER__TYPE = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterBindingImpl <em>Resource Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceParameterBindingImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResourceParameterBinding()
	 * @generated
	 */
	int RESOURCE_PARAMETER_BINDING = 27;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER_BINDING__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER_BINDING__PARAMETER_REF = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER_BINDING__ID = 2;

	/**
	 * The number of structural features of the '<em>Resource Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PARAMETER_BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ExpressionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceAssignmentExpressionImpl <em>Resource Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceAssignmentExpressionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResourceAssignmentExpression()
	 * @generated
	 */
	int RESOURCE_ASSIGNMENT_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ASSIGNMENT_EXPRESSION__ID = 1;

	/**
	 * The number of structural features of the '<em>Resource Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.MonitoringImpl <em>Monitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.MonitoringImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMonitoring()
	 * @generated
	 */
	int MONITORING = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.PerformerImpl <em>Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.PerformerImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getPerformer()
	 * @generated
	 */
	int PERFORMER = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__ID = RESOURCE_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__EXTENSION_DEFINITIONS = RESOURCE_ROLE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__EXTENSION_VALUES = RESOURCE_ROLE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__DOCUMENTATION = RESOURCE_ROLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__DESCRIPTION = RESOURCE_ROLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__RESOURCE_REF = RESOURCE_ROLE__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__RESOURCE_PARAMETER_BINDINGS = RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION = RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER__NAME = RESOURCE_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMER_FEATURE_COUNT = RESOURCE_ROLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ProcessImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ID = CALLABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXTENSION_DEFINITIONS = CALLABLE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXTENSION_VALUES = CALLABLE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOCUMENTATION = CALLABLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = CALLABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = CALLABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IO_SPECIFICATION = CALLABLE_ELEMENT__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPORTED_INTERFACE_REFS = CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IO_BINDING = CALLABLE_ELEMENT__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FLOW_ELEMENTS = CALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__LANE_SETS = CALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROCESS_TYPE = CALLABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_CLOSED = CALLABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__AUDITING = CALLABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MONITORING = CALLABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROPERTIES = CALLABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPORTS = CALLABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Definitional Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DEFINITIONAL_COLLABORATION_REF = CALLABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_EXECUTABLE = CALLABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESOURCES = CALLABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ARTIFACTS = CALLABLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Correlation Subscriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CORRELATION_SUBSCRIPTIONS = CALLABLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Decomposed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DECOMPOSED_BY = CALLABLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Decomposes</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DECOMPOSES = CALLABLE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = CALLABLE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementsContainerImpl <em>Flow Elements Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.FlowElementsContainerImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getFlowElementsContainer()
	 * @generated
	 */
	int FLOW_ELEMENTS_CONTAINER = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__LANE_SETS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Elements Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__AUDITING = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__MONITORING = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__CATEGORY_VALUE_REF = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CategoryValueImpl <em>Category Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CategoryValueImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCategoryValue()
	 * @generated
	 */
	int CATEGORY_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__VALUE = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categorized Flow Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE__CATEGORIZED_FLOW_ELEMENTS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_VALUE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.LaneSetImpl <em>Lane Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.LaneSetImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getLaneSet()
	 * @generated
	 */
	int LANE_SET = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__LANES = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lane Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_SET_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.LaneImpl <em>Lane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.LaneImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getLane()
	 * @generated
	 */
	int LANE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Lane Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__CHILD_LANE_SET = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partition Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__PARTITION_ELEMENT_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Flow Node Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__FLOW_NODE_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partition Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE__PARTITION_ELEMENT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.FlowNodeImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__DESCRIPTION = FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__OUTGOING = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__INCOMING = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__LANES = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__DESCRIPTION = FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__IS_IMMEDIATE = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__CONDITION_EXPRESSION = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TARGET_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__SOURCE_REF = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.PropertyImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = ITEM_AWARE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EXTENSION_DEFINITIONS = ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__EXTENSION_VALUES = ITEM_AWARE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DOCUMENTATION = ITEM_AWARE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = ITEM_AWARE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ITEM_SUBJECT_REF = ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_STATE = ITEM_AWARE_ELEMENT__DATA_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl <em>Collaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCollaboration()
	 * @generated
	 */
	int COLLABORATION = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__IS_CLOSED = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CHOREOGRAPHY_REF = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__ARTIFACTS = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__PARTICIPANT_ASSOCIATIONS = ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Message Flow Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS = ROOT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conversation Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CONVERSATION_ASSOCIATIONS = ROOT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__PARTICIPANTS = ROOT_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Message Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__MESSAGE_FLOWS = ROOT_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CORRELATION_KEYS = ROOT_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Conversations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CONVERSATIONS = ROOT_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Conversation Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION__CONVERSATION_LINKS = ROOT_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Collaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyImpl <em>Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ChoreographyImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getChoreography()
	 * @generated
	 */
	int CHOREOGRAPHY = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ID = COLLABORATION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__EXTENSION_DEFINITIONS = COLLABORATION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__EXTENSION_VALUES = COLLABORATION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__DOCUMENTATION = COLLABORATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__DESCRIPTION = COLLABORATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__NAME = COLLABORATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__IS_CLOSED = COLLABORATION__IS_CLOSED;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CHOREOGRAPHY_REF = COLLABORATION__CHOREOGRAPHY_REF;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__ARTIFACTS = COLLABORATION__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS = COLLABORATION__PARTICIPANT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Message Flow Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS = COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Conversation Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS = COLLABORATION__CONVERSATION_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__PARTICIPANTS = COLLABORATION__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Message Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__MESSAGE_FLOWS = COLLABORATION__MESSAGE_FLOWS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CORRELATION_KEYS = COLLABORATION__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Conversations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CONVERSATIONS = COLLABORATION__CONVERSATIONS;

	/**
	 * The feature id for the '<em><b>Conversation Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__CONVERSATION_LINKS = COLLABORATION__CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__FLOW_ELEMENTS = COLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__LANE_SETS = COLLABORATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ArtifactImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantAssociationImpl <em>Participant Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ParticipantAssociationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getParticipantAssociation()
	 * @generated
	 */
	int PARTICIPANT_ASSOCIATION = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inner Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Participant Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__INCOMING_CONVERSATION_LINKS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__OUTGOING_CONVERSATION_LINKS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__NAME = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__INTERFACE_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Participant Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PARTICIPANT_MULTIPLICITY = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Point Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__END_POINT_REFS = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PROCESS_REF = BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.InteractionNodeImpl <em>Interaction Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.InteractionNodeImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInteractionNode()
	 * @generated
	 */
	int INTERACTION_NODE = 46;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_NODE__INCOMING_CONVERSATION_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS = 1;

	/**
	 * The number of structural features of the '<em>Interaction Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConversationLinkImpl <em>Conversation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ConversationLinkImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConversationLink()
	 * @generated
	 */
	int CONVERSATION_LINK = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__SOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK__TARGET_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conversation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_LINK_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantMultiplicityImpl <em>Participant Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ParticipantMultiplicityImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getParticipantMultiplicity()
	 * @generated
	 */
	int PARTICIPANT_MULTIPLICITY = 48;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_MULTIPLICITY__MINIMUM = 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_MULTIPLICITY__MAXIMUM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_MULTIPLICITY__ID = 2;

	/**
	 * The number of structural features of the '<em>Participant Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_MULTIPLICITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowAssociationImpl <em>Message Flow Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.MessageFlowAssociationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMessageFlowAssociation()
	 * @generated
	 */
	int MESSAGE_FLOW_ASSOCIATION = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inner Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Message Flow Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Flow Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowImpl <em>Message Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.MessageFlowImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMessageFlow()
	 * @generated
	 */
	int MESSAGE_FLOW = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__SOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__TARGET_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW__MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FLOW_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConversationAssociationImpl <em>Conversation Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ConversationAssociationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConversationAssociation()
	 * @generated
	 */
	int CONVERSATION_ASSOCIATION = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inner Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conversation Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl <em>Conversation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConversationNode()
	 * @generated
	 */
	int CONVERSATION_NODE = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__NAME = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__PARTICIPANT_REFS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message Flow Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__MESSAGE_FLOW_REFS = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE__CORRELATION_KEYS = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Conversation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_NODE_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationKeyImpl <em>Correlation Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationKeyImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationKey()
	 * @generated
	 */
	int CORRELATION_KEY = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Correlation Property Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__CORRELATION_PROPERTY_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY__NAME = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_KEY_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyImpl <em>Correlation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationProperty()
	 * @generated
	 */
	int CORRELATION_PROPERTY = 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY__TYPE = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Correlation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl <em>Correlation Property Retrieval Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = 55;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Message Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Property Retrieval Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.FormalExpressionImpl <em>Formal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.FormalExpressionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getFormalExpression()
	 * @generated
	 */
	int FORMAL_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__EXTENSION_DEFINITIONS = EXPRESSION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__EXTENSION_VALUES = EXPRESSION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__DOCUMENTATION = EXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__LANGUAGE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__BODY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Evaluates To Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Formal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationSubscriptionImpl <em>Correlation Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationSubscriptionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationSubscription()
	 * @generated
	 */
	int CORRELATION_SUBSCRIPTION = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Correlation Key Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Property Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SUBSCRIPTION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyBindingImpl <em>Correlation Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyBindingImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationPropertyBinding()
	 * @generated
	 */
	int CORRELATION_PROPERTY_BINDING = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__DATA_PATH = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Property Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Correlation Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_PROPERTY_BINDING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalManualTaskImpl <em>Global Manual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalManualTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalManualTask()
	 * @generated
	 */
	int GLOBAL_MANUAL_TASK = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__ID = GLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__EXTENSION_DEFINITIONS = GLOBAL_TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__EXTENSION_VALUES = GLOBAL_TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__DESCRIPTION = GLOBAL_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__NAME = GLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__SUPPORTED_INTERFACE_REFS = GLOBAL_TASK__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK__RESOURCES = GLOBAL_TASK__RESOURCES;

	/**
	 * The number of structural features of the '<em>Global Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MANUAL_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ActivityImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXTENSION_DEFINITIONS = FLOW_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EXTENSION_VALUES = FLOW_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__AUDITING = FLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__MONITORING = FLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LANES = FLOW_NODE__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING_CONVERSATION_LINKS = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING_CONVERSATION_LINKS = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_FOR_COMPENSATION = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOOP_CHARACTERISTICS = FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCES = FLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DEFAULT = FLOW_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROPERTIES = FLOW_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IO_SPECIFICATION = FLOW_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BOUNDARY_EVENT_REFS = FLOW_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DATA_INPUT_ASSOCIATIONS = FLOW_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DATA_OUTPUT_ASSOCIATIONS = FLOW_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__START_QUANTITY = FLOW_NODE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__COMPLETION_QUANTITY = FLOW_NODE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.TaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTask()
	 * @generated
	 */
	int TASK = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXTENSION_DEFINITIONS = ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXTENSION_VALUES = ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AUDITING = ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MONITORING = ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LANES = ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING_CONVERSATION_LINKS = ACTIVITY__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING_CONVERSATION_LINKS = ACTIVITY__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEFAULT = ACTIVITY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROPERTIES = ACTIVITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_QUANTITY = ACTIVITY__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ManualTaskImpl <em>Manual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ManualTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getManualTask()
	 * @generated
	 */
	int MANUAL_TASK = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The number of structural features of the '<em>Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.LoopCharacteristicsImpl <em>Loop Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.LoopCharacteristicsImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getLoopCharacteristics()
	 * @generated
	 */
	int LOOP_CHARACTERISTICS = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_CHARACTERISTICS_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.EventImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 66;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXTENSION_DEFINITIONS = FLOW_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXTENSION_VALUES = FLOW_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__AUDITING = FLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MONITORING = FLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LANES = FLOW_NODE__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INCOMING_CONVERSATION_LINKS = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUTGOING_CONVERSATION_LINKS = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PROPERTIES = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl <em>Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCatchEvent()
	 * @generated
	 */
	int CATCH_EVENT = 65;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__EXTENSION_DEFINITIONS = EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__EXTENSION_VALUES = EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__DOCUMENTATION = EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__AUDITING = EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__MONITORING = EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__CATEGORY_VALUE_REF = EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__INCOMING = EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__LANES = EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__INCOMING_CONVERSATION_LINKS = EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__OUTGOING_CONVERSATION_LINKS = EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__PROPERTIES = EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__PARALLEL_MULTIPLE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__OUTPUT_SET = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__EVENT_DEFINITION_REFS = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__DATA_OUTPUTS = EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT__EVENT_DEFINITIONS = EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.BoundaryEventImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getBoundaryEvent()
	 * @generated
	 */
	int BOUNDARY_EVENT = 64;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__ID = CATCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__EXTENSION_DEFINITIONS = CATCH_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__EXTENSION_VALUES = CATCH_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__DOCUMENTATION = CATCH_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__DESCRIPTION = CATCH_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__AUDITING = CATCH_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__MONITORING = CATCH_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__CATEGORY_VALUE_REF = CATCH_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__INCOMING = CATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__LANES = CATCH_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__INCOMING_CONVERSATION_LINKS = CATCH_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__OUTGOING_CONVERSATION_LINKS = CATCH_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__PROPERTIES = CATCH_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__EVENT_DEFINITION_REFS = CATCH_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__DATA_OUTPUTS = CATCH_EVENT__DATA_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__EVENT_DEFINITIONS = CATCH_EVENT__EVENT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Cancel Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__CANCEL_ACTIVITY = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attached To Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT__ATTACHED_TO_REF = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.EventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEventDefinition()
	 * @generated
	 */
	int EVENT_DEFINITION = 67;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_DEFINITION_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl <em>Data Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataAssociation()
	 * @generated
	 */
	int DATA_ASSOCIATION = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__TRANSFORMATION = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__ASSIGNMENT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__TARGET_REF = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION__SOURCE_REF = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ASSOCIATION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputAssociationImpl <em>Data Output Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataOutputAssociationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataOutputAssociation()
	 * @generated
	 */
	int DATA_OUTPUT_ASSOCIATION = 68;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__ID = DATA_ASSOCIATION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__EXTENSION_DEFINITIONS = DATA_ASSOCIATION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__EXTENSION_VALUES = DATA_ASSOCIATION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__DOCUMENTATION = DATA_ASSOCIATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__DESCRIPTION = DATA_ASSOCIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__TRANSFORMATION = DATA_ASSOCIATION__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__ASSIGNMENT = DATA_ASSOCIATION__ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__TARGET_REF = DATA_ASSOCIATION__TARGET_REF;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION__SOURCE_REF = DATA_ASSOCIATION__SOURCE_REF;

	/**
	 * The number of structural features of the '<em>Data Output Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_ASSOCIATION_FEATURE_COUNT = DATA_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.AssignmentImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 70;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FROM = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__TO = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataInputAssociationImpl <em>Data Input Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataInputAssociationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataInputAssociation()
	 * @generated
	 */
	int DATA_INPUT_ASSOCIATION = 71;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__ID = DATA_ASSOCIATION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__EXTENSION_DEFINITIONS = DATA_ASSOCIATION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__EXTENSION_VALUES = DATA_ASSOCIATION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__DOCUMENTATION = DATA_ASSOCIATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__DESCRIPTION = DATA_ASSOCIATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__TRANSFORMATION = DATA_ASSOCIATION__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__ASSIGNMENT = DATA_ASSOCIATION__ASSIGNMENT;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__TARGET_REF = DATA_ASSOCIATION__TARGET_REF;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION__SOURCE_REF = DATA_ASSOCIATION__SOURCE_REF;

	/**
	 * The number of structural features of the '<em>Data Input Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_ASSOCIATION_FEATURE_COUNT = DATA_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.UserTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 72;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Renderings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__RENDERINGS = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.RenderingImpl <em>Rendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.RenderingImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getRendering()
	 * @generated
	 */
	int RENDERING = 73;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Rendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENDERING_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.HumanPerformerImpl <em>Human Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.HumanPerformerImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getHumanPerformer()
	 * @generated
	 */
	int HUMAN_PERFORMER = 74;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__ID = PERFORMER__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__EXTENSION_DEFINITIONS = PERFORMER__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__EXTENSION_VALUES = PERFORMER__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__DOCUMENTATION = PERFORMER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__DESCRIPTION = PERFORMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__RESOURCE_REF = PERFORMER__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__RESOURCE_PARAMETER_BINDINGS = PERFORMER__RESOURCE_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION = PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER__NAME = PERFORMER__NAME;

	/**
	 * The number of structural features of the '<em>Human Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUMAN_PERFORMER_FEATURE_COUNT = PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.PotentialOwnerImpl <em>Potential Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.PotentialOwnerImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getPotentialOwner()
	 * @generated
	 */
	int POTENTIAL_OWNER = 75;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__ID = HUMAN_PERFORMER__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__EXTENSION_DEFINITIONS = HUMAN_PERFORMER__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__EXTENSION_VALUES = HUMAN_PERFORMER__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__DOCUMENTATION = HUMAN_PERFORMER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__DESCRIPTION = HUMAN_PERFORMER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__RESOURCE_REF = HUMAN_PERFORMER__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Resource Parameter Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__RESOURCE_PARAMETER_BINDINGS = HUMAN_PERFORMER__RESOURCE_PARAMETER_BINDINGS;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__RESOURCE_ASSIGNMENT_EXPRESSION = HUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER__NAME = HUMAN_PERFORMER__NAME;

	/**
	 * The number of structural features of the '<em>Potential Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENTIAL_OWNER_FEATURE_COUNT = HUMAN_PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalUserTaskImpl <em>Global User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalUserTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalUserTask()
	 * @generated
	 */
	int GLOBAL_USER_TASK = 76;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__ID = GLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__EXTENSION_DEFINITIONS = GLOBAL_TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__EXTENSION_VALUES = GLOBAL_TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__DESCRIPTION = GLOBAL_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__NAME = GLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__SUPPORTED_INTERFACE_REFS = GLOBAL_TASK__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__RESOURCES = GLOBAL_TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__IMPLEMENTATION = GLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Renderings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK__RENDERINGS = GLOBAL_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_USER_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.GatewayImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 77;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__EXTENSION_DEFINITIONS = FLOW_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__EXTENSION_VALUES = FLOW_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__AUDITING = FLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__MONITORING = FLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__LANES = FLOW_NODE__LANES;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GATEWAY_DIRECTION = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.EventBasedGatewayImpl <em>Event Based Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.EventBasedGatewayImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEventBasedGateway()
	 * @generated
	 */
	int EVENT_BASED_GATEWAY = 78;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Instantiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__INSTANTIATE = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Gateway Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Based Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BASED_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ComplexGatewayImpl <em>Complex Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ComplexGatewayImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getComplexGateway()
	 * @generated
	 */
	int COMPLEX_GATEWAY = 79;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Activation Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__ACTIVATION_CONDITION = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY__DEFAULT = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ExclusiveGatewayImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExclusiveGateway()
	 * @generated
	 */
	int EXCLUSIVE_GATEWAY = 80;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__DEFAULT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.InclusiveGatewayImpl <em>Inclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.InclusiveGatewayImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInclusiveGateway()
	 * @generated
	 */
	int INCLUSIVE_GATEWAY = 81;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__DEFAULT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ParallelGatewayImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getParallelGateway()
	 * @generated
	 */
	int PARALLEL_GATEWAY = 82;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__ID = GATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__EXTENSION_DEFINITIONS = GATEWAY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__EXTENSION_VALUES = GATEWAY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__DOCUMENTATION = GATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__AUDITING = GATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__MONITORING = GATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__CATEGORY_VALUE_REF = GATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__LANES = GATEWAY__LANES;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__GATEWAY_DIRECTION = GATEWAY__GATEWAY_DIRECTION;

	/**
	 * The number of structural features of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.RelationshipImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 83;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DIRECTION = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCES = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGETS = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ExtensionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 84;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MUST_UNDERSTAND = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ID = 2;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.IntermediateCatchEventImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getIntermediateCatchEvent()
	 * @generated
	 */
	int INTERMEDIATE_CATCH_EVENT = 85;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__ID = CATCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__EXTENSION_DEFINITIONS = CATCH_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__EXTENSION_VALUES = CATCH_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__DOCUMENTATION = CATCH_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__DESCRIPTION = CATCH_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__AUDITING = CATCH_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__MONITORING = CATCH_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__CATEGORY_VALUE_REF = CATCH_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__INCOMING = CATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__LANES = CATCH_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__INCOMING_CONVERSATION_LINKS = CATCH_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__OUTGOING_CONVERSATION_LINKS = CATCH_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__PROPERTIES = CATCH_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__EVENT_DEFINITION_REFS = CATCH_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__DATA_OUTPUTS = CATCH_EVENT__DATA_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT__EVENT_DEFINITIONS = CATCH_EVENT__EVENT_DEFINITIONS;

	/**
	 * The number of structural features of the '<em>Intermediate Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_CATCH_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl <em>Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getThrowEvent()
	 * @generated
	 */
	int THROW_EVENT = 87;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__EXTENSION_DEFINITIONS = EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__EXTENSION_VALUES = EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__DOCUMENTATION = EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__AUDITING = EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__MONITORING = EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__CATEGORY_VALUE_REF = EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__OUTGOING = EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__INCOMING = EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__LANES = EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__INCOMING_CONVERSATION_LINKS = EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__OUTGOING_CONVERSATION_LINKS = EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__PROPERTIES = EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__INPUT_SET = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__EVENT_DEFINITION_REFS = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__DATA_INPUT_ASSOCIATION = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__DATA_INPUTS = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT__EVENT_DEFINITIONS = EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.IntermediateThrowEventImpl <em>Intermediate Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.IntermediateThrowEventImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getIntermediateThrowEvent()
	 * @generated
	 */
	int INTERMEDIATE_THROW_EVENT = 86;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__ID = THROW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__EXTENSION_DEFINITIONS = THROW_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__EXTENSION_VALUES = THROW_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__DOCUMENTATION = THROW_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__DESCRIPTION = THROW_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__AUDITING = THROW_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__MONITORING = THROW_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__CATEGORY_VALUE_REF = THROW_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__INCOMING = THROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__LANES = THROW_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__INCOMING_CONVERSATION_LINKS = THROW_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__OUTGOING_CONVERSATION_LINKS = THROW_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__PROPERTIES = THROW_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__EVENT_DEFINITION_REFS = THROW_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__DATA_INPUTS = THROW_EVENT__DATA_INPUTS;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT__EVENT_DEFINITIONS = THROW_EVENT__EVENT_DEFINITIONS;

	/**
	 * The number of structural features of the '<em>Intermediate Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_THROW_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.EndEventImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 88;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__ID = THROW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EXTENSION_DEFINITIONS = THROW_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EXTENSION_VALUES = THROW_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DOCUMENTATION = THROW_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DESCRIPTION = THROW_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__AUDITING = THROW_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__MONITORING = THROW_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__CATEGORY_VALUE_REF = THROW_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__INCOMING = THROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__LANES = THROW_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__INCOMING_CONVERSATION_LINKS = THROW_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__OUTGOING_CONVERSATION_LINKS = THROW_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__PROPERTIES = THROW_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EVENT_DEFINITION_REFS = THROW_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__DATA_INPUTS = THROW_EVENT__DATA_INPUTS;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__EVENT_DEFINITIONS = THROW_EVENT__EVENT_DEFINITIONS;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.StartEventImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 89;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__ID = CATCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EXTENSION_DEFINITIONS = CATCH_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EXTENSION_VALUES = CATCH_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DOCUMENTATION = CATCH_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DESCRIPTION = CATCH_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NAME = CATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__AUDITING = CATCH_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__MONITORING = CATCH_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__CATEGORY_VALUE_REF = CATCH_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__OUTGOING = CATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__INCOMING = CATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__LANES = CATCH_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__INCOMING_CONVERSATION_LINKS = CATCH_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__OUTGOING_CONVERSATION_LINKS = CATCH_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__PROPERTIES = CATCH_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__PARALLEL_MULTIPLE = CATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__OUTPUT_SET = CATCH_EVENT__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EVENT_DEFINITION_REFS = CATCH_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DATA_OUTPUT_ASSOCIATION = CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__DATA_OUTPUTS = CATCH_EVENT__DATA_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__EVENT_DEFINITIONS = CATCH_EVENT__EVENT_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Is Interrupting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__IS_INTERRUPTING = CATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = CATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CancelEventDefinitionImpl <em>Cancel Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CancelEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCancelEventDefinition()
	 * @generated
	 */
	int CANCEL_EVENT_DEFINITION = 90;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Cancel Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ErrorEventDefinitionImpl <em>Error Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ErrorEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getErrorEventDefinition()
	 * @generated
	 */
	int ERROR_EVENT_DEFINITION = 91;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Error Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION__ERROR_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.TerminateEventDefinitionImpl <em>Terminate Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.TerminateEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTerminateEventDefinition()
	 * @generated
	 */
	int TERMINATE_EVENT_DEFINITION = 92;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Terminate Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.EscalationEventDefinitionImpl <em>Escalation Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.EscalationEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEscalationEventDefinition()
	 * @generated
	 */
	int ESCALATION_EVENT_DEFINITION = 93;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Escalation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION__ESCALATION_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Escalation Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.EscalationImpl <em>Escalation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.EscalationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEscalation()
	 * @generated
	 */
	int ESCALATION = 94;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION__STRUCTURE_REF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Escalation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION__ESCALATION_CODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION__ID = 3;

	/**
	 * The number of structural features of the '<em>Escalation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESCALATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CompensateEventDefinitionImpl <em>Compensate Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CompensateEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCompensateEventDefinition()
	 * @generated
	 */
	int COMPENSATE_EVENT_DEFINITION = 95;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Wait For Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compensate Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.TimerEventDefinitionImpl <em>Timer Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.TimerEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTimerEventDefinition()
	 * @generated
	 */
	int TIMER_EVENT_DEFINITION = 96;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Time Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__TIME_DATE = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__TIME_CYCLE = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION__TIME_DURATION = EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timer Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.LinkEventDefinitionImpl <em>Link Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.LinkEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getLinkEventDefinition()
	 * @generated
	 */
	int LINK_EVENT_DEFINITION = 97;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__NAME = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__TARGET = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION__SOURCE = EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Link Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.MessageEventDefinitionImpl <em>Message Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.MessageEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMessageEventDefinition()
	 * @generated
	 */
	int MESSAGE_EVENT_DEFINITION = 98;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__MESSAGE_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION__OPERATION_REF = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConditionalEventDefinitionImpl <em>Conditional Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ConditionalEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConditionalEventDefinition()
	 * @generated
	 */
	int CONDITIONAL_EVENT_DEFINITION = 99;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION__CONDITION = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.SignalEventDefinitionImpl <em>Signal Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.SignalEventDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSignalEventDefinition()
	 * @generated
	 */
	int SIGNAL_EVENT_DEFINITION = 100;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__ID = EVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__EXTENSION_DEFINITIONS = EVENT_DEFINITION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__EXTENSION_VALUES = EVENT_DEFINITION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__DOCUMENTATION = EVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__DESCRIPTION = EVENT_DEFINITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Signal Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION__SIGNAL_REF = EVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signal Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_EVENT_DEFINITION_FEATURE_COUNT = EVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.SignalImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 101;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__STRUCTURE_REF = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ImplicitThrowEventImpl <em>Implicit Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ImplicitThrowEventImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getImplicitThrowEvent()
	 * @generated
	 */
	int IMPLICIT_THROW_EVENT = 102;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__ID = THROW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__EXTENSION_DEFINITIONS = THROW_EVENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__EXTENSION_VALUES = THROW_EVENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__DOCUMENTATION = THROW_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__DESCRIPTION = THROW_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__NAME = THROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__AUDITING = THROW_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__MONITORING = THROW_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__CATEGORY_VALUE_REF = THROW_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__OUTGOING = THROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__INCOMING = THROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__LANES = THROW_EVENT__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__INCOMING_CONVERSATION_LINKS = THROW_EVENT__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__OUTGOING_CONVERSATION_LINKS = THROW_EVENT__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__PROPERTIES = THROW_EVENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__INPUT_SET = THROW_EVENT__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__EVENT_DEFINITION_REFS = THROW_EVENT__EVENT_DEFINITION_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__DATA_INPUT_ASSOCIATION = THROW_EVENT__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__DATA_INPUTS = THROW_EVENT__DATA_INPUTS;

	/**
	 * The feature id for the '<em><b>Event Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT__EVENT_DEFINITIONS = THROW_EVENT__EVENT_DEFINITIONS;

	/**
	 * The number of structural features of the '<em>Implicit Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICIT_THROW_EVENT_FEATURE_COUNT = THROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataObjectImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 103;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DESCRIPTION = FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ITEM_SUBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DATA_STATE = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__IS_COLLECTION = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataStoreImpl <em>Data Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataStoreImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataStore()
	 * @generated
	 */
	int DATA_STORE = 104;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__ID = ITEM_AWARE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__EXTENSION_DEFINITIONS = ITEM_AWARE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__EXTENSION_VALUES = ITEM_AWARE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__DOCUMENTATION = ITEM_AWARE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__DESCRIPTION = ITEM_AWARE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__ITEM_SUBJECT_REF = ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__DATA_STATE = ITEM_AWARE_ELEMENT__DATA_STATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__NAME = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__CAPACITY = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unlimited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__IS_UNLIMITED = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_FEATURE_COUNT = ITEM_AWARE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataStoreReferenceImpl <em>Data Store Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataStoreReferenceImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataStoreReference()
	 * @generated
	 */
	int DATA_STORE_REFERENCE = 105;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__DESCRIPTION = FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__ITEM_SUBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__DATA_STATE = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Store Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE__DATA_STORE_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Store Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_REFERENCE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl <em>Data Object Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataObjectReference()
	 * @generated
	 */
	int DATA_OBJECT_REFERENCE = 106;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__ID = FLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__EXTENSION_DEFINITIONS = FLOW_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__EXTENSION_VALUES = FLOW_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__DOCUMENTATION = FLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__DESCRIPTION = FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__AUDITING = FLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__MONITORING = FLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__CATEGORY_VALUE_REF = FLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__DATA_STATE = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE__DATA_OBJECT_REF = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_REFERENCE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CallConversationImpl <em>Call Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CallConversationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCallConversation()
	 * @generated
	 */
	int CALL_CONVERSATION = 107;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__ID = CONVERSATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__EXTENSION_DEFINITIONS = CONVERSATION_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__EXTENSION_VALUES = CONVERSATION_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__DOCUMENTATION = CONVERSATION_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__DESCRIPTION = CONVERSATION_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__INCOMING_CONVERSATION_LINKS = CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__OUTGOING_CONVERSATION_LINKS = CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__NAME = CONVERSATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__PARTICIPANT_REFS = CONVERSATION_NODE__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Message Flow Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__MESSAGE_FLOW_REFS = CONVERSATION_NODE__MESSAGE_FLOW_REFS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__CORRELATION_KEYS = CONVERSATION_NODE__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Called Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__CALLED_COLLABORATION_REF = CONVERSATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS = CONVERSATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CONVERSATION_FEATURE_COUNT = CONVERSATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConversationImpl <em>Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ConversationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConversation()
	 * @generated
	 */
	int CONVERSATION = 108;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__ID = CONVERSATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__EXTENSION_DEFINITIONS = CONVERSATION_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__EXTENSION_VALUES = CONVERSATION_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__DOCUMENTATION = CONVERSATION_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__DESCRIPTION = CONVERSATION_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__INCOMING_CONVERSATION_LINKS = CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__OUTGOING_CONVERSATION_LINKS = CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__NAME = CONVERSATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__PARTICIPANT_REFS = CONVERSATION_NODE__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Message Flow Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__MESSAGE_FLOW_REFS = CONVERSATION_NODE__MESSAGE_FLOW_REFS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION__CORRELATION_KEYS = CONVERSATION_NODE__CORRELATION_KEYS;

	/**
	 * The number of structural features of the '<em>Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERSATION_FEATURE_COUNT = CONVERSATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.SubConversationImpl <em>Sub Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.SubConversationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSubConversation()
	 * @generated
	 */
	int SUB_CONVERSATION = 109;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__ID = CONVERSATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__EXTENSION_DEFINITIONS = CONVERSATION_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__EXTENSION_VALUES = CONVERSATION_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__DOCUMENTATION = CONVERSATION_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__DESCRIPTION = CONVERSATION_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__INCOMING_CONVERSATION_LINKS = CONVERSATION_NODE__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__OUTGOING_CONVERSATION_LINKS = CONVERSATION_NODE__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__NAME = CONVERSATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__PARTICIPANT_REFS = CONVERSATION_NODE__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Message Flow Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__MESSAGE_FLOW_REFS = CONVERSATION_NODE__MESSAGE_FLOW_REFS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__CORRELATION_KEYS = CONVERSATION_NODE__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Conversation Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION__CONVERSATION_NODES = CONVERSATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CONVERSATION_FEATURE_COUNT = CONVERSATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalConversationImpl <em>Global Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalConversationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalConversation()
	 * @generated
	 */
	int GLOBAL_CONVERSATION = 110;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__ID = COLLABORATION__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__EXTENSION_DEFINITIONS = COLLABORATION__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__EXTENSION_VALUES = COLLABORATION__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__DOCUMENTATION = COLLABORATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__DESCRIPTION = COLLABORATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__NAME = COLLABORATION__NAME;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__IS_CLOSED = COLLABORATION__IS_CLOSED;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CHOREOGRAPHY_REF = COLLABORATION__CHOREOGRAPHY_REF;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__ARTIFACTS = COLLABORATION__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__PARTICIPANT_ASSOCIATIONS = COLLABORATION__PARTICIPANT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Message Flow Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__MESSAGE_FLOW_ASSOCIATIONS = COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Conversation Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CONVERSATION_ASSOCIATIONS = COLLABORATION__CONVERSATION_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__PARTICIPANTS = COLLABORATION__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Message Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__MESSAGE_FLOWS = COLLABORATION__MESSAGE_FLOWS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CORRELATION_KEYS = COLLABORATION__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Conversations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CONVERSATIONS = COLLABORATION__CONVERSATIONS;

	/**
	 * The feature id for the '<em><b>Conversation Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION__CONVERSATION_LINKS = COLLABORATION__CONVERSATION_LINKS;

	/**
	 * The number of structural features of the '<em>Global Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CONVERSATION_FEATURE_COUNT = COLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.PartnerEntityImpl <em>Partner Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.PartnerEntityImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getPartnerEntity()
	 * @generated
	 */
	int PARTNER_ENTITY = 111;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY__PARTICIPANT_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partner Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ENTITY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.PartnerRoleImpl <em>Partner Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.PartnerRoleImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getPartnerRole()
	 * @generated
	 */
	int PARTNER_ROLE = 112;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__NAME = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE__PARTICIPANT_REF = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partner Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ROLE_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl <em>Choreography Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getChoreographyActivity()
	 * @generated
	 */
	int CHOREOGRAPHY_ACTIVITY = 113;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__ID = FLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__EXTENSION_DEFINITIONS = FLOW_NODE__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__EXTENSION_VALUES = FLOW_NODE__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__DOCUMENTATION = FLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__AUDITING = FLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__MONITORING = FLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF = FLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__LANES = FLOW_NODE__LANES;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY__LOOP_TYPE = FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Choreography Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CallChoreographyImpl <em>Call Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CallChoreographyImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCallChoreography()
	 * @generated
	 */
	int CALL_CHOREOGRAPHY = 114;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__ID = CHOREOGRAPHY_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__EXTENSION_DEFINITIONS = CHOREOGRAPHY_ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__EXTENSION_VALUES = CHOREOGRAPHY_ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__DOCUMENTATION = CHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__DESCRIPTION = CHOREOGRAPHY_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__NAME = CHOREOGRAPHY_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__AUDITING = CHOREOGRAPHY_ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__MONITORING = CHOREOGRAPHY_ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__CATEGORY_VALUE_REF = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__OUTGOING = CHOREOGRAPHY_ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__INCOMING = CHOREOGRAPHY_ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__LANES = CHOREOGRAPHY_ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__PARTICIPANT_REFS = CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__CORRELATION_KEYS = CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__LOOP_TYPE = CHOREOGRAPHY_ACTIVITY__LOOP_TYPE;

	/**
	 * The feature id for the '<em><b>Called Choreography Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHOREOGRAPHY_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.SubChoreographyImpl <em>Sub Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.SubChoreographyImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSubChoreography()
	 * @generated
	 */
	int SUB_CHOREOGRAPHY = 115;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__ID = CHOREOGRAPHY_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__EXTENSION_DEFINITIONS = CHOREOGRAPHY_ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__EXTENSION_VALUES = CHOREOGRAPHY_ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__DOCUMENTATION = CHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__DESCRIPTION = CHOREOGRAPHY_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__NAME = CHOREOGRAPHY_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__AUDITING = CHOREOGRAPHY_ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__MONITORING = CHOREOGRAPHY_ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__CATEGORY_VALUE_REF = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__OUTGOING = CHOREOGRAPHY_ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__INCOMING = CHOREOGRAPHY_ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__LANES = CHOREOGRAPHY_ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__PARTICIPANT_REFS = CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__CORRELATION_KEYS = CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__LOOP_TYPE = CHOREOGRAPHY_ACTIVITY__LOOP_TYPE;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__FLOW_ELEMENTS = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__LANE_SETS = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY__ARTIFACTS = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CHOREOGRAPHY_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyTaskImpl <em>Choreography Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ChoreographyTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getChoreographyTask()
	 * @generated
	 */
	int CHOREOGRAPHY_TASK = 116;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__ID = CHOREOGRAPHY_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__EXTENSION_DEFINITIONS = CHOREOGRAPHY_ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__EXTENSION_VALUES = CHOREOGRAPHY_ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__DOCUMENTATION = CHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__DESCRIPTION = CHOREOGRAPHY_ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__NAME = CHOREOGRAPHY_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__AUDITING = CHOREOGRAPHY_ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__MONITORING = CHOREOGRAPHY_ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__CATEGORY_VALUE_REF = CHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__OUTGOING = CHOREOGRAPHY_ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__INCOMING = CHOREOGRAPHY_ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__LANES = CHOREOGRAPHY_ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Participant Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__PARTICIPANT_REFS = CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__CORRELATION_KEYS = CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__LOOP_TYPE = CHOREOGRAPHY_ACTIVITY__LOOP_TYPE;

	/**
	 * The feature id for the '<em><b>Message Flow Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_TASK_FEATURE_COUNT = CHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalChoreographyTaskImpl <em>Global Choreography Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalChoreographyTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalChoreographyTask()
	 * @generated
	 */
	int GLOBAL_CHOREOGRAPHY_TASK = 117;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__ID = CHOREOGRAPHY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_DEFINITIONS = CHOREOGRAPHY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__EXTENSION_VALUES = CHOREOGRAPHY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__DOCUMENTATION = CHOREOGRAPHY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__DESCRIPTION = CHOREOGRAPHY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__NAME = CHOREOGRAPHY__NAME;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__IS_CLOSED = CHOREOGRAPHY__IS_CLOSED;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CHOREOGRAPHY_REF = CHOREOGRAPHY__CHOREOGRAPHY_REF;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__ARTIFACTS = CHOREOGRAPHY__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Participant Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT_ASSOCIATIONS = CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Message Flow Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW_ASSOCIATIONS = CHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Conversation Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_ASSOCIATIONS = CHOREOGRAPHY__CONVERSATION_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__PARTICIPANTS = CHOREOGRAPHY__PARTICIPANTS;

	/**
	 * The feature id for the '<em><b>Message Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOWS = CHOREOGRAPHY__MESSAGE_FLOWS;

	/**
	 * The feature id for the '<em><b>Correlation Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CORRELATION_KEYS = CHOREOGRAPHY__CORRELATION_KEYS;

	/**
	 * The feature id for the '<em><b>Conversations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CONVERSATIONS = CHOREOGRAPHY__CONVERSATIONS;

	/**
	 * The feature id for the '<em><b>Conversation Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_LINKS = CHOREOGRAPHY__CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__FLOW_ELEMENTS = CHOREOGRAPHY__FLOW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__LANE_SETS = CHOREOGRAPHY__LANE_SETS;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF = CHOREOGRAPHY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Choreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_CHOREOGRAPHY_TASK_FEATURE_COUNT = CHOREOGRAPHY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.TextAnnotationImpl <em>Text Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.TextAnnotationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTextAnnotation()
	 * @generated
	 */
	int TEXT_ANNOTATION = 118;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__ID = ARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__EXTENSION_DEFINITIONS = ARTIFACT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__EXTENSION_VALUES = ARTIFACT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__DOCUMENTATION = ARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__DESCRIPTION = ARTIFACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__TEXT = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION__TEXT_FORMAT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ANNOTATION_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.GroupImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 119;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = ARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__EXTENSION_DEFINITIONS = ARTIFACT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__EXTENSION_VALUES = ARTIFACT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DOCUMENTATION = ARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = ARTIFACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CATEGORY_VALUE_REF = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.AssociationImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 120;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ID = ARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__EXTENSION_DEFINITIONS = ARTIFACT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__EXTENSION_VALUES = ARTIFACT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DOCUMENTATION = ARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DESCRIPTION = ARTIFACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Association Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_DIRECTION = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_REF = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_REF = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CategoryImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 121;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = ROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__EXTENSION_DEFINITIONS = ROOT_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__EXTENSION_VALUES = ROOT_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DOCUMENTATION = ROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Category Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_VALUE = ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ServiceTaskImpl <em>Service Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ServiceTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getServiceTask()
	 * @generated
	 */
	int SERVICE_TASK = 122;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl <em>Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSubProcess()
	 * @generated
	 */
	int SUB_PROCESS = 123;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__EXTENSION_DEFINITIONS = ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__EXTENSION_VALUES = ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__AUDITING = ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__MONITORING = ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LANES = ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__INCOMING_CONVERSATION_LINKS = ACTIVITY__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__OUTGOING_CONVERSATION_LINKS = ACTIVITY__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DEFAULT = ACTIVITY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__PROPERTIES = ACTIVITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__START_QUANTITY = ACTIVITY__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__FLOW_ELEMENTS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LANE_SETS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__TRIGGERED_BY_EVENT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ARTIFACTS = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl <em>Multi Instance Loop Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS = 124;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__ID = LOOP_CHARACTERISTICS__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS = LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_VALUES = LOOP_CHARACTERISTICS__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__DOCUMENTATION = LOOP_CHARACTERISTICS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__DESCRIPTION = LOOP_CHARACTERISTICS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL = LOOP_CHARACTERISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR = LOOP_CHARACTERISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loop Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY = LOOP_CHARACTERISTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loop Data Input Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Loop Data Output Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Complex Behavior Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>One Behavior Event Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>None Behavior Event Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF = LOOP_CHARACTERISTICS_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Multi Instance Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INSTANCE_LOOP_CHARACTERISTICS_FEATURE_COUNT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ComplexBehaviorDefinitionImpl <em>Complex Behavior Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ComplexBehaviorDefinitionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getComplexBehaviorDefinition()
	 * @generated
	 */
	int COMPLEX_BEHAVIOR_DEFINITION = 125;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__CONDITION = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION__EVENT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_DEFINITION_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.StandardLoopCharacteristicsImpl <em>Standard Loop Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.StandardLoopCharacteristicsImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getStandardLoopCharacteristics()
	 * @generated
	 */
	int STANDARD_LOOP_CHARACTERISTICS = 126;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__ID = LOOP_CHARACTERISTICS__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS = LOOP_CHARACTERISTICS__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__EXTENSION_VALUES = LOOP_CHARACTERISTICS__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__DOCUMENTATION = LOOP_CHARACTERISTICS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__DESCRIPTION = LOOP_CHARACTERISTICS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Test Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE = LOOP_CHARACTERISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION = LOOP_CHARACTERISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loop Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM = LOOP_CHARACTERISTICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Standard Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LOOP_CHARACTERISTICS_FEATURE_COUNT = LOOP_CHARACTERISTICS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.CallActivityImpl <em>Call Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.CallActivityImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCallActivity()
	 * @generated
	 */
	int CALL_ACTIVITY = 127;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__EXTENSION_DEFINITIONS = ACTIVITY__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__EXTENSION_VALUES = ACTIVITY__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__AUDITING = ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__MONITORING = ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__CATEGORY_VALUE_REF = ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__LANES = ACTIVITY__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__INCOMING_CONVERSATION_LINKS = ACTIVITY__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__OUTGOING_CONVERSATION_LINKS = ACTIVITY__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__IS_FOR_COMPENSATION = ACTIVITY__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__LOOP_CHARACTERISTICS = ACTIVITY__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__RESOURCES = ACTIVITY__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__DEFAULT = ACTIVITY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__PROPERTIES = ACTIVITY__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__IO_SPECIFICATION = ACTIVITY__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__BOUNDARY_EVENT_REFS = ACTIVITY__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__DATA_INPUT_ASSOCIATIONS = ACTIVITY__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__DATA_OUTPUT_ASSOCIATIONS = ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__START_QUANTITY = ACTIVITY__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__COMPLETION_QUANTITY = ACTIVITY__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Called Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY__CALLED_ELEMENT_REF = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.SendTaskImpl <em>Send Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.SendTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSendTask()
	 * @generated
	 */
	int SEND_TASK = 128;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK__MESSAGE_REF = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Send Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ReceiveTaskImpl <em>Receive Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ReceiveTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getReceiveTask()
	 * @generated
	 */
	int RECEIVE_TASK = 129;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__INSTANTIATE = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__OPERATION_REF = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK__MESSAGE_REF = TASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Receive Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.ScriptTaskImpl <em>Script Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.ScriptTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getScriptTask()
	 * @generated
	 */
	int SCRIPT_TASK = 130;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Script Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__SCRIPT_FORMAT = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__SCRIPT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Script Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.BusinessRuleTaskImpl <em>Business Rule Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.BusinessRuleTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getBusinessRuleTask()
	 * @generated
	 */
	int BUSINESS_RULE_TASK = 131;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__EXTENSION_DEFINITIONS = TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__EXTENSION_VALUES = TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__DOCUMENTATION = TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__AUDITING = TASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__MONITORING = TASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__CATEGORY_VALUE_REF = TASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__LANES = TASK__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__INCOMING_CONVERSATION_LINKS = TASK__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__OUTGOING_CONVERSATION_LINKS = TASK__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__IS_FOR_COMPENSATION = TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__LOOP_CHARACTERISTICS = TASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__RESOURCES = TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__DEFAULT = TASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__PROPERTIES = TASK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__IO_SPECIFICATION = TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__BOUNDARY_EVENT_REFS = TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__DATA_INPUT_ASSOCIATIONS = TASK__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__DATA_OUTPUT_ASSOCIATIONS = TASK__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__START_QUANTITY = TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__COMPLETION_QUANTITY = TASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK__IMPLEMENTATION = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Business Rule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_RULE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl <em>Ad Hoc Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAdHocSubProcess()
	 * @generated
	 */
	int AD_HOC_SUB_PROCESS = 132;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__ID = SUB_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__EXTENSION_DEFINITIONS = SUB_PROCESS__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__EXTENSION_VALUES = SUB_PROCESS__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__DOCUMENTATION = SUB_PROCESS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__DESCRIPTION = SUB_PROCESS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__NAME = SUB_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__AUDITING = SUB_PROCESS__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__MONITORING = SUB_PROCESS__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__CATEGORY_VALUE_REF = SUB_PROCESS__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__OUTGOING = SUB_PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__INCOMING = SUB_PROCESS__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__LANES = SUB_PROCESS__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__INCOMING_CONVERSATION_LINKS = SUB_PROCESS__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__OUTGOING_CONVERSATION_LINKS = SUB_PROCESS__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__IS_FOR_COMPENSATION = SUB_PROCESS__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__LOOP_CHARACTERISTICS = SUB_PROCESS__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__RESOURCES = SUB_PROCESS__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__DEFAULT = SUB_PROCESS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__PROPERTIES = SUB_PROCESS__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__IO_SPECIFICATION = SUB_PROCESS__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__BOUNDARY_EVENT_REFS = SUB_PROCESS__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__DATA_INPUT_ASSOCIATIONS = SUB_PROCESS__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS = SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__START_QUANTITY = SUB_PROCESS__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__COMPLETION_QUANTITY = SUB_PROCESS__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__FLOW_ELEMENTS = SUB_PROCESS__FLOW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__LANE_SETS = SUB_PROCESS__LANE_SETS;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__TRIGGERED_BY_EVENT = SUB_PROCESS__TRIGGERED_BY_EVENT;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__ARTIFACTS = SUB_PROCESS__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__COMPLETION_CONDITION = SUB_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__ORDERING = SUB_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cancel Remaining Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES = SUB_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ad Hoc Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AD_HOC_SUB_PROCESS_FEATURE_COUNT = SUB_PROCESS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.TransactionImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 133;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ID = SUB_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__EXTENSION_DEFINITIONS = SUB_PROCESS__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__EXTENSION_VALUES = SUB_PROCESS__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DOCUMENTATION = SUB_PROCESS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DESCRIPTION = SUB_PROCESS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NAME = SUB_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__AUDITING = SUB_PROCESS__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__MONITORING = SUB_PROCESS__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__CATEGORY_VALUE_REF = SUB_PROCESS__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__OUTGOING = SUB_PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__INCOMING = SUB_PROCESS__INCOMING;

	/**
	 * The feature id for the '<em><b>Lanes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__LANES = SUB_PROCESS__LANES;

	/**
	 * The feature id for the '<em><b>Incoming Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__INCOMING_CONVERSATION_LINKS = SUB_PROCESS__INCOMING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__OUTGOING_CONVERSATION_LINKS = SUB_PROCESS__OUTGOING_CONVERSATION_LINKS;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__IS_FOR_COMPENSATION = SUB_PROCESS__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__LOOP_CHARACTERISTICS = SUB_PROCESS__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__RESOURCES = SUB_PROCESS__RESOURCES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DEFAULT = SUB_PROCESS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PROPERTIES = SUB_PROCESS__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__IO_SPECIFICATION = SUB_PROCESS__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__BOUNDARY_EVENT_REFS = SUB_PROCESS__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Data Input Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATA_INPUT_ASSOCIATIONS = SUB_PROCESS__DATA_INPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Data Output Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DATA_OUTPUT_ASSOCIATIONS = SUB_PROCESS__DATA_OUTPUT_ASSOCIATIONS;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__START_QUANTITY = SUB_PROCESS__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__COMPLETION_QUANTITY = SUB_PROCESS__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__FLOW_ELEMENTS = SUB_PROCESS__FLOW_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Lane Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__LANE_SETS = SUB_PROCESS__LANE_SETS;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRIGGERED_BY_EVENT = SUB_PROCESS__TRIGGERED_BY_EVENT;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__ARTIFACTS = SUB_PROCESS__ARTIFACTS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PROTOCOL = SUB_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__METHOD = SUB_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = SUB_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalScriptTaskImpl <em>Global Script Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalScriptTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalScriptTask()
	 * @generated
	 */
	int GLOBAL_SCRIPT_TASK = 134;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__ID = GLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__EXTENSION_DEFINITIONS = GLOBAL_TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__EXTENSION_VALUES = GLOBAL_TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__DESCRIPTION = GLOBAL_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__NAME = GLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__SUPPORTED_INTERFACE_REFS = GLOBAL_TASK__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__RESOURCES = GLOBAL_TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Script Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE = GLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK__SCRIPT = GLOBAL_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global Script Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_SCRIPT_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalBusinessRuleTaskImpl <em>Global Business Rule Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalBusinessRuleTaskImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalBusinessRuleTask()
	 * @generated
	 */
	int GLOBAL_BUSINESS_RULE_TASK = 135;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__ID = GLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__EXTENSION_DEFINITIONS = GLOBAL_TASK__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__EXTENSION_VALUES = GLOBAL_TASK__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__DOCUMENTATION = GLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__DESCRIPTION = GLOBAL_TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__NAME = GLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__IO_SPECIFICATION = GLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Supported Interface Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__SUPPORTED_INTERFACE_REFS = GLOBAL_TASK__SUPPORTED_INTERFACE_REFS;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__IO_BINDING = GLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__RESOURCES = GLOBAL_TASK__RESOURCES;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK__IMPLEMENTATION = GLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Business Rule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BUSINESS_RULE_TASK_FEATURE_COUNT = GLOBAL_TASK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl <em>Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDefinitions()
	 * @generated
	 */
	int DEFINITIONS = 136;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__ID = BASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXTENSION_DEFINITIONS = BASE_ELEMENT__EXTENSION_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Extension Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXTENSION_VALUES = BASE_ELEMENT__EXTENSION_VALUES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__DOCUMENTATION = BASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__TARGET_NAMESPACE = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXPRESSION_LANGUAGE = BASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__TYPE_LANGUAGE = BASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__IMPORTS = BASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXTENSIONS = BASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__RELATIONSHIPS = BASE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Root Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__ROOT_ELEMENTS = BASE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__DIAGRAMS = BASE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXPORTER = BASE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__EXPORTER_VERSION = BASE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.ItemKind <em>Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.ItemKind
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getItemKind()
	 * @generated
	 */
	int ITEM_KIND = 137;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.ProcessType <em>Process Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.ProcessType
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getProcessType()
	 * @generated
	 */
	int PROCESS_TYPE = 138;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.GatewayDirection <em>Gateway Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.GatewayDirection
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGatewayDirection()
	 * @generated
	 */
	int GATEWAY_DIRECTION = 139;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.EventBasedGatewayType <em>Event Based Gateway Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.EventBasedGatewayType
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEventBasedGatewayType()
	 * @generated
	 */
	int EVENT_BASED_GATEWAY_TYPE = 140;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.RelationshipDirection <em>Relationship Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.RelationshipDirection
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getRelationshipDirection()
	 * @generated
	 */
	int RELATIONSHIP_DIRECTION = 141;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.ChoreographyLoopType <em>Choreography Loop Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.ChoreographyLoopType
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getChoreographyLoopType()
	 * @generated
	 */
	int CHOREOGRAPHY_LOOP_TYPE = 142;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.AssociationDirection <em>Association Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.AssociationDirection
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAssociationDirection()
	 * @generated
	 */
	int ASSOCIATION_DIRECTION = 143;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceBehavior <em>Multi Instance Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceBehavior
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMultiInstanceBehavior()
	 * @generated
	 */
	int MULTI_INSTANCE_BEHAVIOR = 144;

	/**
	 * The meta object id for the '{@link org.obeonetwork.dsl.bpmn2.AdHocOrdering <em>Ad Hoc Ordering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.obeonetwork.dsl.bpmn2.AdHocOrdering
	 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAdHocOrdering()
	 * @generated
	 */
	int AD_HOC_ORDERING = 145;

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Interface#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Interface#getOperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operations();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Interface#getImplementationRef <em>Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Interface#getImplementationRef()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_ImplementationRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Element</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.RootElement
	 * @generated
	 */
	EClass getRootElement();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Element</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BaseElement
	 * @generated
	 */
	EClass getBaseElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.BaseElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BaseElement#getId()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.BaseElement#getExtensionDefinitions <em>Extension Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension Definitions</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BaseElement#getExtensionDefinitions()
	 * @see #getBaseElement()
	 * @generated
	 */
	EReference getBaseElement_ExtensionDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.BaseElement#getExtensionValues <em>Extension Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Values</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BaseElement#getExtensionValues()
	 * @see #getBaseElement()
	 * @generated
	 */
	EReference getBaseElement_ExtensionValues();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.BaseElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BaseElement#getDocumentation()
	 * @see #getBaseElement()
	 * @generated
	 */
	EReference getBaseElement_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.BaseElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BaseElement#getDescription()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_Description();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionDefinition
	 * @generated
	 */
	EClass getExtensionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ExtensionDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionDefinition#getName()
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	EAttribute getExtensionDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.ExtensionDefinition#getExtensionAttributeDefinitions <em>Extension Attribute Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension Attribute Definitions</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionDefinition#getExtensionAttributeDefinitions()
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	EReference getExtensionDefinition_ExtensionAttributeDefinitions();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ExtensionDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionDefinition#getId()
	 * @see #getExtensionDefinition()
	 * @generated
	 */
	EAttribute getExtensionDefinition_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition <em>Extension Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Attribute Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition
	 * @generated
	 */
	EClass getExtensionAttributeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getName()
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	EAttribute getExtensionAttributeDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getType()
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	EAttribute getExtensionAttributeDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#isIsReference <em>Is Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Reference</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#isIsReference()
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	EAttribute getExtensionAttributeDefinition_IsReference();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getExtensionDefinition <em>Extension Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Extension Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getExtensionDefinition()
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	EReference getExtensionAttributeDefinition_ExtensionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeDefinition#getId()
	 * @see #getExtensionAttributeDefinition()
	 * @generated
	 */
	EAttribute getExtensionAttributeDefinition_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue <em>Extension Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Attribute Value</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue
	 * @generated
	 */
	EClass getExtensionAttributeValue();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue#getValueRef <em>Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue#getValueRef()
	 * @see #getExtensionAttributeValue()
	 * @generated
	 */
	EReference getExtensionAttributeValue_ValueRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue#getValue()
	 * @see #getExtensionAttributeValue()
	 * @generated
	 */
	EReference getExtensionAttributeValue_Value();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extension Attribute Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue#getExtensionAttributeDefinition()
	 * @see #getExtensionAttributeValue()
	 * @generated
	 */
	EReference getExtensionAttributeValue_ExtensionAttributeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExtensionAttributeValue#getId()
	 * @see #getExtensionAttributeValue()
	 * @generated
	 */
	EAttribute getExtensionAttributeValue_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Documentation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Documentation#getText()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Documentation#getTextFormat <em>Text Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Format</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Documentation#getTextFormat()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_TextFormat();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Operation#getInMessageRef <em>In Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Message Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Operation#getInMessageRef()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_InMessageRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Operation#getOutMessageRef <em>Out Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Message Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Operation#getOutMessageRef()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OutMessageRef();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.Operation#getErrorRefs <em>Error Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Operation#getErrorRefs()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ErrorRefs();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Operation#getImplementationRef <em>Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Operation#getImplementationRef()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ImplementationRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Message#getItemRef <em>Item Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Message#getItemRef()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ItemRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ItemDefinition
	 * @generated
	 */
	EClass getItemDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ItemDefinition#getItemKind <em>Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Kind</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ItemDefinition#getItemKind()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EAttribute getItemDefinition_ItemKind();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ItemDefinition#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ItemDefinition#getStructureRef()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EReference getItemDefinition_StructureRef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ItemDefinition#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ItemDefinition#isIsCollection()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EAttribute getItemDefinition_IsCollection();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ItemDefinition#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ItemDefinition#getImport()
	 * @see #getItemDefinition()
	 * @generated
	 */
	EReference getItemDefinition_Import();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Import#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Import#getImportType()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Import#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Import#getLocation()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Import#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Import#getNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Import#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Import#getId()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Error
	 * @generated
	 */
	EClass getError();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Error#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Error#getStructureRef()
	 * @see #getError()
	 * @generated
	 */
	EReference getError_StructureRef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Error#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Error#getName()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Error#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Error#getErrorCode()
	 * @see #getError()
	 * @generated
	 */
	EAttribute getError_ErrorCode();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Auditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auditing</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Auditing
	 * @generated
	 */
	EClass getAuditing();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.GlobalTask <em>Global Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalTask
	 * @generated
	 */
	EClass getGlobalTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.GlobalTask#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalTask#getResources()
	 * @see #getGlobalTask()
	 * @generated
	 */
	EReference getGlobalTask_Resources();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Element</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallableElement
	 * @generated
	 */
	EClass getCallableElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.CallableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallableElement#getName()
	 * @see #getCallableElement()
	 * @generated
	 */
	EAttribute getCallableElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.CallableElement#getIoSpecification <em>Io Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Specification</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallableElement#getIoSpecification()
	 * @see #getCallableElement()
	 * @generated
	 */
	EReference getCallableElement_IoSpecification();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.CallableElement#getSupportedInterfaceRefs <em>Supported Interface Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Interface Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallableElement#getSupportedInterfaceRefs()
	 * @see #getCallableElement()
	 * @generated
	 */
	EReference getCallableElement_SupportedInterfaceRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.CallableElement#getIoBinding <em>Io Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Binding</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallableElement#getIoBinding()
	 * @see #getCallableElement()
	 * @generated
	 */
	EReference getCallableElement_IoBinding();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification <em>Input Output Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Output Specification</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputSpecification
	 * @generated
	 */
	EClass getInputOutputSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getInputSets <em>Input Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Sets</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getInputSets()
	 * @see #getInputOutputSpecification()
	 * @generated
	 */
	EReference getInputOutputSpecification_InputSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getOutputSets <em>Output Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Sets</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getOutputSets()
	 * @see #getInputOutputSpecification()
	 * @generated
	 */
	EReference getInputOutputSpecification_OutputSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getDataInputs <em>Data Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Inputs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getDataInputs()
	 * @see #getInputOutputSpecification()
	 * @generated
	 */
	EReference getInputOutputSpecification_DataInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getDataOutputs <em>Data Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Outputs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputSpecification#getDataOutputs()
	 * @see #getInputOutputSpecification()
	 * @generated
	 */
	EReference getInputOutputSpecification_DataOutputs();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.InputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Set</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputSet
	 * @generated
	 */
	EClass getInputSet();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.InputSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputSet#getName()
	 * @see #getInputSet()
	 * @generated
	 */
	EAttribute getInputSet_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Input Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputSet#getDataInputRefs()
	 * @see #getInputSet()
	 * @generated
	 */
	EReference getInputSet_DataInputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.InputSet#getOptionalInputRefs <em>Optional Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional Input Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputSet#getOptionalInputRefs()
	 * @see #getInputSet()
	 * @generated
	 */
	EReference getInputSet_OptionalInputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.InputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>While Executing Input Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputSet#getWhileExecutingInputRefs()
	 * @see #getInputSet()
	 * @generated
	 */
	EReference getInputSet_WhileExecutingInputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.InputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Set Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputSet#getOutputSetRefs()
	 * @see #getInputSet()
	 * @generated
	 */
	EReference getInputSet_OutputSetRefs();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataInput
	 * @generated
	 */
	EClass getDataInput();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.DataInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataInput#getName()
	 * @see #getDataInput()
	 * @generated
	 */
	EAttribute getDataInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.DataInput#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataInput#isIsCollection()
	 * @see #getDataInput()
	 * @generated
	 */
	EAttribute getDataInput_IsCollection();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.DataInput#getInputSetWithOptional <em>Input Set With Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Set With Optional</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataInput#getInputSetWithOptional()
	 * @see #getDataInput()
	 * @generated
	 */
	EReference getDataInput_InputSetWithOptional();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.DataInput#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Set With While Executing</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataInput#getInputSetWithWhileExecuting()
	 * @see #getDataInput()
	 * @generated
	 */
	EReference getDataInput_InputSetWithWhileExecuting();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.DataInput#getInputSetRefs <em>Input Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Set Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataInput#getInputSetRefs()
	 * @see #getDataInput()
	 * @generated
	 */
	EReference getDataInput_InputSetRefs();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ItemAwareElement <em>Item Aware Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Aware Element</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ItemAwareElement
	 * @generated
	 */
	EClass getItemAwareElement();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ItemAwareElement#getItemSubjectRef <em>Item Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Subject Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ItemAwareElement#getItemSubjectRef()
	 * @see #getItemAwareElement()
	 * @generated
	 */
	EReference getItemAwareElement_ItemSubjectRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ItemAwareElement#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ItemAwareElement#getDataState()
	 * @see #getItemAwareElement()
	 * @generated
	 */
	EReference getItemAwareElement_DataState();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data State</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataState
	 * @generated
	 */
	EClass getDataState();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.DataState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataState#getName()
	 * @see #getDataState()
	 * @generated
	 */
	EAttribute getDataState_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.OutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Set</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.OutputSet
	 * @generated
	 */
	EClass getOutputSet();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.OutputSet#getDataOutputRefs <em>Data Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Output Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.OutputSet#getDataOutputRefs()
	 * @see #getOutputSet()
	 * @generated
	 */
	EReference getOutputSet_DataOutputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.OutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Optional Output Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.OutputSet#getOptionalOutputRefs()
	 * @see #getOutputSet()
	 * @generated
	 */
	EReference getOutputSet_OptionalOutputRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.OutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>While Executing Output Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.OutputSet#getWhileExecutingOutputRefs()
	 * @see #getOutputSet()
	 * @generated
	 */
	EReference getOutputSet_WhileExecutingOutputRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.OutputSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.OutputSet#getName()
	 * @see #getOutputSet()
	 * @generated
	 */
	EAttribute getOutputSet_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.OutputSet#getInputSetRefs <em>Input Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Set Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.OutputSet#getInputSetRefs()
	 * @see #getOutputSet()
	 * @generated
	 */
	EReference getOutputSet_InputSetRefs();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Output</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataOutput
	 * @generated
	 */
	EClass getDataOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.DataOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataOutput#getName()
	 * @see #getDataOutput()
	 * @generated
	 */
	EAttribute getDataOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.DataOutput#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataOutput#isIsCollection()
	 * @see #getDataOutput()
	 * @generated
	 */
	EAttribute getDataOutput_IsCollection();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetWithOptional <em>Output Set With Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Set With Optional</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetWithOptional()
	 * @see #getDataOutput()
	 * @generated
	 */
	EReference getDataOutput_OutputSetWithOptional();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetWithWhileExecuting <em>Output Set With While Executing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Set With While Executing</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetWithWhileExecuting()
	 * @see #getDataOutput()
	 * @generated
	 */
	EReference getDataOutput_OutputSetWithWhileExecuting();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Set Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataOutput#getOutputSetRefs()
	 * @see #getDataOutput()
	 * @generated
	 */
	EReference getDataOutput_OutputSetRefs();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.InputOutputBinding <em>Input Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Output Binding</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputBinding
	 * @generated
	 */
	EClass getInputOutputBinding();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.InputOutputBinding#getInputDataRef <em>Input Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Data Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputBinding#getInputDataRef()
	 * @see #getInputOutputBinding()
	 * @generated
	 */
	EReference getInputOutputBinding_InputDataRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.InputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Data Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputBinding#getOutputDataRef()
	 * @see #getInputOutputBinding()
	 * @generated
	 */
	EReference getInputOutputBinding_OutputDataRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.InputOutputBinding#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputBinding#getOperationRef()
	 * @see #getInputOutputBinding()
	 * @generated
	 */
	EReference getInputOutputBinding_OperationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.InputOutputBinding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InputOutputBinding#getId()
	 * @see #getInputOutputBinding()
	 * @generated
	 */
	EAttribute getInputOutputBinding_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Role</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceRole
	 * @generated
	 */
	EClass getResourceRole();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceRef()
	 * @see #getResourceRole()
	 * @generated
	 */
	EReference getResourceRole_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceParameterBindings <em>Resource Parameter Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Parameter Bindings</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceParameterBindings()
	 * @see #getResourceRole()
	 * @generated
	 */
	EReference getResourceRole_ResourceParameterBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Assignment Expression</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceRole#getResourceAssignmentExpression()
	 * @see #getResourceRole()
	 * @generated
	 */
	EReference getResourceRole_ResourceAssignmentExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ResourceRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceRole#getName()
	 * @see #getResourceRole()
	 * @generated
	 */
	EAttribute getResourceRole_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Resource#getResourceParameters <em>Resource Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Parameters</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Resource#getResourceParameters()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_ResourceParameters();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ResourceParameter <em>Resource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Parameter</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceParameter
	 * @generated
	 */
	EClass getResourceParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ResourceParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceParameter#getName()
	 * @see #getResourceParameter()
	 * @generated
	 */
	EAttribute getResourceParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ResourceParameter#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceParameter#isIsRequired()
	 * @see #getResourceParameter()
	 * @generated
	 */
	EAttribute getResourceParameter_IsRequired();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ResourceParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceParameter#getType()
	 * @see #getResourceParameter()
	 * @generated
	 */
	EReference getResourceParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ResourceParameterBinding <em>Resource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Parameter Binding</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceParameterBinding
	 * @generated
	 */
	EClass getResourceParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ResourceParameterBinding#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceParameterBinding#getExpression()
	 * @see #getResourceParameterBinding()
	 * @generated
	 */
	EReference getResourceParameterBinding_Expression();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceParameterBinding#getParameterRef()
	 * @see #getResourceParameterBinding()
	 * @generated
	 */
	EReference getResourceParameterBinding_ParameterRef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ResourceParameterBinding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceParameterBinding#getId()
	 * @see #getResourceParameterBinding()
	 * @generated
	 */
	EAttribute getResourceParameterBinding_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Assignment Expression</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression
	 * @generated
	 */
	EClass getResourceAssignmentExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression#getExpression()
	 * @see #getResourceAssignmentExpression()
	 * @generated
	 */
	EReference getResourceAssignmentExpression_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ResourceAssignmentExpression#getId()
	 * @see #getResourceAssignmentExpression()
	 * @generated
	 */
	EAttribute getResourceAssignmentExpression_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Monitoring
	 * @generated
	 */
	EClass getMonitoring();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Performer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performer</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Performer
	 * @generated
	 */
	EClass getPerformer();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Process#getProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getProcessType()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ProcessType();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Process#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#isIsClosed()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_IsClosed();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Process#getAuditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditing</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getAuditing()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Auditing();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Process#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getMonitoring()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Monitoring();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Process#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getProperties()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Properties();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.Process#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supports</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getSupports()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Supports();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Process#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definitional Collaboration Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getDefinitionalCollaborationRef()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_DefinitionalCollaborationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Process#isIsExecutable <em>Is Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Executable</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#isIsExecutable()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_IsExecutable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Process#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getResources()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Process#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getArtifacts()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Process#getCorrelationSubscriptions <em>Correlation Subscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Subscriptions</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getCorrelationSubscriptions()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_CorrelationSubscriptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Process#getDecomposedBy <em>Decomposed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decomposed By</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getDecomposedBy()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_DecomposedBy();

	/**
	 * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.bpmn2.Process#getDecomposes <em>Decomposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Decomposes</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Process#getDecomposes()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Decomposes();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.FlowElementsContainer <em>Flow Elements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Elements Container</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowElementsContainer
	 * @generated
	 */
	EClass getFlowElementsContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowElementsContainer#getFlowElements()
	 * @see #getFlowElementsContainer()
	 * @generated
	 */
	EReference getFlowElementsContainer_FlowElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.FlowElementsContainer#getLaneSets <em>Lane Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lane Sets</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowElementsContainer#getLaneSets()
	 * @see #getFlowElementsContainer()
	 * @generated
	 */
	EReference getFlowElementsContainer_LaneSets();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.FlowElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowElement#getName()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.FlowElement#getAuditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditing</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowElement#getAuditing()
	 * @see #getFlowElement()
	 * @generated
	 */
	EReference getFlowElement_Auditing();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.FlowElement#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowElement#getMonitoring()
	 * @see #getFlowElement()
	 * @generated
	 */
	EReference getFlowElement_Monitoring();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.FlowElement#getCategoryValueRef <em>Category Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category Value Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowElement#getCategoryValueRef()
	 * @see #getFlowElement()
	 * @generated
	 */
	EReference getFlowElement_CategoryValueRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Value</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CategoryValue
	 * @generated
	 */
	EClass getCategoryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.CategoryValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CategoryValue#getValue()
	 * @see #getCategoryValue()
	 * @generated
	 */
	EAttribute getCategoryValue_Value();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.CategoryValue#getCategorizedFlowElements <em>Categorized Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categorized Flow Elements</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CategoryValue#getCategorizedFlowElements()
	 * @see #getCategoryValue()
	 * @generated
	 */
	EReference getCategoryValue_CategorizedFlowElements();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.LaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane Set</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.LaneSet
	 * @generated
	 */
	EClass getLaneSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.LaneSet#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lanes</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.LaneSet#getLanes()
	 * @see #getLaneSet()
	 * @generated
	 */
	EReference getLaneSet_Lanes();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.LaneSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.LaneSet#getName()
	 * @see #getLaneSet()
	 * @generated
	 */
	EAttribute getLaneSet_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Lane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lane</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Lane
	 * @generated
	 */
	EClass getLane();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Lane#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Lane#getName()
	 * @see #getLane()
	 * @generated
	 */
	EAttribute getLane_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Lane#getChildLaneSet <em>Child Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Lane Set</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Lane#getChildLaneSet()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_ChildLaneSet();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Lane#getPartitionElementRef <em>Partition Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partition Element Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Lane#getPartitionElementRef()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_PartitionElementRef();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.Lane#getFlowNodeRefs <em>Flow Node Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow Node Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Lane#getFlowNodeRefs()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_FlowNodeRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Lane#getPartitionElement <em>Partition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition Element</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Lane#getPartitionElement()
	 * @see #getLane()
	 * @generated
	 */
	EReference getLane_PartitionElement();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowNode#getOutgoing()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowNode#getIncoming()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.FlowNode#getLanes <em>Lanes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lanes</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FlowNode#getLanes()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Lanes();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.SequenceFlow#isIsImmediate <em>Is Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immediate</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SequenceFlow#isIsImmediate()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EAttribute getSequenceFlow_IsImmediate();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.SequenceFlow#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SequenceFlow#getConditionExpression()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_ConditionExpression();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SequenceFlow#getTargetRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_TargetRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SequenceFlow#getSourceRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_SourceRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Collaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaboration</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration
	 * @generated
	 */
	EClass getCollaboration();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getName()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Collaboration#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#isIsClosed()
	 * @see #getCollaboration()
	 * @generated
	 */
	EAttribute getCollaboration_IsClosed();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getChoreographyRef <em>Choreography Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Choreography Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getChoreographyRef()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_ChoreographyRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getArtifacts()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Artifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getParticipantAssociations <em>Participant Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Associations</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getParticipantAssociations()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_ParticipantAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getMessageFlowAssociations <em>Message Flow Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Flow Associations</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getMessageFlowAssociations()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_MessageFlowAssociations();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getConversationAssociations <em>Conversation Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Associations</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getConversationAssociations()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_ConversationAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getParticipants()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Participants();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getMessageFlows <em>Message Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Flows</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getMessageFlows()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_MessageFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getCorrelationKeys <em>Correlation Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Keys</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getCorrelationKeys()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_CorrelationKeys();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getConversations <em>Conversations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversations</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getConversations()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_Conversations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Collaboration#getConversationLinks <em>Conversation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversation Links</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Collaboration#getConversationLinks()
	 * @see #getCollaboration()
	 * @generated
	 */
	EReference getCollaboration_ConversationLinks();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Choreography
	 * @generated
	 */
	EClass getChoreography();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Association</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ParticipantAssociation
	 * @generated
	 */
	EClass getParticipantAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Participant Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ParticipantAssociation#getInnerParticipantRef()
	 * @see #getParticipantAssociation()
	 * @generated
	 */
	EReference getParticipantAssociation_InnerParticipantRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Participant Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ParticipantAssociation#getOuterParticipantRef()
	 * @see #getParticipantAssociation()
	 * @generated
	 */
	EReference getParticipantAssociation_OuterParticipantRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Participant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Participant#getName()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.Participant#getInterfaceRefs <em>Interface Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Participant#getInterfaceRefs()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_InterfaceRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant Multiplicity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Participant#getParticipantMultiplicity()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_ParticipantMultiplicity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.Participant#getEndPointRefs <em>End Point Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Point Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Participant#getEndPointRefs()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_EndPointRefs();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Participant#getProcessRef <em>Process Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Process Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Participant#getProcessRef()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_ProcessRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.InteractionNode <em>Interaction Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Node</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InteractionNode
	 * @generated
	 */
	EClass getInteractionNode();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.InteractionNode#getIncomingConversationLinks <em>Incoming Conversation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Conversation Links</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InteractionNode#getIncomingConversationLinks()
	 * @see #getInteractionNode()
	 * @generated
	 */
	EReference getInteractionNode_IncomingConversationLinks();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.InteractionNode#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Conversation Links</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InteractionNode#getOutgoingConversationLinks()
	 * @see #getInteractionNode()
	 * @generated
	 */
	EReference getInteractionNode_OutgoingConversationLinks();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ConversationLink <em>Conversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation Link</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationLink
	 * @generated
	 */
	EClass getConversationLink();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ConversationLink#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationLink#getSourceRef()
	 * @see #getConversationLink()
	 * @generated
	 */
	EReference getConversationLink_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ConversationLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationLink#getName()
	 * @see #getConversationLink()
	 * @generated
	 */
	EAttribute getConversationLink_Name();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ConversationLink#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationLink#getTargetRef()
	 * @see #getConversationLink()
	 * @generated
	 */
	EReference getConversationLink_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant Multiplicity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity
	 * @generated
	 */
	EClass getParticipantMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getMinimum()
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	EAttribute getParticipantMultiplicity_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getMaximum()
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	EAttribute getParticipantMultiplicity_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ParticipantMultiplicity#getId()
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	EAttribute getParticipantMultiplicity_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.MessageFlowAssociation <em>Message Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Flow Association</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageFlowAssociation
	 * @generated
	 */
	EClass getMessageFlowAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Message Flow Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageFlowAssociation#getInnerMessageFlowRef()
	 * @see #getMessageFlowAssociation()
	 * @generated
	 */
	EReference getMessageFlowAssociation_InnerMessageFlowRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Message Flow Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageFlowAssociation#getOuterMessageFlowRef()
	 * @see #getMessageFlowAssociation()
	 * @generated
	 */
	EReference getMessageFlowAssociation_OuterMessageFlowRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.MessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Flow</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageFlow
	 * @generated
	 */
	EClass getMessageFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.MessageFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageFlow#getName()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EAttribute getMessageFlow_Name();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MessageFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageFlow#getSourceRef()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EReference getMessageFlow_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MessageFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageFlow#getTargetRef()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EReference getMessageFlow_TargetRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MessageFlow#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageFlow#getMessageRef()
	 * @see #getMessageFlow()
	 * @generated
	 */
	EReference getMessageFlow_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ConversationAssociation <em>Conversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation Association</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationAssociation
	 * @generated
	 */
	EClass getConversationAssociation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Conversation Node Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationAssociation#getInnerConversationNodeRef()
	 * @see #getConversationAssociation()
	 * @generated
	 */
	EReference getConversationAssociation_InnerConversationNodeRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Conversation Node Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationAssociation#getOuterConversationNodeRef()
	 * @see #getConversationAssociation()
	 * @generated
	 */
	EReference getConversationAssociation_OuterConversationNodeRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ConversationNode <em>Conversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation Node</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationNode
	 * @generated
	 */
	EClass getConversationNode();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ConversationNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationNode#getName()
	 * @see #getConversationNode()
	 * @generated
	 */
	EAttribute getConversationNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.ConversationNode#getParticipantRefs <em>Participant Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationNode#getParticipantRefs()
	 * @see #getConversationNode()
	 * @generated
	 */
	EReference getConversationNode_ParticipantRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.ConversationNode#getMessageFlowRefs <em>Message Flow Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Flow Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationNode#getMessageFlowRefs()
	 * @see #getConversationNode()
	 * @generated
	 */
	EReference getConversationNode_MessageFlowRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.ConversationNode#getCorrelationKeys <em>Correlation Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Keys</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConversationNode#getCorrelationKeys()
	 * @see #getConversationNode()
	 * @generated
	 */
	EReference getConversationNode_CorrelationKeys();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Key</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationKey
	 * @generated
	 */
	EClass getCorrelationKey();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.CorrelationKey#getCorrelationPropertyRef <em>Correlation Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Correlation Property Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationKey#getCorrelationPropertyRef()
	 * @see #getCorrelationKey()
	 * @generated
	 */
	EReference getCorrelationKey_CorrelationPropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.CorrelationKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationKey#getName()
	 * @see #getCorrelationKey()
	 * @generated
	 */
	EAttribute getCorrelationKey_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CorrelationProperty <em>Correlation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Property</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationProperty
	 * @generated
	 */
	EClass getCorrelationProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.CorrelationProperty#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Property Retrieval Expression</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationProperty#getCorrelationPropertyRetrievalExpression()
	 * @see #getCorrelationProperty()
	 * @generated
	 */
	EReference getCorrelationProperty_CorrelationPropertyRetrievalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.CorrelationProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationProperty#getName()
	 * @see #getCorrelationProperty()
	 * @generated
	 */
	EAttribute getCorrelationProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.CorrelationProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationProperty#getType()
	 * @see #getCorrelationProperty()
	 * @generated
	 */
	EReference getCorrelationProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Property Retrieval Expression</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression
	 * @generated
	 */
	EClass getCorrelationPropertyRetrievalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Path</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression#getMessagePath()
	 * @see #getCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	EReference getCorrelationPropertyRetrievalExpression_MessagePath();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationPropertyRetrievalExpression#getMessageRef()
	 * @see #getCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	EReference getCorrelationPropertyRetrievalExpression_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.FormalExpression <em>Formal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Expression</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FormalExpression
	 * @generated
	 */
	EClass getFormalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.FormalExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FormalExpression#getLanguage()
	 * @see #getFormalExpression()
	 * @generated
	 */
	EAttribute getFormalExpression_Language();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.FormalExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FormalExpression#getBody()
	 * @see #getFormalExpression()
	 * @generated
	 */
	EReference getFormalExpression_Body();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.FormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaluates To Type Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.FormalExpression#getEvaluatesToTypeRef()
	 * @see #getFormalExpression()
	 * @generated
	 */
	EReference getFormalExpression_EvaluatesToTypeRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CorrelationSubscription <em>Correlation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Subscription</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationSubscription
	 * @generated
	 */
	EClass getCorrelationSubscription();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.CorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlation Key Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationSubscription#getCorrelationKeyRef()
	 * @see #getCorrelationSubscription()
	 * @generated
	 */
	EReference getCorrelationSubscription_CorrelationKeyRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.CorrelationSubscription#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Property Binding</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationSubscription#getCorrelationPropertyBinding()
	 * @see #getCorrelationSubscription()
	 * @generated
	 */
	EReference getCorrelationSubscription_CorrelationPropertyBinding();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Property Binding</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding
	 * @generated
	 */
	EClass getCorrelationPropertyBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Path</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding#getDataPath()
	 * @see #getCorrelationPropertyBinding()
	 * @generated
	 */
	EReference getCorrelationPropertyBinding_DataPath();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Correlation Property Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CorrelationPropertyBinding#getCorrelationPropertyRef()
	 * @see #getCorrelationPropertyBinding()
	 * @generated
	 */
	EReference getCorrelationPropertyBinding_CorrelationPropertyRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.GlobalManualTask <em>Global Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Manual Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalManualTask
	 * @generated
	 */
	EClass getGlobalManualTask();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ManualTask
	 * @generated
	 */
	EClass getManualTask();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Activity#isIsForCompensation <em>Is For Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is For Compensation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#isIsForCompensation()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsForCompensation();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Activity#getLoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Characteristics</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getLoopCharacteristics()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_LoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Activity#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getResources()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Resources();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Activity#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getDefault()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Default();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Activity#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getProperties()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Activity#getIoSpecification <em>Io Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Specification</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getIoSpecification()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_IoSpecification();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.Activity#getBoundaryEventRefs <em>Boundary Event Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Boundary Event Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getBoundaryEventRefs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_BoundaryEventRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Activity#getDataInputAssociations <em>Data Input Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Input Associations</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getDataInputAssociations()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_DataInputAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Activity#getDataOutputAssociations <em>Data Output Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Output Associations</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getDataOutputAssociations()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_DataOutputAssociations();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Activity#getStartQuantity <em>Start Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Quantity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getStartQuantity()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_StartQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Activity#getCompletionQuantity <em>Completion Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Quantity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Activity#getCompletionQuantity()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_CompletionQuantity();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.LoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Characteristics</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.LoopCharacteristics
	 * @generated
	 */
	EClass getLoopCharacteristics();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.BoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BoundaryEvent
	 * @generated
	 */
	EClass getBoundaryEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.BoundaryEvent#isCancelActivity <em>Cancel Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Activity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BoundaryEvent#isCancelActivity()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EAttribute getBoundaryEvent_CancelActivity();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.BoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attached To Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BoundaryEvent#getAttachedToRef()
	 * @see #getBoundaryEvent()
	 * @generated
	 */
	EReference getBoundaryEvent_AttachedToRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CatchEvent
	 * @generated
	 */
	EClass getCatchEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Multiple</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CatchEvent#isParallelMultiple()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EAttribute getCatchEvent_ParallelMultiple();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.CatchEvent#getOutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Set</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CatchEvent#getOutputSet()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_OutputSet();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.CatchEvent#getEventDefinitionRefs <em>Event Definition Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Definition Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CatchEvent#getEventDefinitionRefs()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_EventDefinitionRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.CatchEvent#getDataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Output Association</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CatchEvent#getDataOutputAssociation()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_DataOutputAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.CatchEvent#getDataOutputs <em>Data Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Outputs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CatchEvent#getDataOutputs()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_DataOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.CatchEvent#getEventDefinitions <em>Event Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Definitions</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CatchEvent#getEventDefinitions()
	 * @see #getCatchEvent()
	 * @generated
	 */
	EReference getCatchEvent_EventDefinitions();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Event#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Event#getProperties()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Properties();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.EventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.EventDefinition
	 * @generated
	 */
	EClass getEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Output Association</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataOutputAssociation
	 * @generated
	 */
	EClass getDataOutputAssociation();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Association</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataAssociation
	 * @generated
	 */
	EClass getDataAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataAssociation#getTransformation()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_Transformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataAssociation#getAssignment()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_Assignment();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataAssociation#getTargetRef()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_TargetRef();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.DataAssociation#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataAssociation#getSourceRef()
	 * @see #getDataAssociation()
	 * @generated
	 */
	EReference getDataAssociation_SourceRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Assignment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Assignment#getFrom()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Assignment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Assignment#getTo()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_To();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input Association</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataInputAssociation
	 * @generated
	 */
	EClass getDataInputAssociation();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.UserTask#getRenderings <em>Renderings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renderings</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.UserTask#getRenderings()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_Renderings();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.UserTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.UserTask#getImplementation()
	 * @see #getUserTask()
	 * @generated
	 */
	EAttribute getUserTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Rendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rendering</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Rendering
	 * @generated
	 */
	EClass getRendering();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.HumanPerformer <em>Human Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Human Performer</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.HumanPerformer
	 * @generated
	 */
	EClass getHumanPerformer();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.PotentialOwner <em>Potential Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potential Owner</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.PotentialOwner
	 * @generated
	 */
	EClass getPotentialOwner();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.GlobalUserTask <em>Global User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global User Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalUserTask
	 * @generated
	 */
	EClass getGlobalUserTask();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.GlobalUserTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalUserTask#getImplementation()
	 * @see #getGlobalUserTask()
	 * @generated
	 */
	EAttribute getGlobalUserTask_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.GlobalUserTask#getRenderings <em>Renderings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renderings</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalUserTask#getRenderings()
	 * @see #getGlobalUserTask()
	 * @generated
	 */
	EReference getGlobalUserTask_Renderings();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Gateway#getGatewayDirection <em>Gateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Direction</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Gateway#getGatewayDirection()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_GatewayDirection();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.EventBasedGateway <em>Event Based Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Based Gateway</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.EventBasedGateway
	 * @generated
	 */
	EClass getEventBasedGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.EventBasedGateway#isInstantiate <em>Instantiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiate</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.EventBasedGateway#isInstantiate()
	 * @see #getEventBasedGateway()
	 * @generated
	 */
	EAttribute getEventBasedGateway_Instantiate();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Gateway Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.EventBasedGateway#getEventGatewayType()
	 * @see #getEventBasedGateway()
	 * @generated
	 */
	EAttribute getEventBasedGateway_EventGatewayType();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ComplexGateway <em>Complex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Gateway</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ComplexGateway
	 * @generated
	 */
	EClass getComplexGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ComplexGateway#getActivationCondition <em>Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Condition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ComplexGateway#getActivationCondition()
	 * @see #getComplexGateway()
	 * @generated
	 */
	EReference getComplexGateway_ActivationCondition();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ComplexGateway#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ComplexGateway#getDefault()
	 * @see #getComplexGateway()
	 * @generated
	 */
	EReference getComplexGateway_Default();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Gateway</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExclusiveGateway
	 * @generated
	 */
	EClass getExclusiveGateway();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ExclusiveGateway#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ExclusiveGateway#getDefault()
	 * @see #getExclusiveGateway()
	 * @generated
	 */
	EReference getExclusiveGateway_Default();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusive Gateway</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InclusiveGateway
	 * @generated
	 */
	EClass getInclusiveGateway();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.InclusiveGateway#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.InclusiveGateway#getDefault()
	 * @see #getInclusiveGateway()
	 * @generated
	 */
	EReference getInclusiveGateway_Default();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ParallelGateway
	 * @generated
	 */
	EClass getParallelGateway();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Relationship#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Relationship#getDirection()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Direction();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.Relationship#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Relationship#getSources()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Sources();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.Relationship#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Relationship#getTargets()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Targets();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Extension#isMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Extension#isMustUnderstand()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_MustUnderstand();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.Extension#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Extension#getDefinition()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Extension#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Extension#getId()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Catch Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.IntermediateCatchEvent
	 * @generated
	 */
	EClass getIntermediateCatchEvent();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Throw Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.IntermediateThrowEvent
	 * @generated
	 */
	EClass getIntermediateThrowEvent();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ThrowEvent
	 * @generated
	 */
	EClass getThrowEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ThrowEvent#getInputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Set</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ThrowEvent#getInputSet()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_InputSet();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.ThrowEvent#getEventDefinitionRefs <em>Event Definition Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Definition Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ThrowEvent#getEventDefinitionRefs()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_EventDefinitionRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.ThrowEvent#getDataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Input Association</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ThrowEvent#getDataInputAssociation()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_DataInputAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.ThrowEvent#getDataInputs <em>Data Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Inputs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ThrowEvent#getDataInputs()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_DataInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.ThrowEvent#getEventDefinitions <em>Event Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Definitions</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ThrowEvent#getEventDefinitions()
	 * @see #getThrowEvent()
	 * @generated
	 */
	EReference getThrowEvent_EventDefinitions();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.StartEvent#isIsInterrupting <em>Is Interrupting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interrupting</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.StartEvent#isIsInterrupting()
	 * @see #getStartEvent()
	 * @generated
	 */
	EAttribute getStartEvent_IsInterrupting();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CancelEventDefinition <em>Cancel Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CancelEventDefinition
	 * @generated
	 */
	EClass getCancelEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ErrorEventDefinition <em>Error Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ErrorEventDefinition
	 * @generated
	 */
	EClass getErrorEventDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ErrorEventDefinition#getErrorRef()
	 * @see #getErrorEventDefinition()
	 * @generated
	 */
	EReference getErrorEventDefinition_ErrorRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminate Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.TerminateEventDefinition
	 * @generated
	 */
	EClass getTerminateEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escalation Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.EscalationEventDefinition
	 * @generated
	 */
	EClass getEscalationEventDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.EscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Escalation Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.EscalationEventDefinition#getEscalationRef()
	 * @see #getEscalationEventDefinition()
	 * @generated
	 */
	EReference getEscalationEventDefinition_EscalationRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Escalation <em>Escalation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Escalation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Escalation
	 * @generated
	 */
	EClass getEscalation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Escalation#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Escalation#getStructureRef()
	 * @see #getEscalation()
	 * @generated
	 */
	EReference getEscalation_StructureRef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Escalation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Escalation#getName()
	 * @see #getEscalation()
	 * @generated
	 */
	EAttribute getEscalation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Escalation#getEscalationCode <em>Escalation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escalation Code</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Escalation#getEscalationCode()
	 * @see #getEscalation()
	 * @generated
	 */
	EAttribute getEscalation_EscalationCode();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Escalation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Escalation#getId()
	 * @see #getEscalation()
	 * @generated
	 */
	EAttribute getEscalation_Id();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensate Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CompensateEventDefinition
	 * @generated
	 */
	EClass getCompensateEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.CompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait For Completion</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CompensateEventDefinition#isWaitForCompletion()
	 * @see #getCompensateEventDefinition()
	 * @generated
	 */
	EAttribute getCompensateEventDefinition_WaitForCompletion();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.CompensateEventDefinition#getActivityRef <em>Activity Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CompensateEventDefinition#getActivityRef()
	 * @see #getCompensateEventDefinition()
	 * @generated
	 */
	EReference getCompensateEventDefinition_ActivityRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition <em>Timer Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.TimerEventDefinition
	 * @generated
	 */
	EClass getTimerEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeDate <em>Time Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Date</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeDate()
	 * @see #getTimerEventDefinition()
	 * @generated
	 */
	EReference getTimerEventDefinition_TimeDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeCycle <em>Time Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Cycle</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeCycle()
	 * @see #getTimerEventDefinition()
	 * @generated
	 */
	EReference getTimerEventDefinition_TimeCycle();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeDuration <em>Time Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Duration</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.TimerEventDefinition#getTimeDuration()
	 * @see #getTimerEventDefinition()
	 * @generated
	 */
	EReference getTimerEventDefinition_TimeDuration();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition <em>Link Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.LinkEventDefinition
	 * @generated
	 */
	EClass getLinkEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getName()
	 * @see #getLinkEventDefinition()
	 * @generated
	 */
	EAttribute getLinkEventDefinition_Name();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getTarget()
	 * @see #getLinkEventDefinition()
	 * @generated
	 */
	EReference getLinkEventDefinition_Target();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.LinkEventDefinition#getSource()
	 * @see #getLinkEventDefinition()
	 * @generated
	 */
	EReference getLinkEventDefinition_Source();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.MessageEventDefinition <em>Message Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageEventDefinition
	 * @generated
	 */
	EClass getMessageEventDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MessageEventDefinition#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageEventDefinition#getMessageRef()
	 * @see #getMessageEventDefinition()
	 * @generated
	 */
	EReference getMessageEventDefinition_MessageRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MessageEventDefinition#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MessageEventDefinition#getOperationRef()
	 * @see #getMessageEventDefinition()
	 * @generated
	 */
	EReference getMessageEventDefinition_OperationRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConditionalEventDefinition
	 * @generated
	 */
	EClass getConditionalEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ConditionalEventDefinition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ConditionalEventDefinition#getCondition()
	 * @see #getConditionalEventDefinition()
	 * @generated
	 */
	EReference getConditionalEventDefinition_Condition();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.SignalEventDefinition <em>Signal Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Event Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SignalEventDefinition
	 * @generated
	 */
	EClass getSignalEventDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.SignalEventDefinition#getSignalRef <em>Signal Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SignalEventDefinition#getSignalRef()
	 * @see #getSignalEventDefinition()
	 * @generated
	 */
	EReference getSignalEventDefinition_SignalRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Signal#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Signal#getStructureRef()
	 * @see #getSignal()
	 * @generated
	 */
	EReference getSignal_StructureRef();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Signal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Signal#getName()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ImplicitThrowEvent <em>Implicit Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implicit Throw Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ImplicitThrowEvent
	 * @generated
	 */
	EClass getImplicitThrowEvent();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.DataObject#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataObject#isIsCollection()
	 * @see #getDataObject()
	 * @generated
	 */
	EAttribute getDataObject_IsCollection();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataStore
	 * @generated
	 */
	EClass getDataStore();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.DataStore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataStore#getName()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.DataStore#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataStore#getCapacity()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.DataStore#isIsUnlimited <em>Is Unlimited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unlimited</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataStore#isIsUnlimited()
	 * @see #getDataStore()
	 * @generated
	 */
	EAttribute getDataStore_IsUnlimited();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataStoreReference <em>Data Store Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store Reference</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataStoreReference
	 * @generated
	 */
	EClass getDataStoreReference();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Store Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataStoreReference#getDataStoreRef()
	 * @see #getDataStoreReference()
	 * @generated
	 */
	EReference getDataStoreReference_DataStoreRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.DataObjectReference <em>Data Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object Reference</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataObjectReference
	 * @generated
	 */
	EClass getDataObjectReference();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.DataObjectReference#getDataObjectRef <em>Data Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Object Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.DataObjectReference#getDataObjectRef()
	 * @see #getDataObjectReference()
	 * @generated
	 */
	EReference getDataObjectReference_DataObjectRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CallConversation <em>Call Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Conversation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallConversation
	 * @generated
	 */
	EClass getCallConversation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Collaboration Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallConversation#getCalledCollaborationRef()
	 * @see #getCallConversation()
	 * @generated
	 */
	EReference getCallConversation_CalledCollaborationRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.CallConversation#getParticipantAssociations <em>Participant Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Associations</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallConversation#getParticipantAssociations()
	 * @see #getCallConversation()
	 * @generated
	 */
	EReference getCallConversation_ParticipantAssociations();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Conversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Conversation
	 * @generated
	 */
	EClass getConversation();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.SubConversation <em>Sub Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Conversation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SubConversation
	 * @generated
	 */
	EClass getSubConversation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.SubConversation#getConversationNodes <em>Conversation Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversation Nodes</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SubConversation#getConversationNodes()
	 * @see #getSubConversation()
	 * @generated
	 */
	EReference getSubConversation_ConversationNodes();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.GlobalConversation <em>Global Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Conversation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalConversation
	 * @generated
	 */
	EClass getGlobalConversation();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.PartnerEntity <em>Partner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Entity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.PartnerEntity
	 * @generated
	 */
	EClass getPartnerEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.PartnerEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.PartnerEntity#getName()
	 * @see #getPartnerEntity()
	 * @generated
	 */
	EAttribute getPartnerEntity_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.PartnerEntity#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.PartnerEntity#getParticipantRef()
	 * @see #getPartnerEntity()
	 * @generated
	 */
	EReference getPartnerEntity_ParticipantRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.PartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Role</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.PartnerRole
	 * @generated
	 */
	EClass getPartnerRole();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.PartnerRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.PartnerRole#getName()
	 * @see #getPartnerRole()
	 * @generated
	 */
	EAttribute getPartnerRole_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.PartnerRole#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.PartnerRole#getParticipantRef()
	 * @see #getPartnerRole()
	 * @generated
	 */
	EReference getPartnerRole_ParticipantRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ChoreographyActivity <em>Choreography Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Activity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ChoreographyActivity
	 * @generated
	 */
	EClass getChoreographyActivity();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.ChoreographyActivity#getParticipantRefs <em>Participant Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Refs</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ChoreographyActivity#getParticipantRefs()
	 * @see #getChoreographyActivity()
	 * @generated
	 */
	EReference getChoreographyActivity_ParticipantRefs();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiating Participant Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ChoreographyActivity#getInitiatingParticipantRef()
	 * @see #getChoreographyActivity()
	 * @generated
	 */
	EReference getChoreographyActivity_InitiatingParticipantRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.ChoreographyActivity#getCorrelationKeys <em>Correlation Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Keys</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ChoreographyActivity#getCorrelationKeys()
	 * @see #getChoreographyActivity()
	 * @generated
	 */
	EReference getChoreographyActivity_CorrelationKeys();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ChoreographyActivity#getLoopType <em>Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ChoreographyActivity#getLoopType()
	 * @see #getChoreographyActivity()
	 * @generated
	 */
	EAttribute getChoreographyActivity_LoopType();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CallChoreography <em>Call Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Choreography</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallChoreography
	 * @generated
	 */
	EClass getCallChoreography();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.CallChoreography#getCalledChoreographyRef <em>Called Choreography Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Choreography Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallChoreography#getCalledChoreographyRef()
	 * @see #getCallChoreography()
	 * @generated
	 */
	EReference getCallChoreography_CalledChoreographyRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.CallChoreography#getParticipantAssociations <em>Participant Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Associations</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallChoreography#getParticipantAssociations()
	 * @see #getCallChoreography()
	 * @generated
	 */
	EReference getCallChoreography_ParticipantAssociations();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.SubChoreography <em>Sub Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Choreography</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SubChoreography
	 * @generated
	 */
	EClass getSubChoreography();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.SubChoreography#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SubChoreography#getArtifacts()
	 * @see #getSubChoreography()
	 * @generated
	 */
	EReference getSubChoreography_Artifacts();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ChoreographyTask <em>Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ChoreographyTask
	 * @generated
	 */
	EClass getChoreographyTask();

	/**
	 * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.bpmn2.ChoreographyTask#getMessageFlowRef <em>Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Message Flow Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ChoreographyTask#getMessageFlowRef()
	 * @see #getChoreographyTask()
	 * @generated
	 */
	EReference getChoreographyTask_MessageFlowRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Choreography Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalChoreographyTask
	 * @generated
	 */
	EClass getGlobalChoreographyTask();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.GlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initiating Participant Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalChoreographyTask#getInitiatingParticipantRef()
	 * @see #getGlobalChoreographyTask()
	 * @generated
	 */
	EReference getGlobalChoreographyTask_InitiatingParticipantRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.TextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Annotation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.TextAnnotation
	 * @generated
	 */
	EClass getTextAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.TextAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.TextAnnotation#getText()
	 * @see #getTextAnnotation()
	 * @generated
	 */
	EAttribute getTextAnnotation_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.TextAnnotation#getTextFormat <em>Text Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Format</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.TextAnnotation#getTextFormat()
	 * @see #getTextAnnotation()
	 * @generated
	 */
	EAttribute getTextAnnotation_TextFormat();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Group#getCategoryValueRef <em>Category Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category Value Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Group#getCategoryValueRef()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_CategoryValueRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Association#getAssociationDirection <em>Association Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Direction</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Association#getAssociationDirection()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_AssociationDirection();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Association#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Association#getSourceRef()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_SourceRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.Association#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Association#getTargetRef()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Category#getCategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Value</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Category#getCategoryValue()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_CategoryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ServiceTask
	 * @generated
	 */
	EClass getServiceTask();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ServiceTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ServiceTask#getImplementation()
	 * @see #getServiceTask()
	 * @generated
	 */
	EAttribute getServiceTask_Implementation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ServiceTask#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ServiceTask#getOperationRef()
	 * @see #getServiceTask()
	 * @generated
	 */
	EReference getServiceTask_OperationRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Process</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SubProcess
	 * @generated
	 */
	EClass getSubProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggered By Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SubProcess#isTriggeredByEvent()
	 * @see #getSubProcess()
	 * @generated
	 */
	EAttribute getSubProcess_TriggeredByEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.SubProcess#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SubProcess#getArtifacts()
	 * @see #getSubProcess()
	 * @generated
	 */
	EReference getSubProcess_Artifacts();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Instance Loop Characteristics</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics
	 * @generated
	 */
	EClass getMultiInstanceLoopCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sequential</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#isIsSequential()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getMultiInstanceLoopCharacteristics_IsSequential();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getBehavior()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getMultiInstanceLoopCharacteristics_Behavior();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getLoopCardinality <em>Loop Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Cardinality</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getLoopCardinality()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_LoopCardinality();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataInputRef <em>Loop Data Input Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop Data Input Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataInputRef()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_LoopDataInputRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataOutputRef <em>Loop Data Output Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop Data Output Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getLoopDataOutputRef()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_LoopDataOutputRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getInputDataItem <em>Input Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Data Item</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getInputDataItem()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_InputDataItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getOutputDataItem <em>Output Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Data Item</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getOutputDataItem()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_OutputDataItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getCompletionCondition()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_CompletionCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Behavior Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getComplexBehaviorDefinition()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>One Behavior Event Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getOneBehaviorEventRef()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_OneBehaviorEventRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>None Behavior Event Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceLoopCharacteristics#getNoneBehaviorEventRef()
	 * @see #getMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Behavior Definition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition
	 * @generated
	 */
	EClass getComplexBehaviorDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition#getCondition()
	 * @see #getComplexBehaviorDefinition()
	 * @generated
	 */
	EReference getComplexBehaviorDefinition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ComplexBehaviorDefinition#getEvent()
	 * @see #getComplexBehaviorDefinition()
	 * @generated
	 */
	EReference getComplexBehaviorDefinition_Event();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Loop Characteristics</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics
	 * @generated
	 */
	EClass getStandardLoopCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#isTestBefore <em>Test Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Before</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#isTestBefore()
	 * @see #getStandardLoopCharacteristics()
	 * @generated
	 */
	EAttribute getStandardLoopCharacteristics_TestBefore();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#getLoopCondition()
	 * @see #getStandardLoopCharacteristics()
	 * @generated
	 */
	EReference getStandardLoopCharacteristics_LoopCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Maximum</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.StandardLoopCharacteristics#getLoopMaximum()
	 * @see #getStandardLoopCharacteristics()
	 * @generated
	 */
	EReference getStandardLoopCharacteristics_LoopMaximum();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.CallActivity <em>Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Activity</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallActivity
	 * @generated
	 */
	EClass getCallActivity();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.CallActivity#getCalledElementRef <em>Called Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Called Element Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.CallActivity#getCalledElementRef()
	 * @see #getCallActivity()
	 * @generated
	 */
	EReference getCallActivity_CalledElementRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.SendTask <em>Send Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SendTask
	 * @generated
	 */
	EClass getSendTask();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.SendTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SendTask#getImplementation()
	 * @see #getSendTask()
	 * @generated
	 */
	EAttribute getSendTask_Implementation();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.SendTask#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SendTask#getOperationRef()
	 * @see #getSendTask()
	 * @generated
	 */
	EReference getSendTask_OperationRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.SendTask#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.SendTask#getMessageRef()
	 * @see #getSendTask()
	 * @generated
	 */
	EReference getSendTask_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ReceiveTask <em>Receive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ReceiveTask
	 * @generated
	 */
	EClass getReceiveTask();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ReceiveTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ReceiveTask#getImplementation()
	 * @see #getReceiveTask()
	 * @generated
	 */
	EAttribute getReceiveTask_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ReceiveTask#isInstantiate <em>Instantiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiate</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ReceiveTask#isInstantiate()
	 * @see #getReceiveTask()
	 * @generated
	 */
	EAttribute getReceiveTask_Instantiate();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ReceiveTask#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ReceiveTask#getOperationRef()
	 * @see #getReceiveTask()
	 * @generated
	 */
	EReference getReceiveTask_OperationRef();

	/**
	 * Returns the meta object for the reference '{@link org.obeonetwork.dsl.bpmn2.ReceiveTask#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Ref</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ReceiveTask#getMessageRef()
	 * @see #getReceiveTask()
	 * @generated
	 */
	EReference getReceiveTask_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.ScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ScriptTask
	 * @generated
	 */
	EClass getScriptTask();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ScriptTask#getScriptFormat <em>Script Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Format</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ScriptTask#getScriptFormat()
	 * @see #getScriptTask()
	 * @generated
	 */
	EAttribute getScriptTask_ScriptFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.ScriptTask#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ScriptTask#getScript()
	 * @see #getScriptTask()
	 * @generated
	 */
	EAttribute getScriptTask_Script();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.BusinessRuleTask <em>Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Rule Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BusinessRuleTask
	 * @generated
	 */
	EClass getBusinessRuleTask();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.BusinessRuleTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.BusinessRuleTask#getImplementation()
	 * @see #getBusinessRuleTask()
	 * @generated
	 */
	EAttribute getBusinessRuleTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ad Hoc Sub Process</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.AdHocSubProcess
	 * @generated
	 */
	EClass getAdHocSubProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.bpmn2.AdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.AdHocSubProcess#getCompletionCondition()
	 * @see #getAdHocSubProcess()
	 * @generated
	 */
	EReference getAdHocSubProcess_CompletionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.AdHocSubProcess#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.AdHocSubProcess#getOrdering()
	 * @see #getAdHocSubProcess()
	 * @generated
	 */
	EAttribute getAdHocSubProcess_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.AdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Remaining Instances</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.AdHocSubProcess#isCancelRemainingInstances()
	 * @see #getAdHocSubProcess()
	 * @generated
	 */
	EAttribute getAdHocSubProcess_CancelRemainingInstances();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Transaction#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Transaction#getProtocol()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Transaction#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Transaction#getMethod()
	 * @see #getTransaction()
	 * @generated
	 */
	EAttribute getTransaction_Method();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.GlobalScriptTask <em>Global Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Script Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalScriptTask
	 * @generated
	 */
	EClass getGlobalScriptTask();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.GlobalScriptTask#getScriptLanguage <em>Script Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Language</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalScriptTask#getScriptLanguage()
	 * @see #getGlobalScriptTask()
	 * @generated
	 */
	EAttribute getGlobalScriptTask_ScriptLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.GlobalScriptTask#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalScriptTask#getScript()
	 * @see #getGlobalScriptTask()
	 * @generated
	 */
	EAttribute getGlobalScriptTask_Script();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Business Rule Task</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalBusinessRuleTask
	 * @generated
	 */
	EClass getGlobalBusinessRuleTask();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.GlobalBusinessRuleTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GlobalBusinessRuleTask#getImplementation()
	 * @see #getGlobalBusinessRuleTask()
	 * @generated
	 */
	EAttribute getGlobalBusinessRuleTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.obeonetwork.dsl.bpmn2.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions
	 * @generated
	 */
	EClass getDefinitions();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Definitions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getName()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Definitions#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getTargetNamespace()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Definitions#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getExpressionLanguage()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Definitions#getTypeLanguage <em>Type Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Language</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getTypeLanguage()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_TypeLanguage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Definitions#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getImports()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Definitions#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getExtensions()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Definitions#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getRelationships()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Relationships();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Definitions#getRootElements <em>Root Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Elements</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getRootElements()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_RootElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.bpmn2.Definitions#getDiagrams <em>Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagrams</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getDiagrams()
	 * @see #getDefinitions()
	 * @generated
	 */
	EReference getDefinitions_Diagrams();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Definitions#getExporter <em>Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getExporter()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_Exporter();

	/**
	 * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.bpmn2.Definitions#getExporterVersion <em>Exporter Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter Version</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.Definitions#getExporterVersion()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_ExporterVersion();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.bpmn2.ItemKind <em>Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Item Kind</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ItemKind
	 * @generated
	 */
	EEnum getItemKind();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.bpmn2.ProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ProcessType
	 * @generated
	 */
	EEnum getProcessType();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.bpmn2.GatewayDirection <em>Gateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gateway Direction</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.GatewayDirection
	 * @generated
	 */
	EEnum getGatewayDirection();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.bpmn2.EventBasedGatewayType <em>Event Based Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Based Gateway Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.EventBasedGatewayType
	 * @generated
	 */
	EEnum getEventBasedGatewayType();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.bpmn2.RelationshipDirection <em>Relationship Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Direction</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.RelationshipDirection
	 * @generated
	 */
	EEnum getRelationshipDirection();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.bpmn2.ChoreographyLoopType <em>Choreography Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Choreography Loop Type</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.ChoreographyLoopType
	 * @generated
	 */
	EEnum getChoreographyLoopType();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.bpmn2.AssociationDirection <em>Association Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Direction</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.AssociationDirection
	 * @generated
	 */
	EEnum getAssociationDirection();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceBehavior <em>Multi Instance Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multi Instance Behavior</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceBehavior
	 * @generated
	 */
	EEnum getMultiInstanceBehavior();

	/**
	 * Returns the meta object for enum '{@link org.obeonetwork.dsl.bpmn2.AdHocOrdering <em>Ad Hoc Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ad Hoc Ordering</em>'.
	 * @see org.obeonetwork.dsl.bpmn2.AdHocOrdering
	 * @generated
	 */
	EEnum getAdHocOrdering();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bpmn2Factory getBpmn2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.InterfaceImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OPERATIONS = eINSTANCE.getInterface_Operations();

		/**
		 * The meta object literal for the '<em><b>Implementation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__IMPLEMENTATION_REF = eINSTANCE.getInterface_ImplementationRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.RootElementImpl <em>Root Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.RootElementImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getRootElement()
		 * @generated
		 */
		EClass ROOT_ELEMENT = eINSTANCE.getRootElement();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.BaseElementImpl <em>Base Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.BaseElementImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getBaseElement()
		 * @generated
		 */
		EClass BASE_ELEMENT = eINSTANCE.getBaseElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ELEMENT__ID = eINSTANCE.getBaseElement_Id();

		/**
		 * The meta object literal for the '<em><b>Extension Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ELEMENT__EXTENSION_DEFINITIONS = eINSTANCE.getBaseElement_ExtensionDefinitions();

		/**
		 * The meta object literal for the '<em><b>Extension Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ELEMENT__EXTENSION_VALUES = eINSTANCE.getBaseElement_ExtensionValues();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ELEMENT__DOCUMENTATION = eINSTANCE.getBaseElement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ELEMENT__DESCRIPTION = eINSTANCE.getBaseElement_Description();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionDefinitionImpl <em>Extension Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ExtensionDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExtensionDefinition()
		 * @generated
		 */
		EClass EXTENSION_DEFINITION = eINSTANCE.getExtensionDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_DEFINITION__NAME = eINSTANCE.getExtensionDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Extension Attribute Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_DEFINITION__EXTENSION_ATTRIBUTE_DEFINITIONS = eINSTANCE
				.getExtensionDefinition_ExtensionAttributeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_DEFINITION__ID = eINSTANCE.getExtensionDefinition_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl <em>Extension Attribute Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExtensionAttributeDefinition()
		 * @generated
		 */
		EClass EXTENSION_ATTRIBUTE_DEFINITION = eINSTANCE.getExtensionAttributeDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ATTRIBUTE_DEFINITION__NAME = eINSTANCE.getExtensionAttributeDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ATTRIBUTE_DEFINITION__TYPE = eINSTANCE.getExtensionAttributeDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Is Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ATTRIBUTE_DEFINITION__IS_REFERENCE = eINSTANCE
				.getExtensionAttributeDefinition_IsReference();

		/**
		 * The meta object literal for the '<em><b>Extension Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_ATTRIBUTE_DEFINITION__EXTENSION_DEFINITION = eINSTANCE
				.getExtensionAttributeDefinition_ExtensionDefinition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ATTRIBUTE_DEFINITION__ID = eINSTANCE.getExtensionAttributeDefinition_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl <em>Extension Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ExtensionAttributeValueImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExtensionAttributeValue()
		 * @generated
		 */
		EClass EXTENSION_ATTRIBUTE_VALUE = eINSTANCE.getExtensionAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Value Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_ATTRIBUTE_VALUE__VALUE_REF = eINSTANCE.getExtensionAttributeValue_ValueRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_ATTRIBUTE_VALUE__VALUE = eINSTANCE.getExtensionAttributeValue_Value();

		/**
		 * The meta object literal for the '<em><b>Extension Attribute Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION = eINSTANCE
				.getExtensionAttributeValue_ExtensionAttributeDefinition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ATTRIBUTE_VALUE__ID = eINSTANCE.getExtensionAttributeValue_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DocumentationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__TEXT = eINSTANCE.getDocumentation_Text();

		/**
		 * The meta object literal for the '<em><b>Text Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__TEXT_FORMAT = eINSTANCE.getDocumentation_TextFormat();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.OperationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>In Message Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__IN_MESSAGE_REF = eINSTANCE.getOperation_InMessageRef();

		/**
		 * The meta object literal for the '<em><b>Out Message Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUT_MESSAGE_REF = eINSTANCE.getOperation_OutMessageRef();

		/**
		 * The meta object literal for the '<em><b>Error Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ERROR_REFS = eINSTANCE.getOperation_ErrorRefs();

		/**
		 * The meta object literal for the '<em><b>Implementation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__IMPLEMENTATION_REF = eINSTANCE.getOperation_ImplementationRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.MessageImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Item Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ITEM_REF = eINSTANCE.getMessage_ItemRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ItemDefinitionImpl <em>Item Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ItemDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getItemDefinition()
		 * @generated
		 */
		EClass ITEM_DEFINITION = eINSTANCE.getItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Item Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_DEFINITION__ITEM_KIND = eINSTANCE.getItemDefinition_ItemKind();

		/**
		 * The meta object literal for the '<em><b>Structure Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_DEFINITION__STRUCTURE_REF = eINSTANCE.getItemDefinition_StructureRef();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_DEFINITION__IS_COLLECTION = eINSTANCE.getItemDefinition_IsCollection();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_DEFINITION__IMPORT = eINSTANCE.getItemDefinition_Import();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ImportImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_TYPE = eINSTANCE.getImport_ImportType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__LOCATION = eINSTANCE.getImport_Location();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__NAMESPACE = eINSTANCE.getImport_Namespace();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ID = eINSTANCE.getImport_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ErrorImpl <em>Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ErrorImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getError()
		 * @generated
		 */
		EClass ERROR = eINSTANCE.getError();

		/**
		 * The meta object literal for the '<em><b>Structure Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR__STRUCTURE_REF = eINSTANCE.getError_StructureRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__NAME = eINSTANCE.getError_Name();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR__ERROR_CODE = eINSTANCE.getError_ErrorCode();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.EndPointImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.AuditingImpl <em>Auditing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.AuditingImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAuditing()
		 * @generated
		 */
		EClass AUDITING = eINSTANCE.getAuditing();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalTaskImpl <em>Global Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalTask()
		 * @generated
		 */
		EClass GLOBAL_TASK = eINSTANCE.getGlobalTask();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_TASK__RESOURCES = eINSTANCE.getGlobalTask_Resources();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CallableElementImpl <em>Callable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CallableElementImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCallableElement()
		 * @generated
		 */
		EClass CALLABLE_ELEMENT = eINSTANCE.getCallableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_ELEMENT__NAME = eINSTANCE.getCallableElement_Name();

		/**
		 * The meta object literal for the '<em><b>Io Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_ELEMENT__IO_SPECIFICATION = eINSTANCE.getCallableElement_IoSpecification();

		/**
		 * The meta object literal for the '<em><b>Supported Interface Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS = eINSTANCE.getCallableElement_SupportedInterfaceRefs();

		/**
		 * The meta object literal for the '<em><b>Io Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_ELEMENT__IO_BINDING = eINSTANCE.getCallableElement_IoBinding();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl <em>Input Output Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.InputOutputSpecificationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInputOutputSpecification()
		 * @generated
		 */
		EClass INPUT_OUTPUT_SPECIFICATION = eINSTANCE.getInputOutputSpecification();

		/**
		 * The meta object literal for the '<em><b>Input Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_SPECIFICATION__INPUT_SETS = eINSTANCE.getInputOutputSpecification_InputSets();

		/**
		 * The meta object literal for the '<em><b>Output Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS = eINSTANCE.getInputOutputSpecification_OutputSets();

		/**
		 * The meta object literal for the '<em><b>Data Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS = eINSTANCE.getInputOutputSpecification_DataInputs();

		/**
		 * The meta object literal for the '<em><b>Data Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS = eINSTANCE.getInputOutputSpecification_DataOutputs();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.InputSetImpl <em>Input Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.InputSetImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInputSet()
		 * @generated
		 */
		EClass INPUT_SET = eINSTANCE.getInputSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SET__NAME = eINSTANCE.getInputSet_Name();

		/**
		 * The meta object literal for the '<em><b>Data Input Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SET__DATA_INPUT_REFS = eINSTANCE.getInputSet_DataInputRefs();

		/**
		 * The meta object literal for the '<em><b>Optional Input Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SET__OPTIONAL_INPUT_REFS = eINSTANCE.getInputSet_OptionalInputRefs();

		/**
		 * The meta object literal for the '<em><b>While Executing Input Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SET__WHILE_EXECUTING_INPUT_REFS = eINSTANCE.getInputSet_WhileExecutingInputRefs();

		/**
		 * The meta object literal for the '<em><b>Output Set Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SET__OUTPUT_SET_REFS = eINSTANCE.getInputSet_OutputSetRefs();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataInputImpl <em>Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataInputImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataInput()
		 * @generated
		 */
		EClass DATA_INPUT = eINSTANCE.getDataInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INPUT__NAME = eINSTANCE.getDataInput_Name();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_INPUT__IS_COLLECTION = eINSTANCE.getDataInput_IsCollection();

		/**
		 * The meta object literal for the '<em><b>Input Set With Optional</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INPUT__INPUT_SET_WITH_OPTIONAL = eINSTANCE.getDataInput_InputSetWithOptional();

		/**
		 * The meta object literal for the '<em><b>Input Set With While Executing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INPUT__INPUT_SET_WITH_WHILE_EXECUTING = eINSTANCE.getDataInput_InputSetWithWhileExecuting();

		/**
		 * The meta object literal for the '<em><b>Input Set Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INPUT__INPUT_SET_REFS = eINSTANCE.getDataInput_InputSetRefs();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ItemAwareElementImpl <em>Item Aware Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ItemAwareElementImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getItemAwareElement()
		 * @generated
		 */
		EClass ITEM_AWARE_ELEMENT = eINSTANCE.getItemAwareElement();

		/**
		 * The meta object literal for the '<em><b>Item Subject Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF = eINSTANCE.getItemAwareElement_ItemSubjectRef();

		/**
		 * The meta object literal for the '<em><b>Data State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_AWARE_ELEMENT__DATA_STATE = eINSTANCE.getItemAwareElement_DataState();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataStateImpl <em>Data State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataStateImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataState()
		 * @generated
		 */
		EClass DATA_STATE = eINSTANCE.getDataState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STATE__NAME = eINSTANCE.getDataState_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.OutputSetImpl <em>Output Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.OutputSetImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getOutputSet()
		 * @generated
		 */
		EClass OUTPUT_SET = eINSTANCE.getOutputSet();

		/**
		 * The meta object literal for the '<em><b>Data Output Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_SET__DATA_OUTPUT_REFS = eINSTANCE.getOutputSet_DataOutputRefs();

		/**
		 * The meta object literal for the '<em><b>Optional Output Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_SET__OPTIONAL_OUTPUT_REFS = eINSTANCE.getOutputSet_OptionalOutputRefs();

		/**
		 * The meta object literal for the '<em><b>While Executing Output Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS = eINSTANCE.getOutputSet_WhileExecutingOutputRefs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_SET__NAME = eINSTANCE.getOutputSet_Name();

		/**
		 * The meta object literal for the '<em><b>Input Set Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_SET__INPUT_SET_REFS = eINSTANCE.getOutputSet_InputSetRefs();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl <em>Data Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataOutputImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataOutput()
		 * @generated
		 */
		EClass DATA_OUTPUT = eINSTANCE.getDataOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OUTPUT__NAME = eINSTANCE.getDataOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OUTPUT__IS_COLLECTION = eINSTANCE.getDataOutput_IsCollection();

		/**
		 * The meta object literal for the '<em><b>Output Set With Optional</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OUTPUT__OUTPUT_SET_WITH_OPTIONAL = eINSTANCE.getDataOutput_OutputSetWithOptional();

		/**
		 * The meta object literal for the '<em><b>Output Set With While Executing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OUTPUT__OUTPUT_SET_WITH_WHILE_EXECUTING = eINSTANCE.getDataOutput_OutputSetWithWhileExecuting();

		/**
		 * The meta object literal for the '<em><b>Output Set Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OUTPUT__OUTPUT_SET_REFS = eINSTANCE.getDataOutput_OutputSetRefs();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl <em>Input Output Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.InputOutputBindingImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInputOutputBinding()
		 * @generated
		 */
		EClass INPUT_OUTPUT_BINDING = eINSTANCE.getInputOutputBinding();

		/**
		 * The meta object literal for the '<em><b>Input Data Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_BINDING__INPUT_DATA_REF = eINSTANCE.getInputOutputBinding_InputDataRef();

		/**
		 * The meta object literal for the '<em><b>Output Data Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF = eINSTANCE.getInputOutputBinding_OutputDataRef();

		/**
		 * The meta object literal for the '<em><b>Operation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_OUTPUT_BINDING__OPERATION_REF = eINSTANCE.getInputOutputBinding_OperationRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_OUTPUT_BINDING__ID = eINSTANCE.getInputOutputBinding_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl <em>Resource Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceRoleImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResourceRole()
		 * @generated
		 */
		EClass RESOURCE_ROLE = eINSTANCE.getResourceRole();

		/**
		 * The meta object literal for the '<em><b>Resource Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ROLE__RESOURCE_REF = eINSTANCE.getResourceRole_ResourceRef();

		/**
		 * The meta object literal for the '<em><b>Resource Parameter Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ROLE__RESOURCE_PARAMETER_BINDINGS = eINSTANCE.getResourceRole_ResourceParameterBindings();

		/**
		 * The meta object literal for the '<em><b>Resource Assignment Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION = eINSTANCE
				.getResourceRole_ResourceAssignmentExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ROLE__NAME = eINSTANCE.getResourceRole_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__RESOURCE_PARAMETERS = eINSTANCE.getResource_ResourceParameters();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterImpl <em>Resource Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceParameterImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResourceParameter()
		 * @generated
		 */
		EClass RESOURCE_PARAMETER = eINSTANCE.getResourceParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PARAMETER__NAME = eINSTANCE.getResourceParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PARAMETER__IS_REQUIRED = eINSTANCE.getResourceParameter_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PARAMETER__TYPE = eINSTANCE.getResourceParameter_Type();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceParameterBindingImpl <em>Resource Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceParameterBindingImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResourceParameterBinding()
		 * @generated
		 */
		EClass RESOURCE_PARAMETER_BINDING = eINSTANCE.getResourceParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PARAMETER_BINDING__EXPRESSION = eINSTANCE.getResourceParameterBinding_Expression();

		/**
		 * The meta object literal for the '<em><b>Parameter Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PARAMETER_BINDING__PARAMETER_REF = eINSTANCE.getResourceParameterBinding_ParameterRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PARAMETER_BINDING__ID = eINSTANCE.getResourceParameterBinding_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ExpressionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ResourceAssignmentExpressionImpl <em>Resource Assignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ResourceAssignmentExpressionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getResourceAssignmentExpression()
		 * @generated
		 */
		EClass RESOURCE_ASSIGNMENT_EXPRESSION = eINSTANCE.getResourceAssignmentExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION = eINSTANCE.getResourceAssignmentExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ASSIGNMENT_EXPRESSION__ID = eINSTANCE.getResourceAssignmentExpression_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.MonitoringImpl <em>Monitoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.MonitoringImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMonitoring()
		 * @generated
		 */
		EClass MONITORING = eINSTANCE.getMonitoring();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.PerformerImpl <em>Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.PerformerImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getPerformer()
		 * @generated
		 */
		EClass PERFORMER = eINSTANCE.getPerformer();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ProcessImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Process Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__PROCESS_TYPE = eINSTANCE.getProcess_ProcessType();

		/**
		 * The meta object literal for the '<em><b>Is Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__IS_CLOSED = eINSTANCE.getProcess_IsClosed();

		/**
		 * The meta object literal for the '<em><b>Auditing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__AUDITING = eINSTANCE.getProcess_Auditing();

		/**
		 * The meta object literal for the '<em><b>Monitoring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__MONITORING = eINSTANCE.getProcess_Monitoring();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PROPERTIES = eINSTANCE.getProcess_Properties();

		/**
		 * The meta object literal for the '<em><b>Supports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SUPPORTS = eINSTANCE.getProcess_Supports();

		/**
		 * The meta object literal for the '<em><b>Definitional Collaboration Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__DEFINITIONAL_COLLABORATION_REF = eINSTANCE.getProcess_DefinitionalCollaborationRef();

		/**
		 * The meta object literal for the '<em><b>Is Executable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__IS_EXECUTABLE = eINSTANCE.getProcess_IsExecutable();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__RESOURCES = eINSTANCE.getProcess_Resources();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ARTIFACTS = eINSTANCE.getProcess_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Correlation Subscriptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__CORRELATION_SUBSCRIPTIONS = eINSTANCE.getProcess_CorrelationSubscriptions();

		/**
		 * The meta object literal for the '<em><b>Decomposed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__DECOMPOSED_BY = eINSTANCE.getProcess_DecomposedBy();

		/**
		 * The meta object literal for the '<em><b>Decomposes</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__DECOMPOSES = eINSTANCE.getProcess_Decomposes();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementsContainerImpl <em>Flow Elements Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.FlowElementsContainerImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getFlowElementsContainer()
		 * @generated
		 */
		EClass FLOW_ELEMENTS_CONTAINER = eINSTANCE.getFlowElementsContainer();

		/**
		 * The meta object literal for the '<em><b>Flow Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS = eINSTANCE.getFlowElementsContainer_FlowElements();

		/**
		 * The meta object literal for the '<em><b>Lane Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENTS_CONTAINER__LANE_SETS = eINSTANCE.getFlowElementsContainer_LaneSets();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl <em>Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.FlowElementImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__NAME = eINSTANCE.getFlowElement_Name();

		/**
		 * The meta object literal for the '<em><b>Auditing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENT__AUDITING = eINSTANCE.getFlowElement_Auditing();

		/**
		 * The meta object literal for the '<em><b>Monitoring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENT__MONITORING = eINSTANCE.getFlowElement_Monitoring();

		/**
		 * The meta object literal for the '<em><b>Category Value Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENT__CATEGORY_VALUE_REF = eINSTANCE.getFlowElement_CategoryValueRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CategoryValueImpl <em>Category Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CategoryValueImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCategoryValue()
		 * @generated
		 */
		EClass CATEGORY_VALUE = eINSTANCE.getCategoryValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_VALUE__VALUE = eINSTANCE.getCategoryValue_Value();

		/**
		 * The meta object literal for the '<em><b>Categorized Flow Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_VALUE__CATEGORIZED_FLOW_ELEMENTS = eINSTANCE.getCategoryValue_CategorizedFlowElements();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.LaneSetImpl <em>Lane Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.LaneSetImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getLaneSet()
		 * @generated
		 */
		EClass LANE_SET = eINSTANCE.getLaneSet();

		/**
		 * The meta object literal for the '<em><b>Lanes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE_SET__LANES = eINSTANCE.getLaneSet_Lanes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE_SET__NAME = eINSTANCE.getLaneSet_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.LaneImpl <em>Lane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.LaneImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getLane()
		 * @generated
		 */
		EClass LANE = eINSTANCE.getLane();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANE__NAME = eINSTANCE.getLane_Name();

		/**
		 * The meta object literal for the '<em><b>Child Lane Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__CHILD_LANE_SET = eINSTANCE.getLane_ChildLaneSet();

		/**
		 * The meta object literal for the '<em><b>Partition Element Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__PARTITION_ELEMENT_REF = eINSTANCE.getLane_PartitionElementRef();

		/**
		 * The meta object literal for the '<em><b>Flow Node Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__FLOW_NODE_REFS = eINSTANCE.getLane_FlowNodeRefs();

		/**
		 * The meta object literal for the '<em><b>Partition Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANE__PARTITION_ELEMENT = eINSTANCE.getLane_PartitionElement();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.FlowNodeImpl <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.FlowNodeImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__OUTGOING = eINSTANCE.getFlowNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__INCOMING = eINSTANCE.getFlowNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Lanes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_NODE__LANES = eINSTANCE.getFlowNode_Lanes();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.SequenceFlowImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSequenceFlow()
		 * @generated
		 */
		EClass SEQUENCE_FLOW = eINSTANCE.getSequenceFlow();

		/**
		 * The meta object literal for the '<em><b>Is Immediate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_FLOW__IS_IMMEDIATE = eINSTANCE.getSequenceFlow_IsImmediate();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__CONDITION_EXPRESSION = eINSTANCE.getSequenceFlow_ConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__TARGET_REF = eINSTANCE.getSequenceFlow_TargetRef();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FLOW__SOURCE_REF = eINSTANCE.getSequenceFlow_SourceRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.PropertyImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl <em>Collaboration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CollaborationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCollaboration()
		 * @generated
		 */
		EClass COLLABORATION = eINSTANCE.getCollaboration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION__NAME = eINSTANCE.getCollaboration_Name();

		/**
		 * The meta object literal for the '<em><b>Is Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATION__IS_CLOSED = eINSTANCE.getCollaboration_IsClosed();

		/**
		 * The meta object literal for the '<em><b>Choreography Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__CHOREOGRAPHY_REF = eINSTANCE.getCollaboration_ChoreographyRef();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__ARTIFACTS = eINSTANCE.getCollaboration_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Participant Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__PARTICIPANT_ASSOCIATIONS = eINSTANCE.getCollaboration_ParticipantAssociations();

		/**
		 * The meta object literal for the '<em><b>Message Flow Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__MESSAGE_FLOW_ASSOCIATIONS = eINSTANCE.getCollaboration_MessageFlowAssociations();

		/**
		 * The meta object literal for the '<em><b>Conversation Associations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__CONVERSATION_ASSOCIATIONS = eINSTANCE.getCollaboration_ConversationAssociations();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__PARTICIPANTS = eINSTANCE.getCollaboration_Participants();

		/**
		 * The meta object literal for the '<em><b>Message Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__MESSAGE_FLOWS = eINSTANCE.getCollaboration_MessageFlows();

		/**
		 * The meta object literal for the '<em><b>Correlation Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__CORRELATION_KEYS = eINSTANCE.getCollaboration_CorrelationKeys();

		/**
		 * The meta object literal for the '<em><b>Conversations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__CONVERSATIONS = eINSTANCE.getCollaboration_Conversations();

		/**
		 * The meta object literal for the '<em><b>Conversation Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLABORATION__CONVERSATION_LINKS = eINSTANCE.getCollaboration_ConversationLinks();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyImpl <em>Choreography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ChoreographyImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getChoreography()
		 * @generated
		 */
		EClass CHOREOGRAPHY = eINSTANCE.getChoreography();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ArtifactImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantAssociationImpl <em>Participant Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ParticipantAssociationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getParticipantAssociation()
		 * @generated
		 */
		EClass PARTICIPANT_ASSOCIATION = eINSTANCE.getParticipantAssociation();

		/**
		 * The meta object literal for the '<em><b>Inner Participant Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF = eINSTANCE
				.getParticipantAssociation_InnerParticipantRef();

		/**
		 * The meta object literal for the '<em><b>Outer Participant Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF = eINSTANCE
				.getParticipantAssociation_OuterParticipantRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ParticipantImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

		/**
		 * The meta object literal for the '<em><b>Interface Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__INTERFACE_REFS = eINSTANCE.getParticipant_InterfaceRefs();

		/**
		 * The meta object literal for the '<em><b>Participant Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PARTICIPANT_MULTIPLICITY = eINSTANCE.getParticipant_ParticipantMultiplicity();

		/**
		 * The meta object literal for the '<em><b>End Point Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__END_POINT_REFS = eINSTANCE.getParticipant_EndPointRefs();

		/**
		 * The meta object literal for the '<em><b>Process Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PROCESS_REF = eINSTANCE.getParticipant_ProcessRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.InteractionNodeImpl <em>Interaction Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.InteractionNodeImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInteractionNode()
		 * @generated
		 */
		EClass INTERACTION_NODE = eINSTANCE.getInteractionNode();

		/**
		 * The meta object literal for the '<em><b>Incoming Conversation Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_NODE__INCOMING_CONVERSATION_LINKS = eINSTANCE
				.getInteractionNode_IncomingConversationLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Conversation Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS = eINSTANCE
				.getInteractionNode_OutgoingConversationLinks();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConversationLinkImpl <em>Conversation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ConversationLinkImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConversationLink()
		 * @generated
		 */
		EClass CONVERSATION_LINK = eINSTANCE.getConversationLink();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION_LINK__SOURCE_REF = eINSTANCE.getConversationLink_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSATION_LINK__NAME = eINSTANCE.getConversationLink_Name();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION_LINK__TARGET_REF = eINSTANCE.getConversationLink_TargetRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ParticipantMultiplicityImpl <em>Participant Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ParticipantMultiplicityImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getParticipantMultiplicity()
		 * @generated
		 */
		EClass PARTICIPANT_MULTIPLICITY = eINSTANCE.getParticipantMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_MULTIPLICITY__MINIMUM = eINSTANCE.getParticipantMultiplicity_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_MULTIPLICITY__MAXIMUM = eINSTANCE.getParticipantMultiplicity_Maximum();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT_MULTIPLICITY__ID = eINSTANCE.getParticipantMultiplicity_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowAssociationImpl <em>Message Flow Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.MessageFlowAssociationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMessageFlowAssociation()
		 * @generated
		 */
		EClass MESSAGE_FLOW_ASSOCIATION = eINSTANCE.getMessageFlowAssociation();

		/**
		 * The meta object literal for the '<em><b>Inner Message Flow Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF = eINSTANCE
				.getMessageFlowAssociation_InnerMessageFlowRef();

		/**
		 * The meta object literal for the '<em><b>Outer Message Flow Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF = eINSTANCE
				.getMessageFlowAssociation_OuterMessageFlowRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.MessageFlowImpl <em>Message Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.MessageFlowImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMessageFlow()
		 * @generated
		 */
		EClass MESSAGE_FLOW = eINSTANCE.getMessageFlow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_FLOW__NAME = eINSTANCE.getMessageFlow_Name();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FLOW__SOURCE_REF = eINSTANCE.getMessageFlow_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FLOW__TARGET_REF = eINSTANCE.getMessageFlow_TargetRef();

		/**
		 * The meta object literal for the '<em><b>Message Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_FLOW__MESSAGE_REF = eINSTANCE.getMessageFlow_MessageRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConversationAssociationImpl <em>Conversation Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ConversationAssociationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConversationAssociation()
		 * @generated
		 */
		EClass CONVERSATION_ASSOCIATION = eINSTANCE.getConversationAssociation();

		/**
		 * The meta object literal for the '<em><b>Inner Conversation Node Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF = eINSTANCE
				.getConversationAssociation_InnerConversationNodeRef();

		/**
		 * The meta object literal for the '<em><b>Outer Conversation Node Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF = eINSTANCE
				.getConversationAssociation_OuterConversationNodeRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl <em>Conversation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ConversationNodeImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConversationNode()
		 * @generated
		 */
		EClass CONVERSATION_NODE = eINSTANCE.getConversationNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVERSATION_NODE__NAME = eINSTANCE.getConversationNode_Name();

		/**
		 * The meta object literal for the '<em><b>Participant Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION_NODE__PARTICIPANT_REFS = eINSTANCE.getConversationNode_ParticipantRefs();

		/**
		 * The meta object literal for the '<em><b>Message Flow Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION_NODE__MESSAGE_FLOW_REFS = eINSTANCE.getConversationNode_MessageFlowRefs();

		/**
		 * The meta object literal for the '<em><b>Correlation Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVERSATION_NODE__CORRELATION_KEYS = eINSTANCE.getConversationNode_CorrelationKeys();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationKeyImpl <em>Correlation Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationKeyImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationKey()
		 * @generated
		 */
		EClass CORRELATION_KEY = eINSTANCE.getCorrelationKey();

		/**
		 * The meta object literal for the '<em><b>Correlation Property Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_KEY__CORRELATION_PROPERTY_REF = eINSTANCE.getCorrelationKey_CorrelationPropertyRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_KEY__NAME = eINSTANCE.getCorrelationKey_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyImpl <em>Correlation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationProperty()
		 * @generated
		 */
		EClass CORRELATION_PROPERTY = eINSTANCE.getCorrelationProperty();

		/**
		 * The meta object literal for the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = eINSTANCE
				.getCorrelationProperty_CorrelationPropertyRetrievalExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION_PROPERTY__NAME = eINSTANCE.getCorrelationProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_PROPERTY__TYPE = eINSTANCE.getCorrelationProperty_Type();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl <em>Correlation Property Retrieval Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyRetrievalExpressionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationPropertyRetrievalExpression()
		 * @generated
		 */
		EClass CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = eINSTANCE.getCorrelationPropertyRetrievalExpression();

		/**
		 * The meta object literal for the '<em><b>Message Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH = eINSTANCE
				.getCorrelationPropertyRetrievalExpression_MessagePath();

		/**
		 * The meta object literal for the '<em><b>Message Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF = eINSTANCE
				.getCorrelationPropertyRetrievalExpression_MessageRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.FormalExpressionImpl <em>Formal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.FormalExpressionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getFormalExpression()
		 * @generated
		 */
		EClass FORMAL_EXPRESSION = eINSTANCE.getFormalExpression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_EXPRESSION__LANGUAGE = eINSTANCE.getFormalExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_EXPRESSION__BODY = eINSTANCE.getFormalExpression_Body();

		/**
		 * The meta object literal for the '<em><b>Evaluates To Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF = eINSTANCE.getFormalExpression_EvaluatesToTypeRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationSubscriptionImpl <em>Correlation Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationSubscriptionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationSubscription()
		 * @generated
		 */
		EClass CORRELATION_SUBSCRIPTION = eINSTANCE.getCorrelationSubscription();

		/**
		 * The meta object literal for the '<em><b>Correlation Key Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF = eINSTANCE
				.getCorrelationSubscription_CorrelationKeyRef();

		/**
		 * The meta object literal for the '<em><b>Correlation Property Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING = eINSTANCE
				.getCorrelationSubscription_CorrelationPropertyBinding();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyBindingImpl <em>Correlation Property Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CorrelationPropertyBindingImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCorrelationPropertyBinding()
		 * @generated
		 */
		EClass CORRELATION_PROPERTY_BINDING = eINSTANCE.getCorrelationPropertyBinding();

		/**
		 * The meta object literal for the '<em><b>Data Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_PROPERTY_BINDING__DATA_PATH = eINSTANCE.getCorrelationPropertyBinding_DataPath();

		/**
		 * The meta object literal for the '<em><b>Correlation Property Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF = eINSTANCE
				.getCorrelationPropertyBinding_CorrelationPropertyRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalManualTaskImpl <em>Global Manual Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalManualTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalManualTask()
		 * @generated
		 */
		EClass GLOBAL_MANUAL_TASK = eINSTANCE.getGlobalManualTask();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ManualTaskImpl <em>Manual Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ManualTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getManualTask()
		 * @generated
		 */
		EClass MANUAL_TASK = eINSTANCE.getManualTask();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.TaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ActivityImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Is For Compensation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IS_FOR_COMPENSATION = eINSTANCE.getActivity_IsForCompensation();

		/**
		 * The meta object literal for the '<em><b>Loop Characteristics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__LOOP_CHARACTERISTICS = eINSTANCE.getActivity_LoopCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__RESOURCES = eINSTANCE.getActivity_Resources();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DEFAULT = eINSTANCE.getActivity_Default();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PROPERTIES = eINSTANCE.getActivity_Properties();

		/**
		 * The meta object literal for the '<em><b>Io Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__IO_SPECIFICATION = eINSTANCE.getActivity_IoSpecification();

		/**
		 * The meta object literal for the '<em><b>Boundary Event Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__BOUNDARY_EVENT_REFS = eINSTANCE.getActivity_BoundaryEventRefs();

		/**
		 * The meta object literal for the '<em><b>Data Input Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DATA_INPUT_ASSOCIATIONS = eINSTANCE.getActivity_DataInputAssociations();

		/**
		 * The meta object literal for the '<em><b>Data Output Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DATA_OUTPUT_ASSOCIATIONS = eINSTANCE.getActivity_DataOutputAssociations();

		/**
		 * The meta object literal for the '<em><b>Start Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__START_QUANTITY = eINSTANCE.getActivity_StartQuantity();

		/**
		 * The meta object literal for the '<em><b>Completion Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__COMPLETION_QUANTITY = eINSTANCE.getActivity_CompletionQuantity();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.LoopCharacteristicsImpl <em>Loop Characteristics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.LoopCharacteristicsImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getLoopCharacteristics()
		 * @generated
		 */
		EClass LOOP_CHARACTERISTICS = eINSTANCE.getLoopCharacteristics();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.BoundaryEventImpl <em>Boundary Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.BoundaryEventImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getBoundaryEvent()
		 * @generated
		 */
		EClass BOUNDARY_EVENT = eINSTANCE.getBoundaryEvent();

		/**
		 * The meta object literal for the '<em><b>Cancel Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY_EVENT__CANCEL_ACTIVITY = eINSTANCE.getBoundaryEvent_CancelActivity();

		/**
		 * The meta object literal for the '<em><b>Attached To Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDARY_EVENT__ATTACHED_TO_REF = eINSTANCE.getBoundaryEvent_AttachedToRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl <em>Catch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CatchEventImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCatchEvent()
		 * @generated
		 */
		EClass CATCH_EVENT = eINSTANCE.getCatchEvent();

		/**
		 * The meta object literal for the '<em><b>Parallel Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATCH_EVENT__PARALLEL_MULTIPLE = eINSTANCE.getCatchEvent_ParallelMultiple();

		/**
		 * The meta object literal for the '<em><b>Output Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EVENT__OUTPUT_SET = eINSTANCE.getCatchEvent_OutputSet();

		/**
		 * The meta object literal for the '<em><b>Event Definition Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EVENT__EVENT_DEFINITION_REFS = eINSTANCE.getCatchEvent_EventDefinitionRefs();

		/**
		 * The meta object literal for the '<em><b>Data Output Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = eINSTANCE.getCatchEvent_DataOutputAssociation();

		/**
		 * The meta object literal for the '<em><b>Data Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EVENT__DATA_OUTPUTS = eINSTANCE.getCatchEvent_DataOutputs();

		/**
		 * The meta object literal for the '<em><b>Event Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATCH_EVENT__EVENT_DEFINITIONS = eINSTANCE.getCatchEvent_EventDefinitions();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.EventImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PROPERTIES = eINSTANCE.getEvent_Properties();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.EventDefinitionImpl <em>Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.EventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEventDefinition()
		 * @generated
		 */
		EClass EVENT_DEFINITION = eINSTANCE.getEventDefinition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataOutputAssociationImpl <em>Data Output Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataOutputAssociationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataOutputAssociation()
		 * @generated
		 */
		EClass DATA_OUTPUT_ASSOCIATION = eINSTANCE.getDataOutputAssociation();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl <em>Data Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataAssociationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataAssociation()
		 * @generated
		 */
		EClass DATA_ASSOCIATION = eINSTANCE.getDataAssociation();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ASSOCIATION__TRANSFORMATION = eINSTANCE.getDataAssociation_Transformation();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ASSOCIATION__ASSIGNMENT = eINSTANCE.getDataAssociation_Assignment();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ASSOCIATION__TARGET_REF = eINSTANCE.getDataAssociation_TargetRef();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ASSOCIATION__SOURCE_REF = eINSTANCE.getDataAssociation_SourceRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.AssignmentImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__FROM = eINSTANCE.getAssignment_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__TO = eINSTANCE.getAssignment_To();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataInputAssociationImpl <em>Data Input Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataInputAssociationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataInputAssociation()
		 * @generated
		 */
		EClass DATA_INPUT_ASSOCIATION = eINSTANCE.getDataInputAssociation();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.UserTaskImpl <em>User Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.UserTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getUserTask()
		 * @generated
		 */
		EClass USER_TASK = eINSTANCE.getUserTask();

		/**
		 * The meta object literal for the '<em><b>Renderings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TASK__RENDERINGS = eINSTANCE.getUserTask_Renderings();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TASK__IMPLEMENTATION = eINSTANCE.getUserTask_Implementation();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.RenderingImpl <em>Rendering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.RenderingImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getRendering()
		 * @generated
		 */
		EClass RENDERING = eINSTANCE.getRendering();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.HumanPerformerImpl <em>Human Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.HumanPerformerImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getHumanPerformer()
		 * @generated
		 */
		EClass HUMAN_PERFORMER = eINSTANCE.getHumanPerformer();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.PotentialOwnerImpl <em>Potential Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.PotentialOwnerImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getPotentialOwner()
		 * @generated
		 */
		EClass POTENTIAL_OWNER = eINSTANCE.getPotentialOwner();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalUserTaskImpl <em>Global User Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalUserTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalUserTask()
		 * @generated
		 */
		EClass GLOBAL_USER_TASK = eINSTANCE.getGlobalUserTask();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_USER_TASK__IMPLEMENTATION = eINSTANCE.getGlobalUserTask_Implementation();

		/**
		 * The meta object literal for the '<em><b>Renderings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_USER_TASK__RENDERINGS = eINSTANCE.getGlobalUserTask_Renderings();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.GatewayImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Gateway Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__GATEWAY_DIRECTION = eINSTANCE.getGateway_GatewayDirection();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.EventBasedGatewayImpl <em>Event Based Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.EventBasedGatewayImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEventBasedGateway()
		 * @generated
		 */
		EClass EVENT_BASED_GATEWAY = eINSTANCE.getEventBasedGateway();

		/**
		 * The meta object literal for the '<em><b>Instantiate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BASED_GATEWAY__INSTANTIATE = eINSTANCE.getEventBasedGateway_Instantiate();

		/**
		 * The meta object literal for the '<em><b>Event Gateway Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE = eINSTANCE.getEventBasedGateway_EventGatewayType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ComplexGatewayImpl <em>Complex Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ComplexGatewayImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getComplexGateway()
		 * @generated
		 */
		EClass COMPLEX_GATEWAY = eINSTANCE.getComplexGateway();

		/**
		 * The meta object literal for the '<em><b>Activation Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_GATEWAY__ACTIVATION_CONDITION = eINSTANCE.getComplexGateway_ActivationCondition();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_GATEWAY__DEFAULT = eINSTANCE.getComplexGateway_Default();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ExclusiveGatewayImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExclusiveGateway()
		 * @generated
		 */
		EClass EXCLUSIVE_GATEWAY = eINSTANCE.getExclusiveGateway();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCLUSIVE_GATEWAY__DEFAULT = eINSTANCE.getExclusiveGateway_Default();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.InclusiveGatewayImpl <em>Inclusive Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.InclusiveGatewayImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getInclusiveGateway()
		 * @generated
		 */
		EClass INCLUSIVE_GATEWAY = eINSTANCE.getInclusiveGateway();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUSIVE_GATEWAY__DEFAULT = eINSTANCE.getInclusiveGateway_Default();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ParallelGatewayImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getParallelGateway()
		 * @generated
		 */
		EClass PARALLEL_GATEWAY = eINSTANCE.getParallelGateway();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.RelationshipImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__DIRECTION = eINSTANCE.getRelationship_Direction();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCES = eINSTANCE.getRelationship_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGETS = eINSTANCE.getRelationship_Targets();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ExtensionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Must Understand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__MUST_UNDERSTAND = eINSTANCE.getExtension_MustUnderstand();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__DEFINITION = eINSTANCE.getExtension_Definition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__ID = eINSTANCE.getExtension_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.IntermediateCatchEventImpl <em>Intermediate Catch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.IntermediateCatchEventImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getIntermediateCatchEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_CATCH_EVENT = eINSTANCE.getIntermediateCatchEvent();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.IntermediateThrowEventImpl <em>Intermediate Throw Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.IntermediateThrowEventImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getIntermediateThrowEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_THROW_EVENT = eINSTANCE.getIntermediateThrowEvent();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl <em>Throw Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ThrowEventImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getThrowEvent()
		 * @generated
		 */
		EClass THROW_EVENT = eINSTANCE.getThrowEvent();

		/**
		 * The meta object literal for the '<em><b>Input Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_EVENT__INPUT_SET = eINSTANCE.getThrowEvent_InputSet();

		/**
		 * The meta object literal for the '<em><b>Event Definition Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_EVENT__EVENT_DEFINITION_REFS = eINSTANCE.getThrowEvent_EventDefinitionRefs();

		/**
		 * The meta object literal for the '<em><b>Data Input Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_EVENT__DATA_INPUT_ASSOCIATION = eINSTANCE.getThrowEvent_DataInputAssociation();

		/**
		 * The meta object literal for the '<em><b>Data Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_EVENT__DATA_INPUTS = eINSTANCE.getThrowEvent_DataInputs();

		/**
		 * The meta object literal for the '<em><b>Event Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROW_EVENT__EVENT_DEFINITIONS = eINSTANCE.getThrowEvent_EventDefinitions();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.EndEventImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.StartEventImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '<em><b>Is Interrupting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_EVENT__IS_INTERRUPTING = eINSTANCE.getStartEvent_IsInterrupting();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CancelEventDefinitionImpl <em>Cancel Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CancelEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCancelEventDefinition()
		 * @generated
		 */
		EClass CANCEL_EVENT_DEFINITION = eINSTANCE.getCancelEventDefinition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ErrorEventDefinitionImpl <em>Error Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ErrorEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getErrorEventDefinition()
		 * @generated
		 */
		EClass ERROR_EVENT_DEFINITION = eINSTANCE.getErrorEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Error Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_EVENT_DEFINITION__ERROR_REF = eINSTANCE.getErrorEventDefinition_ErrorRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.TerminateEventDefinitionImpl <em>Terminate Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.TerminateEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTerminateEventDefinition()
		 * @generated
		 */
		EClass TERMINATE_EVENT_DEFINITION = eINSTANCE.getTerminateEventDefinition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.EscalationEventDefinitionImpl <em>Escalation Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.EscalationEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEscalationEventDefinition()
		 * @generated
		 */
		EClass ESCALATION_EVENT_DEFINITION = eINSTANCE.getEscalationEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Escalation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCALATION_EVENT_DEFINITION__ESCALATION_REF = eINSTANCE.getEscalationEventDefinition_EscalationRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.EscalationImpl <em>Escalation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.EscalationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEscalation()
		 * @generated
		 */
		EClass ESCALATION = eINSTANCE.getEscalation();

		/**
		 * The meta object literal for the '<em><b>Structure Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESCALATION__STRUCTURE_REF = eINSTANCE.getEscalation_StructureRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESCALATION__NAME = eINSTANCE.getEscalation_Name();

		/**
		 * The meta object literal for the '<em><b>Escalation Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESCALATION__ESCALATION_CODE = eINSTANCE.getEscalation_EscalationCode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESCALATION__ID = eINSTANCE.getEscalation_Id();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CompensateEventDefinitionImpl <em>Compensate Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CompensateEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCompensateEventDefinition()
		 * @generated
		 */
		EClass COMPENSATE_EVENT_DEFINITION = eINSTANCE.getCompensateEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Wait For Completion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION = eINSTANCE
				.getCompensateEventDefinition_WaitForCompletion();

		/**
		 * The meta object literal for the '<em><b>Activity Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPENSATE_EVENT_DEFINITION__ACTIVITY_REF = eINSTANCE.getCompensateEventDefinition_ActivityRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.TimerEventDefinitionImpl <em>Timer Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.TimerEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTimerEventDefinition()
		 * @generated
		 */
		EClass TIMER_EVENT_DEFINITION = eINSTANCE.getTimerEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Time Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_EVENT_DEFINITION__TIME_DATE = eINSTANCE.getTimerEventDefinition_TimeDate();

		/**
		 * The meta object literal for the '<em><b>Time Cycle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_EVENT_DEFINITION__TIME_CYCLE = eINSTANCE.getTimerEventDefinition_TimeCycle();

		/**
		 * The meta object literal for the '<em><b>Time Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_EVENT_DEFINITION__TIME_DURATION = eINSTANCE.getTimerEventDefinition_TimeDuration();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.LinkEventDefinitionImpl <em>Link Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.LinkEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getLinkEventDefinition()
		 * @generated
		 */
		EClass LINK_EVENT_DEFINITION = eINSTANCE.getLinkEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_EVENT_DEFINITION__NAME = eINSTANCE.getLinkEventDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_EVENT_DEFINITION__TARGET = eINSTANCE.getLinkEventDefinition_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_EVENT_DEFINITION__SOURCE = eINSTANCE.getLinkEventDefinition_Source();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.MessageEventDefinitionImpl <em>Message Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.MessageEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMessageEventDefinition()
		 * @generated
		 */
		EClass MESSAGE_EVENT_DEFINITION = eINSTANCE.getMessageEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Message Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_EVENT_DEFINITION__MESSAGE_REF = eINSTANCE.getMessageEventDefinition_MessageRef();

		/**
		 * The meta object literal for the '<em><b>Operation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_EVENT_DEFINITION__OPERATION_REF = eINSTANCE.getMessageEventDefinition_OperationRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConditionalEventDefinitionImpl <em>Conditional Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ConditionalEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConditionalEventDefinition()
		 * @generated
		 */
		EClass CONDITIONAL_EVENT_DEFINITION = eINSTANCE.getConditionalEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_EVENT_DEFINITION__CONDITION = eINSTANCE.getConditionalEventDefinition_Condition();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.SignalEventDefinitionImpl <em>Signal Event Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.SignalEventDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSignalEventDefinition()
		 * @generated
		 */
		EClass SIGNAL_EVENT_DEFINITION = eINSTANCE.getSignalEventDefinition();

		/**
		 * The meta object literal for the '<em><b>Signal Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_EVENT_DEFINITION__SIGNAL_REF = eINSTANCE.getSignalEventDefinition_SignalRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.SignalImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Structure Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL__STRUCTURE_REF = eINSTANCE.getSignal_StructureRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ImplicitThrowEventImpl <em>Implicit Throw Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ImplicitThrowEventImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getImplicitThrowEvent()
		 * @generated
		 */
		EClass IMPLICIT_THROW_EVENT = eINSTANCE.getImplicitThrowEvent();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataObjectImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_OBJECT__IS_COLLECTION = eINSTANCE.getDataObject_IsCollection();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataStoreImpl <em>Data Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataStoreImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataStore()
		 * @generated
		 */
		EClass DATA_STORE = eINSTANCE.getDataStore();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORE__NAME = eINSTANCE.getDataStore_Name();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORE__CAPACITY = eINSTANCE.getDataStore_Capacity();

		/**
		 * The meta object literal for the '<em><b>Is Unlimited</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_STORE__IS_UNLIMITED = eINSTANCE.getDataStore_IsUnlimited();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataStoreReferenceImpl <em>Data Store Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataStoreReferenceImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataStoreReference()
		 * @generated
		 */
		EClass DATA_STORE_REFERENCE = eINSTANCE.getDataStoreReference();

		/**
		 * The meta object literal for the '<em><b>Data Store Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STORE_REFERENCE__DATA_STORE_REF = eINSTANCE.getDataStoreReference_DataStoreRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl <em>Data Object Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DataObjectReferenceImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDataObjectReference()
		 * @generated
		 */
		EClass DATA_OBJECT_REFERENCE = eINSTANCE.getDataObjectReference();

		/**
		 * The meta object literal for the '<em><b>Data Object Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT_REFERENCE__DATA_OBJECT_REF = eINSTANCE.getDataObjectReference_DataObjectRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CallConversationImpl <em>Call Conversation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CallConversationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCallConversation()
		 * @generated
		 */
		EClass CALL_CONVERSATION = eINSTANCE.getCallConversation();

		/**
		 * The meta object literal for the '<em><b>Called Collaboration Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_CONVERSATION__CALLED_COLLABORATION_REF = eINSTANCE.getCallConversation_CalledCollaborationRef();

		/**
		 * The meta object literal for the '<em><b>Participant Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS = eINSTANCE
				.getCallConversation_ParticipantAssociations();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ConversationImpl <em>Conversation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ConversationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getConversation()
		 * @generated
		 */
		EClass CONVERSATION = eINSTANCE.getConversation();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.SubConversationImpl <em>Sub Conversation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.SubConversationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSubConversation()
		 * @generated
		 */
		EClass SUB_CONVERSATION = eINSTANCE.getSubConversation();

		/**
		 * The meta object literal for the '<em><b>Conversation Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CONVERSATION__CONVERSATION_NODES = eINSTANCE.getSubConversation_ConversationNodes();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalConversationImpl <em>Global Conversation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalConversationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalConversation()
		 * @generated
		 */
		EClass GLOBAL_CONVERSATION = eINSTANCE.getGlobalConversation();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.PartnerEntityImpl <em>Partner Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.PartnerEntityImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getPartnerEntity()
		 * @generated
		 */
		EClass PARTNER_ENTITY = eINSTANCE.getPartnerEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_ENTITY__NAME = eINSTANCE.getPartnerEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Participant Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTNER_ENTITY__PARTICIPANT_REF = eINSTANCE.getPartnerEntity_ParticipantRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.PartnerRoleImpl <em>Partner Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.PartnerRoleImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getPartnerRole()
		 * @generated
		 */
		EClass PARTNER_ROLE = eINSTANCE.getPartnerRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER_ROLE__NAME = eINSTANCE.getPartnerRole_Name();

		/**
		 * The meta object literal for the '<em><b>Participant Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTNER_ROLE__PARTICIPANT_REF = eINSTANCE.getPartnerRole_ParticipantRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl <em>Choreography Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ChoreographyActivityImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getChoreographyActivity()
		 * @generated
		 */
		EClass CHOREOGRAPHY_ACTIVITY = eINSTANCE.getChoreographyActivity();

		/**
		 * The meta object literal for the '<em><b>Participant Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_ACTIVITY__PARTICIPANT_REFS = eINSTANCE.getChoreographyActivity_ParticipantRefs();

		/**
		 * The meta object literal for the '<em><b>Initiating Participant Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF = eINSTANCE
				.getChoreographyActivity_InitiatingParticipantRef();

		/**
		 * The meta object literal for the '<em><b>Correlation Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_ACTIVITY__CORRELATION_KEYS = eINSTANCE.getChoreographyActivity_CorrelationKeys();

		/**
		 * The meta object literal for the '<em><b>Loop Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY_ACTIVITY__LOOP_TYPE = eINSTANCE.getChoreographyActivity_LoopType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CallChoreographyImpl <em>Call Choreography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CallChoreographyImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCallChoreography()
		 * @generated
		 */
		EClass CALL_CHOREOGRAPHY = eINSTANCE.getCallChoreography();

		/**
		 * The meta object literal for the '<em><b>Called Choreography Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF = eINSTANCE.getCallChoreography_CalledChoreographyRef();

		/**
		 * The meta object literal for the '<em><b>Participant Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATIONS = eINSTANCE
				.getCallChoreography_ParticipantAssociations();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.SubChoreographyImpl <em>Sub Choreography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.SubChoreographyImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSubChoreography()
		 * @generated
		 */
		EClass SUB_CHOREOGRAPHY = eINSTANCE.getSubChoreography();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_CHOREOGRAPHY__ARTIFACTS = eINSTANCE.getSubChoreography_Artifacts();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ChoreographyTaskImpl <em>Choreography Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ChoreographyTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getChoreographyTask()
		 * @generated
		 */
		EClass CHOREOGRAPHY_TASK = eINSTANCE.getChoreographyTask();

		/**
		 * The meta object literal for the '<em><b>Message Flow Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY_TASK__MESSAGE_FLOW_REF = eINSTANCE.getChoreographyTask_MessageFlowRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalChoreographyTaskImpl <em>Global Choreography Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalChoreographyTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalChoreographyTask()
		 * @generated
		 */
		EClass GLOBAL_CHOREOGRAPHY_TASK = eINSTANCE.getGlobalChoreographyTask();

		/**
		 * The meta object literal for the '<em><b>Initiating Participant Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF = eINSTANCE
				.getGlobalChoreographyTask_InitiatingParticipantRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.TextAnnotationImpl <em>Text Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.TextAnnotationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTextAnnotation()
		 * @generated
		 */
		EClass TEXT_ANNOTATION = eINSTANCE.getTextAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ANNOTATION__TEXT = eINSTANCE.getTextAnnotation_Text();

		/**
		 * The meta object literal for the '<em><b>Text Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ANNOTATION__TEXT_FORMAT = eINSTANCE.getTextAnnotation_TextFormat();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.GroupImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Category Value Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CATEGORY_VALUE_REF = eINSTANCE.getGroup_CategoryValueRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.AssociationImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Association Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__ASSOCIATION_DIRECTION = eINSTANCE.getAssociation_AssociationDirection();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE_REF = eINSTANCE.getAssociation_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET_REF = eINSTANCE.getAssociation_TargetRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CategoryImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Category Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORY_VALUE = eINSTANCE.getCategory_CategoryValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ServiceTaskImpl <em>Service Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ServiceTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getServiceTask()
		 * @generated
		 */
		EClass SERVICE_TASK = eINSTANCE.getServiceTask();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TASK__IMPLEMENTATION = eINSTANCE.getServiceTask_Implementation();

		/**
		 * The meta object literal for the '<em><b>Operation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_TASK__OPERATION_REF = eINSTANCE.getServiceTask_OperationRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl <em>Sub Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.SubProcessImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSubProcess()
		 * @generated
		 */
		EClass SUB_PROCESS = eINSTANCE.getSubProcess();

		/**
		 * The meta object literal for the '<em><b>Triggered By Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_PROCESS__TRIGGERED_BY_EVENT = eINSTANCE.getSubProcess_TriggeredByEvent();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_PROCESS__ARTIFACTS = eINSTANCE.getSubProcess_Artifacts();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl <em>Multi Instance Loop Characteristics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.MultiInstanceLoopCharacteristicsImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMultiInstanceLoopCharacteristics()
		 * @generated
		 */
		EClass MULTI_INSTANCE_LOOP_CHARACTERISTICS = eINSTANCE.getMultiInstanceLoopCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Is Sequential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL = eINSTANCE
				.getMultiInstanceLoopCharacteristics_IsSequential();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR = eINSTANCE
				.getMultiInstanceLoopCharacteristics_Behavior();

		/**
		 * The meta object literal for the '<em><b>Loop Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY = eINSTANCE
				.getMultiInstanceLoopCharacteristics_LoopCardinality();

		/**
		 * The meta object literal for the '<em><b>Loop Data Input Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF = eINSTANCE
				.getMultiInstanceLoopCharacteristics_LoopDataInputRef();

		/**
		 * The meta object literal for the '<em><b>Loop Data Output Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF = eINSTANCE
				.getMultiInstanceLoopCharacteristics_LoopDataOutputRef();

		/**
		 * The meta object literal for the '<em><b>Input Data Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM = eINSTANCE
				.getMultiInstanceLoopCharacteristics_InputDataItem();

		/**
		 * The meta object literal for the '<em><b>Output Data Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM = eINSTANCE
				.getMultiInstanceLoopCharacteristics_OutputDataItem();

		/**
		 * The meta object literal for the '<em><b>Completion Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION = eINSTANCE
				.getMultiInstanceLoopCharacteristics_CompletionCondition();

		/**
		 * The meta object literal for the '<em><b>Complex Behavior Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION = eINSTANCE
				.getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition();

		/**
		 * The meta object literal for the '<em><b>One Behavior Event Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF = eINSTANCE
				.getMultiInstanceLoopCharacteristics_OneBehaviorEventRef();

		/**
		 * The meta object literal for the '<em><b>None Behavior Event Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF = eINSTANCE
				.getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ComplexBehaviorDefinitionImpl <em>Complex Behavior Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ComplexBehaviorDefinitionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getComplexBehaviorDefinition()
		 * @generated
		 */
		EClass COMPLEX_BEHAVIOR_DEFINITION = eINSTANCE.getComplexBehaviorDefinition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_BEHAVIOR_DEFINITION__CONDITION = eINSTANCE.getComplexBehaviorDefinition_Condition();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_BEHAVIOR_DEFINITION__EVENT = eINSTANCE.getComplexBehaviorDefinition_Event();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.StandardLoopCharacteristicsImpl <em>Standard Loop Characteristics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.StandardLoopCharacteristicsImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getStandardLoopCharacteristics()
		 * @generated
		 */
		EClass STANDARD_LOOP_CHARACTERISTICS = eINSTANCE.getStandardLoopCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Test Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE = eINSTANCE.getStandardLoopCharacteristics_TestBefore();

		/**
		 * The meta object literal for the '<em><b>Loop Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION = eINSTANCE
				.getStandardLoopCharacteristics_LoopCondition();

		/**
		 * The meta object literal for the '<em><b>Loop Maximum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM = eINSTANCE.getStandardLoopCharacteristics_LoopMaximum();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.CallActivityImpl <em>Call Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.CallActivityImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getCallActivity()
		 * @generated
		 */
		EClass CALL_ACTIVITY = eINSTANCE.getCallActivity();

		/**
		 * The meta object literal for the '<em><b>Called Element Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTIVITY__CALLED_ELEMENT_REF = eINSTANCE.getCallActivity_CalledElementRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.SendTaskImpl <em>Send Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.SendTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getSendTask()
		 * @generated
		 */
		EClass SEND_TASK = eINSTANCE.getSendTask();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_TASK__IMPLEMENTATION = eINSTANCE.getSendTask_Implementation();

		/**
		 * The meta object literal for the '<em><b>Operation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_TASK__OPERATION_REF = eINSTANCE.getSendTask_OperationRef();

		/**
		 * The meta object literal for the '<em><b>Message Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_TASK__MESSAGE_REF = eINSTANCE.getSendTask_MessageRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ReceiveTaskImpl <em>Receive Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ReceiveTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getReceiveTask()
		 * @generated
		 */
		EClass RECEIVE_TASK = eINSTANCE.getReceiveTask();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_TASK__IMPLEMENTATION = eINSTANCE.getReceiveTask_Implementation();

		/**
		 * The meta object literal for the '<em><b>Instantiate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_TASK__INSTANTIATE = eINSTANCE.getReceiveTask_Instantiate();

		/**
		 * The meta object literal for the '<em><b>Operation Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_TASK__OPERATION_REF = eINSTANCE.getReceiveTask_OperationRef();

		/**
		 * The meta object literal for the '<em><b>Message Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_TASK__MESSAGE_REF = eINSTANCE.getReceiveTask_MessageRef();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.ScriptTaskImpl <em>Script Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.ScriptTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getScriptTask()
		 * @generated
		 */
		EClass SCRIPT_TASK = eINSTANCE.getScriptTask();

		/**
		 * The meta object literal for the '<em><b>Script Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TASK__SCRIPT_FORMAT = eINSTANCE.getScriptTask_ScriptFormat();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT_TASK__SCRIPT = eINSTANCE.getScriptTask_Script();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.BusinessRuleTaskImpl <em>Business Rule Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.BusinessRuleTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getBusinessRuleTask()
		 * @generated
		 */
		EClass BUSINESS_RULE_TASK = eINSTANCE.getBusinessRuleTask();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_RULE_TASK__IMPLEMENTATION = eINSTANCE.getBusinessRuleTask_Implementation();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl <em>Ad Hoc Sub Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.AdHocSubProcessImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAdHocSubProcess()
		 * @generated
		 */
		EClass AD_HOC_SUB_PROCESS = eINSTANCE.getAdHocSubProcess();

		/**
		 * The meta object literal for the '<em><b>Completion Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AD_HOC_SUB_PROCESS__COMPLETION_CONDITION = eINSTANCE.getAdHocSubProcess_CompletionCondition();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AD_HOC_SUB_PROCESS__ORDERING = eINSTANCE.getAdHocSubProcess_Ordering();

		/**
		 * The meta object literal for the '<em><b>Cancel Remaining Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES = eINSTANCE
				.getAdHocSubProcess_CancelRemainingInstances();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.TransactionImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__PROTOCOL = eINSTANCE.getTransaction_Protocol();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION__METHOD = eINSTANCE.getTransaction_Method();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalScriptTaskImpl <em>Global Script Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalScriptTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalScriptTask()
		 * @generated
		 */
		EClass GLOBAL_SCRIPT_TASK = eINSTANCE.getGlobalScriptTask();

		/**
		 * The meta object literal for the '<em><b>Script Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE = eINSTANCE.getGlobalScriptTask_ScriptLanguage();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_SCRIPT_TASK__SCRIPT = eINSTANCE.getGlobalScriptTask_Script();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.GlobalBusinessRuleTaskImpl <em>Global Business Rule Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.GlobalBusinessRuleTaskImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGlobalBusinessRuleTask()
		 * @generated
		 */
		EClass GLOBAL_BUSINESS_RULE_TASK = eINSTANCE.getGlobalBusinessRuleTask();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_BUSINESS_RULE_TASK__IMPLEMENTATION = eINSTANCE.getGlobalBusinessRuleTask_Implementation();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl <em>Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.impl.DefinitionsImpl
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getDefinitions()
		 * @generated
		 */
		EClass DEFINITIONS = eINSTANCE.getDefinitions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITIONS__NAME = eINSTANCE.getDefinitions_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITIONS__TARGET_NAMESPACE = eINSTANCE.getDefinitions_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITIONS__EXPRESSION_LANGUAGE = eINSTANCE.getDefinitions_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Type Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITIONS__TYPE_LANGUAGE = eINSTANCE.getDefinitions_TypeLanguage();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS__IMPORTS = eINSTANCE.getDefinitions_Imports();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS__EXTENSIONS = eINSTANCE.getDefinitions_Extensions();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS__RELATIONSHIPS = eINSTANCE.getDefinitions_Relationships();

		/**
		 * The meta object literal for the '<em><b>Root Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS__ROOT_ELEMENTS = eINSTANCE.getDefinitions_RootElements();

		/**
		 * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITIONS__DIAGRAMS = eINSTANCE.getDefinitions_Diagrams();

		/**
		 * The meta object literal for the '<em><b>Exporter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITIONS__EXPORTER = eINSTANCE.getDefinitions_Exporter();

		/**
		 * The meta object literal for the '<em><b>Exporter Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITIONS__EXPORTER_VERSION = eINSTANCE.getDefinitions_ExporterVersion();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.ItemKind <em>Item Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.ItemKind
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getItemKind()
		 * @generated
		 */
		EEnum ITEM_KIND = eINSTANCE.getItemKind();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.ProcessType <em>Process Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.ProcessType
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getProcessType()
		 * @generated
		 */
		EEnum PROCESS_TYPE = eINSTANCE.getProcessType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.GatewayDirection <em>Gateway Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.GatewayDirection
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getGatewayDirection()
		 * @generated
		 */
		EEnum GATEWAY_DIRECTION = eINSTANCE.getGatewayDirection();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.EventBasedGatewayType <em>Event Based Gateway Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.EventBasedGatewayType
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getEventBasedGatewayType()
		 * @generated
		 */
		EEnum EVENT_BASED_GATEWAY_TYPE = eINSTANCE.getEventBasedGatewayType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.RelationshipDirection <em>Relationship Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.RelationshipDirection
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getRelationshipDirection()
		 * @generated
		 */
		EEnum RELATIONSHIP_DIRECTION = eINSTANCE.getRelationshipDirection();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.ChoreographyLoopType <em>Choreography Loop Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.ChoreographyLoopType
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getChoreographyLoopType()
		 * @generated
		 */
		EEnum CHOREOGRAPHY_LOOP_TYPE = eINSTANCE.getChoreographyLoopType();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.AssociationDirection <em>Association Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.AssociationDirection
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAssociationDirection()
		 * @generated
		 */
		EEnum ASSOCIATION_DIRECTION = eINSTANCE.getAssociationDirection();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.MultiInstanceBehavior <em>Multi Instance Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.MultiInstanceBehavior
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getMultiInstanceBehavior()
		 * @generated
		 */
		EEnum MULTI_INSTANCE_BEHAVIOR = eINSTANCE.getMultiInstanceBehavior();

		/**
		 * The meta object literal for the '{@link org.obeonetwork.dsl.bpmn2.AdHocOrdering <em>Ad Hoc Ordering</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.obeonetwork.dsl.bpmn2.AdHocOrdering
		 * @see org.obeonetwork.dsl.bpmn2.impl.Bpmn2PackageImpl#getAdHocOrdering()
		 * @generated
		 */
		EEnum AD_HOC_ORDERING = eINSTANCE.getAdHocOrdering();

	}

} //Bpmn2Package
