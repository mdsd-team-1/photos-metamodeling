/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Layer#getLayerSegments <em>Layer Segments</em>}</li>
 *   <li>{@link SystemMetamodel.Layer#getConnections <em>Connections</em>}</li>
 *   <li>{@link SystemMetamodel.Layer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends EObject {
	/**
	 * Returns the value of the '<em><b>Layer Segments</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.LayerSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Segments</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getLayer_LayerSegments()
	 * @model containment="true"
	 * @generated
	 */
	EList<LayerSegment> getLayerSegments();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getLayer_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SystemMetamodel.SystemMetamodelPackage#getLayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Layer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Layer
