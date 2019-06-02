/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Categoria;
import PhotosMetaModel.CrearAlbumes;
import PhotosMetaModel.SystemMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crear Albumes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.CrearAlbumesImpl#getCrearCategoria <em>Crear Categoria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrearAlbumesImpl extends AccionesImpl implements CrearAlbumes {
	/**
	 * The cached value of the '{@link #getCrearCategoria() <em>Crear Categoria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrearCategoria()
	 * @generated
	 * @ordered
	 */
	protected EList<Categoria> crearCategoria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrearAlbumesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.CREAR_ALBUMES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Categoria> getCrearCategoria() {
		if (crearCategoria == null) {
			crearCategoria = new EObjectResolvingEList<Categoria>(Categoria.class, this, SystemMetamodelPackage.CREAR_ALBUMES__CREAR_CATEGORIA);
		}
		return crearCategoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemMetamodelPackage.CREAR_ALBUMES__CREAR_CATEGORIA:
				return getCrearCategoria();
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
			case SystemMetamodelPackage.CREAR_ALBUMES__CREAR_CATEGORIA:
				getCrearCategoria().clear();
				getCrearCategoria().addAll((Collection<? extends Categoria>)newValue);
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
			case SystemMetamodelPackage.CREAR_ALBUMES__CREAR_CATEGORIA:
				getCrearCategoria().clear();
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
			case SystemMetamodelPackage.CREAR_ALBUMES__CREAR_CATEGORIA:
				return crearCategoria != null && !crearCategoria.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CrearAlbumesImpl
