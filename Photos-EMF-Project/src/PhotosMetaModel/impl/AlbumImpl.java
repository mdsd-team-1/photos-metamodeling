/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Album;
import PhotosMetaModel.AlbumManagement;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.AlbumImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AlbumImpl#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AlbumImpl#getAlbummanagement <em>Albummanagement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlbumImpl extends EntitiesImpl implements Album {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

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
	protected AlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.ALBUM__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.ALBUM__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.ALBUM__ALBUMMANAGEMENT, oldAlbummanagement, albummanagement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.ALBUM__ALBUMMANAGEMENT, oldAlbummanagement, albummanagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.ALBUM__URL:
				return getUrl();
			case PhotosMetaModelPackage.ALBUM__NAME:
				return getName();
			case PhotosMetaModelPackage.ALBUM__ALBUMMANAGEMENT:
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
			case PhotosMetaModelPackage.ALBUM__URL:
				setUrl((String)newValue);
				return;
			case PhotosMetaModelPackage.ALBUM__NAME:
				setName((String)newValue);
				return;
			case PhotosMetaModelPackage.ALBUM__ALBUMMANAGEMENT:
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
			case PhotosMetaModelPackage.ALBUM__URL:
				setUrl(URL_EDEFAULT);
				return;
			case PhotosMetaModelPackage.ALBUM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.ALBUM__ALBUMMANAGEMENT:
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
			case PhotosMetaModelPackage.ALBUM__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case PhotosMetaModelPackage.ALBUM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PhotosMetaModelPackage.ALBUM__ALBUMMANAGEMENT:
				return albummanagement != null;
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
		result.append(" (url: ");
		result.append(url);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AlbumImpl
