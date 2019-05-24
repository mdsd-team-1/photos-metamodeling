/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.CodeFile#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getCodeFile()
 * @model
 * @generated
 */
public interface CodeFile extends File {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getCodeFile_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getContains();

} // CodeFile
