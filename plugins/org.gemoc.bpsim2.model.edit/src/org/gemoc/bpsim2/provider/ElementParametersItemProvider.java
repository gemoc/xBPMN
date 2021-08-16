/**
 */
package org.gemoc.bpsim2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.bpsim2.Bpsim2Factory;
import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.ElementParameters;

/**
 * This is the item provider adapter for a {@link org.gemoc.bpsim2.ElementParameters} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementParametersItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementParametersItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addElementRefPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Element Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementParameters_elementRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementParameters_elementRef_feature", "_UI_ElementParameters_type"),
				 Bpsim2Package.Literals.ELEMENT_PARAMETERS__ELEMENT_REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementParameters_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementParameters_id_feature", "_UI_ElementParameters_type"),
				 Bpsim2Package.Literals.ELEMENT_PARAMETERS__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Bpsim2Package.Literals.ELEMENT_PARAMETERS__TIME_PARAMETERS);
			childrenFeatures.add(Bpsim2Package.Literals.ELEMENT_PARAMETERS__CONTROL_PARAMETERS);
			childrenFeatures.add(Bpsim2Package.Literals.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS);
			childrenFeatures.add(Bpsim2Package.Literals.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS);
			childrenFeatures.add(Bpsim2Package.Literals.ELEMENT_PARAMETERS__COST_PARAMETERS);
			childrenFeatures.add(Bpsim2Package.Literals.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS);
			childrenFeatures.add(Bpsim2Package.Literals.ELEMENT_PARAMETERS__VENDOR_EXTENSION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ElementParameters.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ElementParameters"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ElementParameters)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_ElementParameters_type") :
			getString("_UI_ElementParameters_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ElementParameters.class)) {
			case Bpsim2Package.ELEMENT_PARAMETERS__ELEMENT_REF:
			case Bpsim2Package.ELEMENT_PARAMETERS__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Bpsim2Package.ELEMENT_PARAMETERS__TIME_PARAMETERS:
			case Bpsim2Package.ELEMENT_PARAMETERS__CONTROL_PARAMETERS:
			case Bpsim2Package.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS:
			case Bpsim2Package.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS:
			case Bpsim2Package.ELEMENT_PARAMETERS__COST_PARAMETERS:
			case Bpsim2Package.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS:
			case Bpsim2Package.ELEMENT_PARAMETERS__VENDOR_EXTENSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.ELEMENT_PARAMETERS__TIME_PARAMETERS,
				 Bpsim2Factory.eINSTANCE.createTimeParameters()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.ELEMENT_PARAMETERS__CONTROL_PARAMETERS,
				 Bpsim2Factory.eINSTANCE.createControlParameters()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.ELEMENT_PARAMETERS__RESOURCE_PARAMETERS,
				 Bpsim2Factory.eINSTANCE.createResourceParameters()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.ELEMENT_PARAMETERS__PRIORITY_PARAMETERS,
				 Bpsim2Factory.eINSTANCE.createPriorityParameters()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.ELEMENT_PARAMETERS__COST_PARAMETERS,
				 Bpsim2Factory.eINSTANCE.createCostParameters()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.ELEMENT_PARAMETERS__PROPERTY_PARAMETERS,
				 Bpsim2Factory.eINSTANCE.createPropertyParameters()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.ELEMENT_PARAMETERS__VENDOR_EXTENSION,
				 Bpsim2Factory.eINSTANCE.createVendorExtension()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Bpsim2EditPlugin.INSTANCE;
	}

}
