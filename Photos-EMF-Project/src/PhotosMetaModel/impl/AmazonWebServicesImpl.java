/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.AmazonElasticComputeCloud;
import PhotosMetaModel.AmazonSimpleStorageService;
import PhotosMetaModel.AmazonWebServices;
import PhotosMetaModel.PhotosMetaModelPackage;

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
 * An implementation of the model object '<em><b>Amazon Web Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.AmazonWebServicesImpl#getAmazonelasticcomputecloud <em>Amazonelasticcomputecloud</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonWebServicesImpl#getAmazonsimplestorageservice <em>Amazonsimplestorageservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmazonWebServicesImpl extends MinimalEObjectImpl.Container implements AmazonWebServices {
	/**
	 * The cached value of the '{@link #getAmazonelasticcomputecloud() <em>Amazonelasticcomputecloud</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonelasticcomputecloud()
	 * @generated
	 * @ordered
	 */
	protected EList<AmazonElasticComputeCloud> amazonelasticcomputecloud;

	/**
	 * The cached value of the '{@link #getAmazonsimplestorageservice() <em>Amazonsimplestorageservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmazonsimplestorageservice()
	 * @generated
	 * @ordered
	 */
	protected EList<AmazonSimpleStorageService> amazonsimplestorageservice;

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
	public EList<AmazonElasticComputeCloud> getAmazonelasticcomputecloud() {
		if (amazonelasticcomputecloud == null) {
			amazonelasticcomputecloud = new EObjectContainmentEList<AmazonElasticComputeCloud>(AmazonElasticComputeCloud.class, this, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD);
		}
		return amazonelasticcomputecloud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AmazonSimpleStorageService> getAmazonsimplestorageservice() {
		if (amazonsimplestorageservice == null) {
			amazonsimplestorageservice = new EObjectContainmentEList<AmazonSimpleStorageService>(AmazonSimpleStorageService.class, this, PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE);
		}
		return amazonsimplestorageservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				return ((InternalEList<?>)getAmazonelasticcomputecloud()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				return ((InternalEList<?>)getAmazonsimplestorageservice()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				return getAmazonelasticcomputecloud();
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				return getAmazonsimplestorageservice();
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
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONELASTICCOMPUTECLOUD:
				getAmazonelasticcomputecloud().clear();
				getAmazonelasticcomputecloud().addAll((Collection<? extends AmazonElasticComputeCloud>)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				getAmazonsimplestorageservice().clear();
				getAmazonsimplestorageservice().addAll((Collection<? extends AmazonSimpleStorageService>)newValue);
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
				getAmazonelasticcomputecloud().clear();
				return;
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				getAmazonsimplestorageservice().clear();
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
				return amazonelasticcomputecloud != null && !amazonelasticcomputecloud.isEmpty();
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES__AMAZONSIMPLESTORAGESERVICE:
				return amazonsimplestorageservice != null && !amazonsimplestorageservice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AmazonWebServicesImpl
