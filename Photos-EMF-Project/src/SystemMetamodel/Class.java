/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Class#getMembers <em>Members</em>}</li>
 *   <li>{@link SystemMetamodel.Class#getMethods <em>Methods</em>}</li>
 *   <li>{@link SystemMetamodel.Class#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Entity {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getClass_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getMembers();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getClass_Methods()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getMethods();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Class)
	 * @see SystemMetamodel.SystemMetamodelPackage#getClass_Extends()
	 * @model
	 * @generated
	 */
	Class getExtends();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Class#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Class value);

} // Class
