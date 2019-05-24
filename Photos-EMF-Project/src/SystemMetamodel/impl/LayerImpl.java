/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Connection;
import SystemMetamodel.Layer;
import SystemMetamodel.LayerSegment;
import SystemMetamodel.SystemMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.impl.LayerImpl#getLayerSegments <em>Layer Segments</em>}</li>
 *   <li>{@link SystemMetamodel.impl.LayerImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link SystemMetamodel.impl.LayerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerImpl extends MinimalEObjectImpl.Container implements Layer {
	/**
	 * The cached value of the '{@link #getLayerSegments() <em>Layer Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<LayerSegment> layerSegments;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemMetamodelPackage.Literals.LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LayerSegment> getLayerSegments() {
		if (layerSegments == null) {
			layerSegments = new EObjectContainmentEList<LayerSegment>(LayerSegment.class, this, SystemMetamodelPackage.LAYER__LAYER_SEGMENTS);
		}
		return layerSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, SystemMetamodelPackage.LAYER__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemMetamodelPackage.LAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemMetamodelPackage.LAYER__LAYER_SEGMENTS:
				return ((InternalEList<?>)getLayerSegments()).basicRemove(otherEnd, msgs);
			case SystemMetamodelPackage.LAYER__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case SystemMetamodelPackage.LAYER__LAYER_SEGMENTS:
				return getLayerSegments();
			case SystemMetamodelPackage.LAYER__CONNECTIONS:
				return getConnections();
			case SystemMetamodelPackage.LAYER__NAME:
				return getName();
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
			case SystemMetamodelPackage.LAYER__LAYER_SEGMENTS:
				getLayerSegments().clear();
				getLayerSegments().addAll((Collection<? extends LayerSegment>)newValue);
				return;
			case SystemMetamodelPackage.LAYER__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case SystemMetamodelPackage.LAYER__NAME:
				setName((String)newValue);
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
			case SystemMetamodelPackage.LAYER__LAYER_SEGMENTS:
				getLayerSegments().clear();
				return;
			case SystemMetamodelPackage.LAYER__CONNECTIONS:
				getConnections().clear();
				return;
			case SystemMetamodelPackage.LAYER__NAME:
				setName(NAME_EDEFAULT);
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
			case SystemMetamodelPackage.LAYER__LAYER_SEGMENTS:
				return layerSegments != null && !layerSegments.isEmpty();
			case SystemMetamodelPackage.LAYER__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case SystemMetamodelPackage.LAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LayerImpl
