/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Id#getGeneratedvalue <em>Generatedvalue</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getId()
 * @model
 * @generated
 */
public interface Id extends EObject {
	/**
	 * Returns the value of the '<em><b>Generatedvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generatedvalue</em>' containment reference.
	 * @see #setGeneratedvalue(GeneratedValue)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getId_Generatedvalue()
	 * @model containment="true"
	 * @generated
	 */
	GeneratedValue getGeneratedvalue();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Id#getGeneratedvalue <em>Generatedvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generatedvalue</em>' containment reference.
	 * @see #getGeneratedvalue()
	 * @generated
	 */
	void setGeneratedvalue(GeneratedValue value);

} // Id
