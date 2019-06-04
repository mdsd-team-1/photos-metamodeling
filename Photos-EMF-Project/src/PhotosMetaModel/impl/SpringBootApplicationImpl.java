/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Component;
import PhotosMetaModel.Configuration;
import PhotosMetaModel.Entity;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Repository;
import PhotosMetaModel.RestController;
import PhotosMetaModel.SpringBootApplication;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spring Boot Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.SpringBootApplicationImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SpringBootApplicationImpl#getRestcontroller <em>Restcontroller</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SpringBootApplicationImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SpringBootApplicationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SpringBootApplicationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SpringBootApplicationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpringBootApplicationImpl extends MinimalEObjectImpl.Container implements SpringBootApplication {
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repository;

	/**
	 * The cached value of the '{@link #getRestcontroller() <em>Restcontroller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestcontroller()
	 * @generated
	 * @ordered
	 */
	protected EList<RestController> restcontroller;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configuration;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpringBootApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.SPRING_BOOT_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Repository> getRepository() {
		if (repository == null) {
			repository = new EObjectContainmentEList<Repository>(Repository.class, this, PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__REPOSITORY);
		}
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RestController> getRestcontroller() {
		if (restcontroller == null) {
			restcontroller = new EObjectContainmentEList<RestController>(RestController.class, this, PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__RESTCONTROLLER);
		}
		return restcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Configuration> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectContainmentEList<Configuration>(Configuration.class, this, PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__REPOSITORY:
				return ((InternalEList<?>)getRepository()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__RESTCONTROLLER:
				return ((InternalEList<?>)getRestcontroller()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__REPOSITORY:
				return getRepository();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__RESTCONTROLLER:
				return getRestcontroller();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__ENTITY:
				return getEntity();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__COMPONENT:
				return getComponent();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__CONFIGURATION:
				return getConfiguration();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__REPOSITORY:
				getRepository().clear();
				getRepository().addAll((Collection<? extends Repository>)newValue);
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__RESTCONTROLLER:
				getRestcontroller().clear();
				getRestcontroller().addAll((Collection<? extends RestController>)newValue);
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends Configuration>)newValue);
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__REPOSITORY:
				getRepository().clear();
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__RESTCONTROLLER:
				getRestcontroller().clear();
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__ENTITY:
				getEntity().clear();
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__COMPONENT:
				getComponent().clear();
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__CONFIGURATION:
				getConfiguration().clear();
				return;
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__REPOSITORY:
				return repository != null && !repository.isEmpty();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__RESTCONTROLLER:
				return restcontroller != null && !restcontroller.isEmpty();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__ENTITY:
				return entity != null && !entity.isEmpty();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__COMPONENT:
				return component != null && !component.isEmpty();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpringBootApplicationImpl
