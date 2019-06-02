/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imagen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Imagen#getId <em>Id</em>}</li>
 *   <li>{@link PhotosMetaModel.Imagen#getName <em>Name</em>}</li>
 *   <li>{@link PhotosMetaModel.Imagen#getTienenCategoria <em>Tienen Categoria</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.SystemMetamodelPackage#getImagen()
 * @model
 * @generated
 */
public interface Imagen extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see PhotosMetaModel.SystemMetamodelPackage#getImagen_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Imagen#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PhotosMetaModel.SystemMetamodelPackage#getImagen_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Imagen#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tienen Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tienen Categoria</em>' reference.
	 * @see #setTienenCategoria(Categoria)
	 * @see PhotosMetaModel.SystemMetamodelPackage#getImagen_TienenCategoria()
	 * @model required="true"
	 * @generated
	 */
	Categoria getTienenCategoria();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Imagen#getTienenCategoria <em>Tienen Categoria</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tienen Categoria</em>' reference.
	 * @see #getTienenCategoria()
	 * @generated
	 */
	void setTienenCategoria(Categoria value);

} // Imagen
