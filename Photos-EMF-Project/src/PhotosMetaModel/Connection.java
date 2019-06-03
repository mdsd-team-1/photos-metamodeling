/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Connection#getSourceLayer <em>Source Layer</em>}</li>
 *   <li>{@link PhotosMetaModel.Connection#getTargetLayer <em>Target Layer</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Layer</em>' reference.
	 * @see #setSourceLayer(Layer)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getConnection_SourceLayer()
	 * @model
	 * @generated
	 */
	Layer getSourceLayer();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Connection#getSourceLayer <em>Source Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Layer</em>' reference.
	 * @see #getSourceLayer()
	 * @generated
	 */
	void setSourceLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Target Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Layer</em>' reference.
	 * @see #setTargetLayer(Layer)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getConnection_TargetLayer()
	 * @model
	 * @generated
	 */
	Layer getTargetLayer();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Connection#getTargetLayer <em>Target Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Layer</em>' reference.
	 * @see #getTargetLayer()
	 * @generated
	 */
	void setTargetLayer(Layer value);

} // Connection
