/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categoria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Categoria#getTienenImagenes <em>Tienen Imagenes</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getCategoria()
 * @model
 * @generated
 */
public interface Categoria extends EObject {
	/**
	 * Returns the value of the '<em><b>Tienen Imagenes</b></em>' reference list.
	 * The list contents are of type {@link SystemMetamodel.Imagen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienen Imagenes</em>' reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getCategoria_TienenImagenes()
	 * @model
	 * @generated
	 */
	EList<Imagen> getTienenImagenes();

} // Categoria
