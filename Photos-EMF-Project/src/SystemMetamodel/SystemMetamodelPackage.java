/**
 */
package SystemMetamodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SystemMetamodel.SystemMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface SystemMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SystemMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co/edu/unal/mdd/photos/SystemMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co.edu.unal.mdd.photos.SystemMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemMetamodelPackage eINSTANCE = SystemMetamodel.impl.SystemMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.SoftGalleryImpl <em>Soft Gallery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.SoftGalleryImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getSoftGallery()
	 * @generated
	 */
	int SOFT_GALLERY = 0;

	/**
	 * The feature id for the '<em><b>Arquitectura</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY__ARQUITECTURA = 0;

	/**
	 * The feature id for the '<em><b>Dominio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY__DOMINIO = 1;

	/**
	 * The feature id for the '<em><b>Tecnologia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY__TECNOLOGIA = 2;

	/**
	 * The number of structural features of the '<em>Soft Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Soft Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GALLERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.DominioImpl <em>Dominio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.DominioImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getDominio()
	 * @generated
	 */
	int DOMINIO = 1;

	/**
	 * The feature id for the '<em><b>Usuarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMINIO__USUARIOS = 0;

	/**
	 * The feature id for the '<em><b>Galerias Fotos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMINIO__GALERIAS_FOTOS = 1;

	/**
	 * The number of structural features of the '<em>Dominio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMINIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dominio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMINIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.ArquitecturaImpl <em>Arquitectura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.ArquitecturaImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getArquitectura()
	 * @generated
	 */
	int ARQUITECTURA = 2;

	/**
	 * The number of structural features of the '<em>Arquitectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arquitectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.TecnologíaImpl <em>Tecnología</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.TecnologíaImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getTecnología()
	 * @generated
	 */
	int TECNOLOGÍA = 3;

	/**
	 * The number of structural features of the '<em>Tecnología</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNOLOGÍA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tecnología</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECNOLOGÍA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.AutenticacionImpl <em>Autenticacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.AutenticacionImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAutenticacion()
	 * @generated
	 */
	int AUTENTICACION = 4;

	/**
	 * The number of structural features of the '<em>Autenticacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Autenticacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTENTICACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.RegistroImpl <em>Registro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.RegistroImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getRegistro()
	 * @generated
	 */
	int REGISTRO = 5;

	/**
	 * The number of structural features of the '<em>Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Registro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.UsuarioImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 6;

	/**
	 * The feature id for the '<em><b>Iniciar Sesion</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__INICIAR_SESION = 0;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__REGISTRO = 1;

	/**
	 * The feature id for the '<em><b>Administra</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ADMINISTRA = 2;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.FotosImpl <em>Fotos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.FotosImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getFotos()
	 * @generated
	 */
	int FOTOS = 7;

	/**
	 * The feature id for the '<em><b>Categorias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOTOS__CATEGORIAS = 0;

	/**
	 * The feature id for the '<em><b>Imagenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOTOS__IMAGENES = 1;

	/**
	 * The number of structural features of the '<em>Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOTOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOTOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.manejoPerfilImpl <em>manejo Perfil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.manejoPerfilImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getmanejoPerfil()
	 * @generated
	 */
	int MANEJO_PERFIL = 8;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANEJO_PERFIL__ACCIONES = 0;

	/**
	 * The number of structural features of the '<em>manejo Perfil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANEJO_PERFIL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>manejo Perfil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANEJO_PERFIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.CategoriaImpl <em>Categoria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.CategoriaImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getCategoria()
	 * @generated
	 */
	int CATEGORIA = 9;

	/**
	 * The feature id for the '<em><b>Tienen Imagenes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__TIENEN_IMAGENES = 0;

	/**
	 * The number of structural features of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.ImagenImpl <em>Imagen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.ImagenImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getImagen()
	 * @generated
	 */
	int IMAGEN = 10;

	/**
	 * The number of structural features of the '<em>Imagen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Imagen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.AccionesImpl <em>Acciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.AccionesImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAcciones()
	 * @generated
	 */
	int ACCIONES = 11;

	/**
	 * The number of structural features of the '<em>Acciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIONES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Acciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCIONES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.CrearAlbumesImpl <em>Crear Albumes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.CrearAlbumesImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getCrearAlbumes()
	 * @generated
	 */
	int CREAR_ALBUMES = 12;

	/**
	 * The number of structural features of the '<em>Crear Albumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_ALBUMES_FEATURE_COUNT = ACCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Crear Albumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_ALBUMES_OPERATION_COUNT = ACCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.VisualizarAlbumesImpl <em>Visualizar Albumes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.VisualizarAlbumesImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getVisualizarAlbumes()
	 * @generated
	 */
	int VISUALIZAR_ALBUMES = 13;

	/**
	 * The number of structural features of the '<em>Visualizar Albumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZAR_ALBUMES_FEATURE_COUNT = ACCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visualizar Albumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZAR_ALBUMES_OPERATION_COUNT = ACCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.CargarFotosImpl <em>Cargar Fotos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.CargarFotosImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getCargarFotos()
	 * @generated
	 */
	int CARGAR_FOTOS = 14;

	/**
	 * The number of structural features of the '<em>Cargar Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGAR_FOTOS_FEATURE_COUNT = ACCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cargar Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGAR_FOTOS_OPERATION_COUNT = ACCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SystemMetamodel.impl.VisualizarTodasFotosImpl <em>Visualizar Todas Fotos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SystemMetamodel.impl.VisualizarTodasFotosImpl
	 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getVisualizarTodasFotos()
	 * @generated
	 */
	int VISUALIZAR_TODAS_FOTOS = 15;

	/**
	 * The number of structural features of the '<em>Visualizar Todas Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZAR_TODAS_FOTOS_FEATURE_COUNT = ACCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visualizar Todas Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZAR_TODAS_FOTOS_OPERATION_COUNT = ACCIONES_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link SystemMetamodel.SoftGallery <em>Soft Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Gallery</em>'.
	 * @see SystemMetamodel.SoftGallery
	 * @generated
	 */
	EClass getSoftGallery();

	/**
	 * Returns the meta object for the containment reference '{@link SystemMetamodel.SoftGallery#getArquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arquitectura</em>'.
	 * @see SystemMetamodel.SoftGallery#getArquitectura()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Arquitectura();

	/**
	 * Returns the meta object for the containment reference '{@link SystemMetamodel.SoftGallery#getDominio <em>Dominio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dominio</em>'.
	 * @see SystemMetamodel.SoftGallery#getDominio()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Dominio();

	/**
	 * Returns the meta object for the containment reference '{@link SystemMetamodel.SoftGallery#getTecnologia <em>Tecnologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tecnologia</em>'.
	 * @see SystemMetamodel.SoftGallery#getTecnologia()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Tecnologia();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Dominio <em>Dominio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dominio</em>'.
	 * @see SystemMetamodel.Dominio
	 * @generated
	 */
	EClass getDominio();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Dominio#getUsuarios <em>Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usuarios</em>'.
	 * @see SystemMetamodel.Dominio#getUsuarios()
	 * @see #getDominio()
	 * @generated
	 */
	EReference getDominio_Usuarios();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Dominio#getGaleriasFotos <em>Galerias Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Galerias Fotos</em>'.
	 * @see SystemMetamodel.Dominio#getGaleriasFotos()
	 * @see #getDominio()
	 * @generated
	 */
	EReference getDominio_GaleriasFotos();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Arquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arquitectura</em>'.
	 * @see SystemMetamodel.Arquitectura
	 * @generated
	 */
	EClass getArquitectura();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Tecnología <em>Tecnología</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tecnología</em>'.
	 * @see SystemMetamodel.Tecnología
	 * @generated
	 */
	EClass getTecnología();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Autenticacion <em>Autenticacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autenticacion</em>'.
	 * @see SystemMetamodel.Autenticacion
	 * @generated
	 */
	EClass getAutenticacion();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Registro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registro</em>'.
	 * @see SystemMetamodel.Registro
	 * @generated
	 */
	EClass getRegistro();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see SystemMetamodel.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the reference list '{@link SystemMetamodel.Usuario#getIniciarSesion <em>Iniciar Sesion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iniciar Sesion</em>'.
	 * @see SystemMetamodel.Usuario#getIniciarSesion()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_IniciarSesion();

	/**
	 * Returns the meta object for the reference list '{@link SystemMetamodel.Usuario#getRegistro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Registro</em>'.
	 * @see SystemMetamodel.Usuario#getRegistro()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Registro();

	/**
	 * Returns the meta object for the reference '{@link SystemMetamodel.Usuario#getAdministra <em>Administra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Administra</em>'.
	 * @see SystemMetamodel.Usuario#getAdministra()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Administra();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Fotos <em>Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fotos</em>'.
	 * @see SystemMetamodel.Fotos
	 * @generated
	 */
	EClass getFotos();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Fotos#getCategorias <em>Categorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorias</em>'.
	 * @see SystemMetamodel.Fotos#getCategorias()
	 * @see #getFotos()
	 * @generated
	 */
	EReference getFotos_Categorias();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.Fotos#getImagenes <em>Imagenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imagenes</em>'.
	 * @see SystemMetamodel.Fotos#getImagenes()
	 * @see #getFotos()
	 * @generated
	 */
	EReference getFotos_Imagenes();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.manejoPerfil <em>manejo Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>manejo Perfil</em>'.
	 * @see SystemMetamodel.manejoPerfil
	 * @generated
	 */
	EClass getmanejoPerfil();

	/**
	 * Returns the meta object for the containment reference list '{@link SystemMetamodel.manejoPerfil#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acciones</em>'.
	 * @see SystemMetamodel.manejoPerfil#getAcciones()
	 * @see #getmanejoPerfil()
	 * @generated
	 */
	EReference getmanejoPerfil_Acciones();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categoria</em>'.
	 * @see SystemMetamodel.Categoria
	 * @generated
	 */
	EClass getCategoria();

	/**
	 * Returns the meta object for the reference list '{@link SystemMetamodel.Categoria#getTienenImagenes <em>Tienen Imagenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tienen Imagenes</em>'.
	 * @see SystemMetamodel.Categoria#getTienenImagenes()
	 * @see #getCategoria()
	 * @generated
	 */
	EReference getCategoria_TienenImagenes();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Imagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imagen</em>'.
	 * @see SystemMetamodel.Imagen
	 * @generated
	 */
	EClass getImagen();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.Acciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acciones</em>'.
	 * @see SystemMetamodel.Acciones
	 * @generated
	 */
	EClass getAcciones();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.CrearAlbumes <em>Crear Albumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crear Albumes</em>'.
	 * @see SystemMetamodel.CrearAlbumes
	 * @generated
	 */
	EClass getCrearAlbumes();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.VisualizarAlbumes <em>Visualizar Albumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualizar Albumes</em>'.
	 * @see SystemMetamodel.VisualizarAlbumes
	 * @generated
	 */
	EClass getVisualizarAlbumes();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.CargarFotos <em>Cargar Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cargar Fotos</em>'.
	 * @see SystemMetamodel.CargarFotos
	 * @generated
	 */
	EClass getCargarFotos();

	/**
	 * Returns the meta object for class '{@link SystemMetamodel.VisualizarTodasFotos <em>Visualizar Todas Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualizar Todas Fotos</em>'.
	 * @see SystemMetamodel.VisualizarTodasFotos
	 * @generated
	 */
	EClass getVisualizarTodasFotos();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemMetamodelFactory getSystemMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.SoftGalleryImpl <em>Soft Gallery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.SoftGalleryImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getSoftGallery()
		 * @generated
		 */
		EClass SOFT_GALLERY = eINSTANCE.getSoftGallery();

		/**
		 * The meta object literal for the '<em><b>Arquitectura</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GALLERY__ARQUITECTURA = eINSTANCE.getSoftGallery_Arquitectura();

		/**
		 * The meta object literal for the '<em><b>Dominio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GALLERY__DOMINIO = eINSTANCE.getSoftGallery_Dominio();

		/**
		 * The meta object literal for the '<em><b>Tecnologia</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GALLERY__TECNOLOGIA = eINSTANCE.getSoftGallery_Tecnologia();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.DominioImpl <em>Dominio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.DominioImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getDominio()
		 * @generated
		 */
		EClass DOMINIO = eINSTANCE.getDominio();

		/**
		 * The meta object literal for the '<em><b>Usuarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMINIO__USUARIOS = eINSTANCE.getDominio_Usuarios();

		/**
		 * The meta object literal for the '<em><b>Galerias Fotos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMINIO__GALERIAS_FOTOS = eINSTANCE.getDominio_GaleriasFotos();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.ArquitecturaImpl <em>Arquitectura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.ArquitecturaImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getArquitectura()
		 * @generated
		 */
		EClass ARQUITECTURA = eINSTANCE.getArquitectura();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.TecnologíaImpl <em>Tecnología</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.TecnologíaImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getTecnología()
		 * @generated
		 */
		EClass TECNOLOGÍA = eINSTANCE.getTecnología();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.AutenticacionImpl <em>Autenticacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.AutenticacionImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAutenticacion()
		 * @generated
		 */
		EClass AUTENTICACION = eINSTANCE.getAutenticacion();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.RegistroImpl <em>Registro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.RegistroImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getRegistro()
		 * @generated
		 */
		EClass REGISTRO = eINSTANCE.getRegistro();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.UsuarioImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Iniciar Sesion</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__INICIAR_SESION = eINSTANCE.getUsuario_IniciarSesion();

		/**
		 * The meta object literal for the '<em><b>Registro</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__REGISTRO = eINSTANCE.getUsuario_Registro();

		/**
		 * The meta object literal for the '<em><b>Administra</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__ADMINISTRA = eINSTANCE.getUsuario_Administra();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.FotosImpl <em>Fotos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.FotosImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getFotos()
		 * @generated
		 */
		EClass FOTOS = eINSTANCE.getFotos();

		/**
		 * The meta object literal for the '<em><b>Categorias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOTOS__CATEGORIAS = eINSTANCE.getFotos_Categorias();

		/**
		 * The meta object literal for the '<em><b>Imagenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOTOS__IMAGENES = eINSTANCE.getFotos_Imagenes();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.manejoPerfilImpl <em>manejo Perfil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.manejoPerfilImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getmanejoPerfil()
		 * @generated
		 */
		EClass MANEJO_PERFIL = eINSTANCE.getmanejoPerfil();

		/**
		 * The meta object literal for the '<em><b>Acciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANEJO_PERFIL__ACCIONES = eINSTANCE.getmanejoPerfil_Acciones();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.CategoriaImpl <em>Categoria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.CategoriaImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getCategoria()
		 * @generated
		 */
		EClass CATEGORIA = eINSTANCE.getCategoria();

		/**
		 * The meta object literal for the '<em><b>Tienen Imagenes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIA__TIENEN_IMAGENES = eINSTANCE.getCategoria_TienenImagenes();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.ImagenImpl <em>Imagen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.ImagenImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getImagen()
		 * @generated
		 */
		EClass IMAGEN = eINSTANCE.getImagen();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.AccionesImpl <em>Acciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.AccionesImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getAcciones()
		 * @generated
		 */
		EClass ACCIONES = eINSTANCE.getAcciones();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.CrearAlbumesImpl <em>Crear Albumes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.CrearAlbumesImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getCrearAlbumes()
		 * @generated
		 */
		EClass CREAR_ALBUMES = eINSTANCE.getCrearAlbumes();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.VisualizarAlbumesImpl <em>Visualizar Albumes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.VisualizarAlbumesImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getVisualizarAlbumes()
		 * @generated
		 */
		EClass VISUALIZAR_ALBUMES = eINSTANCE.getVisualizarAlbumes();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.CargarFotosImpl <em>Cargar Fotos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.CargarFotosImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getCargarFotos()
		 * @generated
		 */
		EClass CARGAR_FOTOS = eINSTANCE.getCargarFotos();

		/**
		 * The meta object literal for the '{@link SystemMetamodel.impl.VisualizarTodasFotosImpl <em>Visualizar Todas Fotos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SystemMetamodel.impl.VisualizarTodasFotosImpl
		 * @see SystemMetamodel.impl.SystemMetamodelPackageImpl#getVisualizarTodasFotos()
		 * @generated
		 */
		EClass VISUALIZAR_TODAS_FOTOS = eINSTANCE.getVisualizarTodasFotos();

	}

} //SystemMetamodelPackage
