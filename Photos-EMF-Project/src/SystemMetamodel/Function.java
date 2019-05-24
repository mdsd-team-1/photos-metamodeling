/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Function#getParameters <em>Parameters</em>}</li>
 *   <li>{@link SystemMetamodel.Function#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link SystemMetamodel.Function#getThrows <em>Throws</em>}</li>
 *   <li>{@link SystemMetamodel.Function#isIsStatic <em>Is Static</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Entity {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Entity)
	 * @see SystemMetamodel.SystemMetamodelPackage#getFunction_ReturnType()
	 * @model
	 * @generated
	 */
	Entity getReturnType();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Function#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Entity value);

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' reference.
	 * @see #setThrows(SystemMetamodel.Class)
	 * @see SystemMetamodel.SystemMetamodelPackage#getFunction_Throws()
	 * @model
	 * @generated
	 */
	SystemMetamodel.Class getThrows();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Function#getThrows <em>Throws</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' reference.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(SystemMetamodel.Class value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see SystemMetamodel.SystemMetamodelPackage#getFunction_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Function#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

} // Function
