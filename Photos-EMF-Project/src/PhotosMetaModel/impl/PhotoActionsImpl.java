/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.AlbumManagement;
import PhotosMetaModel.PhotoActions;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photo Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.PhotoActionsImpl#getAlbummanagement <em>Albummanagement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhotoActionsImpl extends FunctionalitiesImpl implements PhotoActions {
	/**
	 * The cached value of the '{@link #getAlbummanagement() <em>Albummanagement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbummanagement()
	 * @generated
	 * @ordered
	 */
	protected AlbumManagement albummanagement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.PHOTO_ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlbumManagement getAlbummanagement() {
		if (albummanagement != null && albummanagement.eIsProxy()) {
			InternalEObject oldAlbummanagement = (InternalEObject)albummanagement;
			albummanagement = (AlbumManagement)eResolveProxy(oldAlbummanagement);
			if (albummanagement != oldAlbummanagement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.PHOTO_ACTIONS__ALBUMMANAGEMENT, oldAlbummanagement, albummanagement));
			}
		}
		return albummanagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlbumManagement basicGetAlbummanagement() {
		return albummanagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlbummanagement(AlbumManagement newAlbummanagement) {
		AlbumManagement oldAlbummanagement = albummanagement;
		albummanagement = newAlbummanagement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.PHOTO_ACTIONS__ALBUMMANAGEMENT, oldAlbummanagement, albummanagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.PHOTO_ACTIONS__ALBUMMANAGEMENT:
				if (resolve) return getAlbummanagement();
				return basicGetAlbummanagement();
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
			case PhotosMetaModelPackage.PHOTO_ACTIONS__ALBUMMANAGEMENT:
				setAlbummanagement((AlbumManagement)newValue);
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
			case PhotosMetaModelPackage.PHOTO_ACTIONS__ALBUMMANAGEMENT:
				setAlbummanagement((AlbumManagement)null);
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
			case PhotosMetaModelPackage.PHOTO_ACTIONS__ALBUMMANAGEMENT:
				return albummanagement != null;
		}
		return super.eIsSet(featureID);
	}

} //PhotoActionsImpl
