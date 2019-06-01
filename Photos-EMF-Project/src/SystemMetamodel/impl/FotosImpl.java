/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Categoria;
import SystemMetamodel.Fotos;
import SystemMetamodel.Imagen;
import SystemMetamodel.SystemMetamodelPackage;

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
 * An implementation of the model object '<em><b>Fotos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.FotosImpl#getCategorias <em>Categorias</em>}</li>
 *   <li>{@link SystemMetamodel.impl.FotosImpl#getImagenes <em>Imagenes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FotosImpl extends MinimalEObjectImpl.Container implements Fotos {
	/**
	 * The cached value of the '{@link #getCategorias() <em>Categorias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorias()
	 * @generated
	 * @ordered
	 */
	protected EList<Categoria> categorias;

	/**
	 * The cached value of the '{@link #getImagenes() <em>Imagenes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagenes()
	 * @generated
	 * @ordered
	 */
	protected EList<Imagen> imagenes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FotosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.FOTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Categoria> getCategorias() {
		if (categorias == null) {
			categorias = new EObjectContainmentEList<Categoria>(Categoria.class, this, SystemMetamodelPackage.FOTOS__CATEGORIAS);
		}
		return categorias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Imagen> getImagenes() {
		if (imagenes == null) {
			imagenes = new EObjectContainmentEList<Imagen>(Imagen.class, this, SystemMetamodelPackage.FOTOS__IMAGENES);
		}
		return imagenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemMetamodelPackage.FOTOS__CATEGORIAS:
				return ((InternalEList<?>)getCategorias()).basicRemove(otherEnd, msgs);
			case SystemMetamodelPackage.FOTOS__IMAGENES:
				return ((InternalEList<?>)getImagenes()).basicRemove(otherEnd, msgs);
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
			case SystemMetamodelPackage.FOTOS__CATEGORIAS:
				return getCategorias();
			case SystemMetamodelPackage.FOTOS__IMAGENES:
				return getImagenes();
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
			case SystemMetamodelPackage.FOTOS__CATEGORIAS:
				getCategorias().clear();
				getCategorias().addAll((Collection<? extends Categoria>)newValue);
				return;
			case SystemMetamodelPackage.FOTOS__IMAGENES:
				getImagenes().clear();
				getImagenes().addAll((Collection<? extends Imagen>)newValue);
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
			case SystemMetamodelPackage.FOTOS__CATEGORIAS:
				getCategorias().clear();
				return;
			case SystemMetamodelPackage.FOTOS__IMAGENES:
				getImagenes().clear();
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
			case SystemMetamodelPackage.FOTOS__CATEGORIAS:
				return categorias != null && !categorias.isEmpty();
			case SystemMetamodelPackage.FOTOS__IMAGENES:
				return imagenes != null && !imagenes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FotosImpl
