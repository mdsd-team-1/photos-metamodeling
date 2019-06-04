/**
 */
package PhotosMetaModel.provider;


import PhotosMetaModel.Modules;
import PhotosMetaModel.PhotosMetaModelFactory;
import PhotosMetaModel.PhotosMetaModelPackage;

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

/**
 * This is the item provider adapter for a {@link PhotosMetaModel.Modules} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModulesItemProvider 
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
	public ModulesItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Modules_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Modules_name_feature", "_UI_Modules_type"),
				 PhotosMetaModelPackage.Literals.MODULES__NAME,
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
			childrenFeatures.add(PhotosMetaModelPackage.Literals.MODULES__REACTCONFIGURATION);
			childrenFeatures.add(PhotosMetaModelPackage.Literals.MODULES__COMPONENTS);
			childrenFeatures.add(PhotosMetaModelPackage.Literals.MODULES__ACTIONS);
			childrenFeatures.add(PhotosMetaModelPackage.Literals.MODULES__LIBRARIES);
			childrenFeatures.add(PhotosMetaModelPackage.Literals.MODULES__INFORMATION);
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
	 * This returns Modules.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Modules"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Modules)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Modules_type") :
			getString("_UI_Modules_type") + " " + label;
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

		switch (notification.getFeatureID(Modules.class)) {
			case PhotosMetaModelPackage.MODULES__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PhotosMetaModelPackage.MODULES__REACTCONFIGURATION:
			case PhotosMetaModelPackage.MODULES__COMPONENTS:
			case PhotosMetaModelPackage.MODULES__ACTIONS:
			case PhotosMetaModelPackage.MODULES__LIBRARIES:
			case PhotosMetaModelPackage.MODULES__INFORMATION:
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
				(PhotosMetaModelPackage.Literals.MODULES__REACTCONFIGURATION,
				 PhotosMetaModelFactory.eINSTANCE.createReactConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__REACTCONFIGURATION,
				 PhotosMetaModelFactory.eINSTANCE.createReactDOM()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__REACTCONFIGURATION,
				 PhotosMetaModelFactory.eINSTANCE.createDependencies()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__COMPONENTS,
				 PhotosMetaModelFactory.eINSTANCE.createComponents()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__COMPONENTS,
				 PhotosMetaModelFactory.eINSTANCE.createLogic()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__COMPONENTS,
				 PhotosMetaModelFactory.eINSTANCE.createUI()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__COMPONENTS,
				 PhotosMetaModelFactory.eINSTANCE.createRouter()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__COMPONENTS,
				 PhotosMetaModelFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__COMPONENTS,
				 PhotosMetaModelFactory.eINSTANCE.createViewComponents()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__COMPONENTS,
				 PhotosMetaModelFactory.eINSTANCE.createSubcomponents()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__ACTIONS,
				 PhotosMetaModelFactory.eINSTANCE.createActions()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__ACTIONS,
				 PhotosMetaModelFactory.eINSTANCE.createRequest()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__ACTIONS,
				 PhotosMetaModelFactory.eINSTANCE.createServices()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__LIBRARIES,
				 PhotosMetaModelFactory.eINSTANCE.createLibraries()));

		newChildDescriptors.add
			(createChildParameter
				(PhotosMetaModelPackage.Literals.MODULES__INFORMATION,
				 PhotosMetaModelFactory.eINSTANCE.createInformation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NewModelEditPlugin.INSTANCE;
	}

}
