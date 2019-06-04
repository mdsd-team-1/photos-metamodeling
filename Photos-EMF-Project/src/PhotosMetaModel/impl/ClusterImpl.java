/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Cluster;
import PhotosMetaModel.Database;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.User_p;

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
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.ClusterImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ClusterImpl#getUser_p <em>User p</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends MinimalEObjectImpl.Container implements Cluster {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> database;

	/**
	 * The cached value of the '{@link #getUser_p() <em>User p</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_p()
	 * @generated
	 * @ordered
	 */
	protected EList<User_p> user_p;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Database> getDatabase() {
		if (database == null) {
			database = new EObjectContainmentEList<Database>(Database.class, this, PhotosMetaModelPackage.CLUSTER__DATABASE);
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User_p> getUser_p() {
		if (user_p == null) {
			user_p = new EObjectContainmentEList<User_p>(User_p.class, this, PhotosMetaModelPackage.CLUSTER__USER_P);
		}
		return user_p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.CLUSTER__DATABASE:
				return ((InternalEList<?>)getDatabase()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.CLUSTER__USER_P:
				return ((InternalEList<?>)getUser_p()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.CLUSTER__DATABASE:
				return getDatabase();
			case PhotosMetaModelPackage.CLUSTER__USER_P:
				return getUser_p();
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
			case PhotosMetaModelPackage.CLUSTER__DATABASE:
				getDatabase().clear();
				getDatabase().addAll((Collection<? extends Database>)newValue);
				return;
			case PhotosMetaModelPackage.CLUSTER__USER_P:
				getUser_p().clear();
				getUser_p().addAll((Collection<? extends User_p>)newValue);
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
			case PhotosMetaModelPackage.CLUSTER__DATABASE:
				getDatabase().clear();
				return;
			case PhotosMetaModelPackage.CLUSTER__USER_P:
				getUser_p().clear();
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
			case PhotosMetaModelPackage.CLUSTER__DATABASE:
				return database != null && !database.isEmpty();
			case PhotosMetaModelPackage.CLUSTER__USER_P:
				return user_p != null && !user_p.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClusterImpl
