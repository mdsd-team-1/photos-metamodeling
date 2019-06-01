/**
 */
package SystemMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SystemMetamodel.Usuario#getIniciarSesion <em>Iniciar Sesion</em>}</li>
 *   <li>{@link SystemMetamodel.Usuario#getRegistro <em>Registro</em>}</li>
 *   <li>{@link SystemMetamodel.Usuario#getAdministra <em>Administra</em>}</li>
 * </ul>
 *
 * @see SystemMetamodel.SystemMetamodelPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
	/**
	 * Returns the value of the '<em><b>Iniciar Sesion</b></em>' reference list.
	 * The list contents are of type {@link SystemMetamodel.Autenticacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iniciar Sesion</em>' reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getUsuario_IniciarSesion()
	 * @model
	 * @generated
	 */
	EList<Autenticacion> getIniciarSesion();

	/**
	 * Returns the value of the '<em><b>Registro</b></em>' reference list.
	 * The list contents are of type {@link SystemMetamodel.Registro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registro</em>' reference list.
	 * @see SystemMetamodel.SystemMetamodelPackage#getUsuario_Registro()
	 * @model
	 * @generated
	 */
	EList<Registro> getRegistro();

	/**
	 * Returns the value of the '<em><b>Administra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administra</em>' reference.
	 * @see #setAdministra(manejoPerfil)
	 * @see SystemMetamodel.SystemMetamodelPackage#getUsuario_Administra()
	 * @model required="true"
	 * @generated
	 */
	manejoPerfil getAdministra();

	/**
	 * Sets the value of the '{@link SystemMetamodel.Usuario#getAdministra <em>Administra</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administra</em>' reference.
	 * @see #getAdministra()
	 * @generated
	 */
	void setAdministra(manejoPerfil value);

} // Usuario
