/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Capa;
import PhotosMetaModel.Conexion;
import PhotosMetaModel.NTier;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Relacion;

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
 * An implementation of the model object '<em><b>NTier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.NTierImpl#getConexion <em>Conexion</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.NTierImpl#getCapa <em>Capa</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.NTierImpl#getRelacion <em>Relacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTierImpl extends MinimalEObjectImpl.Container implements NTier {
	/**
	 * The cached value of the '{@link #getConexion() <em>Conexion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConexion()
	 * @generated
	 * @ordered
	 */
	protected EList<Conexion> conexion;

	/**
	 * The cached value of the '{@link #getCapa() <em>Capa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapa()
	 * @generated
	 * @ordered
	 */
	protected EList<Capa> capa;

	/**
	 * The cached value of the '{@link #getRelacion() <em>Relacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> relacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NTierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.NTIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Conexion> getConexion() {
		if (conexion == null) {
			conexion = new EObjectContainmentEList<Conexion>(Conexion.class, this, PhotosMetaModelPackage.NTIER__CONEXION);
		}
		return conexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Capa> getCapa() {
		if (capa == null) {
			capa = new EObjectContainmentEList<Capa>(Capa.class, this, PhotosMetaModelPackage.NTIER__CAPA);
		}
		return capa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relacion> getRelacion() {
		if (relacion == null) {
			relacion = new EObjectContainmentEList<Relacion>(Relacion.class, this, PhotosMetaModelPackage.NTIER__RELACION);
		}
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.NTIER__CONEXION:
				return ((InternalEList<?>)getConexion()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.NTIER__CAPA:
				return ((InternalEList<?>)getCapa()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.NTIER__RELACION:
				return ((InternalEList<?>)getRelacion()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.NTIER__CONEXION:
				return getConexion();
			case PhotosMetaModelPackage.NTIER__CAPA:
				return getCapa();
			case PhotosMetaModelPackage.NTIER__RELACION:
				return getRelacion();
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
			case PhotosMetaModelPackage.NTIER__CONEXION:
				getConexion().clear();
				getConexion().addAll((Collection<? extends Conexion>)newValue);
				return;
			case PhotosMetaModelPackage.NTIER__CAPA:
				getCapa().clear();
				getCapa().addAll((Collection<? extends Capa>)newValue);
				return;
			case PhotosMetaModelPackage.NTIER__RELACION:
				getRelacion().clear();
				getRelacion().addAll((Collection<? extends Relacion>)newValue);
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
			case PhotosMetaModelPackage.NTIER__CONEXION:
				getConexion().clear();
				return;
			case PhotosMetaModelPackage.NTIER__CAPA:
				getCapa().clear();
				return;
			case PhotosMetaModelPackage.NTIER__RELACION:
				getRelacion().clear();
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
			case PhotosMetaModelPackage.NTIER__CONEXION:
				return conexion != null && !conexion.isEmpty();
			case PhotosMetaModelPackage.NTIER__CAPA:
				return capa != null && !capa.isEmpty();
			case PhotosMetaModelPackage.NTIER__RELACION:
				return relacion != null && !relacion.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NTierImpl
