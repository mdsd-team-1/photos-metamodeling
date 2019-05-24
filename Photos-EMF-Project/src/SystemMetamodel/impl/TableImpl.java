/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Column;
import SystemMetamodel.ForeignKey;
import SystemMetamodel.SystemMetamodelPackage;
import SystemMetamodel.Table;

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
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link SystemMetamodel.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link SystemMetamodel.impl.TableImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link SystemMetamodel.impl.TableImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected Column primaryKey;

	/**
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> foreignKeys;

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
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, SystemMetamodelPackage.TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Column getPrimaryKey() {
		if (primaryKey != null && primaryKey.eIsProxy()) {
			InternalEObject oldPrimaryKey = (InternalEObject)primaryKey;
			primaryKey = (Column)eResolveProxy(oldPrimaryKey);
			if (primaryKey != oldPrimaryKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemMetamodelPackage.TABLE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
			}
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetPrimaryKey() {
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKey(Column newPrimaryKey) {
		Column oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.TABLE__PRIMARY_KEY, oldPrimaryKey, primaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignKey> getForeignKeys() {
		if (foreignKeys == null) {
			foreignKeys = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, SystemMetamodelPackage.TABLE__FOREIGN_KEYS);
		}
		return foreignKeys;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemMetamodelPackage.TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case SystemMetamodelPackage.TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
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
			case SystemMetamodelPackage.TABLE__COLUMNS:
				return getColumns();
			case SystemMetamodelPackage.TABLE__PRIMARY_KEY:
				if (resolve) return getPrimaryKey();
				return basicGetPrimaryKey();
			case SystemMetamodelPackage.TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case SystemMetamodelPackage.TABLE__NAME:
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
			case SystemMetamodelPackage.TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case SystemMetamodelPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((Column)newValue);
				return;
			case SystemMetamodelPackage.TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case SystemMetamodelPackage.TABLE__NAME:
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
			case SystemMetamodelPackage.TABLE__COLUMNS:
				getColumns().clear();
				return;
			case SystemMetamodelPackage.TABLE__PRIMARY_KEY:
				setPrimaryKey((Column)null);
				return;
			case SystemMetamodelPackage.TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case SystemMetamodelPackage.TABLE__NAME:
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
			case SystemMetamodelPackage.TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case SystemMetamodelPackage.TABLE__PRIMARY_KEY:
				return primaryKey != null;
			case SystemMetamodelPackage.TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case SystemMetamodelPackage.TABLE__NAME:
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

} //TableImpl
