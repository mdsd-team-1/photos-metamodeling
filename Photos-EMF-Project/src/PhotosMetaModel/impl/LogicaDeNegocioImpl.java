/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.LogicaDeNegocio;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.SegmentoLogica;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logica De Negocio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.impl.LogicaDeNegocioImpl#getSegmentologica <em>Segmentologica</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicaDeNegocioImpl extends CapaImpl implements LogicaDeNegocio {
	/**
	 * The cached value of the '{@link #getSegmentologica() <em>Segmentologica</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentologica()
	 * @generated
	 * @ordered
	 */
	protected EList<SegmentoLogica> segmentologica;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicaDeNegocioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotosMetaModelPackage.Literals.LOGICA_DE_NEGOCIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SegmentoLogica> getSegmentologica() {
		if (segmentologica == null) {
			segmentologica = new EObjectContainmentEList<SegmentoLogica>(SegmentoLogica.class, this, PhotosMetaModelPackage.LOGICA_DE_NEGOCIO__SEGMENTOLOGICA);
		}
		return segmentologica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.LOGICA_DE_NEGOCIO__SEGMENTOLOGICA:
				return ((InternalEList<?>)getSegmentologica()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.LOGICA_DE_NEGOCIO__SEGMENTOLOGICA:
				return getSegmentologica();
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
			case PhotosMetaModelPackage.LOGICA_DE_NEGOCIO__SEGMENTOLOGICA:
				getSegmentologica().clear();
				getSegmentologica().addAll((Collection<? extends SegmentoLogica>)newValue);
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
			case PhotosMetaModelPackage.LOGICA_DE_NEGOCIO__SEGMENTOLOGICA:
				getSegmentologica().clear();
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
			case PhotosMetaModelPackage.LOGICA_DE_NEGOCIO__SEGMENTOLOGICA:
				return segmentologica != null && !segmentologica.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicaDeNegocioImpl
