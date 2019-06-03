/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.AmazonElasticComputeCloud;
import PhotosMetaModel.AmazonSimpleStorageService;
import PhotosMetaModel.AmazonWebServices;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amazon Web Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.AmazonWebServicesImpl#getAmazonsimplestorageservice <em>Amazonsimplestorageservice</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonWebServicesImpl#getAmazonelasticcomputecloud <em>Amazonelasticcomputecloud</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmazonWebServicesImpl extends MinimalEObjectImpl.Container implements AmazonWebServices {
	/**
	 * The cached value of the '{@link #getAmazonsimplestorageservice() <em>Amazonsimplestorageservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonsimplestorageservice()
	 * @generated
	 * @ordered
	 */
	protected AmazonSimpleStorageService amazonsimplestorageservice;

	/**
	 * The cached value of the '{@link #getAmazonelasticcomputecloud() <em>Amazonelasticcomputecloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonelasticcomputecloud()
	 * @generated
	 * @ordered
	 */
	protected AmazonElasticComputeCloud amazonelasticcomputecloud;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmazonWebServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.AMAZON_WEB_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonSimpleStorageService getAmazonsimplestorageservice() {
		if (amazonsimplestorageservice != null && amazonsimplestorageservice.eIsProxy()) {
			InternalEObject oldAmazonsimplestorageservice = (InternalEObject)amazonsimplestorageservice;
			amazonsimplestorageservice = (AmazonSimpleStorageService)eResolveProxy(oldAmazonsimplestorageservice);
			if (amazonsimplestorageservice != oldAmazonsimplestorageservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE, oldAmazonsimplestorageservice, amazonsimplestorageservice));
			}
		}
		return amazonsimplestorageservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonSimpleStorageService basicGetAmazonsimplestorageservice() {
		return amazonsimplestorageservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmazonsimplestorageservice(AmazonSimpleStorageService newAmazonsimplestorageservice) {
		AmazonSimpleStorageService oldAmazonsimplestorageservice = amazonsimplestorageservice;
		amazonsimplestorageservice = newAmazonsimplestorageservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE, oldAmazonsimplestorageservice, amazonsimplestorageservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonElasticComputeCloud getAmazonelasticcomputecloud() {
		if (amazonelasticcomputecloud != null && amazonelasticcomputecloud.eIsProxy()) {
			InternalEObject oldAmazonelasticcomputecloud = (InternalEObject)amazonelasticcomputecloud;
			amazonelasticcomputecloud = (AmazonElasticComputeCloud)eResolveProxy(oldAmazonelasticcomputecloud);
			if (amazonelasticcomputecloud != oldAmazonelasticcomputecloud) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD, oldAmazonelasticcomputecloud, amazonelasticcomputecloud));
			}
		}
		return amazonelasticcomputecloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonElasticComputeCloud basicGetAmazonelasticcomputecloud() {
		return amazonelasticcomputecloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmazonelasticcomputecloud(AmazonElasticComputeCloud newAmazonelasticcomputecloud) {
		AmazonElasticComputeCloud oldAmazonelasticcomputecloud = amazonelasticcomputecloud;
		amazonelasticcomputecloud = newAmazonelasticcomputecloud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD, oldAmazonelasticcomputecloud, amazonelasticcomputecloud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				if (resolve) return getAmazonsimplestorageservice();
				return basicGetAmazonsimplestorageservice();
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				if (resolve) return getAmazonelasticcomputecloud();
				return basicGetAmazonelasticcomputecloud();
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
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				setAmazonsimplestorageservice((AmazonSimpleStorageService)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				setAmazonelasticcomputecloud((AmazonElasticComputeCloud)newValue);
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
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				setAmazonsimplestorageservice((AmazonSimpleStorageService)null);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				setAmazonelasticcomputecloud((AmazonElasticComputeCloud)null);
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
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				return amazonsimplestorageservice != null;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				return amazonelasticcomputecloud != null;
		}
		return super.eIsSet(featureID);
	}

} //AmazonWebServicesImpl
