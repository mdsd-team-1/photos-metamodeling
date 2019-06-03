/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amazon Simple Storage Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.AmazonSimpleStorageService#getBucket <em>Bucket</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonSimpleStorageService#getBatchoperation <em>Batchoperation</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonSimpleStorageService()
 * @model
 * @generated
 */
public interface AmazonSimpleStorageService extends EObject {
	/**
	 * Returns the value of the '<em><b>Bucket</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Bucket}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonSimpleStorageService_Bucket()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bucket> getBucket();

	/**
	 * Returns the value of the '<em><b>Batchoperation</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.BatchOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batchoperation</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonSimpleStorageService_Batchoperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<BatchOperation> getBatchoperation();

} // AmazonSimpleStorageService
