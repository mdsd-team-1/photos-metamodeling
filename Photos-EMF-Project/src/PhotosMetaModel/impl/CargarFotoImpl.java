/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.CargarFoto;
import PhotosMetaModel.Imagen;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cargar Foto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.CargarFotoImpl#getImagen <em>Imagen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CargarFotoImpl extends AccionImpl implements CargarFoto {
	/**
	 * The cached value of the '{@link #getImagen() <em>Imagen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagen()
	 * @generated
	 * @ordered
	 */
	protected Imagen imagen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CargarFotoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.CARGAR_FOTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imagen getImagen() {
		if (imagen != null && imagen.eIsProxy()) {
			InternalEObject oldImagen = (InternalEObject)imagen;
			imagen = (Imagen)eResolveProxy(oldImagen);
			if (imagen != oldImagen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.CARGAR_FOTO__IMAGEN, oldImagen, imagen));
			}
		}
		return imagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imagen basicGetImagen() {
		return imagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagen(Imagen newImagen) {
		Imagen oldImagen = imagen;
		imagen = newImagen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.CARGAR_FOTO__IMAGEN, oldImagen, imagen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.CARGAR_FOTO__IMAGEN:
				if (resolve) return getImagen();
				return basicGetImagen();
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
			case PhotosMetaModelPackage.CARGAR_FOTO__IMAGEN:
				setImagen((Imagen)newValue);
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
			case PhotosMetaModelPackage.CARGAR_FOTO__IMAGEN:
				setImagen((Imagen)null);
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
			case PhotosMetaModelPackage.CARGAR_FOTO__IMAGEN:
				return imagen != null;
		}
		return super.eIsSet(featureID);
	}

} //CargarFotoImpl
