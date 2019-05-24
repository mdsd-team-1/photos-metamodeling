/**
 */
package SystemMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.PrimitiveDataType#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getPrimitiveDataType()
 * @model
 * @generated
 */
public interface PrimitiveDataType extends Entity {
	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see SystemMetamodel.SystemMetamodelPackage#getPrimitiveDataType_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link SystemMetamodel.PrimitiveDataType#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

} // PrimitiveDataType
