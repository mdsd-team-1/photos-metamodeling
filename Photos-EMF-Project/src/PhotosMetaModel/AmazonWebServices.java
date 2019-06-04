/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amazon Web Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.AmazonWebServices#getAmazonelasticcomputecloud <em>Amazonelasticcomputecloud</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonWebServices#getAmazonsimplestorageservice <em>Amazonsimplestorageservice</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices()
 * @model
 * @generated
 */
public interface AmazonWebServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Amazonelasticcomputecloud</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.AmazonElasticComputeCloud}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazonelasticcomputecloud</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices_Amazonelasticcomputecloud()
	 * @model containment="true"
	 * @generated
	 */
	EList<AmazonElasticComputeCloud> getAmazonelasticcomputecloud();

	/**
	 * Returns the value of the '<em><b>Amazonsimplestorageservice</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.AmazonSimpleStorageService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazonsimplestorageservice</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices_Amazonsimplestorageservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<AmazonSimpleStorageService> getAmazonsimplestorageservice();

} // AmazonWebServices
