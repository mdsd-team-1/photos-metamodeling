/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link SystemMetamodel.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link SystemMetamodel.Parameter#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SystemMetamodel.SystemMetamodelPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Entity)
	 * @see SystemMetamodel.SystemMetamodelPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	Entity getType();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Entity value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getParameter_Annotation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

} // Parameter
