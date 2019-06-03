/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Capa;
import PhotosMetaModel.Conexion;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conexion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.ConexionImpl#getConexionSource <em>Conexion Source</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.ConexionImpl#getConexionTarget <em>Conexion Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConexionImpl extends MinimalEObjectImpl.Container implements Conexion {
	/**
	 * The cached value of the '{@link #getConexionSource() <em>Conexion Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConexionSource()
	 * @generated
	 * @ordered
	 */
	protected Capa conexionSource;

	/**
	 * The cached value of the '{@link #getConexionTarget() <em>Conexion Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConexionTarget()
	 * @generated
	 * @ordered
	 */
	protected Capa conexionTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConexionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.CONEXION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capa getConexionSource() {
		if (conexionSource != null && conexionSource.eIsProxy()) {
			InternalEObject oldConexionSource = (InternalEObject)conexionSource;
			conexionSource = (Capa)eResolveProxy(oldConexionSource);
			if (conexionSource != oldConexionSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CONEXION__CONEXION_SOURCE, oldConexionSource, conexionSource));
			}
		}
		return conexionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capa basicGetConexionSource() {
		return conexionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConexionSource(Capa newConexionSource) {
		Capa oldConexionSource = conexionSource;
		conexionSource = newConexionSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONEXION__CONEXION_SOURCE, oldConexionSource, conexionSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capa getConexionTarget() {
		if (conexionTarget != null && conexionTarget.eIsProxy()) {
			InternalEObject oldConexionTarget = (InternalEObject)conexionTarget;
			conexionTarget = (Capa)eResolveProxy(oldConexionTarget);
			if (conexionTarget != oldConexionTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CONEXION__CONEXION_TARGET, oldConexionTarget, conexionTarget));
			}
		}
		return conexionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capa basicGetConexionTarget() {
		return conexionTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConexionTarget(Capa newConexionTarget) {
		Capa oldConexionTarget = conexionTarget;
		conexionTarget = newConexionTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CONEXION__CONEXION_TARGET, oldConexionTarget, conexionTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.CONEXION__CONEXION_SOURCE:
				if (resolve) return getConexionSource();
				return basicGetConexionSource();
			case PhotosMetaModelPackage.CONEXION__CONEXION_TARGET:
				if (resolve) return getConexionTarget();
				return basicGetConexionTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhotosMetaModelPackage.CONEXION__CONEXION_SOURCE:
				setConexionSource((Capa)newValue);
				return;
			case PhotosMetaModelPackage.CONEXION__CONEXION_TARGET:
				setConexionTarget((Capa)newValue);
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
			case PhotosMetaModelPackage.CONEXION__CONEXION_SOURCE:
				setConexionSource((Capa)null);
				return;
			case PhotosMetaModelPackage.CONEXION__CONEXION_TARGET:
				setConexionTarget((Capa)null);
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
			case PhotosMetaModelPackage.CONEXION__CONEXION_SOURCE:
				return conexionSource != null;
			case PhotosMetaModelPackage.CONEXION__CONEXION_TARGET:
				return conexionTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //ConexionImpl
