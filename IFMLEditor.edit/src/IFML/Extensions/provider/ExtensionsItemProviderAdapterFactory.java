/**
 */
package IFML.Extensions.provider;

import IFML.Extensions.util.ExtensionsAdapterFactory;

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
public class ExtensionsItemProviderAdapterFactory extends ExtensionsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ExtensionsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.OnSubmitEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnSubmitEventItemProvider onSubmitEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.OnSubmitEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOnSubmitEventAdapter() {
		if (onSubmitEventItemProvider == null) {
			onSubmitEventItemProvider = new OnSubmitEventItemProvider(this);
		}

		return onSubmitEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.ValidationRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationRuleItemProvider validationRuleItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.ValidationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createValidationRuleAdapter() {
		if (validationRuleItemProvider == null) {
			validationRuleItemProvider = new ValidationRuleItemProvider(this);
		}

		return validationRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.List} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListItemProvider listItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.List}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createListAdapter() {
		if (listItemProvider == null) {
			listItemProvider = new ListItemProvider(this);
		}

		return listItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.Position} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionItemProvider positionItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		if (positionItemProvider == null) {
			positionItemProvider = new PositionItemProvider(this);
		}

		return positionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.UserRole} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserRoleItemProvider userRoleItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.UserRole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createUserRoleAdapter() {
		if (userRoleItemProvider == null) {
			userRoleItemProvider = new UserRoleItemProvider(this);
		}

		return userRoleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.IFMLSlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLSlotItemProvider ifmlSlotItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.IFMLSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIFMLSlotAdapter() {
		if (ifmlSlotItemProvider == null) {
			ifmlSlotItemProvider = new IFMLSlotItemProvider(this);
		}

		return ifmlSlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.OnSelectEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnSelectEventItemProvider onSelectEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.OnSelectEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOnSelectEventAdapter() {
		if (onSelectEventItemProvider == null) {
			onSelectEventItemProvider = new OnSelectEventItemProvider(this);
		}

		return onSelectEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.Form} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormItemProvider formItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createFormAdapter() {
		if (formItemProvider == null) {
			formItemProvider = new FormItemProvider(this);
		}

		return formItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.Device} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceItemProvider deviceItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		if (deviceItemProvider == null) {
			deviceItemProvider = new DeviceItemProvider(this);
		}

		return deviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.SelectionField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionFieldItemProvider selectionFieldItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.SelectionField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSelectionFieldAdapter() {
		if (selectionFieldItemProvider == null) {
			selectionFieldItemProvider = new SelectionFieldItemProvider(this);
		}

		return selectionFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.SimpleField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleFieldItemProvider simpleFieldItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.SimpleField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSimpleFieldAdapter() {
		if (simpleFieldItemProvider == null) {
			simpleFieldItemProvider = new SimpleFieldItemProvider(this);
		}

		return simpleFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.Details} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailsItemProvider detailsItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.Details}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createDetailsAdapter() {
		if (detailsItemProvider == null) {
			detailsItemProvider = new DetailsItemProvider(this);
		}

		return detailsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.IFMLWindow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLWindowItemProvider ifmlWindowItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.IFMLWindow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIFMLWindowAdapter() {
		if (ifmlWindowItemProvider == null) {
			ifmlWindowItemProvider = new IFMLWindowItemProvider(this);
		}

		return ifmlWindowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.OnLoadEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnLoadEventItemProvider onLoadEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.OnLoadEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createOnLoadEventAdapter() {
		if (onLoadEventItemProvider == null) {
			onLoadEventItemProvider = new OnLoadEventItemProvider(this);
		}

		return onLoadEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.IFMLMenu} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IFMLMenuItemProvider ifmlMenuItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.IFMLMenu}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createIFMLMenuAdapter() {
		if (ifmlMenuItemProvider == null) {
			ifmlMenuItemProvider = new IFMLMenuItemProvider(this);
		}

		return ifmlMenuItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.JumpEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JumpEventItemProvider jumpEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.JumpEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createJumpEventAdapter() {
		if (jumpEventItemProvider == null) {
			jumpEventItemProvider = new JumpEventItemProvider(this);
		}

		return jumpEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.LandingEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingEventItemProvider landingEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.LandingEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createLandingEventAdapter() {
		if (landingEventItemProvider == null) {
			landingEventItemProvider = new LandingEventItemProvider(this);
		}

		return landingEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link IFML.Extensions.SetContextEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetContextEventItemProvider setContextEventItemProvider;

	/**
	 * This creates an adapter for a {@link IFML.Extensions.SetContextEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adapter createSetContextEventAdapter() {
		if (setContextEventItemProvider == null) {
			setContextEventItemProvider = new SetContextEventItemProvider(this);
		}

		return setContextEventItemProvider;
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
		if (onSubmitEventItemProvider != null) onSubmitEventItemProvider.dispose();
		if (validationRuleItemProvider != null) validationRuleItemProvider.dispose();
		if (listItemProvider != null) listItemProvider.dispose();
		if (positionItemProvider != null) positionItemProvider.dispose();
		if (userRoleItemProvider != null) userRoleItemProvider.dispose();
		if (ifmlSlotItemProvider != null) ifmlSlotItemProvider.dispose();
		if (onSelectEventItemProvider != null) onSelectEventItemProvider.dispose();
		if (formItemProvider != null) formItemProvider.dispose();
		if (deviceItemProvider != null) deviceItemProvider.dispose();
		if (selectionFieldItemProvider != null) selectionFieldItemProvider.dispose();
		if (simpleFieldItemProvider != null) simpleFieldItemProvider.dispose();
		if (detailsItemProvider != null) detailsItemProvider.dispose();
		if (ifmlWindowItemProvider != null) ifmlWindowItemProvider.dispose();
		if (onLoadEventItemProvider != null) onLoadEventItemProvider.dispose();
		if (ifmlMenuItemProvider != null) ifmlMenuItemProvider.dispose();
		if (jumpEventItemProvider != null) jumpEventItemProvider.dispose();
		if (landingEventItemProvider != null) landingEventItemProvider.dispose();
		if (setContextEventItemProvider != null) setContextEventItemProvider.dispose();
	}

}