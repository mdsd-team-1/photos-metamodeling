/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Dominio;
import PhotosMetaModel.Fotos;
import PhotosMetaModel.SystemMetamodelPackage;
import PhotosMetaModel.Usuario;

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
 * An implementation of the model object '<em><b>Dominio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.DominioImpl#getUsuarios <em>Usuarios</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.DominioImpl#getGaleriasFotos <em>Galerias Fotos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DominioImpl extends MinimalEObjectImpl.Container implements Dominio {
	/**
	 * The cached value of the '{@link #getUsuarios() <em>Usuarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Usuario> usuarios;

	/**
	 * The cached value of the '{@link #getGaleriasFotos() <em>Galerias Fotos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGaleriasFotos()
	 * @generated
	 * @ordered
	 */
	protected EList<Fotos> galeriasFotos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DominioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.DOMINIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Usuario> getUsuarios() {
		if (usuarios == null) {
			usuarios = new EObjectContainmentEList<Usuario>(Usuario.class, this, SystemMetamodelPackage.DOMINIO__USUARIOS);
		}
		return usuarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fotos> getGaleriasFotos() {
		if (galeriasFotos == null) {
			galeriasFotos = new EObjectContainmentEList<Fotos>(Fotos.class, this, SystemMetamodelPackage.DOMINIO__GALERIAS_FOTOS);
		}
		return galeriasFotos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemMetamodelPackage.DOMINIO__USUARIOS:
				return ((InternalEList<?>)getUsuarios()).basicRemove(otherEnd, msgs);
			case SystemMetamodelPackage.DOMINIO__GALERIAS_FOTOS:
				return ((InternalEList<?>)getGaleriasFotos()).basicRemove(otherEnd, msgs);
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
			case SystemMetamodelPackage.DOMINIO__USUARIOS:
				return getUsuarios();
			case SystemMetamodelPackage.DOMINIO__GALERIAS_FOTOS:
				return getGaleriasFotos();
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
			case SystemMetamodelPackage.DOMINIO__USUARIOS:
				getUsuarios().clear();
				getUsuarios().addAll((Collection<? extends Usuario>)newValue);
				return;
			case SystemMetamodelPackage.DOMINIO__GALERIAS_FOTOS:
				getGaleriasFotos().clear();
				getGaleriasFotos().addAll((Collection<? extends Fotos>)newValue);
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
			case SystemMetamodelPackage.DOMINIO__USUARIOS:
				getUsuarios().clear();
				return;
			case SystemMetamodelPackage.DOMINIO__GALERIAS_FOTOS:
				getGaleriasFotos().clear();
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
			case SystemMetamodelPackage.DOMINIO__USUARIOS:
				return usuarios != null && !usuarios.isEmpty();
			case SystemMetamodelPackage.DOMINIO__GALERIAS_FOTOS:
				return galeriasFotos != null && !galeriasFotos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DominioImpl
