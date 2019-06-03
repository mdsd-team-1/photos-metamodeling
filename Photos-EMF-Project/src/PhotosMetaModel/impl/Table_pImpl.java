/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Column_p;
import PhotosMetaModel.ForeignKey;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Row;
import PhotosMetaModel.Table_p;

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
 * An implementation of the model object '<em><b>Table p</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.Table_pImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.Table_pImpl#getRow <em>Row</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.Table_pImpl#getForeignkey <em>Foreignkey</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.Table_pImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.Table_pImpl#getInherit <em>Inherit</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.Table_pImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Table_pImpl extends MinimalEObjectImpl.Container implements Table_p {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column_p> column;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> row;

	/**
	 * The cached value of the '{@link #getForeignkey() <em>Foreignkey</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignkey()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> foreignkey;

	/**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Column_p> primaryKey;

	/**
	 * The cached value of the '{@link #getInherit() <em>Inherit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInherit()
	 * @generated
	 * @ordered
	 */
	protected Table_p inherit;

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
	protected Table_pImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.TABLE_P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column_p> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<Column_p>(Column_p.class, this, PhotosMetaModelPackage.TABLE_P__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Row> getRow() {
		if (row == null) {
			row = new EObjectContainmentEList<Row>(Row.class, this, PhotosMetaModelPackage.TABLE_P__ROW);
		}
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ForeignKey> getForeignkey() {
		if (foreignkey == null) {
			foreignkey = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, PhotosMetaModelPackage.TABLE_P__FOREIGNKEY);
		}
		return foreignkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column_p> getPrimaryKey() {
		if (primaryKey == null) {
			primaryKey = new EObjectContainmentEList<Column_p>(Column_p.class, this, PhotosMetaModelPackage.TABLE_P__PRIMARY_KEY);
		}
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table_p getInherit() {
		if (inherit != null && inherit.eIsProxy()) {
			InternalEObject oldInherit = (InternalEObject)inherit;
			inherit = (Table_p)eResolveProxy(oldInherit);
			if (inherit != oldInherit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.TABLE_P__INHERIT, oldInherit, inherit));
			}
		}
		return inherit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table_p basicGetInherit() {
		return inherit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInherit(Table_p newInherit) {
		Table_p oldInherit = inherit;
		inherit = newInherit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TABLE_P__INHERIT, oldInherit, inherit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TABLE_P__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.TABLE_P__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.TABLE_P__ROW:
				return ((InternalEList<?>)getRow()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.TABLE_P__FOREIGNKEY:
				return ((InternalEList<?>)getForeignkey()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.TABLE_P__PRIMARY_KEY:
				return ((InternalEList<?>)getPrimaryKey()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.TABLE_P__COLUMN:
				return getColumn();
			case PhotosMetaModelPackage.TABLE_P__ROW:
				return getRow();
			case PhotosMetaModelPackage.TABLE_P__FOREIGNKEY:
				return getForeignkey();
			case PhotosMetaModelPackage.TABLE_P__PRIMARY_KEY:
				return getPrimaryKey();
			case PhotosMetaModelPackage.TABLE_P__INHERIT:
				if (resolve) return getInherit();
				return basicGetInherit();
			case PhotosMetaModelPackage.TABLE_P__NAME:
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
			case PhotosMetaModelPackage.TABLE_P__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column_p>)newValue);
				return;
			case PhotosMetaModelPackage.TABLE_P__ROW:
				getRow().clear();
				getRow().addAll((Collection<? extends Row>)newValue);
				return;
			case PhotosMetaModelPackage.TABLE_P__FOREIGNKEY:
				getForeignkey().clear();
				getForeignkey().addAll((Collection<? extends ForeignKey>)newValue);
				return;
			case PhotosMetaModelPackage.TABLE_P__PRIMARY_KEY:
				getPrimaryKey().clear();
				getPrimaryKey().addAll((Collection<? extends Column_p>)newValue);
				return;
			case PhotosMetaModelPackage.TABLE_P__INHERIT:
				setInherit((Table_p)newValue);
				return;
			case PhotosMetaModelPackage.TABLE_P__NAME:
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
			case PhotosMetaModelPackage.TABLE_P__COLUMN:
				getColumn().clear();
				return;
			case PhotosMetaModelPackage.TABLE_P__ROW:
				getRow().clear();
				return;
			case PhotosMetaModelPackage.TABLE_P__FOREIGNKEY:
				getForeignkey().clear();
				return;
			case PhotosMetaModelPackage.TABLE_P__PRIMARY_KEY:
				getPrimaryKey().clear();
				return;
			case PhotosMetaModelPackage.TABLE_P__INHERIT:
				setInherit((Table_p)null);
				return;
			case PhotosMetaModelPackage.TABLE_P__NAME:
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
			case PhotosMetaModelPackage.TABLE_P__COLUMN:
				return column != null && !column.isEmpty();
			case PhotosMetaModelPackage.TABLE_P__ROW:
				return row != null && !row.isEmpty();
			case PhotosMetaModelPackage.TABLE_P__FOREIGNKEY:
				return foreignkey != null && !foreignkey.isEmpty();
			case PhotosMetaModelPackage.TABLE_P__PRIMARY_KEY:
				return primaryKey != null && !primaryKey.isEmpty();
			case PhotosMetaModelPackage.TABLE_P__INHERIT:
				return inherit != null;
			case PhotosMetaModelPackage.TABLE_P__NAME:
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

} //Table_pImpl
