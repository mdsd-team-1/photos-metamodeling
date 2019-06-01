/**
 */
package SystemMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SystemMetamodel.SystemMetamodelPackage
 * @generated
 */
public interface SystemMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemMetamodelFactory eINSTANCE = SystemMetamodel.impl.SystemMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Soft Gallery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soft Gallery</em>'.
	 * @generated
	 */
	SoftGallery createSoftGallery();

	/**
	 * Returns a new object of class '<em>Dominio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dominio</em>'.
	 * @generated
	 */
	Dominio createDominio();

	/**
	 * Returns a new object of class '<em>Arquitectura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arquitectura</em>'.
	 * @generated
	 */
	Arquitectura createArquitectura();

	/**
	 * Returns a new object of class '<em>Tecnología</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tecnología</em>'.
	 * @generated
	 */
	Tecnología createTecnología();

	/**
	 * Returns a new object of class '<em>Autenticacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Autenticacion</em>'.
	 * @generated
	 */
	Autenticacion createAutenticacion();

	/**
	 * Returns a new object of class '<em>Registro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registro</em>'.
	 * @generated
	 */
	Registro createRegistro();

	/**
	 * Returns a new object of class '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usuario</em>'.
	 * @generated
	 */
	Usuario createUsuario();

	/**
	 * Returns a new object of class '<em>Fotos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fotos</em>'.
	 * @generated
	 */
	Fotos createFotos();

	/**
	 * Returns a new object of class '<em>manejo Perfil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>manejo Perfil</em>'.
	 * @generated
	 */
	manejoPerfil createmanejoPerfil();

	/**
	 * Returns a new object of class '<em>Categoria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categoria</em>'.
	 * @generated
	 */
	Categoria createCategoria();

	/**
	 * Returns a new object of class '<em>Imagen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imagen</em>'.
	 * @generated
	 */
	Imagen createImagen();

	/**
	 * Returns a new object of class '<em>Acciones</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acciones</em>'.
	 * @generated
	 */
	Acciones createAcciones();

	/**
	 * Returns a new object of class '<em>Crear Albumes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crear Albumes</em>'.
	 * @generated
	 */
	CrearAlbumes createCrearAlbumes();

	/**
	 * Returns a new object of class '<em>Visualizar Albumes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualizar Albumes</em>'.
	 * @generated
	 */
	VisualizarAlbumes createVisualizarAlbumes();

	/**
	 * Returns a new object of class '<em>Cargar Fotos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cargar Fotos</em>'.
	 * @generated
	 */
	CargarFotos createCargarFotos();

	/**
	 * Returns a new object of class '<em>Visualizar Todas Fotos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualizar Todas Fotos</em>'.
	 * @generated
	 */
	VisualizarTodasFotos createVisualizarTodasFotos();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemMetamodelPackage getSystemMetamodelPackage();

} //SystemMetamodelFactory
