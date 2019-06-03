/**
 */
package PhotosMetaModel.util;

import PhotosMetaModel.Access;
import PhotosMetaModel.Accion;
import PhotosMetaModel.Action_a;
import PhotosMetaModel.AllowedToUse;
import PhotosMetaModel.Alter;
import PhotosMetaModel.AmazonAurora;
import PhotosMetaModel.AmazonDynamoDB;
import PhotosMetaModel.AmazonElasticComputeCloud;
import PhotosMetaModel.AmazonS3API;
import PhotosMetaModel.AmazonS3Storage;
import PhotosMetaModel.AmazonSageMaker;
import PhotosMetaModel.AmazonSimpleStorageService;
import PhotosMetaModel.AmazonWebServices;
import PhotosMetaModel.Architecture;
import PhotosMetaModel.Array;
import PhotosMetaModel.Autenticacion;
import PhotosMetaModel.Autowired;
import PhotosMetaModel.BatchOperation;
import PhotosMetaModel.Bean;
import PhotosMetaModel.Bucket;
import PhotosMetaModel.BucketObjectsNotPublic;
import PhotosMetaModel.Capa;
import PhotosMetaModel.CargarFoto;
import PhotosMetaModel.Categoria;
import PhotosMetaModel.Class_r;
import PhotosMetaModel.Clause;
import PhotosMetaModel.Cluster;
import PhotosMetaModel.Column;
import PhotosMetaModel.Column_p;
import PhotosMetaModel.Column_s;
import PhotosMetaModel.Component;
import PhotosMetaModel.ComponentDidMount;
import PhotosMetaModel.ComponentWillUnmount;
import PhotosMetaModel.Component_a;
import PhotosMetaModel.Component_r;
import PhotosMetaModel.Conexion;
import PhotosMetaModel.ConexionPostgreSQL;
import PhotosMetaModel.Configuration;
import PhotosMetaModel.Constraint;
import PhotosMetaModel.Constructor;
import PhotosMetaModel.Controller_a;
import PhotosMetaModel.CrearAlbum;
import PhotosMetaModel.Create;
import PhotosMetaModel.DataType;
import PhotosMetaModel.Database;
import PhotosMetaModel.Datos;
import PhotosMetaModel.Delete;
import PhotosMetaModel.DeleteMapping;
import PhotosMetaModel.Distnct;
import PhotosMetaModel.Domain;
import PhotosMetaModel.Drop;
import PhotosMetaModel.EditarPerfil;
import PhotosMetaModel.Element_r;
import PhotosMetaModel.EnableAuthorizationServer;
import PhotosMetaModel.EnableGlobalMethodSecurity;
import PhotosMetaModel.EnableResourceServer;
import PhotosMetaModel.EnableWebSecurity;
import PhotosMetaModel.Entity;
import PhotosMetaModel.ExceptionHandler;
import PhotosMetaModel.File_a;
import PhotosMetaModel.Folder_a;
import PhotosMetaModel.ForeignKey;
import PhotosMetaModel.Foto;
import PhotosMetaModel.From;
import PhotosMetaModel.Function_p;
import PhotosMetaModel.Function_r;
import PhotosMetaModel.GeneratedValue;
import PhotosMetaModel.GetMapping;
import PhotosMetaModel.GroupBy;
import PhotosMetaModel.Having;
import PhotosMetaModel.Id;
import PhotosMetaModel.Imagen;
import PhotosMetaModel.Index;
import PhotosMetaModel.Index_p;
import PhotosMetaModel.Insert;
import PhotosMetaModel.Into;
import PhotosMetaModel.Join;
import PhotosMetaModel.Lateral;
import PhotosMetaModel.Limit;
import PhotosMetaModel.LogicaDeNegocio;
import PhotosMetaModel.ManejoPerfil;
import PhotosMetaModel.MetaData;
import PhotosMetaModel.Model_a;
import PhotosMetaModel.NTier;
import PhotosMetaModel.NamedNativeQuery;
import PhotosMetaModel.ObjectsPublic;
import PhotosMetaModel.Offset;
import PhotosMetaModel.OnlyAuthorized;
import PhotosMetaModel.Order_p;
import PhotosMetaModel.Order_s;
import PhotosMetaModel.PhotosMetaModelPackage;
import PhotosMetaModel.Policy;
import PhotosMetaModel.PostMapping;
import PhotosMetaModel.PostgreSQL;
import PhotosMetaModel.PostgreSQL_a;
import PhotosMetaModel.Predicate;
import PhotosMetaModel.Presentacion;
import PhotosMetaModel.Privilege;
import PhotosMetaModel.Prop;
import PhotosMetaModel.Public;
import PhotosMetaModel.PutMapping;
import PhotosMetaModel.Query;
import PhotosMetaModel.REST;
import PhotosMetaModel.React;
import PhotosMetaModel.ReactDOM;
import PhotosMetaModel.Registro;
import PhotosMetaModel.Relacion;
import PhotosMetaModel.Render;
import PhotosMetaModel.Repository;
import PhotosMetaModel.Repository_a;
import PhotosMetaModel.RequestMapping;
import PhotosMetaModel.RequestPart;
import PhotosMetaModel.RestController;
import PhotosMetaModel.Row;
import PhotosMetaModel.Scheme;
import PhotosMetaModel.SearchCriteria;
import PhotosMetaModel.Security_a;
import PhotosMetaModel.SegmentoDatos;
import PhotosMetaModel.SegmentoLogica;
import PhotosMetaModel.SegmentoPresentacion;
import PhotosMetaModel.Select;
import PhotosMetaModel.SoftGallery;
import PhotosMetaModel.Specification;
import PhotosMetaModel.Spring;
import PhotosMetaModel.SpringBootApplication;
import PhotosMetaModel.Table_p;
import PhotosMetaModel.Table_s;
import PhotosMetaModel.Technology;
import PhotosMetaModel.Trigger;
import PhotosMetaModel.Update;
import PhotosMetaModel.User_p;
import PhotosMetaModel.Using;
import PhotosMetaModel.Usuario;
import PhotosMetaModel.Values;
import PhotosMetaModel.VerAlbum;
import PhotosMetaModel.VerTodasLasFotos;
import PhotosMetaModel.View;
import PhotosMetaModel.View_a;
import PhotosMetaModel.Where;

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
 * @see PhotosMetaModel.PhotosMetaModelPackage
 * @generated
 */
