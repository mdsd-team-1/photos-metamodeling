/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.EditarPerfil;
import PhotosMetaModel.Fotos;
import PhotosMetaModel.SystemMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editar Perfil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.EditarPerfilImpl#getEditarPerfil <em>Editar Perfil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditarPerfilImpl extends AccionesImpl implements EditarPerfil {
	/**
	 * The cached value of the '{@link #getEditarPerfil() <em>Editar Perfil</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditarPerfil()
	 * @generated
	 * @ordered
	 */
	protected EList<Fotos> editarPerfil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditarPerfilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.EDITAR_PERFIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fotos> getEditarPerfil() {
		if (editarPerfil == null) {
			editarPerfil = new EObjectResolvingEList<Fotos>(Fotos.class, this, SystemMetamodelPackage.EDITAR_PERFIL__EDITAR_PERFIL);
		}
		return editarPerfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemMetamodelPackage.EDITAR_PERFIL__EDITAR_PERFIL:
				return getEditarPerfil();
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
			case SystemMetamodelPackage.EDITAR_PERFIL__EDITAR_PERFIL:
				getEditarPerfil().clear();
				getEditarPerfil().addAll((Collection<? extends Fotos>)newValue);
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
			case SystemMetamodelPackage.EDITAR_PERFIL__EDITAR_PERFIL:
				getEditarPerfil().clear();
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
			case SystemMetamodelPackage.EDITAR_PERFIL__EDITAR_PERFIL:
				return editarPerfil != null && !editarPerfil.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EditarPerfilImpl
