/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dominio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Dominio#getUsuarios <em>Usuarios</em>}</li>
 *   <li>{@link SystemMetamodel.Dominio#getGaleriasFotos <em>Galerias Fotos</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getDominio()
 * @model
 * @generated
 */
public interface Dominio extends EObject {
	/**
	 * Returns the value of the '<em><b>Usuarios</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Usuario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuarios</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getDominio_Usuarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Usuario> getUsuarios();

	/**
	 * Returns the value of the '<em><b>Galerias Fotos</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Fotos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Galerias Fotos</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getDominio_GaleriasFotos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fotos> getGaleriasFotos();

} // Dominio
