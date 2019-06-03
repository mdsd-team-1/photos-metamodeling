/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Domain;
import PhotosMetaModel.Photo;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.User_d;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.DomainImpl#getUser_d <em>User d</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.DomainImpl#getPhoto <em>Photo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getUser_d() <em>User d</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_d()
	 * @generated
	 * @ordered
	 */
	protected EList<User_d> user_d;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<Photo> photo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User_d> getUser_d() {
		if (user_d == null) {
			user_d = new EObjectContainmentEList<User_d>(User_d.class, this, PhotosMetaModelPackage.DOMAIN__USER_D);
		}
		return user_d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Photo> getPhoto() {
		if (photo == null) {
			photo = new EObjectContainmentEList<Photo>(Photo.class, this, PhotosMetaModelPackage.DOMAIN__PHOTO);
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.DOMAIN__USER_D:
				return ((InternalEList<?>)getUser_d()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.DOMAIN__PHOTO:
				return ((InternalEList<?>)getPhoto()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.DOMAIN__USER_D:
				return getUser_d();
			case PhotosMetaModelPackage.DOMAIN__PHOTO:
				return getPhoto();
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
			case PhotosMetaModelPackage.DOMAIN__USER_D:
				getUser_d().clear();
				getUser_d().addAll((Collection<? extends User_d>)newValue);
				return;
			case PhotosMetaModelPackage.DOMAIN__PHOTO:
				getPhoto().clear();
				getPhoto().addAll((Collection<? extends Photo>)newValue);
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
			case PhotosMetaModelPackage.DOMAIN__USER_D:
				getUser_d().clear();
				return;
			case PhotosMetaModelPackage.DOMAIN__PHOTO:
				getPhoto().clear();
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
			case PhotosMetaModelPackage.DOMAIN__USER_D:
				return user_d != null && !user_d.isEmpty();
			case PhotosMetaModelPackage.DOMAIN__PHOTO:
				return photo != null && !photo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
