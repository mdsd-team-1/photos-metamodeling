/**
 */
package SystemMetamodel.provider;

import SystemMetamodel.util.SystemMetamodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemMetamodelItemProviderAdapterFactory extends SystemMetamodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetamodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.LayeredStyle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayeredStyleItemProvider layeredStyleItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.LayeredStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayeredStyleAdapter() {
		if (layeredStyleItemProvider == null) {
			layeredStyleItemProvider = new LayeredStyleItemProvider(this);
		}

		return layeredStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Layer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerItemProvider layerItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayerAdapter() {
		if (layerItemProvider == null) {
			layerItemProvider = new LayerItemProvider(this);
		}

		return layerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Relation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationItemProvider relationItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationAdapter() {
		if (relationItemProvider == null) {
			relationItemProvider = new RelationItemProvider(this);
		}

		return relationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.LayerSegment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerSegmentItemProvider layerSegmentItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.LayerSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayerSegmentAdapter() {
		if (layerSegmentItemProvider == null) {
			layerSegmentItemProvider = new LayerSegmentItemProvider(this);
		}

		return layerSegmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.AllowedToUse} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedToUseItemProvider allowedToUseItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.AllowedToUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllowedToUseAdapter() {
		if (allowedToUseItemProvider == null) {
			allowedToUseItemProvider = new AllowedToUseItemProvider(this);
		}

		return allowedToUseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.AllowedToUseBelow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedToUseBelowItemProvider allowedToUseBelowItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.AllowedToUseBelow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllowedToUseBelowAdapter() {
		if (allowedToUseBelowItemProvider == null) {
			allowedToUseBelowItemProvider = new AllowedToUseBelowItemProvider(this);
		}

		return allowedToUseBelowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Table} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableItemProvider tableItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableAdapter() {
		if (tableItemProvider == null) {
			tableItemProvider = new TableItemProvider(this);
		}

		return tableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Column} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnItemProvider columnItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColumnAdapter() {
		if (columnItemProvider == null) {
			columnItemProvider = new ColumnItemProvider(this);
		}

		return columnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.ForeignKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyItemProvider foreignKeyItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForeignKeyAdapter() {
		if (foreignKeyItemProvider == null) {
			foreignKeyItemProvider = new ForeignKeyItemProvider(this);
		}

		return foreignKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Classifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierItemProvider classifierItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassifierAdapter() {
		if (classifierItemProvider == null) {
			classifierItemProvider = new ClassifierItemProvider(this);
		}

		return classifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.PrimitiveDataType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveDataTypeItemProvider primitiveDataTypeItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.PrimitiveDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveDataTypeAdapter() {
		if (primitiveDataTypeItemProvider == null) {
			primitiveDataTypeItemProvider = new PrimitiveDataTypeItemProvider(this);
		}

		return primitiveDataTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Association} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationItemProvider associationItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Association}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationAdapter() {
		if (associationItemProvider == null) {
			associationItemProvider = new AssociationItemProvider(this);
		}

		return associationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Member} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberItemProvider memberItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemberAdapter() {
		if (memberItemProvider == null) {
			memberItemProvider = new MemberItemProvider(this);
		}

		return memberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Function} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionItemProvider functionItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionAdapter() {
		if (functionItemProvider == null) {
			functionItemProvider = new FunctionItemProvider(this);
		}

		return functionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Folder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderItemProvider folderItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Folder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFolderAdapter() {
		if (folderItemProvider == null) {
			folderItemProvider = new FolderItemProvider(this);
		}

		return folderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.File} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileItemProvider fileItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileAdapter() {
		if (fileItemProvider == null) {
			fileItemProvider = new FileItemProvider(this);
		}

		return fileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Connection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionItemProvider connectionItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionAdapter() {
		if (connectionItemProvider == null) {
			connectionItemProvider = new ConnectionItemProvider(this);
		}

		return connectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Database} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseItemProvider databaseItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Database}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDatabaseAdapter() {
		if (databaseItemProvider == null) {
			databaseItemProvider = new DatabaseItemProvider(this);
		}

		return databaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Media} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaItemProvider mediaItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Media}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMediaAdapter() {
		if (mediaItemProvider == null) {
			mediaItemProvider = new MediaItemProvider(this);
		}

		return mediaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Code} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeItemProvider codeItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeAdapter() {
		if (codeItemProvider == null) {
			codeItemProvider = new CodeItemProvider(this);
		}

		return codeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Schema} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaItemProvider schemaItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSchemaAdapter() {
		if (schemaItemProvider == null) {
			schemaItemProvider = new SchemaItemProvider(this);
		}

		return schemaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link SystemMetamodel.Element} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementItemProvider elementItemProvider;

	/**
	 * This creates an adapter for a {@link SystemMetamodel.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementAdapter() {
		if (elementItemProvider == null) {
			elementItemProvider = new ElementItemProvider(this);
		}

		return elementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (layeredStyleItemProvider != null) layeredStyleItemProvider.dispose();
		if (layerItemProvider != null) layerItemProvider.dispose();
		if (relationItemProvider != null) relationItemProvider.dispose();
		if (layerSegmentItemProvider != null) layerSegmentItemProvider.dispose();
		if (allowedToUseItemProvider != null) allowedToUseItemProvider.dispose();
		if (allowedToUseBelowItemProvider != null) allowedToUseBelowItemProvider.dispose();
		if (tableItemProvider != null) tableItemProvider.dispose();
		if (columnItemProvider != null) columnItemProvider.dispose();
		if (foreignKeyItemProvider != null) foreignKeyItemProvider.dispose();
		if (classifierItemProvider != null) classifierItemProvider.dispose();
		if (primitiveDataTypeItemProvider != null) primitiveDataTypeItemProvider.dispose();
		if (classItemProvider != null) classItemProvider.dispose();
		if (associationItemProvider != null) associationItemProvider.dispose();
		if (memberItemProvider != null) memberItemProvider.dispose();
		if (functionItemProvider != null) functionItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (folderItemProvider != null) folderItemProvider.dispose();
		if (fileItemProvider != null) fileItemProvider.dispose();
		if (connectionItemProvider != null) connectionItemProvider.dispose();
		if (databaseItemProvider != null) databaseItemProvider.dispose();
		if (mediaItemProvider != null) mediaItemProvider.dispose();
		if (codeItemProvider != null) codeItemProvider.dispose();
		if (schemaItemProvider != null) schemaItemProvider.dispose();
		if (annotationItemProvider != null) annotationItemProvider.dispose();
		if (elementItemProvider != null) elementItemProvider.dispose();
	}

}
