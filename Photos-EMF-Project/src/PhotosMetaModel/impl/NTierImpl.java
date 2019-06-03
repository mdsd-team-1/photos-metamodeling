/**
 */
package PhotosMetaModel.impl;

import PhotosMetaModel.Connection;
import PhotosMetaModel.Layer;
import PhotosMetaModel.NTier;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Relation;

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
 *   <li>{@link PhotosMetaModel.impl.NTierImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.NTierImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link PhotosMetaModel.impl.NTierImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTierImpl extends MinimalEObjectImpl.Container implements NTier {
	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layer;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relation;

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
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, PhotosMetaModelPackage.NTIER__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Layer> getLayer() {
		if (layer == null) {
			layer = new EObjectContainmentEList<Layer>(Layer.class, this, PhotosMetaModelPackage.NTIER__LAYER);
		}
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<Relation>(Relation.class, this, PhotosMetaModelPackage.NTIER__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotosMetaModelPackage.NTIER__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.NTIER__LAYER:
				return ((InternalEList<?>)getLayer()).basicRemove(otherEnd, msgs);
			case PhotosMetaModelPackage.NTIER__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
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
			case PhotosMetaModelPackage.NTIER__CONNECTION:
				return getConnection();
			case PhotosMetaModelPackage.NTIER__LAYER:
				return getLayer();
			case PhotosMetaModelPackage.NTIER__RELATION:
				return getRelation();
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
			case PhotosMetaModelPackage.NTIER__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case PhotosMetaModelPackage.NTIER__LAYER:
				getLayer().clear();
				getLayer().addAll((Collection<? extends Layer>)newValue);
				return;
			case PhotosMetaModelPackage.NTIER__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends Relation>)newValue);
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
			case PhotosMetaModelPackage.NTIER__CONNECTION:
				getConnection().clear();
				return;
			case PhotosMetaModelPackage.NTIER__LAYER:
				getLayer().clear();
				return;
			case PhotosMetaModelPackage.NTIER__RELATION:
				getRelation().clear();
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
			case PhotosMetaModelPackage.NTIER__CONNECTION:
				return connection != null && !connection.isEmpty();
			case PhotosMetaModelPackage.NTIER__LAYER:
				return layer != null && !layer.isEmpty();
			case PhotosMetaModelPackage.NTIER__RELATION:
				return relation != null && !relation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NTierImpl
