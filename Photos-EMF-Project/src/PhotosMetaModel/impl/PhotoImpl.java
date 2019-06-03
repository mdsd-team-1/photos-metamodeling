/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Album;
import PhotosMetaModel.Photo;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Picture;

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
 * An implementation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.PhotoImpl#getAlbum <em>Album</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.PhotoImpl#getPhoto <em>Photo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhotoImpl extends MinimalEObjectImpl.Container implements Photo {
	/**
	 * The cached value of the '{@link #getAlbum() <em>Album</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbum()
	 * @generated
	 * @ordered
	 */
	protected EList<Album> album;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<Picture> photo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.PHOTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Album> getAlbum() {
		if (album == null) {
			album = new EObjectContainmentEList<Album>(Album.class, this, PhotosMetaModelPackage.PHOTO__ALBUM);
		}
		return album;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Picture> getPhoto() {
		if (photo == null) {
			photo = new EObjectContainmentEList<Picture>(Picture.class, this, PhotosMetaModelPackage.PHOTO__PHOTO);
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
			case PhotosMetaModelPackage.PHOTO__ALBUM:
				return ((InternalEList<?>)getAlbum()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.PHOTO__PHOTO:
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
			case PhotosMetaModelPackage.PHOTO__ALBUM:
				return getAlbum();
			case PhotosMetaModelPackage.PHOTO__PHOTO:
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
			case PhotosMetaModelPackage.PHOTO__ALBUM:
				getAlbum().clear();
				getAlbum().addAll((Collection<? extends Album>)newValue);
				return;
			case PhotosMetaModelPackage.PHOTO__PHOTO:
				getPhoto().clear();
				getPhoto().addAll((Collection<? extends Picture>)newValue);
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
			case PhotosMetaModelPackage.PHOTO__ALBUM:
				getAlbum().clear();
				return;
			case PhotosMetaModelPackage.PHOTO__PHOTO:
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
			case PhotosMetaModelPackage.PHOTO__ALBUM:
				return album != null && !album.isEmpty();
			case PhotosMetaModelPackage.PHOTO__PHOTO:
				return photo != null && !photo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhotoImpl
