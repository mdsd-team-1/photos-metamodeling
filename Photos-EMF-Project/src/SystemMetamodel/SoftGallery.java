/**
 */
package SystemMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Gallery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.SoftGallery#getArquitectura <em>Arquitectura</em>}</li>
 *   <li>{@link SystemMetamodel.SoftGallery#getDominio <em>Dominio</em>}</li>
 *   <li>{@link SystemMetamodel.SoftGallery#getTecnologia <em>Tecnologia</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getSoftGallery()
 * @model
 * @generated
 */
public interface SoftGallery extends EObject {
	/**
	 * Returns the value of the '<em><b>Arquitectura</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arquitectura</em>' containment reference.
	 * @see #setArquitectura(Arquitectura)
	 * @see SystemMetamodel.SystemMetamodelPackage#getSoftGallery_Arquitectura()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arquitectura getArquitectura();

	/**
	 * Sets the value of the '{@link SystemMetamodel.SoftGallery#getArquitectura <em>Arquitectura</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arquitectura</em>' containment reference.
	 * @see #getArquitectura()
	 * @generated
	 */
	void setArquitectura(Arquitectura value);

	/**
	 * Returns the value of the '<em><b>Dominio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dominio</em>' containment reference.
	 * @see #setDominio(Dominio)
	 * @see SystemMetamodel.SystemMetamodelPackage#getSoftGallery_Dominio()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dominio getDominio();

	/**
	 * Sets the value of the '{@link SystemMetamodel.SoftGallery#getDominio <em>Dominio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dominio</em>' containment reference.
	 * @see #getDominio()
	 * @generated
	 */
	void setDominio(Dominio value);

	/**
	 * Returns the value of the '<em><b>Tecnologia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tecnologia</em>' containment reference.
	 * @see #setTecnologia(Tecnología)
	 * @see SystemMetamodel.SystemMetamodelPackage#getSoftGallery_Tecnologia()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Tecnología getTecnologia();

	/**
	 * Sets the value of the '{@link SystemMetamodel.SoftGallery#getTecnologia <em>Tecnologia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tecnologia</em>' containment reference.
	 * @see #getTecnologia()
	 * @generated
	 */
	void setTecnologia(Tecnología value);

} // SoftGallery
