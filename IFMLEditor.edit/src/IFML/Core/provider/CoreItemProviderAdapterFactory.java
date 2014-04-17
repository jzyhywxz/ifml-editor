/**
 */
package IFML.Core.provider;

import IFML.Core.util.CoreAdapterFactory;

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
public class CoreItemProviderAdapterFactory extends CoreAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	protected Collection supportedTypes = new ArrayList();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.InteractionFlowExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFlowExpressionItemProvider interactionFlowExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.InteractionFlowExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createInteractionFlowExpressionAdapter() {
		if (interactionFlowExpressionItemProvider == null) {
			interactionFlowExpressionItemProvider = new InteractionFlowExpressionItemProvider(this);
		}

		return interactionFlowExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.SystemEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemEventItemProvider systemEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.SystemEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSystemEventAdapter() {
		if (systemEventItemProvider == null) {
			systemEventItemProvider = new SystemEventItemProvider(this);
		}

		return systemEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ParameterBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBindingItemProvider parameterBindingItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createParameterBindingAdapter() {
		if (parameterBindingItemProvider == null) {
			parameterBindingItemProvider = new ParameterBindingItemProvider(this);
		}

		return parameterBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ActionEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionEventItemProvider actionEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ActionEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createActionEventAdapter() {
		if (actionEventItemProvider == null) {
			actionEventItemProvider = new ActionEventItemProvider(this);
		}

		return actionEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.DomainModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainModelItemProvider domainModelItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.DomainModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		if (domainModelItemProvider == null) {
			domainModelItemProvider = new DomainModelItemProvider(this);
		}

		return domainModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.PortDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortDefinitionItemProvider portDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.PortDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPortDefinitionAdapter() {
		if (portDefinitionItemProvider == null) {
			portDefinitionItemProvider = new PortDefinitionItemProvider(this);
		}

		return portDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ViewElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewElementItemProvider viewElementItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ViewElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		if (viewElementItemProvider == null) {
			viewElementItemProvider = new ViewElementItemProvider(this);
		}

		return viewElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.DynamicBehavior} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicBehaviorItemProvider dynamicBehaviorItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.DynamicBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDynamicBehaviorAdapter() {
		if (dynamicBehaviorItemProvider == null) {
			dynamicBehaviorItemProvider = new DynamicBehaviorItemProvider(this);
		}

		return dynamicBehaviorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.Viewpoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointItemProvider viewpointItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.Viewpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createViewpointAdapter() {
		if (viewpointItemProvider == null) {
			viewpointItemProvider = new ViewpointItemProvider(this);
		}

		return viewpointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.DataFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowItemProvider dataFlowItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		if (dataFlowItemProvider == null) {
			dataFlowItemProvider = new DataFlowItemProvider(this);
		}

		return dataFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ViewComponentPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewComponentPartItemProvider viewComponentPartItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ViewComponentPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createViewComponentPartAdapter() {
		if (viewComponentPartItemProvider == null) {
			viewComponentPartItemProvider = new ViewComponentPartItemProvider(this);
		}

		return viewComponentPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ViewContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewContainerItemProvider viewContainerItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ViewContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createViewContainerAdapter() {
		if (viewContainerItemProvider == null) {
			viewContainerItemProvider = new ViewContainerItemProvider(this);
		}

		return viewContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ActivationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivationExpressionItemProvider activationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ActivationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createActivationExpressionAdapter() {
		if (activationExpressionItemProvider == null) {
			activationExpressionItemProvider = new ActivationExpressionItemProvider(this);
		}

		return activationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.InteractionFlowModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFlowModelItemProvider interactionFlowModelItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.InteractionFlowModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createInteractionFlowModelAdapter() {
		if (interactionFlowModelItemProvider == null) {
			interactionFlowModelItemProvider = new InteractionFlowModelItemProvider(this);
		}

		return interactionFlowModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ContextDimension} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextDimensionItemProvider contextDimensionItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ContextDimension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createContextDimensionAdapter() {
		if (contextDimensionItemProvider == null) {
			contextDimensionItemProvider = new ContextDimensionItemProvider(this);
		}

		return contextDimensionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.IFMLModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLModelItemProvider ifmlModelItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.IFMLModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIFMLModelAdapter() {
		if (ifmlModelItemProvider == null) {
			ifmlModelItemProvider = new IFMLModelItemProvider(this);
		}

		return ifmlModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ModuleDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDefinitionItemProvider moduleDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ModuleDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createModuleDefinitionAdapter() {
		if (moduleDefinitionItemProvider == null) {
			moduleDefinitionItemProvider = new ModuleDefinitionItemProvider(this);
		}

		return moduleDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.BooleanExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanExpressionItemProvider booleanExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.BooleanExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		if (booleanExpressionItemProvider == null) {
			booleanExpressionItemProvider = new BooleanExpressionItemProvider(this);
		}

		return booleanExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.IFMLAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLActionItemProvider ifmlActionItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.IFMLAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIFMLActionAdapter() {
		if (ifmlActionItemProvider == null) {
			ifmlActionItemProvider = new IFMLActionItemProvider(this);
		}

		return ifmlActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.NavigationFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationFlowItemProvider navigationFlowItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.NavigationFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createNavigationFlowAdapter() {
		if (navigationFlowItemProvider == null) {
			navigationFlowItemProvider = new NavigationFlowItemProvider(this);
		}

		return navigationFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ParameterBindingGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBindingGroupItemProvider parameterBindingGroupItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ParameterBindingGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createParameterBindingGroupAdapter() {
		if (parameterBindingGroupItemProvider == null) {
			parameterBindingGroupItemProvider = new ParameterBindingGroupItemProvider(this);
		}

		return parameterBindingGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.Constraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintItemProvider constraintItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		if (constraintItemProvider == null) {
			constraintItemProvider = new ConstraintItemProvider(this);
		}

		return constraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ViewComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewComponentItemProvider viewComponentItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ViewComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createViewComponentAdapter() {
		if (viewComponentItemProvider == null) {
			viewComponentItemProvider = new ViewComponentItemProvider(this);
		}

		return viewComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.IFMLParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLParameterItemProvider ifmlParameterItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.IFMLParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIFMLParameterAdapter() {
		if (ifmlParameterItemProvider == null) {
			ifmlParameterItemProvider = new IFMLParameterItemProvider(this);
		}

		return ifmlParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.DataBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBindingItemProvider dataBindingItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.DataBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDataBindingAdapter() {
		if (dataBindingItemProvider == null) {
			dataBindingItemProvider = new DataBindingItemProvider(this);
		}

		return dataBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ConditionalExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalExpressionItemProvider conditionalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ConditionalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createConditionalExpressionAdapter() {
		if (conditionalExpressionItemProvider == null) {
			conditionalExpressionItemProvider = new ConditionalExpressionItemProvider(this);
		}

		return conditionalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.Context} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextItemProvider contextItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createContextAdapter() {
		if (contextItemProvider == null) {
			contextItemProvider = new ContextItemProvider(this);
		}

		return contextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.VisualizationAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualizationAttributeItemProvider visualizationAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.VisualizationAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createVisualizationAttributeAdapter() {
		if (visualizationAttributeItemProvider == null) {
			visualizationAttributeItemProvider = new VisualizationAttributeItemProvider(this);
		}

		return visualizationAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ViewElementEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewElementEventItemProvider viewElementEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ViewElementEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createViewElementEventAdapter() {
		if (viewElementEventItemProvider == null) {
			viewElementEventItemProvider = new ViewElementEventItemProvider(this);
		}

		return viewElementEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ModulePackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulePackageItemProvider modulePackageItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ModulePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createModulePackageAdapter() {
		if (modulePackageItemProvider == null) {
			modulePackageItemProvider = new ModulePackageItemProvider(this);
		}

		return modulePackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ModularizationElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModularizationElementItemProvider modularizationElementItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ModularizationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createModularizationElementAdapter() {
		if (modularizationElementItemProvider == null) {
			modularizationElementItemProvider = new ModularizationElementItemProvider(this);
		}

		return modularizationElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.IFMLModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLModuleItemProvider ifmlModuleItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.IFMLModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIFMLModuleAdapter() {
		if (ifmlModuleItemProvider == null) {
			ifmlModuleItemProvider = new IFMLModuleItemProvider(this);
		}

		return ifmlModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.IFMLPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLPortItemProvider ifmlPortItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.IFMLPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIFMLPortAdapter() {
		if (ifmlPortItemProvider == null) {
			ifmlPortItemProvider = new IFMLPortItemProvider(this);
		}

		return ifmlPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.CatchingEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatchingEventItemProvider catchingEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.CatchingEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createCatchingEventAdapter() {
		if (catchingEventItemProvider == null) {
			catchingEventItemProvider = new CatchingEventItemProvider(this);
		}

		return catchingEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ThrowingEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrowingEventItemProvider throwingEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ThrowingEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createThrowingEventAdapter() {
		if (throwingEventItemProvider == null) {
			throwingEventItemProvider = new ThrowingEventItemProvider(this);
		}

		return throwingEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.BPMNActivityConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNActivityConceptItemProvider bpmnActivityConceptItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.BPMNActivityConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBPMNActivityConceptAdapter() {
		if (bpmnActivityConceptItemProvider == null) {
			bpmnActivityConceptItemProvider = new BPMNActivityConceptItemProvider(this);
		}

		return bpmnActivityConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ContextVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextVariableItemProvider contextVariableItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ContextVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createContextVariableAdapter() {
		if (contextVariableItemProvider == null) {
			contextVariableItemProvider = new ContextVariableItemProvider(this);
		}

		return contextVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.SimpleContextVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleContextVariableItemProvider simpleContextVariableItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.SimpleContextVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSimpleContextVariableAdapter() {
		if (simpleContextVariableItemProvider == null) {
			simpleContextVariableItemProvider = new SimpleContextVariableItemProvider(this);
		}

		return simpleContextVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.DataContextVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataContextVariableItemProvider dataContextVariableItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.DataContextVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDataContextVariableAdapter() {
		if (dataContextVariableItemProvider == null) {
			dataContextVariableItemProvider = new DataContextVariableItemProvider(this);
		}

		return dataContextVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.DomainConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainConceptItemProvider domainConceptItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.DomainConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDomainConceptAdapter() {
		if (domainConceptItemProvider == null) {
			domainConceptItemProvider = new DomainConceptItemProvider(this);
		}

		return domainConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.FeatureConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureConceptItemProvider featureConceptItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.FeatureConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFeatureConceptAdapter() {
		if (featureConceptItemProvider == null) {
			featureConceptItemProvider = new FeatureConceptItemProvider(this);
		}

		return featureConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.BehaviorConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorConceptItemProvider behaviorConceptItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.BehaviorConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBehaviorConceptAdapter() {
		if (behaviorConceptItemProvider == null) {
			behaviorConceptItemProvider = new BehaviorConceptItemProvider(this);
		}

		return behaviorConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.BehavioralFeatureConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureConceptItemProvider behavioralFeatureConceptItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.BehavioralFeatureConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createBehavioralFeatureConceptAdapter() {
		if (behavioralFeatureConceptItemProvider == null) {
			behavioralFeatureConceptItemProvider = new BehavioralFeatureConceptItemProvider(this);
		}

		return behavioralFeatureConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.UMLBehavior} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLBehaviorItemProvider umlBehaviorItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.UMLBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createUMLBehaviorAdapter() {
		if (umlBehaviorItemProvider == null) {
			umlBehaviorItemProvider = new UMLBehaviorItemProvider(this);
		}

		return umlBehaviorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.UMLBehavioralFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLBehavioralFeatureItemProvider umlBehavioralFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.UMLBehavioralFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createUMLBehavioralFeatureAdapter() {
		if (umlBehavioralFeatureItemProvider == null) {
			umlBehavioralFeatureItemProvider = new UMLBehavioralFeatureItemProvider(this);
		}

		return umlBehavioralFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.UMLDomainConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLDomainConceptItemProvider umlDomainConceptItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.UMLDomainConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createUMLDomainConceptAdapter() {
		if (umlDomainConceptItemProvider == null) {
			umlDomainConceptItemProvider = new UMLDomainConceptItemProvider(this);
		}

		return umlDomainConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.UMLStructuralFeature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLStructuralFeatureItemProvider umlStructuralFeatureItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.UMLStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createUMLStructuralFeatureAdapter() {
		if (umlStructuralFeatureItemProvider == null) {
			umlStructuralFeatureItemProvider = new UMLStructuralFeatureItemProvider(this);
		}

		return umlStructuralFeatureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.ActivityConcept} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityConceptItemProvider activityConceptItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.ActivityConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createActivityConceptAdapter() {
		if (activityConceptItemProvider == null) {
			activityConceptItemProvider = new ActivityConceptItemProvider(this);
		}

		return activityConceptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Core.DomainElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainElementItemProvider domainElementItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Core.DomainElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDomainElementAdapter() {
		if (domainElementItemProvider == null) {
			domainElementItemProvider = new DomainElementItemProvider(this);
		}

		return domainElementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class)type).isInstance(adapter))) {
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
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void dispose() {
		if (interactionFlowExpressionItemProvider != null) interactionFlowExpressionItemProvider.dispose();
		if (systemEventItemProvider != null) systemEventItemProvider.dispose();
		if (parameterBindingItemProvider != null) parameterBindingItemProvider.dispose();
		if (actionEventItemProvider != null) actionEventItemProvider.dispose();
		if (domainModelItemProvider != null) domainModelItemProvider.dispose();
		if (portDefinitionItemProvider != null) portDefinitionItemProvider.dispose();
		if (viewElementItemProvider != null) viewElementItemProvider.dispose();
		if (dynamicBehaviorItemProvider != null) dynamicBehaviorItemProvider.dispose();
		if (viewpointItemProvider != null) viewpointItemProvider.dispose();
		if (dataFlowItemProvider != null) dataFlowItemProvider.dispose();
		if (viewComponentPartItemProvider != null) viewComponentPartItemProvider.dispose();
		if (viewContainerItemProvider != null) viewContainerItemProvider.dispose();
		if (activationExpressionItemProvider != null) activationExpressionItemProvider.dispose();
		if (interactionFlowModelItemProvider != null) interactionFlowModelItemProvider.dispose();
		if (contextDimensionItemProvider != null) contextDimensionItemProvider.dispose();
		if (ifmlModelItemProvider != null) ifmlModelItemProvider.dispose();
		if (moduleDefinitionItemProvider != null) moduleDefinitionItemProvider.dispose();
		if (booleanExpressionItemProvider != null) booleanExpressionItemProvider.dispose();
		if (ifmlActionItemProvider != null) ifmlActionItemProvider.dispose();
		if (navigationFlowItemProvider != null) navigationFlowItemProvider.dispose();
		if (parameterBindingGroupItemProvider != null) parameterBindingGroupItemProvider.dispose();
		if (constraintItemProvider != null) constraintItemProvider.dispose();
		if (viewComponentItemProvider != null) viewComponentItemProvider.dispose();
		if (ifmlParameterItemProvider != null) ifmlParameterItemProvider.dispose();
		if (dataBindingItemProvider != null) dataBindingItemProvider.dispose();
		if (conditionalExpressionItemProvider != null) conditionalExpressionItemProvider.dispose();
		if (contextItemProvider != null) contextItemProvider.dispose();
		if (visualizationAttributeItemProvider != null) visualizationAttributeItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (viewElementEventItemProvider != null) viewElementEventItemProvider.dispose();
		if (annotationItemProvider != null) annotationItemProvider.dispose();
		if (modulePackageItemProvider != null) modulePackageItemProvider.dispose();
		if (modularizationElementItemProvider != null) modularizationElementItemProvider.dispose();
		if (ifmlModuleItemProvider != null) ifmlModuleItemProvider.dispose();
		if (ifmlPortItemProvider != null) ifmlPortItemProvider.dispose();
		if (catchingEventItemProvider != null) catchingEventItemProvider.dispose();
		if (throwingEventItemProvider != null) throwingEventItemProvider.dispose();
		if (bpmnActivityConceptItemProvider != null) bpmnActivityConceptItemProvider.dispose();
		if (contextVariableItemProvider != null) contextVariableItemProvider.dispose();
		if (simpleContextVariableItemProvider != null) simpleContextVariableItemProvider.dispose();
		if (dataContextVariableItemProvider != null) dataContextVariableItemProvider.dispose();
		if (domainConceptItemProvider != null) domainConceptItemProvider.dispose();
		if (featureConceptItemProvider != null) featureConceptItemProvider.dispose();
		if (behaviorConceptItemProvider != null) behaviorConceptItemProvider.dispose();
		if (behavioralFeatureConceptItemProvider != null) behavioralFeatureConceptItemProvider.dispose();
		if (umlBehaviorItemProvider != null) umlBehaviorItemProvider.dispose();
		if (umlBehavioralFeatureItemProvider != null) umlBehavioralFeatureItemProvider.dispose();
		if (umlDomainConceptItemProvider != null) umlDomainConceptItemProvider.dispose();
		if (umlStructuralFeatureItemProvider != null) umlStructuralFeatureItemProvider.dispose();
		if (activityConceptItemProvider != null) activityConceptItemProvider.dispose();
		if (domainElementItemProvider != null) domainElementItemProvider.dispose();
	}

}
