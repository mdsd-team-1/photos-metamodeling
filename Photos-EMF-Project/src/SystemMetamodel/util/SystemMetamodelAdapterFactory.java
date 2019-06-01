/**
 */
package SystemMetamodel.util;

import SystemMetamodel.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SystemMetamodel.SystemMetamodelPackage
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
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.SoftGallery <em>Soft Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.SoftGallery
	 * @generated
	 */
	public Adapter createSoftGalleryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Dominio <em>Dominio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Dominio
	 * @generated
	 */
	public Adapter createDominioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Arquitectura <em>Arquitectura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Arquitectura
	 * @generated
	 */
	public Adapter createArquitecturaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Tecnología <em>Tecnología</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Tecnología
	 * @generated
	 */
	public Adapter createTecnologíaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Autenticacion <em>Autenticacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Autenticacion
	 * @generated
	 */
	public Adapter createAutenticacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Registro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Registro
	 * @generated
	 */
	public Adapter createRegistroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Fotos <em>Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Fotos
	 * @generated
	 */
	public Adapter createFotosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.manejoPerfil <em>manejo Perfil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.manejoPerfil
	 * @generated
	 */
	public Adapter createmanejoPerfilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Categoria <em>Categoria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Categoria
	 * @generated
	 */
	public Adapter createCategoriaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Imagen <em>Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Imagen
	 * @generated
	 */
	public Adapter createImagenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.Acciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.Acciones
	 * @generated
	 */
	public Adapter createAccionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.CrearAlbumes <em>Crear Albumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.CrearAlbumes
	 * @generated
	 */
	public Adapter createCrearAlbumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.VisualizarAlbumes <em>Visualizar Albumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.VisualizarAlbumes
	 * @generated
	 */
	public Adapter createVisualizarAlbumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.CargarFotos <em>Cargar Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.CargarFotos
	 * @generated
	 */
	public Adapter createCargarFotosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SystemMetamodel.VisualizarTodasFotos <em>Visualizar Todas Fotos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SystemMetamodel.VisualizarTodasFotos
	 * @generated
	 */
	public Adapter createVisualizarTodasFotosAdapter() {
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
