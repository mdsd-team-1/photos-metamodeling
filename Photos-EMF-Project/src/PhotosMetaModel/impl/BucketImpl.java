/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Access;
import PhotosMetaModel.Bucket;
import PhotosMetaModel.File_a;
import PhotosMetaModel.Folder_a;
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
 * An implementation of the model object '<em><b>Bucket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.BucketImpl#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.BucketImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.BucketImpl#getFile_a <em>File a</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.BucketImpl#getFolder_a <em>Folder a</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BucketImpl extends MinimalEObjectImpl.Container implements Bucket {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected Access access;

	/**
	 * The cached value of the '{@link #getFile_a() <em>File a</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_a()
	 * @generated
	 * @ordered
	 */
	protected EList<File_a> file_a;

	/**
	 * The cached value of the '{@link #getFolder_a() <em>Folder a</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolder_a()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder_a> folder_a;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BucketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.BUCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.BUCKET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Access getAccess() {
		if (access != null && access.eIsProxy()) {
			InternalEObject oldAccess = (InternalEObject)access;
			access = (Access)eResolveProxy(oldAccess);
			if (access != oldAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.BUCKET__ACCESS, oldAccess, access));
			}
		}
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Access basicGetAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccess(Access newAccess) {
		Access oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.BUCKET__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<File_a> getFile_a() {
		if (file_a == null) {
			file_a = new EObjectContainmentEList<File_a>(File_a.class, this, PhotosMetaModelPackage.BUCKET__FILE_A);
		}
		return file_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Folder_a> getFolder_a() {
		if (folder_a == null) {
			folder_a = new EObjectContainmentEList<Folder_a>(Folder_a.class, this, PhotosMetaModelPackage.BUCKET__FOLDER_A);
		}
		return folder_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.BUCKET__FILE_A:
				return ((InternalEList<?>)getFile_a()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.BUCKET__FOLDER_A:
				return ((InternalEList<?>)getFolder_a()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.BUCKET__NAME:
				return getName();
			case PhotosMetaModelPackage.BUCKET__ACCESS:
				if (resolve) return getAccess();
				return basicGetAccess();
			case PhotosMetaModelPackage.BUCKET__FILE_A:
				return getFile_a();
			case PhotosMetaModelPackage.BUCKET__FOLDER_A:
				return getFolder_a();
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
			case PhotosMetaModelPackage.BUCKET__NAME:
				setName((String)newValue);
				return;
			case PhotosMetaModelPackage.BUCKET__ACCESS:
				setAccess((Access)newValue);
				return;
			case PhotosMetaModelPackage.BUCKET__FILE_A:
				getFile_a().clear();
				getFile_a().addAll((Collection<? extends File_a>)newValue);
				return;
			case PhotosMetaModelPackage.BUCKET__FOLDER_A:
				getFolder_a().clear();
				getFolder_a().addAll((Collection<? extends Folder_a>)newValue);
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
			case PhotosMetaModelPackage.BUCKET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.BUCKET__ACCESS:
				setAccess((Access)null);
				return;
			case PhotosMetaModelPackage.BUCKET__FILE_A:
				getFile_a().clear();
				return;
			case PhotosMetaModelPackage.BUCKET__FOLDER_A:
				getFolder_a().clear();
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
			case PhotosMetaModelPackage.BUCKET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PhotosMetaModelPackage.BUCKET__ACCESS:
				return access != null;
			case PhotosMetaModelPackage.BUCKET__FILE_A:
				return file_a != null && !file_a.isEmpty();
			case PhotosMetaModelPackage.BUCKET__FOLDER_A:
				return folder_a != null && !folder_a.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BucketImpl
