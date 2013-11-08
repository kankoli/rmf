/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.xhtml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.rmf.reqif10.xhtml.XhtmlFactory;
import org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XhtmlInlPresTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlInlPresTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addClassPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addSpacePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlInlPresType_class_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlInlPresType_class_feature", "_UI_XhtmlInlPresType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlInlPresType_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlInlPresType_id_feature", "_UI_XhtmlInlPresType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lang feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlInlPresType_lang_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlInlPresType_lang_feature", "_UI_XhtmlInlPresType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Lang(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlInlPresType_space_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlInlPresType_space_feature", "_UI_XhtmlInlPresType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Space(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlInlPresType_style_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlInlPresType_style_feature", "_UI_XhtmlInlPresType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Style(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlInlPresType_title_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlInlPresType_title_feature", "_UI_XhtmlInlPresType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Title(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns XhtmlInlPresType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XhtmlInlPresType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XhtmlInlPresType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_XhtmlInlPresType_type") : //$NON-NLS-1$
			getString("_UI_XhtmlInlPresType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(XhtmlInlPresType.class)) {
			case XhtmlPackage.XHTML_INL_PRES_TYPE__CLASS:
			case XhtmlPackage.XHTML_INL_PRES_TYPE__ID:
			case XhtmlPackage.XHTML_INL_PRES_TYPE__LANG:
			case XhtmlPackage.XHTML_INL_PRES_TYPE__SPACE:
			case XhtmlPackage.XHTML_INL_PRES_TYPE__STYLE:
			case XhtmlPackage.XHTML_INL_PRES_TYPE__TITLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XhtmlPackage.XHTML_INL_PRES_TYPE__MIXED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Br(),
					 XhtmlFactory.eINSTANCE.createXhtmlBrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Span(),
					 XhtmlFactory.eINSTANCE.createXhtmlSpanType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Em(),
					 XhtmlFactory.eINSTANCE.createXhtmlEmType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Strong(),
					 XhtmlFactory.eINSTANCE.createXhtmlStrongType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Dfn(),
					 XhtmlFactory.eINSTANCE.createXhtmlDfnType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Code(),
					 XhtmlFactory.eINSTANCE.createXhtmlCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Samp(),
					 XhtmlFactory.eINSTANCE.createXhtmlSampType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Kbd(),
					 XhtmlFactory.eINSTANCE.createXhtmlKbdType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Var(),
					 XhtmlFactory.eINSTANCE.createXhtmlVarType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Cite(),
					 XhtmlFactory.eINSTANCE.createXhtmlCiteType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Abbr(),
					 XhtmlFactory.eINSTANCE.createXhtmlAbbrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Acronym(),
					 XhtmlFactory.eINSTANCE.createXhtmlAcronymType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Q(),
					 XhtmlFactory.eINSTANCE.createXhtmlQType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Tt(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_I(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_B(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Big(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Small(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Sub(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Sup(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_A(),
					 XhtmlFactory.eINSTANCE.createXhtmlAType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Object(),
					 XhtmlFactory.eINSTANCE.createXhtmlObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Ins(),
					 XhtmlFactory.eINSTANCE.createXhtmlEditType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Del(),
					 XhtmlFactory.eINSTANCE.createXhtmlEditType())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Tt() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlInlPresType_I() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlInlPresType_B() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Big() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Small() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Sub() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Sup() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Ins() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlInlPresType_Del();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XhtmlEditPlugin.INSTANCE;
	}

}
