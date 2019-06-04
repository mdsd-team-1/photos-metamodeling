/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Association#getSource <em>Source</em>}</li>
 *   <li>{@link PhotosMetaModel.Association#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Functionalities)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAssociation_Source()
	 * @model
	 * @generated
	 */
	Functionalities getSource();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Association#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Functionalities value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Functionalities)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getAssociation_Target()
	 * @model
	 * @generated
	 */
	Functionalities getTarget();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Association#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Functionalities value);

} // Association
