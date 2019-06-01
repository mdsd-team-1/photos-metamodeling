/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Autenticacion;
import SystemMetamodel.Registro;
import SystemMetamodel.SystemMetamodelPackage;
import SystemMetamodel.Usuario;
import SystemMetamodel.manejoPerfil;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.UsuarioImpl#getIniciarSesion <em>Iniciar Sesion</em>}</li>
 *   <li>{@link SystemMetamodel.impl.UsuarioImpl#getRegistro <em>Registro</em>}</li>
 *   <li>{@link SystemMetamodel.impl.UsuarioImpl#getAdministra <em>Administra</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The cached value of the '{@link #getIniciarSesion() <em>Iniciar Sesion</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIniciarSesion()
	 * @generated
	 * @ordered
	 */
	protected EList<Autenticacion> iniciarSesion;

	/**
	 * The cached value of the '{@link #getRegistro() <em>Registro</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistro()
	 * @generated
	 * @ordered
	 */
	protected EList<Registro> registro;

	/**
	 * The cached value of the '{@link #getAdministra() <em>Administra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministra()
	 * @generated
	 * @ordered
	 */
	protected manejoPerfil administra;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Autenticacion> getIniciarSesion() {
		if (iniciarSesion == null) {
			iniciarSesion = new EObjectResolvingEList<Autenticacion>(Autenticacion.class, this, SystemMetamodelPackage.USUARIO__INICIAR_SESION);
		}
		return iniciarSesion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Registro> getRegistro() {
		if (registro == null) {
			registro = new EObjectResolvingEList<Registro>(Registro.class, this, SystemMetamodelPackage.USUARIO__REGISTRO);
		}
		return registro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public manejoPerfil getAdministra() {
		if (administra != null && administra.eIsProxy()) {
			InternalEObject oldAdministra = (InternalEObject)administra;
			administra = (manejoPerfil)eResolveProxy(oldAdministra);
			if (administra != oldAdministra) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemMetamodelPackage.USUARIO__ADMINISTRA, oldAdministra, administra));
			}
		}
		return administra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public manejoPerfil basicGetAdministra() {
		return administra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdministra(manejoPerfil newAdministra) {
		manejoPerfil oldAdministra = administra;
		administra = newAdministra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.USUARIO__ADMINISTRA, oldAdministra, administra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemMetamodelPackage.USUARIO__INICIAR_SESION:
				return getIniciarSesion();
			case SystemMetamodelPackage.USUARIO__REGISTRO:
				return getRegistro();
			case SystemMetamodelPackage.USUARIO__ADMINISTRA:
				if (resolve) return getAdministra();
				return basicGetAdministra();
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
			case SystemMetamodelPackage.USUARIO__INICIAR_SESION:
				getIniciarSesion().clear();
				getIniciarSesion().addAll((Collection<? extends Autenticacion>)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__REGISTRO:
				getRegistro().clear();
				getRegistro().addAll((Collection<? extends Registro>)newValue);
				return;
			case SystemMetamodelPackage.USUARIO__ADMINISTRA:
				setAdministra((manejoPerfil)newValue);
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
			case SystemMetamodelPackage.USUARIO__INICIAR_SESION:
				getIniciarSesion().clear();
				return;
			case SystemMetamodelPackage.USUARIO__REGISTRO:
				getRegistro().clear();
				return;
			case SystemMetamodelPackage.USUARIO__ADMINISTRA:
				setAdministra((manejoPerfil)null);
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
			case SystemMetamodelPackage.USUARIO__INICIAR_SESION:
				return iniciarSesion != null && !iniciarSesion.isEmpty();
			case SystemMetamodelPackage.USUARIO__REGISTRO:
				return registro != null && !registro.isEmpty();
			case SystemMetamodelPackage.USUARIO__ADMINISTRA:
				return administra != null;
		}
		return super.eIsSet(featureID);
	}

} //UsuarioImpl
