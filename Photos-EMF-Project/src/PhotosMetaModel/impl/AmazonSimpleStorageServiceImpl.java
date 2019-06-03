/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.AmazonSimpleStorageService;
import PhotosMetaModel.BatchOperation;
import PhotosMetaModel.Bucket;
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
 * An implementation of the model object '<em><b>Amazon Simple Storage Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.AmazonSimpleStorageServiceImpl#getBucket <em>Bucket</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonSimpleStorageServiceImpl#getBatchoperation <em>Batchoperation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmazonSimpleStorageServiceImpl extends MinimalEObjectImpl.Container implements AmazonSimpleStorageService {
	/**
	 * The cached value of the '{@link #getBucket() <em>Bucket</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucket()
	 * @generated
	 * @ordered
	 */
	protected EList<Bucket> bucket;

	/**
	 * The cached value of the '{@link #getBatchoperation() <em>Batchoperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchoperation()
	 * @generated
	 * @ordered
	 */
	protected EList<BatchOperation> batchoperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmazonSimpleStorageServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.AMAZON_SIMPLE_STORAGE_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bucket> getBucket() {
		if (bucket == null) {
			bucket = new EObjectContainmentEList<Bucket>(Bucket.class, this, PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BUCKET);
		}
		return bucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BatchOperation> getBatchoperation() {
		if (batchoperation == null) {
			batchoperation = new EObjectContainmentEList<BatchOperation>(BatchOperation.class, this, PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BATCHOPERATION);
		}
		return batchoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BUCKET:
				return ((InternalEList<?>)getBucket()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BATCHOPERATION:
				return ((InternalEList<?>)getBatchoperation()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BUCKET:
				return getBucket();
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BATCHOPERATION:
				return getBatchoperation();
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
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BUCKET:
				getBucket().clear();
				getBucket().addAll((Collection<? extends Bucket>)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BATCHOPERATION:
				getBatchoperation().clear();
				getBatchoperation().addAll((Collection<? extends BatchOperation>)newValue);
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
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BUCKET:
				getBucket().clear();
				return;
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BATCHOPERATION:
				getBatchoperation().clear();
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
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BUCKET:
				return bucket != null && !bucket.isEmpty();
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE__BATCHOPERATION:
				return batchoperation != null && !batchoperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AmazonSimpleStorageServiceImpl
