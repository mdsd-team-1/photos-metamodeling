/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.LoadPhoto;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Picture;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Photo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.LoadPhotoImpl#getPicture <em>Picture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadPhotoImpl extends ActionImpl implements LoadPhoto {
	/**
	 * The cached value of the '{@link #getPicture() <em>Picture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected Picture picture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadPhotoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.LOAD_PHOTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Picture getPicture() {
		if (picture != null && picture.eIsProxy()) {
			InternalEObject oldPicture = (InternalEObject)picture;
			picture = (Picture)eResolveProxy(oldPicture);
			if (picture != oldPicture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.LOAD_PHOTO__PICTURE, oldPicture, picture));
			}
		}
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Picture basicGetPicture() {
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicture(Picture newPicture) {
		Picture oldPicture = picture;
		picture = newPicture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.LOAD_PHOTO__PICTURE, oldPicture, picture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.LOAD_PHOTO__PICTURE:
				if (resolve) return getPicture();
				return basicGetPicture();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhotosMetaModelPackage.LOAD_PHOTO__PICTURE:
				setPicture((Picture)newValue);
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
			case PhotosMetaModelPackage.LOAD_PHOTO__PICTURE:
				setPicture((Picture)null);
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
			case PhotosMetaModelPackage.LOAD_PHOTO__PICTURE:
				return picture != null;
		}
		return super.eIsSet(featureID);
	}

} //LoadPhotoImpl
