/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.Acciones;
import SystemMetamodel.Arquitectura;
import SystemMetamodel.Autenticacion;
import SystemMetamodel.CargarFotos;
import SystemMetamodel.Categoria;
import SystemMetamodel.CrearAlbumes;
import SystemMetamodel.Dominio;
import SystemMetamodel.Fotos;
import SystemMetamodel.Imagen;
import SystemMetamodel.Registro;
import SystemMetamodel.SoftGallery;
import SystemMetamodel.SystemMetamodelFactory;
import SystemMetamodel.SystemMetamodelPackage;
import SystemMetamodel.Tecnología;
import SystemMetamodel.Usuario;
import SystemMetamodel.VisualizarAlbumes;
import SystemMetamodel.VisualizarTodasFotos;
import SystemMetamodel.manejoPerfil;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemMetamodelPackageImpl extends EPackageImpl implements SystemMetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softGalleryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dominioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arquitecturaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tecnologíaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autenticacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fotosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manejoPerfilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crearAlbumesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizarAlbumesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cargarFotosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizarTodasFotosEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SystemMetamodel.SystemMetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemMetamodelPackageImpl() {
		super(eNS_URI, SystemMetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SystemMetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemMetamodelPackage init() {
		if (isInited) return (SystemMetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(SystemMetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemMetamodelPackageImpl theSystemMetamodelPackage = registeredSystemMetamodelPackage instanceof SystemMetamodelPackageImpl ? (SystemMetamodelPackageImpl)registeredSystemMetamodelPackage : new SystemMetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSystemMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theSystemMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemMetamodelPackage.eNS_URI, theSystemMetamodelPackage);
		return theSystemMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftGallery() {
		return softGalleryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftGallery_Arquitectura() {
		return (EReference)softGalleryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftGallery_Dominio() {
		return (EReference)softGalleryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSoftGallery_Tecnologia() {
		return (EReference)softGalleryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDominio() {
		return dominioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDominio_Usuarios() {
		return (EReference)dominioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDominio_GaleriasFotos() {
		return (EReference)dominioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArquitectura() {
		return arquitecturaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTecnología() {
		return tecnologíaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutenticacion() {
		return autenticacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegistro() {
		return registroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsuario_IniciarSesion() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsuario_Registro() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsuario_Administra() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFotos() {
		return fotosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFotos_Categorias() {
		return (EReference)fotosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFotos_Imagenes() {
		return (EReference)fotosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getmanejoPerfil() {
		return manejoPerfilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getmanejoPerfil_Acciones() {
		return (EReference)manejoPerfilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategoria() {
		return categoriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategoria_TienenImagenes() {
		return (EReference)categoriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImagen() {
		return imagenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAcciones() {
		return accionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrearAlbumes() {
		return crearAlbumesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisualizarAlbumes() {
		return visualizarAlbumesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCargarFotos() {
		return cargarFotosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisualizarTodasFotos() {
		return visualizarTodasFotosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemMetamodelFactory getSystemMetamodelFactory() {
		return (SystemMetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		softGalleryEClass = createEClass(SOFT_GALLERY);
		createEReference(softGalleryEClass, SOFT_GALLERY__ARQUITECTURA);
		createEReference(softGalleryEClass, SOFT_GALLERY__DOMINIO);
		createEReference(softGalleryEClass, SOFT_GALLERY__TECNOLOGIA);

		dominioEClass = createEClass(DOMINIO);
		createEReference(dominioEClass, DOMINIO__USUARIOS);
		createEReference(dominioEClass, DOMINIO__GALERIAS_FOTOS);

		arquitecturaEClass = createEClass(ARQUITECTURA);

		tecnologíaEClass = createEClass(TECNOLOGÍA);

		autenticacionEClass = createEClass(AUTENTICACION);

		registroEClass = createEClass(REGISTRO);

		usuarioEClass = createEClass(USUARIO);
		createEReference(usuarioEClass, USUARIO__INICIAR_SESION);
		createEReference(usuarioEClass, USUARIO__REGISTRO);
		createEReference(usuarioEClass, USUARIO__ADMINISTRA);

		fotosEClass = createEClass(FOTOS);
		createEReference(fotosEClass, FOTOS__CATEGORIAS);
		createEReference(fotosEClass, FOTOS__IMAGENES);

		manejoPerfilEClass = createEClass(MANEJO_PERFIL);
		createEReference(manejoPerfilEClass, MANEJO_PERFIL__ACCIONES);

		categoriaEClass = createEClass(CATEGORIA);
		createEReference(categoriaEClass, CATEGORIA__TIENEN_IMAGENES);

		imagenEClass = createEClass(IMAGEN);

		accionesEClass = createEClass(ACCIONES);

		crearAlbumesEClass = createEClass(CREAR_ALBUMES);

		visualizarAlbumesEClass = createEClass(VISUALIZAR_ALBUMES);

		cargarFotosEClass = createEClass(CARGAR_FOTOS);

		visualizarTodasFotosEClass = createEClass(VISUALIZAR_TODAS_FOTOS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		crearAlbumesEClass.getESuperTypes().add(this.getAcciones());
		visualizarAlbumesEClass.getESuperTypes().add(this.getAcciones());
		cargarFotosEClass.getESuperTypes().add(this.getAcciones());
		visualizarTodasFotosEClass.getESuperTypes().add(this.getAcciones());

		// Initialize classes, features, and operations; add parameters
		initEClass(softGalleryEClass, SoftGallery.class, "SoftGallery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftGallery_Arquitectura(), this.getArquitectura(), null, "arquitectura", null, 1, 1, SoftGallery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftGallery_Dominio(), this.getDominio(), null, "dominio", null, 1, 1, SoftGallery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftGallery_Tecnologia(), this.getTecnología(), null, "tecnologia", null, 1, 1, SoftGallery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dominioEClass, Dominio.class, "Dominio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDominio_Usuarios(), this.getUsuario(), null, "usuarios", null, 0, -1, Dominio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDominio_GaleriasFotos(), this.getFotos(), null, "galeriasFotos", null, 0, -1, Dominio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arquitecturaEClass, Arquitectura.class, "Arquitectura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tecnologíaEClass, Tecnología.class, "Tecnología", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autenticacionEClass, Autenticacion.class, "Autenticacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registroEClass, Registro.class, "Registro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsuario_IniciarSesion(), this.getAutenticacion(), null, "iniciarSesion", null, 0, -1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_Registro(), this.getRegistro(), null, "registro", null, 0, -1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsuario_Administra(), this.getmanejoPerfil(), null, "administra", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fotosEClass, Fotos.class, "Fotos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFotos_Categorias(), this.getCategoria(), null, "categorias", null, 1, -1, Fotos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFotos_Imagenes(), this.getImagen(), null, "imagenes", null, 0, -1, Fotos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manejoPerfilEClass, manejoPerfil.class, "manejoPerfil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmanejoPerfil_Acciones(), this.getAcciones(), null, "acciones", null, 4, 4, manejoPerfil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoriaEClass, Categoria.class, "Categoria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategoria_TienenImagenes(), this.getImagen(), null, "tienenImagenes", null, 0, -1, Categoria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagenEClass, Imagen.class, "Imagen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accionesEClass, Acciones.class, "Acciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(crearAlbumesEClass, CrearAlbumes.class, "CrearAlbumes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visualizarAlbumesEClass, VisualizarAlbumes.class, "VisualizarAlbumes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cargarFotosEClass, CargarFotos.class, "CargarFotos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visualizarTodasFotosEClass, VisualizarTodasFotos.class, "VisualizarTodasFotos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SystemMetamodelPackageImpl
