/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Layer;
import SystemMetamodel.LayeredStyle;
import SystemMetamodel.Relation;
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
 * An implementation of the model object '<em><b>Layered Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.LayeredStyleImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link SystemMetamodel.impl.LayeredStyleImpl#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayeredStyleImpl extends MinimalEObjectImpl.Container implements LayeredStyle {
	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayeredStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.LAYERED_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, SystemMetamodelPackage.LAYERED_STYLE__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Layer> getLayer() {
		if (layer == null) {
			layer = new EObjectContainmentEList<Layer>(Layer.class, this, SystemMetamodelPackage.LAYERED_STYLE__LAYER);
		}
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemMetamodelPackage.LAYERED_STYLE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case SystemMetamodelPackage.LAYERED_STYLE__LAYER:
				return ((InternalEList<?>)getLayer()).basicRemove(otherEnd, msgs);
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
			case SystemMetamodelPackage.LAYERED_STYLE__RELATIONS:
				return getRelations();
			case SystemMetamodelPackage.LAYERED_STYLE__LAYER:
				return getLayer();
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
			case SystemMetamodelPackage.LAYERED_STYLE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case SystemMetamodelPackage.LAYERED_STYLE__LAYER:
				getLayer().clear();
				getLayer().addAll((Collection<? extends Layer>)newValue);
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
			case SystemMetamodelPackage.LAYERED_STYLE__RELATIONS:
				getRelations().clear();
				return;
			case SystemMetamodelPackage.LAYERED_STYLE__LAYER:
				getLayer().clear();
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
			case SystemMetamodelPackage.LAYERED_STYLE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case SystemMetamodelPackage.LAYERED_STYLE__LAYER:
				return layer != null && !layer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayeredStyleImpl
