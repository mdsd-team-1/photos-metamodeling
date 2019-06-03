/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.File_a;
import PhotosMetaModel.MetaData;
import PhotosMetaModel.PhotosMetaModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File a</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.File_aImpl#getOnwer <em>Onwer</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.File_aImpl#getSize <em>Size</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.File_aImpl#getObjectURL <em>Object URL</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.File_aImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class File_aImpl extends MinimalEObjectImpl.Container implements File_a {
	/**
	 * The default value of the '{@link #getOnwer() <em>Onwer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnwer()
	 * @generated
	 * @ordered
	 */
	protected static final String ONWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnwer() <em>Onwer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnwer()
	 * @generated
	 * @ordered
	 */
	protected String onwer = ONWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectURL() <em>Object URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectURL()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectURL() <em>Object URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectURL()
	 * @generated
	 * @ordered
	 */
	protected String objectURL = OBJECT_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaData> metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected File_aImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.FILE_A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOnwer() {
		return onwer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnwer(String newOnwer) {
		String oldOnwer = onwer;
		onwer = newOnwer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.FILE_A__ONWER, oldOnwer, onwer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.FILE_A__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectURL() {
		return objectURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectURL(String newObjectURL) {
		String oldObjectURL = objectURL;
		objectURL = newObjectURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.FILE_A__OBJECT_URL, oldObjectURL, objectURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaData> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<MetaData>(MetaData.class, this, PhotosMetaModelPackage.FILE_A__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.FILE_A__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.FILE_A__ONWER:
				return getOnwer();
			case PhotosMetaModelPackage.FILE_A__SIZE:
				return getSize();
			case PhotosMetaModelPackage.FILE_A__OBJECT_URL:
				return getObjectURL();
			case PhotosMetaModelPackage.FILE_A__METADATA:
				return getMetadata();
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
			case PhotosMetaModelPackage.FILE_A__ONWER:
				setOnwer((String)newValue);
				return;
			case PhotosMetaModelPackage.FILE_A__SIZE:
				setSize((String)newValue);
				return;
			case PhotosMetaModelPackage.FILE_A__OBJECT_URL:
				setObjectURL((String)newValue);
				return;
			case PhotosMetaModelPackage.FILE_A__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends MetaData>)newValue);
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
			case PhotosMetaModelPackage.FILE_A__ONWER:
				setOnwer(ONWER_EDEFAULT);
				return;
			case PhotosMetaModelPackage.FILE_A__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case PhotosMetaModelPackage.FILE_A__OBJECT_URL:
				setObjectURL(OBJECT_URL_EDEFAULT);
				return;
			case PhotosMetaModelPackage.FILE_A__METADATA:
				getMetadata().clear();
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
			case PhotosMetaModelPackage.FILE_A__ONWER:
				return ONWER_EDEFAULT == null ? onwer != null : !ONWER_EDEFAULT.equals(onwer);
			case PhotosMetaModelPackage.FILE_A__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case PhotosMetaModelPackage.FILE_A__OBJECT_URL:
				return OBJECT_URL_EDEFAULT == null ? objectURL != null : !OBJECT_URL_EDEFAULT.equals(objectURL);
			case PhotosMetaModelPackage.FILE_A__METADATA:
				return metadata != null && !metadata.isEmpty();
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
		result.append(" (Onwer: ");
		result.append(onwer);
		result.append(", size: ");
		result.append(size);
		result.append(", ObjectURL: ");
		result.append(objectURL);
		result.append(')');
		return result.toString();
	}

} //File_aImpl
