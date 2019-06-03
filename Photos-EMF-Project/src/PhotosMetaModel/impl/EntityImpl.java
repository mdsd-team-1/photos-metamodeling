/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Entity;
import PhotosMetaModel.NamedNativeQuery;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Table_s;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.EntityImpl#getTable <em>Table</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.EntityImpl#getNamednativequery <em>Namednativequery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected EList<Table_s> table;

	/**
	 * The cached value of the '{@link #getNamednativequery() <em>Namednativequery</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamednativequery()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedNativeQuery> namednativequery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table_s> getTable() {
		if (table == null) {
			table = new EObjectContainmentEList<Table_s>(Table_s.class, this, PhotosMetaModelPackage.ENTITY__TABLE);
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedNativeQuery> getNamednativequery() {
		if (namednativequery == null) {
			namednativequery = new EObjectContainmentEList<NamedNativeQuery>(NamedNativeQuery.class, this, PhotosMetaModelPackage.ENTITY__NAMEDNATIVEQUERY);
		}
		return namednativequery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.ENTITY__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.ENTITY__NAMEDNATIVEQUERY:
				return ((InternalEList<?>)getNamednativequery()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.ENTITY__TABLE:
				return getTable();
			case PhotosMetaModelPackage.ENTITY__NAMEDNATIVEQUERY:
				return getNamednativequery();
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
			case PhotosMetaModelPackage.ENTITY__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends Table_s>)newValue);
				return;
			case PhotosMetaModelPackage.ENTITY__NAMEDNATIVEQUERY:
				getNamednativequery().clear();
				getNamednativequery().addAll((Collection<? extends NamedNativeQuery>)newValue);
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
			case PhotosMetaModelPackage.ENTITY__TABLE:
				getTable().clear();
				return;
			case PhotosMetaModelPackage.ENTITY__NAMEDNATIVEQUERY:
				getNamednativequery().clear();
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
			case PhotosMetaModelPackage.ENTITY__TABLE:
				return table != null && !table.isEmpty();
			case PhotosMetaModelPackage.ENTITY__NAMEDNATIVEQUERY:
				return namednativequery != null && !namednativequery.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