public class PhotosMetaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhotosMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotosMetaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = PhotosMetaModelPackage.eINSTANCE;
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
			case PhotosMetaModelPackage.SOFT_GALLERY: {
				SoftGallery softGallery = (SoftGallery)theEObject;
				T result = caseSoftGallery(softGallery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ARCHITECTURE: {
				Architecture architecture = (Architecture)theEObject;
				T result = caseArchitecture(architecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.TECHNOLOGY: {
				Technology technology = (Technology)theEObject;
				T result = caseTechnology(technology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SPRING: {
				Spring spring = (Spring)theEObject;
				T result = caseSpring(spring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.REACT: {
				React react = (React)theEObject;
				T result = caseReact(react);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.REST_CONTROLLER: {
				RestController restController = (RestController)theEObject;
				T result = caseRestController(restController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SPRING_BOOT_APPLICATION: {
				SpringBootApplication springBootApplication = (SpringBootApplication)theEObject;
				T result = caseSpringBootApplication(springBootApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.REQUEST_MAPPING: {
				RequestMapping requestMapping = (RequestMapping)theEObject;
				T result = caseRequestMapping(requestMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.POST_MAPPING: {
				PostMapping postMapping = (PostMapping)theEObject;
				T result = casePostMapping(postMapping);
				if (result == null) result = caseRequestMapping(postMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.GET_MAPPING: {
				GetMapping getMapping = (GetMapping)theEObject;
				T result = caseGetMapping(getMapping);
				if (result == null) result = caseRequestMapping(getMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.PUT_MAPPING: {
				PutMapping putMapping = (PutMapping)theEObject;
				T result = casePutMapping(putMapping);
				if (result == null) result = caseRequestMapping(putMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.EXCEPTION_HANDLER: {
				ExceptionHandler exceptionHandler = (ExceptionHandler)theEObject;
				T result = caseExceptionHandler(exceptionHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.DELETE_MAPPING: {
				DeleteMapping deleteMapping = (DeleteMapping)theEObject;
				T result = caseDeleteMapping(deleteMapping);
				if (result == null) result = caseRequestMapping(deleteMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.REQUEST_PART: {
				RequestPart requestPart = (RequestPart)theEObject;
				T result = caseRequestPart(requestPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AUTOWIRED: {
				Autowired autowired = (Autowired)theEObject;
				T result = caseAutowired(autowired);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.EXCEPTION: {
				PhotosMetaModel.Exception exception = (PhotosMetaModel.Exception)theEObject;
				T result = caseException(exception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.TABLE_S: {
				Table_s table_s = (Table_s)theEObject;
				T result = caseTable_s(table_s);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ID: {
				Id id = (Id)theEObject;
				T result = caseId(id);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.COLUMN_P: {
				Column_p column_p = (Column_p)theEObject;
				T result = caseColumn_p(column_p);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.GENERATED_VALUE: {
				GeneratedValue generatedValue = (GeneratedValue)theEObject;
				T result = caseGeneratedValue(generatedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.NAMED_NATIVE_QUERY: {
				NamedNativeQuery namedNativeQuery = (NamedNativeQuery)theEObject;
				T result = caseNamedNativeQuery(namedNativeQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SEARCH_CRITERIA: {
				SearchCriteria searchCriteria = (SearchCriteria)theEObject;
				T result = caseSearchCriteria(searchCriteria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ORDER_S: {
				Order_s order_s = (Order_s)theEObject;
				T result = caseOrder_s(order_s);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ENABLE_AUTHORIZATION_SERVER: {
				EnableAuthorizationServer enableAuthorizationServer = (EnableAuthorizationServer)theEObject;
				T result = caseEnableAuthorizationServer(enableAuthorizationServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ENABLE_RESOURCE_SERVER: {
				EnableResourceServer enableResourceServer = (EnableResourceServer)theEObject;
				T result = caseEnableResourceServer(enableResourceServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ENABLE_WEB_SECURITY: {
				EnableWebSecurity enableWebSecurity = (EnableWebSecurity)theEObject;
				T result = caseEnableWebSecurity(enableWebSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ENABLE_GLOBAL_METHOD_SECURITY: {
				EnableGlobalMethodSecurity enableGlobalMethodSecurity = (EnableGlobalMethodSecurity)theEObject;
				T result = caseEnableGlobalMethodSecurity(enableGlobalMethodSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.BEAN: {
				Bean bean = (Bean)theEObject;
				T result = caseBean(bean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.POSTGRE_SQL: {
				PostgreSQL postgreSQL = (PostgreSQL)theEObject;
				T result = casePostgreSQL(postgreSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.FOREIGN_KEY: {
				ForeignKey foreignKey = (ForeignKey)theEObject;
				T result = caseForeignKey(foreignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.INDEX_P: {
				Index_p index_p = (Index_p)theEObject;
				T result = caseIndex_p(index_p);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.TABLE_P: {
				Table_p table_p = (Table_p)theEObject;
				T result = caseTable_p(table_p);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.FUNCTION_P: {
				Function_p function_p = (Function_p)theEObject;
				T result = caseFunction_p(function_p);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SCHEME: {
				Scheme scheme = (Scheme)theEObject;
				T result = caseScheme(scheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.USER_P: {
				User_p user_p = (User_p)theEObject;
				T result = caseUser_p(user_p);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CLUSTER: {
				Cluster cluster = (Cluster)theEObject;
				T result = caseCluster(cluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.PRIVILEGE: {
				Privilege privilege = (Privilege)theEObject;
				T result = casePrivilege(privilege);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.POLICY: {
				Policy policy = (Policy)theEObject;
				T result = casePolicy(policy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CLAUSE: {
				Clause clause = (Clause)theEObject;
				T result = caseClause(clause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.INSERT: {
				Insert insert = (Insert)theEObject;
				T result = caseInsert(insert);
				if (result == null) result = caseClause(insert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.FROM: {
				From from = (From)theEObject;
				T result = caseFrom(from);
				if (result == null) result = caseClause(from);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.JOIN: {
				Join join = (Join)theEObject;
				T result = caseJoin(join);
				if (result == null) result = caseClause(join);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.LATERAL: {
				Lateral lateral = (Lateral)theEObject;
				T result = caseLateral(lateral);
				if (result == null) result = caseClause(lateral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.WHERE: {
				Where where = (Where)theEObject;
				T result = caseWhere(where);
				if (result == null) result = caseClause(where);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.GROUP_BY: {
				GroupBy groupBy = (GroupBy)theEObject;
				T result = caseGroupBy(groupBy);
				if (result == null) result = caseClause(groupBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.HAVING: {
				Having having = (Having)theEObject;
				T result = caseHaving(having);
				if (result == null) result = caseClause(having);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseClause(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.DISTNCT: {
				Distnct distnct = (Distnct)theEObject;
				T result = caseDistnct(distnct);
				if (result == null) result = caseClause(distnct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.LIMIT: {
				Limit limit = (Limit)theEObject;
				T result = caseLimit(limit);
				if (result == null) result = caseClause(limit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.OFFSET: {
				Offset offset = (Offset)theEObject;
				T result = caseOffset(offset);
				if (result == null) result = caseClause(offset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.VALUES: {
				Values values = (Values)theEObject;
				T result = caseValues(values);
				if (result == null) result = caseClause(values);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ALTER: {
				Alter alter = (Alter)theEObject;
				T result = caseAlter(alter);
				if (result == null) result = caseClause(alter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseClause(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseClause(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.DROP: {
				Drop drop = (Drop)theEObject;
				T result = caseDrop(drop);
				if (result == null) result = caseClause(drop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.USING: {
				Using using = (Using)theEObject;
				T result = caseUsing(using);
				if (result == null) result = caseClause(using);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.INDEX: {
				Index index = (Index)theEObject;
				T result = caseIndex(index);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.UPDATE: {
				Update update = (Update)theEObject;
				T result = caseUpdate(update);
				if (result == null) result = caseClause(update);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = caseClause(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.INTO: {
				Into into = (Into)theEObject;
				T result = caseInto(into);
				if (result == null) result = caseClause(into);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.COLUMN_S: {
				Column_s column_s = (Column_s)theEObject;
				T result = caseColumn_s(column_s);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ORDER_P: {
				Order_p order_p = (Order_p)theEObject;
				T result = caseOrder_p(order_p);
				if (result == null) result = caseClause(order_p);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.USUARIO: {
				Usuario usuario = (Usuario)theEObject;
				T result = caseUsuario(usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AUTENTICACION: {
				Autenticacion autenticacion = (Autenticacion)theEObject;
				T result = caseAutenticacion(autenticacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.REGISTRO: {
				Registro registro = (Registro)theEObject;
				T result = caseRegistro(registro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.MANEJO_PERFIL: {
				ManejoPerfil manejoPerfil = (ManejoPerfil)theEObject;
				T result = caseManejoPerfil(manejoPerfil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ACCION: {
				Accion accion = (Accion)theEObject;
				T result = caseAccion(accion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CREAR_ALBUM: {
				CrearAlbum crearAlbum = (CrearAlbum)theEObject;
				T result = caseCrearAlbum(crearAlbum);
				if (result == null) result = caseAccion(crearAlbum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.VER_ALBUM: {
				VerAlbum verAlbum = (VerAlbum)theEObject;
				T result = caseVerAlbum(verAlbum);
				if (result == null) result = caseAccion(verAlbum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CARGAR_FOTO: {
				CargarFoto cargarFoto = (CargarFoto)theEObject;
				T result = caseCargarFoto(cargarFoto);
				if (result == null) result = caseAccion(cargarFoto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.VER_TODAS_LAS_FOTOS: {
				VerTodasLasFotos verTodasLasFotos = (VerTodasLasFotos)theEObject;
				T result = caseVerTodasLasFotos(verTodasLasFotos);
				if (result == null) result = caseAccion(verTodasLasFotos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.EDITAR_PERFIL: {
				EditarPerfil editarPerfil = (EditarPerfil)theEObject;
				T result = caseEditarPerfil(editarPerfil);
				if (result == null) result = caseAccion(editarPerfil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.FOTO: {
				Foto foto = (Foto)theEObject;
				T result = caseFoto(foto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CATEGORIA: {
				Categoria categoria = (Categoria)theEObject;
				T result = caseCategoria(categoria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.IMAGEN: {
				Imagen imagen = (Imagen)theEObject;
				T result = caseImagen(imagen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AMAZON_WEB_SERVICES: {
				AmazonWebServices amazonWebServices = (AmazonWebServices)theEObject;
				T result = caseAmazonWebServices(amazonWebServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.NTIER: {
				NTier nTier = (NTier)theEObject;
				T result = caseNTier(nTier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CAPA: {
				Capa capa = (Capa)theEObject;
				T result = caseCapa(capa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CONEXION: {
				Conexion conexion = (Conexion)theEObject;
				T result = caseConexion(conexion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.RELACION: {
				Relacion relacion = (Relacion)theEObject;
				T result = caseRelacion(relacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.REST: {
				REST rest = (REST)theEObject;
				T result = caseREST(rest);
				if (result == null) result = caseConexion(rest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CONEXION_POSTGRE_SQL: {
				ConexionPostgreSQL conexionPostgreSQL = (ConexionPostgreSQL)theEObject;
				T result = caseConexionPostgreSQL(conexionPostgreSQL);
				if (result == null) result = caseConexion(conexionPostgreSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AMAZON_S3API: {
				AmazonS3API amazonS3API = (AmazonS3API)theEObject;
				T result = caseAmazonS3API(amazonS3API);
				if (result == null) result = caseConexion(amazonS3API);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.PRESENTACION: {
				Presentacion presentacion = (Presentacion)theEObject;
				T result = casePresentacion(presentacion);
				if (result == null) result = caseCapa(presentacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.LOGICA_DE_NEGOCIO: {
				LogicaDeNegocio logicaDeNegocio = (LogicaDeNegocio)theEObject;
				T result = caseLogicaDeNegocio(logicaDeNegocio);
				if (result == null) result = caseCapa(logicaDeNegocio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.DATOS: {
				Datos datos = (Datos)theEObject;
				T result = caseDatos(datos);
				if (result == null) result = caseCapa(datos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ALLOWED_TO_USE: {
				AllowedToUse allowedToUse = (AllowedToUse)theEObject;
				T result = caseAllowedToUse(allowedToUse);
				if (result == null) result = caseRelacion(allowedToUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SEGMENTO_PRESENTACION: {
				SegmentoPresentacion segmentoPresentacion = (SegmentoPresentacion)theEObject;
				T result = caseSegmentoPresentacion(segmentoPresentacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SEGMENTO_LOGICA: {
				SegmentoLogica segmentoLogica = (SegmentoLogica)theEObject;
				T result = caseSegmentoLogica(segmentoLogica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SEGMENTO_DATOS: {
				SegmentoDatos segmentoDatos = (SegmentoDatos)theEObject;
				T result = caseSegmentoDatos(segmentoDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.VIEW_A: {
				View_a view_a = (View_a)theEObject;
				T result = caseView_a(view_a);
				if (result == null) result = caseSegmentoPresentacion(view_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.COMPONENT_A: {
				Component_a component_a = (Component_a)theEObject;
				T result = caseComponent_a(component_a);
				if (result == null) result = caseSegmentoPresentacion(component_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ACTION_A: {
				Action_a action_a = (Action_a)theEObject;
				T result = caseAction_a(action_a);
				if (result == null) result = caseSegmentoPresentacion(action_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CONTROLLER_A: {
				Controller_a controller_a = (Controller_a)theEObject;
				T result = caseController_a(controller_a);
				if (result == null) result = caseSegmentoLogica(controller_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.MODEL_A: {
				Model_a model_a = (Model_a)theEObject;
				T result = caseModel_a(model_a);
				if (result == null) result = caseSegmentoLogica(model_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.REPOSITORY_A: {
				Repository_a repository_a = (Repository_a)theEObject;
				T result = caseRepository_a(repository_a);
				if (result == null) result = caseSegmentoLogica(repository_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.SECURITY_A: {
				Security_a security_a = (Security_a)theEObject;
				T result = caseSecurity_a(security_a);
				if (result == null) result = caseSegmentoLogica(security_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.POSTGRE_SQL_A: {
				PostgreSQL_a postgreSQL_a = (PostgreSQL_a)theEObject;
				T result = casePostgreSQL_a(postgreSQL_a);
				if (result == null) result = caseSegmentoDatos(postgreSQL_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AMAZON_S3_STORAGE: {
				AmazonS3Storage amazonS3Storage = (AmazonS3Storage)theEObject;
				T result = caseAmazonS3Storage(amazonS3Storage);
				if (result == null) result = caseSegmentoDatos(amazonS3Storage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.REACT_DOM: {
				ReactDOM reactDOM = (ReactDOM)theEObject;
				T result = caseReactDOM(reactDOM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ELEMENT_R: {
				Element_r element_r = (Element_r)theEObject;
				T result = caseElement_r(element_r);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.COMPONENT_R: {
				Component_r component_r = (Component_r)theEObject;
				T result = caseComponent_r(component_r);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.PROP: {
				Prop prop = (Prop)theEObject;
				T result = caseProp(prop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CLASS_R: {
				Class_r class_r = (Class_r)theEObject;
				T result = caseClass_r(class_r);
				if (result == null) result = caseComponent_r(class_r);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.FUNCTION_R: {
				Function_r function_r = (Function_r)theEObject;
				T result = caseFunction_r(function_r);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.RENDER: {
				Render render = (Render)theEObject;
				T result = caseRender(render);
				if (result == null) result = caseFunction_r(render);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseFunction_r(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.COMPONENT_DID_MOUNT: {
				ComponentDidMount componentDidMount = (ComponentDidMount)theEObject;
				T result = caseComponentDidMount(componentDidMount);
				if (result == null) result = caseFunction_r(componentDidMount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.COMPONENT_WILL_UNMOUNT: {
				ComponentWillUnmount componentWillUnmount = (ComponentWillUnmount)theEObject;
				T result = caseComponentWillUnmount(componentWillUnmount);
				if (result == null) result = caseFunction_r(componentWillUnmount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AMAZON_ELASTIC_COMPUTE_CLOUD: {
				AmazonElasticComputeCloud amazonElasticComputeCloud = (AmazonElasticComputeCloud)theEObject;
				T result = caseAmazonElasticComputeCloud(amazonElasticComputeCloud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AMAZON_SIMPLE_STORAGE_SERVICE: {
				AmazonSimpleStorageService amazonSimpleStorageService = (AmazonSimpleStorageService)theEObject;
				T result = caseAmazonSimpleStorageService(amazonSimpleStorageService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AMAZON_AURORA: {
				AmazonAurora amazonAurora = (AmazonAurora)theEObject;
				T result = caseAmazonAurora(amazonAurora);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AMAZON_DYNAMO_DB: {
				AmazonDynamoDB amazonDynamoDB = (AmazonDynamoDB)theEObject;
				T result = caseAmazonDynamoDB(amazonDynamoDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.AMAZON_SAGE_MAKER: {
				AmazonSageMaker amazonSageMaker = (AmazonSageMaker)theEObject;
				T result = caseAmazonSageMaker(amazonSageMaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.BUCKET: {
				Bucket bucket = (Bucket)theEObject;
				T result = caseBucket(bucket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.BATCH_OPERATION: {
				BatchOperation batchOperation = (BatchOperation)theEObject;
				T result = caseBatchOperation(batchOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ACCESS: {
				Access access = (Access)theEObject;
				T result = caseAccess(access);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.PUBLIC: {
				Public public_ = (Public)theEObject;
				T result = casePublic(public_);
				if (result == null) result = caseAccess(public_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.OBJECTS_PUBLIC: {
				ObjectsPublic objectsPublic = (ObjectsPublic)theEObject;
				T result = caseObjectsPublic(objectsPublic);
				if (result == null) result = caseAccess(objectsPublic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.BUCKET_OBJECTS_NOT_PUBLIC: {
				BucketObjectsNotPublic bucketObjectsNotPublic = (BucketObjectsNotPublic)theEObject;
				T result = caseBucketObjectsNotPublic(bucketObjectsNotPublic);
				if (result == null) result = caseAccess(bucketObjectsNotPublic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.ONLY_AUTHORIZED: {
				OnlyAuthorized onlyAuthorized = (OnlyAuthorized)theEObject;
				T result = caseOnlyAuthorized(onlyAuthorized);
				if (result == null) result = caseAccess(onlyAuthorized);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.FILE_A: {
				File_a file_a = (File_a)theEObject;
				T result = caseFile_a(file_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.FOLDER_A: {
				Folder_a folder_a = (Folder_a)theEObject;
				T result = caseFolder_a(folder_a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotosMetaModelPackage.META_DATA: {
				MetaData metaData = (MetaData)theEObject;
				T result = caseMetaData(metaData);
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecture(Architecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnology(Technology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpring(Spring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>React</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>React</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReact(React object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestController(RestController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spring Boot Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spring Boot Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpringBootApplication(SpringBootApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestMapping(RequestMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostMapping(PostMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetMapping(GetMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Put Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Put Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePutMapping(PutMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandler(ExceptionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteMapping(DeleteMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestPart(RequestPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Autowired</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Autowired</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutowired(Autowired object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(PhotosMetaModel.Exception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable_s(Table_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseId(Id object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column p</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column p</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn_p(Column_p object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generated Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generated Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneratedValue(GeneratedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Native Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Native Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedNativeQuery(NamedNativeQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Criteria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Criteria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchCriteria(SearchCriteria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder_s(Order_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Authorization Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Authorization Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableAuthorizationServer(EnableAuthorizationServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Resource Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Resource Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableResourceServer(EnableResourceServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Web Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Web Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableWebSecurity(EnableWebSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Global Method Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Global Method Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableGlobalMethodSecurity(EnableGlobalMethodSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBean(Bean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postgre SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postgre SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostgreSQL(PostgreSQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKey(ForeignKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index p</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index p</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex_p(Index_p object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table p</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table p</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable_p(Table_p object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function p</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function p</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction_p(Function_p object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheme(Scheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User p</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User p</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser_p(User_p object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCluster(Cluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privilege</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privilege</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivilege(Privilege object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicy(Policy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClause(Clause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsert(Insert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrom(From object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoin(Join object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lateral</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lateral</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLateral(Lateral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhere(Where object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupBy(GroupBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Having</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Having</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHaving(Having object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distnct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distnct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistnct(Distnct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimit(Limit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffset(Offset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValues(Values object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlter(Alter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrop(Drop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Using</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Using</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsing(Using object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex(Index object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdate(Update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Into</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Into</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInto(Into object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column s</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column s</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn_s(Column_s object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order p</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order p</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder_p(Order_p object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Manejo Perfil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manejo Perfil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManejoPerfil(ManejoPerfil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccion(Accion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crear Album</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crear Album</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrearAlbum(CrearAlbum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ver Album</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ver Album</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerAlbum(VerAlbum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cargar Foto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cargar Foto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCargarFoto(CargarFoto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ver Todas Las Fotos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ver Todas Las Fotos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerTodasLasFotos(VerTodasLasFotos object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Foto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFoto(Foto object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Amazon Web Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon Web Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonWebServices(AmazonWebServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NTier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NTier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNTier(NTier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapa(Capa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conexion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conexion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConexion(Conexion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelacion(Relacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREST(REST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conexion Postgre SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conexion Postgre SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConexionPostgreSQL(ConexionPostgreSQL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon S3API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon S3API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonS3API(AmazonS3API object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentacion(Presentacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logica De Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logica De Negocio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicaDeNegocio(LogicaDeNegocio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatos(Datos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowed To Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowed To Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowedToUse(AllowedToUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segmento Presentacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segmento Presentacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentoPresentacion(SegmentoPresentacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segmento Logica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segmento Logica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentoLogica(SegmentoLogica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segmento Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segmento Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentoDatos(SegmentoDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView_a(View_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent_a(Component_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction_a(Action_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController_a(Controller_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_a(Model_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository_a(Repository_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity_a(Security_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postgre SQL a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postgre SQL a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostgreSQL_a(PostgreSQL_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon S3 Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon S3 Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonS3Storage(AmazonS3Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>React DOM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>React DOM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactDOM(ReactDOM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element r</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element r</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement_r(Element_r object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component r</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component r</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent_r(Component_r object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProp(Prop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class r</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class r</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass_r(Class_r object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function r</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function r</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction_r(Function_r object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Render</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Render</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRender(Render object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Did Mount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Did Mount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDidMount(ComponentDidMount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Will Unmount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Will Unmount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentWillUnmount(ComponentWillUnmount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon Elastic Compute Cloud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon Elastic Compute Cloud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonElasticComputeCloud(AmazonElasticComputeCloud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon Simple Storage Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon Simple Storage Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonSimpleStorageService(AmazonSimpleStorageService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon Aurora</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon Aurora</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonAurora(AmazonAurora object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon Dynamo DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon Dynamo DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonDynamoDB(AmazonDynamoDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Amazon Sage Maker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Amazon Sage Maker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmazonSageMaker(AmazonSageMaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bucket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bucket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBucket(Bucket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Batch Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batch Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatchOperation(BatchOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccess(Access object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublic(Public object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objects Public</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objects Public</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectsPublic(ObjectsPublic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bucket Objects Not Public</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bucket Objects Not Public</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBucketObjectsNotPublic(BucketObjectsNotPublic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Only Authorized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Only Authorized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlyAuthorized(OnlyAuthorized object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile_a(File_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolder_a(Folder_a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaData(MetaData object) {
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

} //PhotosMetaModelSwitch
