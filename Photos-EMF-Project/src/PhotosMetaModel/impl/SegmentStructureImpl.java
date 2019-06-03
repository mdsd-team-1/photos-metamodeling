/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Directories;
import PhotosMetaModel.Files;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.SegmentStructure;

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
 * An implementation of the model object '<em><b>Segment Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.SegmentStructureImpl#getDirectories <em>Directories</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SegmentStructureImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SegmentStructureImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentStructureImpl extends MinimalEObjectImpl.Container implements SegmentStructure {
	/**
	 * The cached value of the '{@link #getDirectories() <em>Directories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectories()
	 * @generated
	 * @ordered
	 */
	protected EList<Directories> directories;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Files> files;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.SEGMENT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Directories> getDirectories() {
		if (directories == null) {
			directories = new EObjectContainmentEList<Directories>(Directories.class, this, PhotosMetaModelPackage.SEGMENT_STRUCTURE__DIRECTORIES);
		}
		return directories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Files> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<Files>(Files.class, this, PhotosMetaModelPackage.SEGMENT_STRUCTURE__FILES);
		}
		return files;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SEGMENT_STRUCTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__DIRECTORIES:
				return ((InternalEList<?>)getDirectories()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__DIRECTORIES:
				return getDirectories();
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__FILES:
				return getFiles();
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__NAME:
				return getName();
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
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__DIRECTORIES:
				getDirectories().clear();
				getDirectories().addAll((Collection<? extends Directories>)newValue);
				return;
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends Files>)newValue);
				return;
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__NAME:
				setName((String)newValue);
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
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__DIRECTORIES:
				getDirectories().clear();
				return;
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__FILES:
				getFiles().clear();
				return;
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__NAME:
				setName(NAME_EDEFAULT);
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
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__DIRECTORIES:
				return directories != null && !directories.isEmpty();
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__FILES:
				return files != null && !files.isEmpty();
			case PhotosMetaModelPackage.SEGMENT_STRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //SegmentStructureImpl
