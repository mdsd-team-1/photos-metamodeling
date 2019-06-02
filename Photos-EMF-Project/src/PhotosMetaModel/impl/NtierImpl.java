/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Capas;
import PhotosMetaModel.Ntier;
import PhotosMetaModel.Relaciones;
import PhotosMetaModel.SystemMetamodelPackage;

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
 * An implementation of the model object '<em><b>Ntier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.NtierImpl#getCapas <em>Capas</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.NtierImpl#getRelaciones <em>Relaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NtierImpl extends MinimalEObjectImpl.Container implements Ntier {
	/**
	 * The cached value of the '{@link #getCapas() <em>Capas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapas()
	 * @generated
	 * @ordered
	 */
	protected EList<Capas> capas;

	/**
	 * The cached value of the '{@link #getRelaciones() <em>Relaciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Relaciones> relaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NtierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.NTIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Capas> getCapas() {
		if (capas == null) {
			capas = new EObjectContainmentEList<Capas>(Capas.class, this, SystemMetamodelPackage.NTIER__CAPAS);
		}
		return capas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relaciones> getRelaciones() {
		if (relaciones == null) {
			relaciones = new EObjectContainmentEList<Relaciones>(Relaciones.class, this, SystemMetamodelPackage.NTIER__RELACIONES);
		}
		return relaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemMetamodelPackage.NTIER__CAPAS:
				return ((InternalEList<?>)getCapas()).basicRemove(otherEnd, msgs);
			case SystemMetamodelPackage.NTIER__RELACIONES:
				return ((InternalEList<?>)getRelaciones()).basicRemove(otherEnd, msgs);
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
			case SystemMetamodelPackage.NTIER__CAPAS:
				return getCapas();
			case SystemMetamodelPackage.NTIER__RELACIONES:
				return getRelaciones();
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
			case SystemMetamodelPackage.NTIER__CAPAS:
				getCapas().clear();
				getCapas().addAll((Collection<? extends Capas>)newValue);
				return;
			case SystemMetamodelPackage.NTIER__RELACIONES:
				getRelaciones().clear();
				getRelaciones().addAll((Collection<? extends Relaciones>)newValue);
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
			case SystemMetamodelPackage.NTIER__CAPAS:
				getCapas().clear();
				return;
			case SystemMetamodelPackage.NTIER__RELACIONES:
				getRelaciones().clear();
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
			case SystemMetamodelPackage.NTIER__CAPAS:
				return capas != null && !capas.isEmpty();
			case SystemMetamodelPackage.NTIER__RELACIONES:
				return relaciones != null && !relaciones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NtierImpl
