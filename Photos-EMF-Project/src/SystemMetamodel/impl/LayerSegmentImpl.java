/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Database;
import SystemMetamodel.File;
import SystemMetamodel.Folder;
import SystemMetamodel.LayerSegment;
import SystemMetamodel.SystemMetamodelPackage;

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
 * An implementation of the model object '<em><b>Layer Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.LayerSegmentImpl#getFolders <em>Folders</em>}</li>
 *   <li>{@link SystemMetamodel.impl.LayerSegmentImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link SystemMetamodel.impl.LayerSegmentImpl#getDatabases <em>Databases</em>}</li>
 *   <li>{@link SystemMetamodel.impl.LayerSegmentImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerSegmentImpl extends MinimalEObjectImpl.Container implements LayerSegment {
	/**
	 * The cached value of the '{@link #getFolders() <em>Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> folders;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getDatabases() <em>Databases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabases()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> databases;

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
	protected LayerSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.LAYER_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Folder> getFolders() {
		if (folders == null) {
			folders = new EObjectContainmentEList<Folder>(Folder.class, this, SystemMetamodelPackage.LAYER_SEGMENT__FOLDERS);
		}
		return folders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectContainmentEList<File>(File.class, this, SystemMetamodelPackage.LAYER_SEGMENT__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Database> getDatabases() {
		if (databases == null) {
			databases = new EObjectContainmentEList<Database>(Database.class, this, SystemMetamodelPackage.LAYER_SEGMENT__DATABASES);
		}
		return databases;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.LAYER_SEGMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemMetamodelPackage.LAYER_SEGMENT__FOLDERS:
				return ((InternalEList<?>)getFolders()).basicRemove(otherEnd, msgs);
			case SystemMetamodelPackage.LAYER_SEGMENT__FILES:
				return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
			case SystemMetamodelPackage.LAYER_SEGMENT__DATABASES:
				return ((InternalEList<?>)getDatabases()).basicRemove(otherEnd, msgs);
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
			case SystemMetamodelPackage.LAYER_SEGMENT__FOLDERS:
				return getFolders();
			case SystemMetamodelPackage.LAYER_SEGMENT__FILES:
				return getFiles();
			case SystemMetamodelPackage.LAYER_SEGMENT__DATABASES:
				return getDatabases();
			case SystemMetamodelPackage.LAYER_SEGMENT__NAME:
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
			case SystemMetamodelPackage.LAYER_SEGMENT__FOLDERS:
				getFolders().clear();
				getFolders().addAll((Collection<? extends Folder>)newValue);
				return;
			case SystemMetamodelPackage.LAYER_SEGMENT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case SystemMetamodelPackage.LAYER_SEGMENT__DATABASES:
				getDatabases().clear();
				getDatabases().addAll((Collection<? extends Database>)newValue);
				return;
			case SystemMetamodelPackage.LAYER_SEGMENT__NAME:
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
			case SystemMetamodelPackage.LAYER_SEGMENT__FOLDERS:
				getFolders().clear();
				return;
			case SystemMetamodelPackage.LAYER_SEGMENT__FILES:
				getFiles().clear();
				return;
			case SystemMetamodelPackage.LAYER_SEGMENT__DATABASES:
				getDatabases().clear();
				return;
			case SystemMetamodelPackage.LAYER_SEGMENT__NAME:
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
			case SystemMetamodelPackage.LAYER_SEGMENT__FOLDERS:
				return folders != null && !folders.isEmpty();
			case SystemMetamodelPackage.LAYER_SEGMENT__FILES:
				return files != null && !files.isEmpty();
			case SystemMetamodelPackage.LAYER_SEGMENT__DATABASES:
				return databases != null && !databases.isEmpty();
			case SystemMetamodelPackage.LAYER_SEGMENT__NAME:
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

} //LayerSegmentImpl
