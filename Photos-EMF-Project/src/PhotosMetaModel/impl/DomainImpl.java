/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Domain;
import PhotosMetaModel.Foto;
import PhotosMetaModel.PhotosMetaModelPackage;
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
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.DomainImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.DomainImpl#getFoto <em>Foto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected EList<Usuario> usuario;

	/**
	 * The cached value of the '{@link #getFoto() <em>Foto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoto()
	 * @generated
	 * @ordered
	 */
	protected EList<Foto> foto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Usuario> getUsuario() {
		if (usuario == null) {
			usuario = new EObjectContainmentEList<Usuario>(Usuario.class, this, PhotosMetaModelPackage.DOMAIN__USUARIO);
		}
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Foto> getFoto() {
		if (foto == null) {
			foto = new EObjectContainmentEList<Foto>(Foto.class, this, PhotosMetaModelPackage.DOMAIN__FOTO);
		}
		return foto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.DOMAIN__USUARIO:
				return ((InternalEList<?>)getUsuario()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.DOMAIN__FOTO:
				return ((InternalEList<?>)getFoto()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.DOMAIN__USUARIO:
				return getUsuario();
			case PhotosMetaModelPackage.DOMAIN__FOTO:
				return getFoto();
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
			case PhotosMetaModelPackage.DOMAIN__USUARIO:
				getUsuario().clear();
				getUsuario().addAll((Collection<? extends Usuario>)newValue);
				return;
			case PhotosMetaModelPackage.DOMAIN__FOTO:
				getFoto().clear();
				getFoto().addAll((Collection<? extends Foto>)newValue);
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
			case PhotosMetaModelPackage.DOMAIN__USUARIO:
				getUsuario().clear();
				return;
			case PhotosMetaModelPackage.DOMAIN__FOTO:
				getFoto().clear();
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
			case PhotosMetaModelPackage.DOMAIN__USUARIO:
				return usuario != null && !usuario.isEmpty();
			case PhotosMetaModelPackage.DOMAIN__FOTO:
				return foto != null && !foto.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
