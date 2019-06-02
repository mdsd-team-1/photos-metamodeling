/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Categoria;
import PhotosMetaModel.SystemMetamodelPackage;
import PhotosMetaModel.VisualizarAlbumes;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visualizar Albumes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.VisualizarAlbumesImpl#getVisualizarCategoria <em>Visualizar Categoria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualizarAlbumesImpl extends AccionesImpl implements VisualizarAlbumes {
	/**
	 * The cached value of the '{@link #getVisualizarCategoria() <em>Visualizar Categoria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizarCategoria()
	 * @generated
	 * @ordered
	 */
	protected EList<Categoria> visualizarCategoria;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizarAlbumesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.VISUALIZAR_ALBUMES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Categoria> getVisualizarCategoria() {
		if (visualizarCategoria == null) {
			visualizarCategoria = new EObjectResolvingEList<Categoria>(Categoria.class, this, SystemMetamodelPackage.VISUALIZAR_ALBUMES__VISUALIZAR_CATEGORIA);
		}
		return visualizarCategoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemMetamodelPackage.VISUALIZAR_ALBUMES__VISUALIZAR_CATEGORIA:
				return getVisualizarCategoria();
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
			case SystemMetamodelPackage.VISUALIZAR_ALBUMES__VISUALIZAR_CATEGORIA:
				getVisualizarCategoria().clear();
				getVisualizarCategoria().addAll((Collection<? extends Categoria>)newValue);
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
			case SystemMetamodelPackage.VISUALIZAR_ALBUMES__VISUALIZAR_CATEGORIA:
				getVisualizarCategoria().clear();
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
			case SystemMetamodelPackage.VISUALIZAR_ALBUMES__VISUALIZAR_CATEGORIA:
				return visualizarCategoria != null && !visualizarCategoria.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VisualizarAlbumesImpl
