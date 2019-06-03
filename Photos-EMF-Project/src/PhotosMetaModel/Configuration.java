/**
 */
package PhotosMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PhotosMetaModel.Configuration#getBean <em>Bean</em>}</li>
 *   <li>{@link PhotosMetaModel.Configuration#getEnablewebsecurity <em>Enablewebsecurity</em>}</li>
 *   <li>{@link PhotosMetaModel.Configuration#getEnableresourceserver <em>Enableresourceserver</em>}</li>
 *   <li>{@link PhotosMetaModel.Configuration#getEnableauthorizationserver <em>Enableauthorizationserver</em>}</li>
 *   <li>{@link PhotosMetaModel.Configuration#getEnableglobalmethodsecurity <em>Enableglobalmethodsecurity</em>}</li>
 * </ul>
 *
 * @see PhotosMetaModel.PhotosMetaModelPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Bean</b></em>' containment reference list.
	 * The list contents are of type {@link PhotosMetaModel.Bean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean</em>' containment reference list.
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getConfiguration_Bean()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bean> getBean();

	/**
	 * Returns the value of the '<em><b>Enablewebsecurity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enablewebsecurity</em>' reference.
	 * @see #setEnablewebsecurity(EnableWebSecurity)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getConfiguration_Enablewebsecurity()
	 * @model
	 * @generated
	 */
	EnableWebSecurity getEnablewebsecurity();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Configuration#getEnablewebsecurity <em>Enablewebsecurity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enablewebsecurity</em>' reference.
	 * @see #getEnablewebsecurity()
	 * @generated
	 */
	void setEnablewebsecurity(EnableWebSecurity value);

	/**
	 * Returns the value of the '<em><b>Enableresourceserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enableresourceserver</em>' reference.
	 * @see #setEnableresourceserver(EnableResourceServer)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getConfiguration_Enableresourceserver()
	 * @model
	 * @generated
	 */
	EnableResourceServer getEnableresourceserver();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Configuration#getEnableresourceserver <em>Enableresourceserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enableresourceserver</em>' reference.
	 * @see #getEnableresourceserver()
	 * @generated
	 */
	void setEnableresourceserver(EnableResourceServer value);

	/**
	 * Returns the value of the '<em><b>Enableauthorizationserver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enableauthorizationserver</em>' reference.
	 * @see #setEnableauthorizationserver(EnableAuthorizationServer)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getConfiguration_Enableauthorizationserver()
	 * @model
	 * @generated
	 */
	EnableAuthorizationServer getEnableauthorizationserver();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Configuration#getEnableauthorizationserver <em>Enableauthorizationserver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enableauthorizationserver</em>' reference.
	 * @see #getEnableauthorizationserver()
	 * @generated
	 */
	void setEnableauthorizationserver(EnableAuthorizationServer value);

	/**
	 * Returns the value of the '<em><b>Enableglobalmethodsecurity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enableglobalmethodsecurity</em>' reference.
	 * @see #setEnableglobalmethodsecurity(EnableGlobalMethodSecurity)
	 * @see PhotosMetaModel.PhotosMetaModelPackage#getConfiguration_Enableglobalmethodsecurity()
	 * @model
	 * @generated
	 */
	EnableGlobalMethodSecurity getEnableglobalmethodsecurity();

	/**
	 * Sets the value of the '{@link PhotosMetaModel.Configuration#getEnableglobalmethodsecurity <em>Enableglobalmethodsecurity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enableglobalmethodsecurity</em>' reference.
	 * @see #getEnableglobalmethodsecurity()
	 * @generated
	 */
	void setEnableglobalmethodsecurity(EnableGlobalMethodSecurity value);

} // Configuration
