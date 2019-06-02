/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.CargarFotos;
import PhotosMetaModel.Imagen;
import PhotosMetaModel.SystemMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cargar Fotos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.CargarFotosImpl#getCargarImagen <em>Cargar Imagen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CargarFotosImpl extends AccionesImpl implements CargarFotos {
	/**
	 * The cached value of the '{@link #getCargarImagen() <em>Cargar Imagen</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargarImagen()
	 * @generated
	 * @ordered
	 */
	protected EList<Imagen> cargarImagen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CargarFotosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.CARGAR_FOTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Imagen> getCargarImagen() {
		if (cargarImagen == null) {
			cargarImagen = new EObjectResolvingEList<Imagen>(Imagen.class, this, SystemMetamodelPackage.CARGAR_FOTOS__CARGAR_IMAGEN);
		}
		return cargarImagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemMetamodelPackage.CARGAR_FOTOS__CARGAR_IMAGEN:
				return getCargarImagen();
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
			case SystemMetamodelPackage.CARGAR_FOTOS__CARGAR_IMAGEN:
				getCargarImagen().clear();
				getCargarImagen().addAll((Collection<? extends Imagen>)newValue);
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
			case SystemMetamodelPackage.CARGAR_FOTOS__CARGAR_IMAGEN:
				getCargarImagen().clear();
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
			case SystemMetamodelPackage.CARGAR_FOTOS__CARGAR_IMAGEN:
				return cargarImagen != null && !cargarImagen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CargarFotosImpl
