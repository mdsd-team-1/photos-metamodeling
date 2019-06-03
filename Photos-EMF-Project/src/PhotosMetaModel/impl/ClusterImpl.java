/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Cluster;
import PhotosMetaModel.Database;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.User_p;

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
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.ClusterImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ClusterImpl#getUser_postgresql <em>User postgresql</em>}</li>
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
	 * The cached value of the '{@link #getUser_postgresql() <em>User postgresql</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_postgresql()
	 * @generated
	 * @ordered
	 */
	protected User_p user_postgresql;

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
	public User_p getUser_postgresql() {
		if (user_postgresql != null && user_postgresql.eIsProxy()) {
			InternalEObject oldUser_postgresql = (InternalEObject)user_postgresql;
			user_postgresql = (User_p)eResolveProxy(oldUser_postgresql);
			if (user_postgresql != oldUser_postgresql) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CLUSTER__USER_POSTGRESQL, oldUser_postgresql, user_postgresql));
			}
		}
		return user_postgresql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User_p basicGetUser_postgresql() {
		return user_postgresql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser_postgresql(User_p newUser_postgresql) {
		User_p oldUser_postgresql = user_postgresql;
		user_postgresql = newUser_postgresql;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CLUSTER__USER_POSTGRESQL, oldUser_postgresql, user_postgresql));
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
			case PhotosMetaModelPackage.CLUSTER__USER_POSTGRESQL:
				if (resolve) return getUser_postgresql();
				return basicGetUser_postgresql();
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
			case PhotosMetaModelPackage.CLUSTER__USER_POSTGRESQL:
				setUser_postgresql((User_p)newValue);
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
			case PhotosMetaModelPackage.CLUSTER__USER_POSTGRESQL:
				setUser_postgresql((User_p)null);
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
			case PhotosMetaModelPackage.CLUSTER__USER_POSTGRESQL:
				return user_postgresql != null;
		}
		return super.eIsSet(featureID);
	}

} //ClusterImpl
