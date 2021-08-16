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
import org.gemoc.bpsim2.ScenarioParameters;

/**
 * This is the item provider adapter for a {@link org.gemoc.bpsim2.ScenarioParameters} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioParametersItemProvider 
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
	public ScenarioParametersItemProvider(AdapterFactory adapterFactory) {
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

			addBaseCurrencyUnitPropertyDescriptor(object);
			addBaseResultFrequencyPropertyDescriptor(object);
			addBaseResultFrequencyCumulPropertyDescriptor(object);
			addBaseTimeUnitPropertyDescriptor(object);
			addReplicationPropertyDescriptor(object);
			addSeedPropertyDescriptor(object);
			addTraceFormatPropertyDescriptor(object);
			addTraceOutputPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Currency Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseCurrencyUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioParameters_baseCurrencyUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioParameters_baseCurrencyUnit_feature", "_UI_ScenarioParameters_type"),
				 Bpsim2Package.Literals.SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Result Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseResultFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioParameters_baseResultFrequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioParameters_baseResultFrequency_feature", "_UI_ScenarioParameters_type"),
				 Bpsim2Package.Literals.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Result Frequency Cumul feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseResultFrequencyCumulPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioParameters_baseResultFrequencyCumul_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioParameters_baseResultFrequencyCumul_feature", "_UI_ScenarioParameters_type"),
				 Bpsim2Package.Literals.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Time Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseTimeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioParameters_baseTimeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioParameters_baseTimeUnit_feature", "_UI_ScenarioParameters_type"),
				 Bpsim2Package.Literals.SCENARIO_PARAMETERS__BASE_TIME_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Replication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReplicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioParameters_replication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioParameters_replication_feature", "_UI_ScenarioParameters_type"),
				 Bpsim2Package.Literals.SCENARIO_PARAMETERS__REPLICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioParameters_seed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioParameters_seed_feature", "_UI_ScenarioParameters_type"),
				 Bpsim2Package.Literals.SCENARIO_PARAMETERS__SEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trace Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraceFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioParameters_traceFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioParameters_traceFormat_feature", "_UI_ScenarioParameters_type"),
				 Bpsim2Package.Literals.SCENARIO_PARAMETERS__TRACE_FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trace Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraceOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioParameters_traceOutput_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioParameters_traceOutput_feature", "_UI_ScenarioParameters_type"),
				 Bpsim2Package.Literals.SCENARIO_PARAMETERS__TRACE_OUTPUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(Bpsim2Package.Literals.SCENARIO_PARAMETERS__START);
			childrenFeatures.add(Bpsim2Package.Literals.SCENARIO_PARAMETERS__DURATION);
			childrenFeatures.add(Bpsim2Package.Literals.SCENARIO_PARAMETERS__WARMUP);
			childrenFeatures.add(Bpsim2Package.Literals.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS);
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
	 * This returns ScenarioParameters.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScenarioParameters"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScenarioParameters)object).getBaseCurrencyUnit();
		return label == null || label.length() == 0 ?
			getString("_UI_ScenarioParameters_type") :
			getString("_UI_ScenarioParameters_type") + " " + label;
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

		switch (notification.getFeatureID(ScenarioParameters.class)) {
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_CURRENCY_UNIT:
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY:
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_RESULT_FREQUENCY_CUMUL:
			case Bpsim2Package.SCENARIO_PARAMETERS__BASE_TIME_UNIT:
			case Bpsim2Package.SCENARIO_PARAMETERS__REPLICATION:
			case Bpsim2Package.SCENARIO_PARAMETERS__SEED:
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_FORMAT:
			case Bpsim2Package.SCENARIO_PARAMETERS__TRACE_OUTPUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Bpsim2Package.SCENARIO_PARAMETERS__START:
			case Bpsim2Package.SCENARIO_PARAMETERS__DURATION:
			case Bpsim2Package.SCENARIO_PARAMETERS__WARMUP:
			case Bpsim2Package.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS:
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
				(Bpsim2Package.Literals.SCENARIO_PARAMETERS__START,
				 Bpsim2Factory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.SCENARIO_PARAMETERS__DURATION,
				 Bpsim2Factory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.SCENARIO_PARAMETERS__WARMUP,
				 Bpsim2Factory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.SCENARIO_PARAMETERS__PROPERTY_PARAMETERS,
				 Bpsim2Factory.eINSTANCE.createPropertyParameters()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Bpsim2Package.Literals.SCENARIO_PARAMETERS__START ||
			childFeature == Bpsim2Package.Literals.SCENARIO_PARAMETERS__DURATION ||
			childFeature == Bpsim2Package.Literals.SCENARIO_PARAMETERS__WARMUP;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
