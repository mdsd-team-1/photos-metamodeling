/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fotos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Fotos#getCategorias <em>Categorias</em>}</li>
 *   <li>{@link SystemMetamodel.Fotos#getImagenes <em>Imagenes</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getFotos()
 * @model
 * @generated
 */
public interface Fotos extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorias</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Categoria}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorias</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getFotos_Categorias()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Categoria> getCategorias();

	/**
	 * Returns the value of the '<em><b>Imagenes</b></em>' containment reference list.
	 * The list contents are of type {@link SystemMetamodel.Imagen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imagenes</em>' containment reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getFotos_Imagenes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Imagen> getImagenes();

} // Fotos
