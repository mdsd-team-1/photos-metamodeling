/**
 */
package PhotosMetaModel.util;

import PhotosMetaModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see PhotosMetaModel.SystemMetamodelPackage
 * @generated
 */
public class SystemMetamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SystemMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = SystemMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SystemMetamodelPackage.SOFT_GALLERY: {
				SoftGallery softGallery = (SoftGallery)theEObject;
				T result = caseSoftGallery(softGallery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.DOMINIO: {
				Dominio dominio = (Dominio)theEObject;
				T result = caseDominio(dominio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.ARQUITECTURA: {
				Arquitectura arquitectura = (Arquitectura)theEObject;
				T result = caseArquitectura(arquitectura);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.TECNOLOGÍA: {
				Tecnología tecnología = (Tecnología)theEObject;
				T result = caseTecnología(tecnología);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.AUTENTICACION: {
				Autenticacion autenticacion = (Autenticacion)theEObject;
				T result = caseAutenticacion(autenticacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.REGISTRO: {
				Registro registro = (Registro)theEObject;
				T result = caseRegistro(registro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.USUARIO: {
				Usuario usuario = (Usuario)theEObject;
				T result = caseUsuario(usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.FOTOS: {
				Fotos fotos = (Fotos)theEObject;
				T result = caseFotos(fotos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.MANEJO_PERFIL: {
				manejoPerfil manejoPerfil = (manejoPerfil)theEObject;
				T result = casemanejoPerfil(manejoPerfil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.CATEGORIA: {
				Categoria categoria = (Categoria)theEObject;
				T result = caseCategoria(categoria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.IMAGEN: {
				Imagen imagen = (Imagen)theEObject;
				T result = caseImagen(imagen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.ACCIONES: {
				Acciones acciones = (Acciones)theEObject;
				T result = caseAcciones(acciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.CREAR_ALBUMES: {
				CrearAlbumes crearAlbumes = (CrearAlbumes)theEObject;
				T result = caseCrearAlbumes(crearAlbumes);
				if (result == null) result = caseAcciones(crearAlbumes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.VISUALIZAR_ALBUMES: {
				VisualizarAlbumes visualizarAlbumes = (VisualizarAlbumes)theEObject;
				T result = caseVisualizarAlbumes(visualizarAlbumes);
				if (result == null) result = caseAcciones(visualizarAlbumes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.CARGAR_FOTOS: {
				CargarFotos cargarFotos = (CargarFotos)theEObject;
				T result = caseCargarFotos(cargarFotos);
				if (result == null) result = caseAcciones(cargarFotos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.VISUALIZAR_TODAS_FOTOS: {
				VisualizarTodasFotos visualizarTodasFotos = (VisualizarTodasFotos)theEObject;
				T result = caseVisualizarTodasFotos(visualizarTodasFotos);
				if (result == null) result = caseAcciones(visualizarTodasFotos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.EDITAR_PERFIL: {
				EditarPerfil editarPerfil = (EditarPerfil)theEObject;
				T result = caseEditarPerfil(editarPerfil);
				if (result == null) result = caseAcciones(editarPerfil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.NTIER: {
				Ntier ntier = (Ntier)theEObject;
				T result = caseNtier(ntier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.CAPAS: {
				Capas capas = (Capas)theEObject;
				T result = caseCapas(capas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.RELACIONES: {
				Relaciones relaciones = (Relaciones)theEObject;
				T result = caseRelaciones(relaciones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SystemMetamodelPackage.CONEXIONES: {
				Conexiones conexiones = (Conexiones)theEObject;
				T result = caseConexiones(conexiones);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Gallery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Gallery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftGallery(SoftGallery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dominio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dominio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDominio(Dominio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arquitectura</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arquitectura</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArquitectura(Arquitectura object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tecnología</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tecnología</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTecnología(Tecnología object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autenticacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autenticacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutenticacion(Autenticacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistro(Registro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsuario(Usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fotos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fotos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFotos(Fotos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>manejo Perfil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>manejo Perfil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemanejoPerfil(manejoPerfil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categoria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categoria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoria(Categoria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imagen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imagen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagen(Imagen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcciones(Acciones object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crear Albumes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crear Albumes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrearAlbumes(CrearAlbumes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualizar Albumes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualizar Albumes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizarAlbumes(VisualizarAlbumes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cargar Fotos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cargar Fotos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCargarFotos(CargarFotos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualizar Todas Fotos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualizar Todas Fotos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizarTodasFotos(VisualizarTodasFotos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Editar Perfil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Editar Perfil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEditarPerfil(EditarPerfil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ntier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ntier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNtier(Ntier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapas(Capas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relaciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relaciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelaciones(Relaciones object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conexiones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conexiones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConexiones(Conexiones object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SystemMetamodelSwitch
