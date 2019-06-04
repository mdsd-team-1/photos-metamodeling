/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enable Global Method Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.EnableGlobalMethodSecurity#isPrePostEnabled <em>Pre Post Enabled</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getEnableGlobalMethodSecurity()
 * @model
 * @generated
 */
public interface EnableGlobalMethodSecurity extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre Post Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Post Enabled</em>' attribute.
	 * @see #setPrePostEnabled(boolean)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getEnableGlobalMethodSecurity_PrePostEnabled()
	 * @model
	 * @generated
	 */
	boolean isPrePostEnabled();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.EnableGlobalMethodSecurity#isPrePostEnabled <em>Pre Post Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Post Enabled</em>' attribute.
	 * @see #isPrePostEnabled()
	 * @generated
	 */
	void setPrePostEnabled(boolean value);

} // EnableGlobalMethodSecurity
