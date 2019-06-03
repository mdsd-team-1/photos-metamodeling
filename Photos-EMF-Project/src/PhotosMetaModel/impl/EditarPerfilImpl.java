/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.EditarPerfil;
import PhotosMetaModel.Foto;
import PhotosMetaModel.PhotosMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Editar Perfil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.EditarPerfilImpl#getFoto <em>Foto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EditarPerfilImpl extends AccionImpl implements EditarPerfil {
	/**
	 * The cached value of the '{@link #getFoto() <em>Foto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoto()
	 * @generated
	 * @ordered
	 */
	protected Foto foto;

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
		return PhotosMetaModelPackage.Literals.EDITAR_PERFIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foto getFoto() {
		if (foto != null && foto.eIsProxy()) {
			InternalEObject oldFoto = (InternalEObject)foto;
			foto = (Foto)eResolveProxy(oldFoto);
			if (foto != oldFoto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PhotosMetaModelPackage.EDITAR_PERFIL__FOTO, oldFoto, foto));
			}
		}
		return foto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foto basicGetFoto() {
		return foto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFoto(Foto newFoto) {
		Foto oldFoto = foto;
		foto = newFoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotosMetaModelPackage.EDITAR_PERFIL__FOTO, oldFoto, foto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotosMetaModelPackage.EDITAR_PERFIL__FOTO:
				if (resolve) return getFoto();
				return basicGetFoto();
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
			case PhotosMetaModelPackage.EDITAR_PERFIL__FOTO:
				setFoto((Foto)newValue);
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
			case PhotosMetaModelPackage.EDITAR_PERFIL__FOTO:
				setFoto((Foto)null);
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
			case PhotosMetaModelPackage.EDITAR_PERFIL__FOTO:
				return foto != null;
		}
		return super.eIsSet(featureID);
	}

} //EditarPerfilImpl
