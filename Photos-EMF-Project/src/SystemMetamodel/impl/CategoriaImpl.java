/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Categoria;
import SystemMetamodel.Imagen;
import SystemMetamodel.SystemMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categoria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.CategoriaImpl#getTienenImagenes <em>Tienen Imagenes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoriaImpl extends MinimalEObjectImpl.Container implements Categoria {
	/**
	 * The cached value of the '{@link #getTienenImagenes() <em>Tienen Imagenes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTienenImagenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Imagen> tienenImagenes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.CATEGORIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Imagen> getTienenImagenes() {
		if (tienenImagenes == null) {
			tienenImagenes = new EObjectResolvingEList<Imagen>(Imagen.class, this, SystemMetamodelPackage.CATEGORIA__TIENEN_IMAGENES);
		}
		return tienenImagenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemMetamodelPackage.CATEGORIA__TIENEN_IMAGENES:
				return getTienenImagenes();
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
			case SystemMetamodelPackage.CATEGORIA__TIENEN_IMAGENES:
				getTienenImagenes().clear();
				getTienenImagenes().addAll((Collection<? extends Imagen>)newValue);
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
			case SystemMetamodelPackage.CATEGORIA__TIENEN_IMAGENES:
				getTienenImagenes().clear();
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
			case SystemMetamodelPackage.CATEGORIA__TIENEN_IMAGENES:
				return tienenImagenes != null && !tienenImagenes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoriaImpl
