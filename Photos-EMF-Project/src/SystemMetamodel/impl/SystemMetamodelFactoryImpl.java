/**
 */
package SystemMetamodel.impl;

import SystemMetamodel.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemMetamodelFactoryImpl extends EFactoryImpl implements SystemMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemMetamodelFactory init() {
		try {
			SystemMetamodelFactory theSystemMetamodelFactory = (SystemMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(SystemMetamodelPackage.eNS_URI);
			if (theSystemMetamodelFactory != null) {
				return theSystemMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SystemMetamodelPackage.SOFT_GALLERY: return createSoftGallery();
			case SystemMetamodelPackage.DOMINIO: return createDominio();
			case SystemMetamodelPackage.ARQUITECTURA: return createArquitectura();
			case SystemMetamodelPackage.TECNOLOGÍA: return createTecnología();
			case SystemMetamodelPackage.AUTENTICACION: return createAutenticacion();
			case SystemMetamodelPackage.REGISTRO: return createRegistro();
			case SystemMetamodelPackage.USUARIO: return createUsuario();
			case SystemMetamodelPackage.FOTOS: return createFotos();
			case SystemMetamodelPackage.MANEJO_PERFIL: return createmanejoPerfil();
			case SystemMetamodelPackage.CATEGORIA: return createCategoria();
			case SystemMetamodelPackage.IMAGEN: return createImagen();
			case SystemMetamodelPackage.ACCIONES: return createAcciones();
			case SystemMetamodelPackage.CREAR_ALBUMES: return createCrearAlbumes();
			case SystemMetamodelPackage.VISUALIZAR_ALBUMES: return createVisualizarAlbumes();
			case SystemMetamodelPackage.CARGAR_FOTOS: return createCargarFotos();
			case SystemMetamodelPackage.VISUALIZAR_TODAS_FOTOS: return createVisualizarTodasFotos();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftGallery createSoftGallery() {
		SoftGalleryImpl softGallery = new SoftGalleryImpl();
		return softGallery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dominio createDominio() {
		DominioImpl dominio = new DominioImpl();
		return dominio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arquitectura createArquitectura() {
		ArquitecturaImpl arquitectura = new ArquitecturaImpl();
		return arquitectura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tecnología createTecnología() {
		TecnologíaImpl tecnología = new TecnologíaImpl();
		return tecnología;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Autenticacion createAutenticacion() {
		AutenticacionImpl autenticacion = new AutenticacionImpl();
		return autenticacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Registro createRegistro() {
		RegistroImpl registro = new RegistroImpl();
		return registro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usuario createUsuario() {
		UsuarioImpl usuario = new UsuarioImpl();
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fotos createFotos() {
		FotosImpl fotos = new FotosImpl();
		return fotos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public manejoPerfil createmanejoPerfil() {
		manejoPerfilImpl manejoPerfil = new manejoPerfilImpl();
		return manejoPerfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Categoria createCategoria() {
		CategoriaImpl categoria = new CategoriaImpl();
		return categoria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imagen createImagen() {
		ImagenImpl imagen = new ImagenImpl();
		return imagen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Acciones createAcciones() {
		AccionesImpl acciones = new AccionesImpl();
		return acciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrearAlbumes createCrearAlbumes() {
		CrearAlbumesImpl crearAlbumes = new CrearAlbumesImpl();
		return crearAlbumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualizarAlbumes createVisualizarAlbumes() {
		VisualizarAlbumesImpl visualizarAlbumes = new VisualizarAlbumesImpl();
		return visualizarAlbumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CargarFotos createCargarFotos() {
		CargarFotosImpl cargarFotos = new CargarFotosImpl();
		return cargarFotos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualizarTodasFotos createVisualizarTodasFotos() {
		VisualizarTodasFotosImpl visualizarTodasFotos = new VisualizarTodasFotosImpl();
		return visualizarTodasFotos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemMetamodelPackage getSystemMetamodelPackage() {
		return (SystemMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemMetamodelPackage getPackage() {
		return SystemMetamodelPackage.eINSTANCE;
	}

} //SystemMetamodelFactoryImpl
