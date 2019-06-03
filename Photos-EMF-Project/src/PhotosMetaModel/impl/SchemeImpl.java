/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Function_p;
import PhotosMetaModel.Index_p;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Scheme;
import PhotosMetaModel.Table_p;
import PhotosMetaModel.Trigger;
import PhotosMetaModel.View;

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
 * An implementation of the model object '<em><b>Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.SchemeImpl#getTable_postgresql <em>Table postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SchemeImpl#getView_postgresql <em>View postgresql</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SchemeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SchemeImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SchemeImpl#getStoredprocedure <em>Storedprocedure</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.SchemeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemeImpl extends MinimalEObjectImpl.Container implements Scheme {
	/**
	 * The cached value of the '{@link #getTable_postgresql() <em>Table postgresql</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable_postgresql()
	 * @generated
	 * @ordered
	 */
	protected EList<Table_p> table_postgresql;

	/**
	 * The cached value of the '{@link #getView_postgresql() <em>View postgresql</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView_postgresql()
	 * @generated
	 * @ordered
	 */
	protected EList<View> view_postgresql;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Index_p> index;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

	/**
	 * The cached value of the '{@link #getStoredprocedure() <em>Storedprocedure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoredprocedure()
	 * @generated
	 * @ordered
	 */
	protected EList<Function_p> storedprocedure;

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
	protected SchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.SCHEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Table_p> getTable_postgresql() {
		if (table_postgresql == null) {
			table_postgresql = new EObjectContainmentEList<Table_p>(Table_p.class, this, PhotosMetaModelPackage.SCHEME__TABLE_POSTGRESQL);
		}
		return table_postgresql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<View> getView_postgresql() {
		if (view_postgresql == null) {
			view_postgresql = new EObjectContainmentEList<View>(View.class, this, PhotosMetaModelPackage.SCHEME__VIEW_POSTGRESQL);
		}
		return view_postgresql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Index_p> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<Index_p>(Index_p.class, this, PhotosMetaModelPackage.SCHEME__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, PhotosMetaModelPackage.SCHEME__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Function_p> getStoredprocedure() {
		if (storedprocedure == null) {
			storedprocedure = new EObjectContainmentEList<Function_p>(Function_p.class, this, PhotosMetaModelPackage.SCHEME__STOREDPROCEDURE);
		}
		return storedprocedure;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.SCHEME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.SCHEME__TABLE_POSTGRESQL:
				return ((InternalEList<?>)getTable_postgresql()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SCHEME__VIEW_POSTGRESQL:
				return ((InternalEList<?>)getView_postgresql()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SCHEME__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SCHEME__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.SCHEME__STOREDPROCEDURE:
				return ((InternalEList<?>)getStoredprocedure()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.SCHEME__TABLE_POSTGRESQL:
				return getTable_postgresql();
			case PhotosMetaModelPackage.SCHEME__VIEW_POSTGRESQL:
				return getView_postgresql();
			case PhotosMetaModelPackage.SCHEME__INDEX:
				return getIndex();
			case PhotosMetaModelPackage.SCHEME__TRIGGER:
				return getTrigger();
			case PhotosMetaModelPackage.SCHEME__STOREDPROCEDURE:
				return getStoredprocedure();
			case PhotosMetaModelPackage.SCHEME__NAME:
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
			case PhotosMetaModelPackage.SCHEME__TABLE_POSTGRESQL:
				getTable_postgresql().clear();
				getTable_postgresql().addAll((Collection<? extends Table_p>)newValue);
				return;
			case PhotosMetaModelPackage.SCHEME__VIEW_POSTGRESQL:
				getView_postgresql().clear();
				getView_postgresql().addAll((Collection<? extends View>)newValue);
				return;
			case PhotosMetaModelPackage.SCHEME__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Index_p>)newValue);
				return;
			case PhotosMetaModelPackage.SCHEME__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case PhotosMetaModelPackage.SCHEME__STOREDPROCEDURE:
				getStoredprocedure().clear();
				getStoredprocedure().addAll((Collection<? extends Function_p>)newValue);
				return;
			case PhotosMetaModelPackage.SCHEME__NAME:
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
			case PhotosMetaModelPackage.SCHEME__TABLE_POSTGRESQL:
				getTable_postgresql().clear();
				return;
			case PhotosMetaModelPackage.SCHEME__VIEW_POSTGRESQL:
				getView_postgresql().clear();
				return;
			case PhotosMetaModelPackage.SCHEME__INDEX:
				getIndex().clear();
				return;
			case PhotosMetaModelPackage.SCHEME__TRIGGER:
				getTrigger().clear();
				return;
			case PhotosMetaModelPackage.SCHEME__STOREDPROCEDURE:
				getStoredprocedure().clear();
				return;
			case PhotosMetaModelPackage.SCHEME__NAME:
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
			case PhotosMetaModelPackage.SCHEME__TABLE_POSTGRESQL:
				return table_postgresql != null && !table_postgresql.isEmpty();
			case PhotosMetaModelPackage.SCHEME__VIEW_POSTGRESQL:
				return view_postgresql != null && !view_postgresql.isEmpty();
			case PhotosMetaModelPackage.SCHEME__INDEX:
				return index != null && !index.isEmpty();
			case PhotosMetaModelPackage.SCHEME__TRIGGER:
				return trigger != null && !trigger.isEmpty();
			case PhotosMetaModelPackage.SCHEME__STOREDPROCEDURE:
				return storedprocedure != null && !storedprocedure.isEmpty();
			case PhotosMetaModelPackage.SCHEME__NAME:
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

} //SchemeImpl
