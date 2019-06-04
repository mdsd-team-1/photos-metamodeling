/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Column_s;
import PhotosMetaModel.Id;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Table_s;

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
 * An implementation of the model object '<em><b>Table s</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.Table_sImpl#getColumn_s <em>Column s</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.Table_sImpl#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.Table_sImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Table_sImpl extends MinimalEObjectImpl.Container implements Table_s {
	/**
	 * The cached value of the '{@link #getColumn_s() <em>Column s</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn_s()
	 * @generated
	 * @ordered
	 */
	protected EList<Column_s> column_s;

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
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Id id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Table_sImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.TABLE_S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column_s> getColumn_s() {
		if (column_s == null) {
			column_s = new EObjectContainmentEList<Column_s>(Column_s.class, this, PhotosMetaModelPackage.TABLE_S__COLUMN_S);
		}
		return column_s;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TABLE_S__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Id getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(Id newId, NotificationChain msgs) {
		Id oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TABLE_S__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Id newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TABLE_S__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotosMetaModelPackage.TABLE_S__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.TABLE_S__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.TABLE_S__COLUMN_S:
				return ((InternalEList<?>)getColumn_s()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.TABLE_S__ID:
				return basicSetId(null, msgs);
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
			case PhotosMetaModelPackage.TABLE_S__COLUMN_S:
				return getColumn_s();
			case PhotosMetaModelPackage.TABLE_S__NAME:
				return getName();
			case PhotosMetaModelPackage.TABLE_S__ID:
				return getId();
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
			case PhotosMetaModelPackage.TABLE_S__COLUMN_S:
				getColumn_s().clear();
				getColumn_s().addAll((Collection<? extends Column_s>)newValue);
				return;
			case PhotosMetaModelPackage.TABLE_S__NAME:
				setName((String)newValue);
				return;
			case PhotosMetaModelPackage.TABLE_S__ID:
				setId((Id)newValue);
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
			case PhotosMetaModelPackage.TABLE_S__COLUMN_S:
				getColumn_s().clear();
				return;
			case PhotosMetaModelPackage.TABLE_S__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PhotosMetaModelPackage.TABLE_S__ID:
				setId((Id)null);
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
			case PhotosMetaModelPackage.TABLE_S__COLUMN_S:
				return column_s != null && !column_s.isEmpty();
			case PhotosMetaModelPackage.TABLE_S__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PhotosMetaModelPackage.TABLE_S__ID:
				return id != null;
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

} //Table_sImpl
