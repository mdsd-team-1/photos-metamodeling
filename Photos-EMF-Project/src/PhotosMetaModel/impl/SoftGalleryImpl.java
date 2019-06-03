/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Architecture;
import PhotosMetaModel.Domain;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.SoftGallery;
import PhotosMetaModel.Technology;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soft Gallery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.SoftGalleryImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SoftGalleryImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SoftGalleryImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftGalleryImpl extends MinimalEObjectImpl.Container implements SoftGallery {
	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected Architecture architecture;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected Technology technology;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain domain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftGalleryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.SOFT_GALLERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Architecture getArchitecture() {
		if (architecture != null && architecture.eIsProxy()) {
			InternalEObject oldArchitecture = (InternalEObject)architecture;
			architecture = (Architecture)eResolveProxy(oldArchitecture);
			if (architecture != oldArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE, oldArchitecture, architecture));
			}
		}
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture basicGetArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchitecture(Architecture newArchitecture) {
		Architecture oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technology getTechnology() {
		if (technology != null && technology.eIsProxy()) {
			InternalEObject oldTechnology = (InternalEObject)technology;
			technology = (Technology)eResolveProxy(oldTechnology);
			if (technology != oldTechnology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY, oldTechnology, technology));
			}
		}
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology basicGetTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnology(Technology newTechnology) {
		Technology oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (Domain)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(Domain newDomain) {
		Domain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				if (resolve) return getArchitecture();
				return basicGetArchitecture();
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				if (resolve) return getTechnology();
				return basicGetTechnology();
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
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
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				setArchitecture((Architecture)newValue);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				setTechnology((Technology)newValue);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				setDomain((Domain)newValue);
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
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				setArchitecture((Architecture)null);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				setTechnology((Technology)null);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				setDomain((Domain)null);
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
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				return architecture != null;
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				return technology != null;
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				return domain != null;
		}
		return super.eIsSet(featureID);
	}

} //SoftGalleryImpl
