/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Architecture;
import PhotosMetaModel.Domain;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.SoftGallery;
import PhotosMetaModel.Technology;

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
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> domain;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected EList<Architecture> architecture;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected EList<Technology> technology;

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
	public EList<Domain> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<Domain>(Domain.class, this, PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Architecture> getArchitecture() {
		if (architecture == null) {
			architecture = new EObjectContainmentEList<Architecture>(Architecture.class, this, PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE);
		}
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Technology> getTechnology() {
		if (technology == null) {
			technology = new EObjectContainmentEList<Technology>(Technology.class, this, PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY);
		}
		return technology;
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
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				return ((InternalEList<?>)getArchitecture()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				return ((InternalEList<?>)getTechnology()).basicRemove(otherEnd, msgs);
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhotosMetaModelPackage.SOFT_GALLERY__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends Domain>)newValue);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				getArchitecture().clear();
				getArchitecture().addAll((Collection<? extends Architecture>)newValue);
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				getTechnology().clear();
				getTechnology().addAll((Collection<? extends Technology>)newValue);
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
				getDomain().clear();
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				getArchitecture().clear();
				return;
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				getTechnology().clear();
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
				return domain != null && !domain.isEmpty();
			case PhotosMetaModelPackage.SOFT_GALLERY__ARCHITECTURE:
				return architecture != null && !architecture.isEmpty();
			case PhotosMetaModelPackage.SOFT_GALLERY__TECHNOLOGY:
				return technology != null && !technology.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SoftGalleryImpl
