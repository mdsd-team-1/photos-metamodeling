/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>manejo Perfil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.manejoPerfil#getAcciones <em>Acciones</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getmanejoPerfil()
 * @model
 * @generated
 */
public interface manejoPerfil extends EObject {
	/**
	 * Returns the value of the '<em><b>Acciones</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Acciones}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acciones</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getmanejoPerfil_Acciones()
	 * @model containment="true" lower="4" upper="4"
	 * @generated
	 */
	EList<Acciones> getAcciones();

} // manejoPerfil
