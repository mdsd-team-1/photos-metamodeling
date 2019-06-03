/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.AmazonS3API;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amazon S3API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.AmazonS3APIImpl#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonS3APIImpl#getAccessKey <em>Access Key</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonS3APIImpl#getSecretKey <em>Secret Key</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.AmazonS3APIImpl#getBucketName <em>Bucket Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmazonS3APIImpl extends ConnectionImpl implements AmazonS3API {
	/**
	 * The default value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointUrl() <em>Endpoint Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointUrl()
	 * @generated
	 * @ordered
	 */
	protected String endpointUrl = ENDPOINT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessKey() <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessKey() <em>Access Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKey()
	 * @generated
	 * @ordered
	 */
	protected String accessKey = ACCESS_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretKey() <em>Secret Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKey()
	 * @generated
	 * @ordered
	 */
	protected String secretKey = SECRET_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketName() <em>Bucket Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketName()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketName() <em>Bucket Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketName()
	 * @generated
	 * @ordered
	 */
	protected String bucketName = BUCKET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AmazonS3APIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.AMAZON_S3API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndpointUrl() {
		return endpointUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndpointUrl(String newEndpointUrl) {
		String oldEndpointUrl = endpointUrl;
		endpointUrl = newEndpointUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.AMAZON_S3API__ENDPOINT_URL, oldEndpointUrl, endpointUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessKey() {
		return accessKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessKey(String newAccessKey) {
		String oldAccessKey = accessKey;
		accessKey = newAccessKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.AMAZON_S3API__ACCESS_KEY, oldAccessKey, accessKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecretKey(String newSecretKey) {
		String oldSecretKey = secretKey;
		secretKey = newSecretKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.AMAZON_S3API__SECRET_KEY, oldSecretKey, secretKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucketName() {
		return bucketName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBucketName(String newBucketName) {
		String oldBucketName = bucketName;
		bucketName = newBucketName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.AMAZON_S3API__BUCKET_NAME, oldBucketName, bucketName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.AMAZON_S3API__ENDPOINT_URL:
				return getEndpointUrl();
			case PhotosMetaModelPackage.AMAZON_S3API__ACCESS_KEY:
				return getAccessKey();
			case PhotosMetaModelPackage.AMAZON_S3API__SECRET_KEY:
				return getSecretKey();
			case PhotosMetaModelPackage.AMAZON_S3API__BUCKET_NAME:
				return getBucketName();
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
			case PhotosMetaModelPackage.AMAZON_S3API__ENDPOINT_URL:
				setEndpointUrl((String)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_S3API__ACCESS_KEY:
				setAccessKey((String)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_S3API__SECRET_KEY:
				setSecretKey((String)newValue);
				return;
			case PhotosMetaModelPackage.AMAZON_S3API__BUCKET_NAME:
				setBucketName((String)newValue);
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
			case PhotosMetaModelPackage.AMAZON_S3API__ENDPOINT_URL:
				setEndpointUrl(ENDPOINT_URL_EDEFAULT);
				return;
			case PhotosMetaModelPackage.AMAZON_S3API__ACCESS_KEY:
				setAccessKey(ACCESS_KEY_EDEFAULT);
				return;
			case PhotosMetaModelPackage.AMAZON_S3API__SECRET_KEY:
				setSecretKey(SECRET_KEY_EDEFAULT);
				return;
			case PhotosMetaModelPackage.AMAZON_S3API__BUCKET_NAME:
				setBucketName(BUCKET_NAME_EDEFAULT);
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
			case PhotosMetaModelPackage.AMAZON_S3API__ENDPOINT_URL:
				return ENDPOINT_URL_EDEFAULT == null ? endpointUrl != null : !ENDPOINT_URL_EDEFAULT.equals(endpointUrl);
			case PhotosMetaModelPackage.AMAZON_S3API__ACCESS_KEY:
				return ACCESS_KEY_EDEFAULT == null ? accessKey != null : !ACCESS_KEY_EDEFAULT.equals(accessKey);
			case PhotosMetaModelPackage.AMAZON_S3API__SECRET_KEY:
				return SECRET_KEY_EDEFAULT == null ? secretKey != null : !SECRET_KEY_EDEFAULT.equals(secretKey);
			case PhotosMetaModelPackage.AMAZON_S3API__BUCKET_NAME:
				return BUCKET_NAME_EDEFAULT == null ? bucketName != null : !BUCKET_NAME_EDEFAULT.equals(bucketName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (endpointUrl: ");
		result.append(endpointUrl);
		result.append(", accessKey: ");
		result.append(accessKey);
		result.append(", secretKey: ");
		result.append(secretKey);
		result.append(", bucketName: ");
		result.append(bucketName);
		result.append(')');
		return result.toString();
	}

} //AmazonS3APIImpl
