/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Relacion#getRelacionSource <em>Relacion Source</em>}</li>
 *   <li>{@link PhotosMetaModel.Relacion#getRelacionTarget <em>Relacion Target</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getRelacion()
 * @model
 * @generated
 */
public interface Relacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Relacion Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion Source</em>' reference.
	 * @see #setRelacionSource(Capa)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRelacion_RelacionSource()
	 * @model
	 * @generated
	 */
	Capa getRelacionSource();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Relacion#getRelacionSource <em>Relacion Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relacion Source</em>' reference.
	 * @see #getRelacionSource()
	 * @generated
	 */
	void setRelacionSource(Capa value);

	/**
	 * Returns the value of the '<em><b>Relacion Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion Target</em>' reference.
	 * @see #setRelacionTarget(Capa)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getRelacion_RelacionTarget()
	 * @model
	 * @generated
	 */
	Capa getRelacionTarget();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Relacion#getRelacionTarget <em>Relacion Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relacion Target</em>' reference.
	 * @see #getRelacionTarget()
	 * @generated
	 */
	void setRelacionTarget(Capa value);

} // Relacion
