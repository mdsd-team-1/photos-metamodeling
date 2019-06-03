/**
 */
package PhotosMetaModel;

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
 *   <li>{@link PhotosMetaModel.AmazonWebServices#getAmazonsimplestorageservice <em>Amazonsimplestorageservice</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonWebServices#getAmazonelasticcomputecloud <em>Amazonelasticcomputecloud</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices()
 * @model
 * @generated
 */
public interface AmazonWebServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Amazonsimplestorageservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazonsimplestorageservice</em>' reference.
	 * @see #setAmazonsimplestorageservice(AmazonSimpleStorageService)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices_Amazonsimplestorageservice()
	 * @model
	 * @generated
	 */
	AmazonSimpleStorageService getAmazonsimplestorageservice();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.AmazonWebServices#getAmazonsimplestorageservice <em>Amazonsimplestorageservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amazonsimplestorageservice</em>' reference.
	 * @see #getAmazonsimplestorageservice()
	 * @generated
	 */
	void setAmazonsimplestorageservice(AmazonSimpleStorageService value);

	/**
	 * Returns the value of the '<em><b>Amazonelasticcomputecloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazonelasticcomputecloud</em>' reference.
	 * @see #setAmazonelasticcomputecloud(AmazonElasticComputeCloud)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices_Amazonelasticcomputecloud()
	 * @model
	 * @generated
	 */
	AmazonElasticComputeCloud getAmazonelasticcomputecloud();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.AmazonWebServices#getAmazonelasticcomputecloud <em>Amazonelasticcomputecloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amazonelasticcomputecloud</em>' reference.
	 * @see #getAmazonelasticcomputecloud()
	 * @generated
	 */
	void setAmazonelasticcomputecloud(AmazonElasticComputeCloud value);

} // AmazonWebServices
