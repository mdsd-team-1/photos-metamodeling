/**
 */
package PhotosMetaModel.util;

import PhotosMetaModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see PhotosMetaModel.SystemMetamodelPackage
 * @generated
 */
public class SystemMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SystemMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemMetamodelSwitch<Adapter> modelSwitch =
		new SystemMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseSoftGallery(SoftGallery object) {
				return createSoftGalleryAdapter();
			}
			@Override
			public Adapter caseDominio(Dominio object) {
				return createDominioAdapter();
			}
			@Override
			public Adapter caseArquitectura(Arquitectura object) {
				return createArquitecturaAdapter();
			}
			@Override
			public Adapter caseTecnología(Tecnología object) {
				return createTecnologíaAdapter();
			}
			@Override
			public Adapter caseAutenticacion(Autenticacion object) {
				return createAutenticacionAdapter();
			}
			@Override
			public Adapter caseRegistro(Registro object) {
				return createRegistroAdapter();
			}
			@Override
			public Adapter caseUsuario(Usuario object) {
				return createUsuarioAdapter();
			}
			@Override
			public Adapter caseFotos(Fotos object) {
				return createFotosAdapter();
			}
			@Override
			public Adapter casemanejoPerfil(manejoPerfil object) {
				return createmanejoPerfilAdapter();
			}
			@Override
			public Adapter caseCategoria(Categoria object) {
				return createCategoriaAdapter();
			}
			@Override
			public Adapter caseImagen(Imagen object) {
				return createImagenAdapter();
			}
			@Override
			public Adapter caseAcciones(Acciones object) {
				return createAccionesAdapter();
			}
			@Override
			public Adapter caseCrearAlbumes(CrearAlbumes object) {
				return createCrearAlbumesAdapter();
			}
			@Override
			public Adapter caseVisualizarAlbumes(VisualizarAlbumes object) {
				return createVisualizarAlbumesAdapter();
			}
			@Override
			public Adapter caseCargarFotos(CargarFotos object) {
				return createCargarFotosAdapter();
			}
			@Override
			public Adapter caseVisualizarTodasFotos(VisualizarTodasFotos object) {
				return createVisualizarTodasFotosAdapter();
			}
			@Override
			public Adapter caseEditarPerfil(EditarPerfil object) {
				return createEditarPerfilAdapter();
			}
			@Override
			public Adapter caseNtier(Ntier object) {
				return createNtierAdapter();
			}
			@Override
			public Adapter caseCapas(Capas object) {
				return createCapasAdapter();
			}
			@Override
			public Adapter caseRelaciones(Relaciones object) {
				return createRelacionesAdapter();
			}
			@Override
			public Adapter caseConexiones(Conexiones object) {
				return createConexionesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.SoftGallery <em>Soft Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.SoftGallery
	 * @generated
	 */
	public Adapter createSoftGalleryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Dominio <em>Dominio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Dominio
	 * @generated
	 */
	public Adapter createDominioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Arquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Arquitectura
	 * @generated
	 */
	public Adapter createArquitecturaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Tecnología <em>Tecnología</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Tecnología
	 * @generated
	 */
	public Adapter createTecnologíaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Autenticacion <em>Autenticacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Autenticacion
	 * @generated
	 */
	public Adapter createAutenticacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Registro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Registro
	 * @generated
	 */
	public Adapter createRegistroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Fotos <em>Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Fotos
	 * @generated
	 */
	public Adapter createFotosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.manejoPerfil <em>manejo Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.manejoPerfil
	 * @generated
	 */
	public Adapter createmanejoPerfilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Categoria
	 * @generated
	 */
	public Adapter createCategoriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Imagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Imagen
	 * @generated
	 */
	public Adapter createImagenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Acciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Acciones
	 * @generated
	 */
	public Adapter createAccionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.CrearAlbumes <em>Crear Albumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.CrearAlbumes
	 * @generated
	 */
	public Adapter createCrearAlbumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.VisualizarAlbumes <em>Visualizar Albumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.VisualizarAlbumes
	 * @generated
	 */
	public Adapter createVisualizarAlbumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.CargarFotos <em>Cargar Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.CargarFotos
	 * @generated
	 */
	public Adapter createCargarFotosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.VisualizarTodasFotos <em>Visualizar Todas Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.VisualizarTodasFotos
	 * @generated
	 */
	public Adapter createVisualizarTodasFotosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.EditarPerfil <em>Editar Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.EditarPerfil
	 * @generated
	 */
	public Adapter createEditarPerfilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Ntier <em>Ntier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Ntier
	 * @generated
	 */
	public Adapter createNtierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Capas <em>Capas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Capas
	 * @generated
	 */
	public Adapter createCapasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Relaciones <em>Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Relaciones
	 * @generated
	 */
	public Adapter createRelacionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link PhotosMetaModel.Conexiones <em>Conexiones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see PhotosMetaModel.Conexiones
	 * @generated
	 */
	public Adapter createConexionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SystemMetamodelAdapterFactory
