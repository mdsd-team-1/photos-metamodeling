/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Categoria;
import PhotosMetaModel.Foto;
import PhotosMetaModel.Imagen;
import PhotosMetaModel.PhotosMetaModelPackage;

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
 * An implementation of the model object '<em><b>Foto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.FotoImpl#getCategoria <em>Categoria</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.FotoImpl#getImagen <em>Imagen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FotoImpl extends MinimalEObjectImpl.Container implements Foto {
	/**
	 * The cached value of the '{@link #getCategoria() <em>Categoria</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoria()
	 * @generated
	 * @ordered
	 */
	protected EList<Categoria> categoria;

	/**
	 * The cached value of the '{@link #getImagen() <em>Imagen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagen()
	 * @generated
	 * @ordered
	 */
	protected EList<Imagen> imagen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FotoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.FOTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Categoria> getCategoria() {
		if (categoria == null) {
			categoria = new EObjectContainmentEList<Categoria>(Categoria.class, this, PhotosMetaModelPackage.FOTO__CATEGORIA);
		}
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Imagen> getImagen() {
		if (imagen == null) {
			imagen = new EObjectContainmentEList<Imagen>(Imagen.class, this, PhotosMetaModelPackage.FOTO__IMAGEN);
		}
		return imagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.FOTO__CATEGORIA:
				return ((InternalEList<?>)getCategoria()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.FOTO__IMAGEN:
				return ((InternalEList<?>)getImagen()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.FOTO__CATEGORIA:
				return getCategoria();
			case PhotosMetaModelPackage.FOTO__IMAGEN:
				return getImagen();
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
			case PhotosMetaModelPackage.FOTO__CATEGORIA:
				getCategoria().clear();
				getCategoria().addAll((Collection<? extends Categoria>)newValue);
				return;
			case PhotosMetaModelPackage.FOTO__IMAGEN:
				getImagen().clear();
				getImagen().addAll((Collection<? extends Imagen>)newValue);
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
			case PhotosMetaModelPackage.FOTO__CATEGORIA:
				getCategoria().clear();
				return;
			case PhotosMetaModelPackage.FOTO__IMAGEN:
				getImagen().clear();
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
			case PhotosMetaModelPackage.FOTO__CATEGORIA:
				return categoria != null && !categoria.isEmpty();
			case PhotosMetaModelPackage.FOTO__IMAGEN:
				return imagen != null && !imagen.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FotoImpl
