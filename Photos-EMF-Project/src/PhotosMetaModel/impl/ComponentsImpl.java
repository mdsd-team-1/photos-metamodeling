/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Components;
import PhotosMetaModel.Modules;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.ReactClasses;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.ComponentsImpl#getReactclasses <em>Reactclasses</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ComponentsImpl#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentsImpl extends ModulesImpl implements Components {
	/**
	 * The cached value of the '{@link #getReactclasses() <em>Reactclasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ReactClasses> reactclasses;

	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected Modules modules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.COMPONENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReactClasses> getReactclasses() {
		if (reactclasses == null) {
			reactclasses = new EObjectContainmentEList<ReactClasses>(ReactClasses.class, this, PhotosMetaModelPackage.COMPONENTS__REACTCLASSES);
		}
		return reactclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modules getModules() {
		if (modules != null && modules.eIsProxy()) {
			InternalEObject oldModules = (InternalEObject)modules;
			modules = (Modules)eResolveProxy(oldModules);
			if (modules != oldModules) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.COMPONENTS__MODULES, oldModules, modules));
			}
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modules basicGetModules() {
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModules(Modules newModules) {
		Modules oldModules = modules;
		modules = newModules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.COMPONENTS__MODULES, oldModules, modules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.COMPONENTS__REACTCLASSES:
				return ((InternalEList<?>)getReactclasses()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.COMPONENTS__REACTCLASSES:
				return getReactclasses();
			case PhotosMetaModelPackage.COMPONENTS__MODULES:
				if (resolve) return getModules();
				return basicGetModules();
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
			case PhotosMetaModelPackage.COMPONENTS__REACTCLASSES:
				getReactclasses().clear();
				getReactclasses().addAll((Collection<? extends ReactClasses>)newValue);
				return;
			case PhotosMetaModelPackage.COMPONENTS__MODULES:
				setModules((Modules)newValue);
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
			case PhotosMetaModelPackage.COMPONENTS__REACTCLASSES:
				getReactclasses().clear();
				return;
			case PhotosMetaModelPackage.COMPONENTS__MODULES:
				setModules((Modules)null);
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
			case PhotosMetaModelPackage.COMPONENTS__REACTCLASSES:
				return reactclasses != null && !reactclasses.isEmpty();
			case PhotosMetaModelPackage.COMPONENTS__MODULES:
				return modules != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentsImpl
