/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.ExceptionHandler#getException <em>Exception</em>}</li>
 *   <li>{@link PhotosMetaModel.ExceptionHandler#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Exception}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getExceptionHandler_Exception()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhotosMetaModel.Exception> getException();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getExceptionHandler_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.ExceptionHandler#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ExceptionHandler
