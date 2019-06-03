/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Album;
import PhotosMetaModel.CreateAlbum;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.CreateAlbumImpl#getAlbum <em>Album</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateAlbumImpl extends ActionImpl implements CreateAlbum {
	/**
	 * The cached value of the '{@link #getAlbum() <em>Album</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbum()
	 * @generated
	 * @ordered
	 */
	protected Album album;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateAlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.CREATE_ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Album getAlbum() {
		if (album != null && album.eIsProxy()) {
			InternalEObject oldAlbum = (InternalEObject)album;
			album = (Album)eResolveProxy(oldAlbum);
			if (album != oldAlbum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CREATE_ALBUM__ALBUM, oldAlbum, album));
			}
		}
		return album;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Album basicGetAlbum() {
		return album;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlbum(Album newAlbum) {
		Album oldAlbum = album;
		album = newAlbum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CREATE_ALBUM__ALBUM, oldAlbum, album));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.CREATE_ALBUM__ALBUM:
				if (resolve) return getAlbum();
				return basicGetAlbum();
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
			case PhotosMetaModelPackage.CREATE_ALBUM__ALBUM:
				setAlbum((Album)newValue);
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
			case PhotosMetaModelPackage.CREATE_ALBUM__ALBUM:
				setAlbum((Album)null);
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
			case PhotosMetaModelPackage.CREATE_ALBUM__ALBUM:
				return album != null;
		}
		return super.eIsSet(featureID);
	}

} //CreateAlbumImpl
