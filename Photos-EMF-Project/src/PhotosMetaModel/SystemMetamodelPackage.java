/**
 */
package PhotosMetaModel;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see PhotosMetaModel.SystemMetamodelFactory
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
	String eNAME = "PhotosMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co/edu/unal/mdd/photos/PhotosMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co.edu.unal.mdd.photos.PhotosMetaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemMetamodelPackage eINSTANCE = PhotosMetaModel.impl.SystemMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.SoftGalleryImpl <em>Soft Gallery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.SoftGalleryImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getSoftGallery()
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
	 * The meta object id for the '{@link PhotosMetaModel.impl.DominioImpl <em>Dominio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.DominioImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getDominio()
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
	 * The meta object id for the '{@link PhotosMetaModel.impl.ArquitecturaImpl <em>Arquitectura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ArquitecturaImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getArquitectura()
	 * @generated
	 */
	int ARQUITECTURA = 2;

	/**
	 * The feature id for the '<em><b>Ntier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA__NTIER = 0;

	/**
	 * The number of structural features of the '<em>Arquitectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arquitectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.TecnologíaImpl <em>Tecnología</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.TecnologíaImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getTecnología()
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
	 * The meta object id for the '{@link PhotosMetaModel.impl.AutenticacionImpl <em>Autenticacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AutenticacionImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getAutenticacion()
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
	 * The meta object id for the '{@link PhotosMetaModel.impl.RegistroImpl <em>Registro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RegistroImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getRegistro()
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
	 * The meta object id for the '{@link PhotosMetaModel.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.UsuarioImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 6;

	/**
	 * The feature id for the '<em><b>Tiene Manejo Perfil</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TIENE_MANEJO_PERFIL = 0;

	/**
	 * The feature id for the '<em><b>Puede Tener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PUEDE_TENER = 1;

	/**
	 * The feature id for the '<em><b>Puede Autenticarse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PUEDE_AUTENTICARSE = 2;

	/**
	 * The feature id for the '<em><b>Posee Una Galeria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__POSEE_UNA_GALERIA = 3;

	/**
	 * The feature id for the '<em><b>First name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__LAST_NAME = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ID = 6;

	/**
	 * The feature id for the '<em><b>Profile description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PROFILE_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__USERNAME = 8;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PASSWORD = 9;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 10;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.FotosImpl <em>Fotos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.FotosImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getFotos()
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
	 * The meta object id for the '{@link PhotosMetaModel.impl.manejoPerfilImpl <em>manejo Perfil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.manejoPerfilImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getmanejoPerfil()
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
	 * The meta object id for the '{@link PhotosMetaModel.impl.CategoriaImpl <em>Categoria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CategoriaImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getCategoria()
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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__ID = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__URL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA__NAME = 3;

	/**
	 * The number of structural features of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Categoria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ImagenImpl <em>Imagen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ImagenImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getImagen()
	 * @generated
	 */
	int IMAGEN = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Tienen Categoria</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN__TIENEN_CATEGORIA = 2;

	/**
	 * The number of structural features of the '<em>Imagen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Imagen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.AccionesImpl <em>Acciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.AccionesImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getAcciones()
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
	 * The meta object id for the '{@link PhotosMetaModel.impl.CrearAlbumesImpl <em>Crear Albumes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CrearAlbumesImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getCrearAlbumes()
	 * @generated
	 */
	int CREAR_ALBUMES = 12;

	/**
	 * The feature id for the '<em><b>Crear Categoria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_ALBUMES__CREAR_CATEGORIA = ACCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Crear Albumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_ALBUMES_FEATURE_COUNT = ACCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Crear Albumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREAR_ALBUMES_OPERATION_COUNT = ACCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.VisualizarAlbumesImpl <em>Visualizar Albumes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.VisualizarAlbumesImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getVisualizarAlbumes()
	 * @generated
	 */
	int VISUALIZAR_ALBUMES = 13;

	/**
	 * The feature id for the '<em><b>Visualizar Categoria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZAR_ALBUMES__VISUALIZAR_CATEGORIA = ACCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visualizar Albumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZAR_ALBUMES_FEATURE_COUNT = ACCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visualizar Albumes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZAR_ALBUMES_OPERATION_COUNT = ACCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.CargarFotosImpl <em>Cargar Fotos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CargarFotosImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getCargarFotos()
	 * @generated
	 */
	int CARGAR_FOTOS = 14;

	/**
	 * The feature id for the '<em><b>Cargar Imagen</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGAR_FOTOS__CARGAR_IMAGEN = ACCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cargar Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGAR_FOTOS_FEATURE_COUNT = ACCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cargar Fotos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARGAR_FOTOS_OPERATION_COUNT = ACCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.VisualizarTodasFotosImpl <em>Visualizar Todas Fotos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.VisualizarTodasFotosImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getVisualizarTodasFotos()
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
	 * The meta object id for the '{@link PhotosMetaModel.impl.EditarPerfilImpl <em>Editar Perfil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.EditarPerfilImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getEditarPerfil()
	 * @generated
	 */
	int EDITAR_PERFIL = 16;

	/**
	 * The feature id for the '<em><b>Editar Perfil</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PERFIL__EDITAR_PERFIL = ACCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Editar Perfil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PERFIL_FEATURE_COUNT = ACCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Editar Perfil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITAR_PERFIL_OPERATION_COUNT = ACCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.NtierImpl <em>Ntier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.NtierImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getNtier()
	 * @generated
	 */
	int NTIER = 17;

	/**
	 * The feature id for the '<em><b>Capas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER__CAPAS = 0;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER__RELACIONES = 1;

	/**
	 * The number of structural features of the '<em>Ntier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ntier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NTIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.CapasImpl <em>Capas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.CapasImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getCapas()
	 * @generated
	 */
	int CAPAS = 18;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPAS__CONEXIONES = 0;

	/**
	 * The number of structural features of the '<em>Capas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPAS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.RelacionesImpl <em>Relaciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.RelacionesImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getRelaciones()
	 * @generated
	 */
	int RELACIONES = 19;

	/**
	 * The number of structural features of the '<em>Relaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relaciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACIONES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PhotosMetaModel.impl.ConexionesImpl <em>Conexiones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PhotosMetaModel.impl.ConexionesImpl
	 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getConexiones()
	 * @generated
	 */
	int CONEXIONES = 20;

	/**
	 * The number of structural features of the '<em>Conexiones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXIONES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Conexiones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXIONES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.SoftGallery <em>Soft Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Gallery</em>'.
	 * @see PhotosMetaModel.SoftGallery
	 * @generated
	 */
	EClass getSoftGallery();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.SoftGallery#getArquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arquitectura</em>'.
	 * @see PhotosMetaModel.SoftGallery#getArquitectura()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Arquitectura();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.SoftGallery#getDominio <em>Dominio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dominio</em>'.
	 * @see PhotosMetaModel.SoftGallery#getDominio()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Dominio();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.SoftGallery#getTecnologia <em>Tecnologia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tecnologia</em>'.
	 * @see PhotosMetaModel.SoftGallery#getTecnologia()
	 * @see #getSoftGallery()
	 * @generated
	 */
	EReference getSoftGallery_Tecnologia();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Dominio <em>Dominio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dominio</em>'.
	 * @see PhotosMetaModel.Dominio
	 * @generated
	 */
	EClass getDominio();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Dominio#getUsuarios <em>Usuarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usuarios</em>'.
	 * @see PhotosMetaModel.Dominio#getUsuarios()
	 * @see #getDominio()
	 * @generated
	 */
	EReference getDominio_Usuarios();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Dominio#getGaleriasFotos <em>Galerias Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Galerias Fotos</em>'.
	 * @see PhotosMetaModel.Dominio#getGaleriasFotos()
	 * @see #getDominio()
	 * @generated
	 */
	EReference getDominio_GaleriasFotos();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Arquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arquitectura</em>'.
	 * @see PhotosMetaModel.Arquitectura
	 * @generated
	 */
	EClass getArquitectura();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Arquitectura#getNtier <em>Ntier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ntier</em>'.
	 * @see PhotosMetaModel.Arquitectura#getNtier()
	 * @see #getArquitectura()
	 * @generated
	 */
	EReference getArquitectura_Ntier();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Tecnología <em>Tecnología</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tecnología</em>'.
	 * @see PhotosMetaModel.Tecnología
	 * @generated
	 */
	EClass getTecnología();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Autenticacion <em>Autenticacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Autenticacion</em>'.
	 * @see PhotosMetaModel.Autenticacion
	 * @generated
	 */
	EClass getAutenticacion();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Registro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registro</em>'.
	 * @see PhotosMetaModel.Registro
	 * @generated
	 */
	EClass getRegistro();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see PhotosMetaModel.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Usuario#getTieneManejoPerfil <em>Tiene Manejo Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiene Manejo Perfil</em>'.
	 * @see PhotosMetaModel.Usuario#getTieneManejoPerfil()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_TieneManejoPerfil();

	/**
	 * Returns the meta object for the containment reference '{@link PhotosMetaModel.Usuario#getPuedeTener <em>Puede Tener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Puede Tener</em>'.
	 * @see PhotosMetaModel.Usuario#getPuedeTener()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_PuedeTener();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Usuario#getPuedeAutenticarse <em>Puede Autenticarse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Puede Autenticarse</em>'.
	 * @see PhotosMetaModel.Usuario#getPuedeAutenticarse()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_PuedeAutenticarse();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Usuario#getPoseeUnaGaleria <em>Posee Una Galeria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Posee Una Galeria</em>'.
	 * @see PhotosMetaModel.Usuario#getPoseeUnaGaleria()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_PoseeUnaGaleria();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getFirst_name <em>First name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First name</em>'.
	 * @see PhotosMetaModel.Usuario#getFirst_name()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_First_name();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getLast_name <em>Last name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last name</em>'.
	 * @see PhotosMetaModel.Usuario#getLast_name()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Last_name();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PhotosMetaModel.Usuario#getId()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Id();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getProfile_description <em>Profile description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile description</em>'.
	 * @see PhotosMetaModel.Usuario#getProfile_description()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Profile_description();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see PhotosMetaModel.Usuario#getUsername()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Username();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see PhotosMetaModel.Usuario#getPassword()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Password();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see PhotosMetaModel.Usuario#getEmail()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Fotos <em>Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fotos</em>'.
	 * @see PhotosMetaModel.Fotos
	 * @generated
	 */
	EClass getFotos();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Fotos#getCategorias <em>Categorias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorias</em>'.
	 * @see PhotosMetaModel.Fotos#getCategorias()
	 * @see #getFotos()
	 * @generated
	 */
	EReference getFotos_Categorias();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Fotos#getImagenes <em>Imagenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imagenes</em>'.
	 * @see PhotosMetaModel.Fotos#getImagenes()
	 * @see #getFotos()
	 * @generated
	 */
	EReference getFotos_Imagenes();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.manejoPerfil <em>manejo Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>manejo Perfil</em>'.
	 * @see PhotosMetaModel.manejoPerfil
	 * @generated
	 */
	EClass getmanejoPerfil();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.manejoPerfil#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acciones</em>'.
	 * @see PhotosMetaModel.manejoPerfil#getAcciones()
	 * @see #getmanejoPerfil()
	 * @generated
	 */
	EReference getmanejoPerfil_Acciones();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categoria</em>'.
	 * @see PhotosMetaModel.Categoria
	 * @generated
	 */
	EClass getCategoria();

	/**
	 * Returns the meta object for the reference list '{@link PhotosMetaModel.Categoria#getTienenImagenes <em>Tienen Imagenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tienen Imagenes</em>'.
	 * @see PhotosMetaModel.Categoria#getTienenImagenes()
	 * @see #getCategoria()
	 * @generated
	 */
	EReference getCategoria_TienenImagenes();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Categoria#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PhotosMetaModel.Categoria#getId()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Id();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Categoria#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see PhotosMetaModel.Categoria#getUrl()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Url();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Categoria#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Categoria#getName()
	 * @see #getCategoria()
	 * @generated
	 */
	EAttribute getCategoria_Name();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Imagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imagen</em>'.
	 * @see PhotosMetaModel.Imagen
	 * @generated
	 */
	EClass getImagen();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Imagen#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see PhotosMetaModel.Imagen#getId()
	 * @see #getImagen()
	 * @generated
	 */
	EAttribute getImagen_Id();

	/**
	 * Returns the meta object for the attribute '{@link PhotosMetaModel.Imagen#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PhotosMetaModel.Imagen#getName()
	 * @see #getImagen()
	 * @generated
	 */
	EAttribute getImagen_Name();

	/**
	 * Returns the meta object for the reference '{@link PhotosMetaModel.Imagen#getTienenCategoria <em>Tienen Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tienen Categoria</em>'.
	 * @see PhotosMetaModel.Imagen#getTienenCategoria()
	 * @see #getImagen()
	 * @generated
	 */
	EReference getImagen_TienenCategoria();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Acciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acciones</em>'.
	 * @see PhotosMetaModel.Acciones
	 * @generated
	 */
	EClass getAcciones();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.CrearAlbumes <em>Crear Albumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crear Albumes</em>'.
	 * @see PhotosMetaModel.CrearAlbumes
	 * @generated
	 */
	EClass getCrearAlbumes();

	/**
	 * Returns the meta object for the reference list '{@link PhotosMetaModel.CrearAlbumes#getCrearCategoria <em>Crear Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Crear Categoria</em>'.
	 * @see PhotosMetaModel.CrearAlbumes#getCrearCategoria()
	 * @see #getCrearAlbumes()
	 * @generated
	 */
	EReference getCrearAlbumes_CrearCategoria();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.VisualizarAlbumes <em>Visualizar Albumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualizar Albumes</em>'.
	 * @see PhotosMetaModel.VisualizarAlbumes
	 * @generated
	 */
	EClass getVisualizarAlbumes();

	/**
	 * Returns the meta object for the reference list '{@link PhotosMetaModel.VisualizarAlbumes#getVisualizarCategoria <em>Visualizar Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Visualizar Categoria</em>'.
	 * @see PhotosMetaModel.VisualizarAlbumes#getVisualizarCategoria()
	 * @see #getVisualizarAlbumes()
	 * @generated
	 */
	EReference getVisualizarAlbumes_VisualizarCategoria();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.CargarFotos <em>Cargar Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cargar Fotos</em>'.
	 * @see PhotosMetaModel.CargarFotos
	 * @generated
	 */
	EClass getCargarFotos();

	/**
	 * Returns the meta object for the reference list '{@link PhotosMetaModel.CargarFotos#getCargarImagen <em>Cargar Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cargar Imagen</em>'.
	 * @see PhotosMetaModel.CargarFotos#getCargarImagen()
	 * @see #getCargarFotos()
	 * @generated
	 */
	EReference getCargarFotos_CargarImagen();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.VisualizarTodasFotos <em>Visualizar Todas Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualizar Todas Fotos</em>'.
	 * @see PhotosMetaModel.VisualizarTodasFotos
	 * @generated
	 */
	EClass getVisualizarTodasFotos();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.EditarPerfil <em>Editar Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editar Perfil</em>'.
	 * @see PhotosMetaModel.EditarPerfil
	 * @generated
	 */
	EClass getEditarPerfil();

	/**
	 * Returns the meta object for the reference list '{@link PhotosMetaModel.EditarPerfil#getEditarPerfil <em>Editar Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editar Perfil</em>'.
	 * @see PhotosMetaModel.EditarPerfil#getEditarPerfil()
	 * @see #getEditarPerfil()
	 * @generated
	 */
	EReference getEditarPerfil_EditarPerfil();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Ntier <em>Ntier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ntier</em>'.
	 * @see PhotosMetaModel.Ntier
	 * @generated
	 */
	EClass getNtier();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Ntier#getCapas <em>Capas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capas</em>'.
	 * @see PhotosMetaModel.Ntier#getCapas()
	 * @see #getNtier()
	 * @generated
	 */
	EReference getNtier_Capas();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Ntier#getRelaciones <em>Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaciones</em>'.
	 * @see PhotosMetaModel.Ntier#getRelaciones()
	 * @see #getNtier()
	 * @generated
	 */
	EReference getNtier_Relaciones();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Capas <em>Capas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capas</em>'.
	 * @see PhotosMetaModel.Capas
	 * @generated
	 */
	EClass getCapas();

	/**
	 * Returns the meta object for the containment reference list '{@link PhotosMetaModel.Capas#getConexiones <em>Conexiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conexiones</em>'.
	 * @see PhotosMetaModel.Capas#getConexiones()
	 * @see #getCapas()
	 * @generated
	 */
	EReference getCapas_Conexiones();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Relaciones <em>Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relaciones</em>'.
	 * @see PhotosMetaModel.Relaciones
	 * @generated
	 */
	EClass getRelaciones();

	/**
	 * Returns the meta object for class '{@link PhotosMetaModel.Conexiones <em>Conexiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conexiones</em>'.
	 * @see PhotosMetaModel.Conexiones
	 * @generated
	 */
	EClass getConexiones();

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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.SoftGalleryImpl <em>Soft Gallery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.SoftGalleryImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getSoftGallery()
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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.DominioImpl <em>Dominio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.DominioImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getDominio()
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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ArquitecturaImpl <em>Arquitectura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ArquitecturaImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getArquitectura()
		 * @generated
		 */
		EClass ARQUITECTURA = eINSTANCE.getArquitectura();

		/**
		 * The meta object literal for the '<em><b>Ntier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARQUITECTURA__NTIER = eINSTANCE.getArquitectura_Ntier();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.TecnologíaImpl <em>Tecnología</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.TecnologíaImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getTecnología()
		 * @generated
		 */
		EClass TECNOLOGÍA = eINSTANCE.getTecnología();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AutenticacionImpl <em>Autenticacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AutenticacionImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getAutenticacion()
		 * @generated
		 */
		EClass AUTENTICACION = eINSTANCE.getAutenticacion();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RegistroImpl <em>Registro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RegistroImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getRegistro()
		 * @generated
		 */
		EClass REGISTRO = eINSTANCE.getRegistro();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.UsuarioImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Tiene Manejo Perfil</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__TIENE_MANEJO_PERFIL = eINSTANCE.getUsuario_TieneManejoPerfil();

		/**
		 * The meta object literal for the '<em><b>Puede Tener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__PUEDE_TENER = eINSTANCE.getUsuario_PuedeTener();

		/**
		 * The meta object literal for the '<em><b>Puede Autenticarse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__PUEDE_AUTENTICARSE = eINSTANCE.getUsuario_PuedeAutenticarse();

		/**
		 * The meta object literal for the '<em><b>Posee Una Galeria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__POSEE_UNA_GALERIA = eINSTANCE.getUsuario_PoseeUnaGaleria();

		/**
		 * The meta object literal for the '<em><b>First name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__FIRST_NAME = eINSTANCE.getUsuario_First_name();

		/**
		 * The meta object literal for the '<em><b>Last name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__LAST_NAME = eINSTANCE.getUsuario_Last_name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ID = eINSTANCE.getUsuario_Id();

		/**
		 * The meta object literal for the '<em><b>Profile description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PROFILE_DESCRIPTION = eINSTANCE.getUsuario_Profile_description();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__USERNAME = eINSTANCE.getUsuario_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PASSWORD = eINSTANCE.getUsuario_Password();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getUsuario_Email();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.FotosImpl <em>Fotos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.FotosImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getFotos()
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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.manejoPerfilImpl <em>manejo Perfil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.manejoPerfilImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getmanejoPerfil()
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
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CategoriaImpl <em>Categoria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CategoriaImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getCategoria()
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__ID = eINSTANCE.getCategoria_Id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__URL = eINSTANCE.getCategoria_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIA__NAME = eINSTANCE.getCategoria_Name();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ImagenImpl <em>Imagen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ImagenImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getImagen()
		 * @generated
		 */
		EClass IMAGEN = eINSTANCE.getImagen();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEN__ID = eINSTANCE.getImagen_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEN__NAME = eINSTANCE.getImagen_Name();

		/**
		 * The meta object literal for the '<em><b>Tienen Categoria</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGEN__TIENEN_CATEGORIA = eINSTANCE.getImagen_TienenCategoria();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.AccionesImpl <em>Acciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.AccionesImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getAcciones()
		 * @generated
		 */
		EClass ACCIONES = eINSTANCE.getAcciones();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CrearAlbumesImpl <em>Crear Albumes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CrearAlbumesImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getCrearAlbumes()
		 * @generated
		 */
		EClass CREAR_ALBUMES = eINSTANCE.getCrearAlbumes();

		/**
		 * The meta object literal for the '<em><b>Crear Categoria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREAR_ALBUMES__CREAR_CATEGORIA = eINSTANCE.getCrearAlbumes_CrearCategoria();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.VisualizarAlbumesImpl <em>Visualizar Albumes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.VisualizarAlbumesImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getVisualizarAlbumes()
		 * @generated
		 */
		EClass VISUALIZAR_ALBUMES = eINSTANCE.getVisualizarAlbumes();

		/**
		 * The meta object literal for the '<em><b>Visualizar Categoria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZAR_ALBUMES__VISUALIZAR_CATEGORIA = eINSTANCE.getVisualizarAlbumes_VisualizarCategoria();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CargarFotosImpl <em>Cargar Fotos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CargarFotosImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getCargarFotos()
		 * @generated
		 */
		EClass CARGAR_FOTOS = eINSTANCE.getCargarFotos();

		/**
		 * The meta object literal for the '<em><b>Cargar Imagen</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARGAR_FOTOS__CARGAR_IMAGEN = eINSTANCE.getCargarFotos_CargarImagen();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.VisualizarTodasFotosImpl <em>Visualizar Todas Fotos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.VisualizarTodasFotosImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getVisualizarTodasFotos()
		 * @generated
		 */
		EClass VISUALIZAR_TODAS_FOTOS = eINSTANCE.getVisualizarTodasFotos();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.EditarPerfilImpl <em>Editar Perfil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.EditarPerfilImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getEditarPerfil()
		 * @generated
		 */
		EClass EDITAR_PERFIL = eINSTANCE.getEditarPerfil();

		/**
		 * The meta object literal for the '<em><b>Editar Perfil</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITAR_PERFIL__EDITAR_PERFIL = eINSTANCE.getEditarPerfil_EditarPerfil();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.NtierImpl <em>Ntier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.NtierImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getNtier()
		 * @generated
		 */
		EClass NTIER = eINSTANCE.getNtier();

		/**
		 * The meta object literal for the '<em><b>Capas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTIER__CAPAS = eINSTANCE.getNtier_Capas();

		/**
		 * The meta object literal for the '<em><b>Relaciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NTIER__RELACIONES = eINSTANCE.getNtier_Relaciones();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.CapasImpl <em>Capas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.CapasImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getCapas()
		 * @generated
		 */
		EClass CAPAS = eINSTANCE.getCapas();

		/**
		 * The meta object literal for the '<em><b>Conexiones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPAS__CONEXIONES = eINSTANCE.getCapas_Conexiones();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.RelacionesImpl <em>Relaciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.RelacionesImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getRelaciones()
		 * @generated
		 */
		EClass RELACIONES = eINSTANCE.getRelaciones();

		/**
		 * The meta object literal for the '{@link PhotosMetaModel.impl.ConexionesImpl <em>Conexiones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PhotosMetaModel.impl.ConexionesImpl
		 * @see PhotosMetaModel.impl.SystemMetamodelPackageImpl#getConexiones()
		 * @generated
		 */
		EClass CONEXIONES = eINSTANCE.getConexiones();

	}

} //SystemMetamodelPackage
