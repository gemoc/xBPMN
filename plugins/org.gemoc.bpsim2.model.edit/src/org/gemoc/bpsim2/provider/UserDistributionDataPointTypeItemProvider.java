/**
 */
package org.gemoc.bpsim2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
import org.gemoc.bpsim2.UserDistributionDataPointType;

/**
 * This is the item provider adapter for a {@link org.gemoc.bpsim2.UserDistributionDataPointType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserDistributionDataPointTypeItemProvider 
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
	public UserDistributionDataPointTypeItemProvider(AdapterFactory adapterFactory) {
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

			addProbabilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Probability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProbabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserDistributionDataPointType_probability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserDistributionDataPointType_probability_feature", "_UI_UserDistributionDataPointType_type"),
				 Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PROBABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
			childrenFeatures.add(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP);
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
	 * This returns UserDistributionDataPointType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserDistributionDataPointType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		UserDistributionDataPointType userDistributionDataPointType = (UserDistributionDataPointType)object;
		return getString("_UI_UserDistributionDataPointType_type") + " " + userDistributionDataPointType.getProbability();
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

		switch (notification.getFeatureID(UserDistributionDataPointType.class)) {
			case Bpsim2Package.USER_DISTRIBUTION_DATA_POINT_TYPE__PROBABILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Bpsim2Package.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP:
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
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE,
					 Bpsim2Factory.eINSTANCE.createParameterValue())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE,
					 Bpsim2Factory.eINSTANCE.createDistributionParameter())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE,
					 Bpsim2Factory.eINSTANCE.createConstantParameter())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__BETA_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createBetaDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createBinomialDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__BOOLEAN_PARAMETER,
					 Bpsim2Factory.eINSTANCE.createBooleanParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__DATE_TIME_PARAMETER,
					 Bpsim2Factory.eINSTANCE.createDateTimeParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__DURATION_PARAMETER,
					 Bpsim2Factory.eINSTANCE.createDurationParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__ENUM_PARAMETER,
					 Bpsim2Factory.eINSTANCE.createEnumParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__ERLANG_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createErlangDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__EXPRESSION_PARAMETER,
					 Bpsim2Factory.eINSTANCE.createExpressionParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__FLOATING_PARAMETER,
					 Bpsim2Factory.eINSTANCE.createFloatingParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__GAMMA_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createGammaDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createLogNormalDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createNegativeExponentialDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__NORMAL_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createNormalDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__NUMERIC_PARAMETER,
					 Bpsim2Factory.eINSTANCE.createNumericParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__POISSON_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createPoissonDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__STRING_PARAMETER,
					 Bpsim2Factory.eINSTANCE.createStringParameterType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createTriangularDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createTruncatedNormalDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createUniformDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createUserDistributionType())));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.USER_DISTRIBUTION_DATA_POINT_TYPE__PARAMETER_VALUE_GROUP,
				 FeatureMapUtil.createEntry
					(Bpsim2Package.Literals.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION,
					 Bpsim2Factory.eINSTANCE.createWeibullDistributionType())));
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
