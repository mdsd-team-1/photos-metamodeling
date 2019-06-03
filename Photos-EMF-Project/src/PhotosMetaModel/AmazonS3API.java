/**
 */
package PhotosMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Amazon S3API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.AmazonS3API#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonS3API#getAccessKey <em>Access Key</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonS3API#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link PhotosMetaModel.AmazonS3API#getBucketName <em>Bucket Name</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonS3API()
 * @model
 * @generated
 */
public interface AmazonS3API extends Conexion {
	/**
	 * Returns the value of the '<em><b>Endpoint Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url</em>' attribute.
	 * @see #setEndpointUrl(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonS3API_EndpointUrl()
	 * @model
	 * @generated
	 */
	String getEndpointUrl();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.AmazonS3API#getEndpointUrl <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Url</em>' attribute.
	 * @see #getEndpointUrl()
	 * @generated
	 */
	void setEndpointUrl(String value);

	/**
	 * Returns the value of the '<em><b>Access Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Key</em>' attribute.
	 * @see #setAccessKey(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonS3API_AccessKey()
	 * @model
	 * @generated
	 */
	String getAccessKey();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.AmazonS3API#getAccessKey <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Key</em>' attribute.
	 * @see #getAccessKey()
	 * @generated
	 */
	void setAccessKey(String value);

	/**
	 * Returns the value of the '<em><b>Secret Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Key</em>' attribute.
	 * @see #setSecretKey(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonS3API_SecretKey()
	 * @model
	 * @generated
	 */
	String getSecretKey();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.AmazonS3API#getSecretKey <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key</em>' attribute.
	 * @see #getSecretKey()
	 * @generated
	 */
	void setSecretKey(String value);

	/**
	 * Returns the value of the '<em><b>Bucket Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Name</em>' attribute.
	 * @see #setBucketName(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAmazonS3API_BucketName()
	 * @model
	 * @generated
	 */
	String getBucketName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.AmazonS3API#getBucketName <em>Bucket Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Name</em>' attribute.
	 * @see #getBucketName()
	 * @generated
	 */
	void setBucketName(String value);

} // AmazonS3API
