/**
 */
package org.gemoc.bpsim2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.bpsim2.Bpsim2Factory;
import org.gemoc.bpsim2.Bpsim2Package;
import org.gemoc.bpsim2.DocumentRoot;

/**
 * This is the item provider adapter for a {@link org.gemoc.bpsim2.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__BETA_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__PARAMETER_VALUE);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__BOOLEAN_PARAMETER);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__BP_SIM_DATA);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__DATE_TIME_PARAMETER);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__DURATION_PARAMETER);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__ENUM_PARAMETER);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__ERLANG_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__EXPRESSION_PARAMETER);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__FLOATING_PARAMETER);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__GAMMA_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__NORMAL_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__NUMERIC_PARAMETER);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__POISSON_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__STRING_PARAMETER);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT);
			childrenFeatures.add(Bpsim2Package.Literals.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case Bpsim2Package.DOCUMENT_ROOT__BETA_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__PARAMETER_VALUE:
			case Bpsim2Package.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__BOOLEAN_PARAMETER:
			case Bpsim2Package.DOCUMENT_ROOT__BP_SIM_DATA:
			case Bpsim2Package.DOCUMENT_ROOT__DATE_TIME_PARAMETER:
			case Bpsim2Package.DOCUMENT_ROOT__DURATION_PARAMETER:
			case Bpsim2Package.DOCUMENT_ROOT__ENUM_PARAMETER:
			case Bpsim2Package.DOCUMENT_ROOT__ERLANG_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__EXPRESSION_PARAMETER:
			case Bpsim2Package.DOCUMENT_ROOT__FLOATING_PARAMETER:
			case Bpsim2Package.DOCUMENT_ROOT__GAMMA_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__NORMAL_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__NUMERIC_PARAMETER:
			case Bpsim2Package.DOCUMENT_ROOT__POISSON_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__STRING_PARAMETER:
			case Bpsim2Package.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION:
			case Bpsim2Package.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT:
			case Bpsim2Package.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION:
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
				(Bpsim2Package.Literals.DOCUMENT_ROOT__BETA_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createBetaDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__PARAMETER_VALUE,
				 Bpsim2Factory.eINSTANCE.createParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__PARAMETER_VALUE,
				 Bpsim2Factory.eINSTANCE.createDistributionParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__PARAMETER_VALUE,
				 Bpsim2Factory.eINSTANCE.createConstantParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__BINOMIAL_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createBinomialDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__BOOLEAN_PARAMETER,
				 Bpsim2Factory.eINSTANCE.createBooleanParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__BP_SIM_DATA,
				 Bpsim2Factory.eINSTANCE.createBPSimDataType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__DATE_TIME_PARAMETER,
				 Bpsim2Factory.eINSTANCE.createDateTimeParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__DURATION_PARAMETER,
				 Bpsim2Factory.eINSTANCE.createDurationParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__ENUM_PARAMETER,
				 Bpsim2Factory.eINSTANCE.createEnumParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__ERLANG_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createErlangDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__EXPRESSION_PARAMETER,
				 Bpsim2Factory.eINSTANCE.createExpressionParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__FLOATING_PARAMETER,
				 Bpsim2Factory.eINSTANCE.createFloatingParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__GAMMA_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createGammaDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__LOG_NORMAL_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createLogNormalDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__NEGATIVE_EXPONENTIAL_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createNegativeExponentialDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__NORMAL_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createNormalDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__NUMERIC_PARAMETER,
				 Bpsim2Factory.eINSTANCE.createNumericParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__POISSON_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createPoissonDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__STRING_PARAMETER,
				 Bpsim2Factory.eINSTANCE.createStringParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__TRIANGULAR_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createTriangularDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__TRUNCATED_NORMAL_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createTruncatedNormalDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__UNIFORM_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createUniformDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createUserDistributionType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__USER_DISTRIBUTION_DATA_POINT,
				 Bpsim2Factory.eINSTANCE.createUserDistributionDataPointType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpsim2Package.Literals.DOCUMENT_ROOT__WEIBULL_DISTRIBUTION,
				 Bpsim2Factory.eINSTANCE.createWeibullDistributionType()));
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
