/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Actions;
import PhotosMetaModel.Components;
import PhotosMetaModel.Information;
import PhotosMetaModel.Libraries;
import PhotosMetaModel.Modules;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.ReactConfiguration;

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
 * An implementation of the model object '<em><b>Modules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.ModulesImpl#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ModulesImpl#getReactconfiguration <em>Reactconfiguration</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ModulesImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ModulesImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ModulesImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ModulesImpl#getInformation <em>Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModulesImpl extends MinimalEObjectImpl.Container implements Modules {
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
	 * The cached value of the '{@link #getReactconfiguration() <em>Reactconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<ReactConfiguration> reactconfiguration;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Components> components;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Actions> actions;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Libraries> libraries;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> information;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.MODULES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.MODULES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReactConfiguration> getReactconfiguration() {
		if (reactconfiguration == null) {
			reactconfiguration = new EObjectContainmentEList<ReactConfiguration>(ReactConfiguration.class, this, PhotosMetaModelPackage.MODULES__REACTCONFIGURATION);
		}
		return reactconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Components> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Components>(Components.class, this, PhotosMetaModelPackage.MODULES__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actions> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Actions>(Actions.class, this, PhotosMetaModelPackage.MODULES__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Libraries> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentEList<Libraries>(Libraries.class, this, PhotosMetaModelPackage.MODULES__LIBRARIES);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Information> getInformation() {
		if (information == null) {
			information = new EObjectContainmentEList<Information>(Information.class, this, PhotosMetaModelPackage.MODULES__INFORMATION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.MODULES__REACTCONFIGURATION:
				return ((InternalEList<?>)getReactconfiguration()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.MODULES__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.MODULES__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.MODULES__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.MODULES__INFORMATION:
				return ((InternalEList<?>)getInformation()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.MODULES__NAME:
				return getName();
			case PhotosMetaModelPackage.MODULES__REACTCONFIGURATION:
				return getReactconfiguration();
			case PhotosMetaModelPackage.MODULES__COMPONENTS:
				return getComponents();
			case PhotosMetaModelPackage.MODULES__ACTIONS:
				return getActions();
			case PhotosMetaModelPackage.MODULES__LIBRARIES:
				return getLibraries();
			case PhotosMetaModelPackage.MODULES__INFORMATION:
				return getInformation();
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
			case PhotosMetaModelPackage.MODULES__NAME:
				setName((String)newValue);
				return;
			case PhotosMetaModelPackage.MODULES__REACTCONFIGURATION:
				getReactconfiguration().clear();
				getReactconfiguration().addAll((Collection<? extends ReactConfiguration>)newValue);
				return;
			case PhotosMetaModelPackage.MODULES__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Components>)newValue);
				return;
			case PhotosMetaModelPackage.MODULES__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Actions>)newValue);
				return;
			case PhotosMetaModelPackage.MODULES__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Libraries>)newValue);
				return;
			case PhotosMetaModelPackage.MODULES__INFORMATION:
				getInformation().clear();
				getInformation().addAll((Collection<? extends Information>)newValue);
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
			case PhotosMetaModelPackage.MODULES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.MODULES__REACTCONFIGURATION:
				getReactconfiguration().clear();
				return;
			case PhotosMetaModelPackage.MODULES__COMPONENTS:
				getComponents().clear();
				return;
			case PhotosMetaModelPackage.MODULES__ACTIONS:
				getActions().clear();
				return;
			case PhotosMetaModelPackage.MODULES__LIBRARIES:
				getLibraries().clear();
				return;
			case PhotosMetaModelPackage.MODULES__INFORMATION:
				getInformation().clear();
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
			case PhotosMetaModelPackage.MODULES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PhotosMetaModelPackage.MODULES__REACTCONFIGURATION:
				return reactconfiguration != null && !reactconfiguration.isEmpty();
			case PhotosMetaModelPackage.MODULES__COMPONENTS:
				return components != null && !components.isEmpty();
			case PhotosMetaModelPackage.MODULES__ACTIONS:
				return actions != null && !actions.isEmpty();
			case PhotosMetaModelPackage.MODULES__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case PhotosMetaModelPackage.MODULES__INFORMATION:
				return information != null && !information.isEmpty();
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

} //ModulesImpl
