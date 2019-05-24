/**
 */
package SystemMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Connection#getSourceSegment <em>Source Segment</em>}</li>
 *   <li>{@link SystemMetamodel.Connection#getTargetSegment <em>Target Segment</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Segment</em>' reference.
	 * @see #setSourceSegment(LayerSegment)
	 * @see SystemMetamodel.SystemMetamodelPackage#getConnection_SourceSegment()
	 * @model
	 * @generated
	 */
	LayerSegment getSourceSegment();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Connection#getSourceSegment <em>Source Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Segment</em>' reference.
	 * @see #getSourceSegment()
	 * @generated
	 */
	void setSourceSegment(LayerSegment value);

	/**
	 * Returns the value of the '<em><b>Target Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Segment</em>' reference.
	 * @see #setTargetSegment(LayerSegment)
	 * @see SystemMetamodel.SystemMetamodelPackage#getConnection_TargetSegment()
	 * @model
	 * @generated
	 */
	LayerSegment getTargetSegment();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Connection#getTargetSegment <em>Target Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Segment</em>' reference.
	 * @see #getTargetSegment()
	 * @generated
	 */
	void setTargetSegment(LayerSegment value);

} // Connection
