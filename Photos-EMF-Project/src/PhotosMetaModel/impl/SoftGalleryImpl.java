/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Architecture;
import PhotosMetaModel.Domain;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.SoftGallery;
import PhotosMetaModel.Technology;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link PhotosMetaModel.impl.SoftGalleryImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SoftGalleryImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SoftGalleryImpl#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftGalleryImpl extends MinimalEObjectImpl.Container implements SoftGallery {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain domain;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected Architecture architecture;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected Technology technology;

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
	public Domain getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		Domain oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(Domain newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Architecture getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchitecture(Architecture newArchitecture, NotificationChain msgs) {
		Architecture oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE, oldArchitecture, newArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchitecture(Architecture newArchitecture) {
		if (newArchitecture != architecture) {
			NotificationChain msgs = null;
			if (architecture != null)
				msgs = ((InternalEObject)architecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE, null, msgs);
			if (newArchitecture != null)
				msgs = ((InternalEObject)newArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE, null, msgs);
			msgs = basicSetArchitecture(newArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE, newArchitecture, newArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technology getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnology(Technology newTechnology, NotificationChain msgs) {
		Technology oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY, oldTechnology, newTechnology);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnology(Technology newTechnology) {
		if (newTechnology != technology) {
			NotificationChain msgs = null;
			if (technology != null)
				msgs = ((InternalEObject)technology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY, null, msgs);
			if (newTechnology != null)
				msgs = ((InternalEObject)newTechnology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY, null, msgs);
			msgs = basicSetTechnology(newTechnology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY, newTechnology, newTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				return basicSetDomain(null, msgs);
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				return basicSetArchitecture(null, msgs);
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				return basicSetTechnology(null, msgs);
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
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				return getDomain();
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				return getArchitecture();
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				return getTechnology();
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
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				setArchitecture((Architecture)newValue);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				setTechnology((Technology)newValue);
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
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				setDomain((Domain)null);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				setArchitecture((Architecture)null);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				setTechnology((Technology)null);
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
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				return domain != null;
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				return architecture != null;
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				return technology != null;
		}
		return super.eIsSet(featureID);
	}

} //SoftGalleryImpl
