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
 *   <li>{@link PhotosMetaModel.AmazonWebServices#getAmazonelasticcomputecloud <em>Amazonelasticcomputecloud</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonWebServices#getAmazonaurora <em>Amazonaurora</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonWebServices#getAmazonsimplestorageservice <em>Amazonsimplestorageservice</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonWebServices#getAmazondynamodb <em>Amazondynamodb</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonWebServices#getAmazonsagemaker <em>Amazonsagemaker</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices()
 * @model
 * @generated
 */
public interface AmazonWebServices extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Amazonaurora</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazonaurora</em>' reference.
	 * @see #setAmazonaurora(AmazonAurora)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices_Amazonaurora()
	 * @model
	 * @generated
	 */
	AmazonAurora getAmazonaurora();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.AmazonWebServices#getAmazonaurora <em>Amazonaurora</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amazonaurora</em>' reference.
	 * @see #getAmazonaurora()
	 * @generated
	 */
	void setAmazonaurora(AmazonAurora value);

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
	 * Returns the value of the '<em><b>Amazondynamodb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazondynamodb</em>' reference.
	 * @see #setAmazondynamodb(AmazonDynamoDB)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices_Amazondynamodb()
	 * @model
	 * @generated
	 */
	AmazonDynamoDB getAmazondynamodb();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.AmazonWebServices#getAmazondynamodb <em>Amazondynamodb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amazondynamodb</em>' reference.
	 * @see #getAmazondynamodb()
	 * @generated
	 */
	void setAmazondynamodb(AmazonDynamoDB value);

	/**
	 * Returns the value of the '<em><b>Amazonsagemaker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amazonsagemaker</em>' reference.
	 * @see #setAmazonsagemaker(AmazonSageMaker)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonWebServices_Amazonsagemaker()
	 * @model
	 * @generated
	 */
	AmazonSageMaker getAmazonsagemaker();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.AmazonWebServices#getAmazonsagemaker <em>Amazonsagemaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amazonsagemaker</em>' reference.
	 * @see #getAmazonsagemaker()
	 * @generated
	 */
	void setAmazonsagemaker(AmazonSageMaker value);

} // AmazonWebServices
