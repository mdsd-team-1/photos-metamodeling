/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.AmazonAurora;
import PhotosMetaModel.AmazonDynamoDB;
import PhotosMetaModel.AmazonElasticComputeCloud;
import PhotosMetaModel.AmazonSageMaker;
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
 *   <li>{@link PhotosMetaModel.impl.AmazonWebServicesImpl#getAmazonelasticcomputecloud <em>Amazonelasticcomputecloud</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonWebServicesImpl#getAmazonaurora <em>Amazonaurora</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonWebServicesImpl#getAmazonsimplestorageservice <em>Amazonsimplestorageservice</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonWebServicesImpl#getAmazondynamodb <em>Amazondynamodb</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonWebServicesImpl#getAmazonsagemaker <em>Amazonsagemaker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmazonWebServicesImpl extends MinimalEObjectImpl.Container implements AmazonWebServices {
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
	 * The cached value of the '{@link #getAmazonaurora() <em>Amazonaurora</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonaurora()
	 * @generated
	 * @ordered
	 */
	protected AmazonAurora amazonaurora;

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
	 * The cached value of the '{@link #getAmazondynamodb() <em>Amazondynamodb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazondynamodb()
	 * @generated
	 * @ordered
	 */
	protected AmazonDynamoDB amazondynamodb;

	/**
	 * The cached value of the '{@link #getAmazonsagemaker() <em>Amazonsagemaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonsagemaker()
	 * @generated
	 * @ordered
	 */
	protected AmazonSageMaker amazonsagemaker;

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
	public AmazonAurora getAmazonaurora() {
		if (amazonaurora != null && amazonaurora.eIsProxy()) {
			InternalEObject oldAmazonaurora = (InternalEObject)amazonaurora;
			amazonaurora = (AmazonAurora)eResolveProxy(oldAmazonaurora);
			if (amazonaurora != oldAmazonaurora) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONAURORA, oldAmazonaurora, amazonaurora));
			}
		}
		return amazonaurora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonAurora basicGetAmazonaurora() {
		return amazonaurora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmazonaurora(AmazonAurora newAmazonaurora) {
		AmazonAurora oldAmazonaurora = amazonaurora;
		amazonaurora = newAmazonaurora;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONAURORA, oldAmazonaurora, amazonaurora));
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
	public AmazonDynamoDB getAmazondynamodb() {
		if (amazondynamodb != null && amazondynamodb.eIsProxy()) {
			InternalEObject oldAmazondynamodb = (InternalEObject)amazondynamodb;
			amazondynamodb = (AmazonDynamoDB)eResolveProxy(oldAmazondynamodb);
			if (amazondynamodb != oldAmazondynamodb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONDYNAMODB, oldAmazondynamodb, amazondynamodb));
			}
		}
		return amazondynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonDynamoDB basicGetAmazondynamodb() {
		return amazondynamodb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmazondynamodb(AmazonDynamoDB newAmazondynamodb) {
		AmazonDynamoDB oldAmazondynamodb = amazondynamodb;
		amazondynamodb = newAmazondynamodb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONDYNAMODB, oldAmazondynamodb, amazondynamodb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonSageMaker getAmazonsagemaker() {
		if (amazonsagemaker != null && amazonsagemaker.eIsProxy()) {
			InternalEObject oldAmazonsagemaker = (InternalEObject)amazonsagemaker;
			amazonsagemaker = (AmazonSageMaker)eResolveProxy(oldAmazonsagemaker);
			if (amazonsagemaker != oldAmazonsagemaker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSAGEMAKER, oldAmazonsagemaker, amazonsagemaker));
			}
		}
		return amazonsagemaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmazonSageMaker basicGetAmazonsagemaker() {
		return amazonsagemaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmazonsagemaker(AmazonSageMaker newAmazonsagemaker) {
		AmazonSageMaker oldAmazonsagemaker = amazonsagemaker;
		amazonsagemaker = newAmazonsagemaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSAGEMAKER, oldAmazonsagemaker, amazonsagemaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				if (resolve) return getAmazonelasticcomputecloud();
				return basicGetAmazonelasticcomputecloud();
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONAURORA:
				if (resolve) return getAmazonaurora();
				return basicGetAmazonaurora();
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				if (resolve) return getAmazonsimplestorageservice();
				return basicGetAmazonsimplestorageservice();
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONDYNAMODB:
				if (resolve) return getAmazondynamodb();
				return basicGetAmazondynamodb();
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSAGEMAKER:
				if (resolve) return getAmazonsagemaker();
				return basicGetAmazonsagemaker();
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
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				setAmazonelasticcomputecloud((AmazonElasticComputeCloud)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONAURORA:
				setAmazonaurora((AmazonAurora)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				setAmazonsimplestorageservice((AmazonSimpleStorageService)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONDYNAMODB:
				setAmazondynamodb((AmazonDynamoDB)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSAGEMAKER:
				setAmazonsagemaker((AmazonSageMaker)newValue);
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
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				setAmazonelasticcomputecloud((AmazonElasticComputeCloud)null);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONAURORA:
				setAmazonaurora((AmazonAurora)null);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				setAmazonsimplestorageservice((AmazonSimpleStorageService)null);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONDYNAMODB:
				setAmazondynamodb((AmazonDynamoDB)null);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSAGEMAKER:
				setAmazonsagemaker((AmazonSageMaker)null);
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
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				return amazonelasticcomputecloud != null;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONAURORA:
				return amazonaurora != null;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				return amazonsimplestorageservice != null;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONDYNAMODB:
				return amazondynamodb != null;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSAGEMAKER:
				return amazonsagemaker != null;
		}
		return super.eIsSet(featureID);
	}

} //AmazonWebServicesImpl
