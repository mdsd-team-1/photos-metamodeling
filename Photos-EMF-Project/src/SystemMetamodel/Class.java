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
 *   <li>{@link SystemMetamodel.Class#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link SystemMetamodel.Class#getMembers <em>Members</em>}</li>
 *   <li>{@link SystemMetamodel.Class#getMethods <em>Methods</em>}</li>
 *   <li>{@link SystemMetamodel.Class#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see SystemMetamodel.SystemMetamodelPackage#getClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Class#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getClass_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

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
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Class)
	 * @see SystemMetamodel.SystemMetamodelPackage#getClass_Parent()
	 * @model
	 * @generated
	 */
	Class getParent();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Class#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Class value);

} // Class
