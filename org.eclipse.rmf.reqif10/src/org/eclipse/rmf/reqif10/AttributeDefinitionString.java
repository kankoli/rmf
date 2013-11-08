/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Attribute Definition String</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getType <em>Type</em>}</li>
 * <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionString()
 * @model extendedMetaData="name='ATTRIBUTE-DEFINITION-STRING' kind='elementOnly'" annotation=
 *        "http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='ATTRIBUTE-DEFINITION-STRING'"
 * @generated
 */
public interface AttributeDefinitionString extends AttributeDefinitionSimple {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(DatatypeDefinitionString)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionString_Type()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='TYPE' kind='element' namespace='##targetNamespace'" annotation=
	 *        "http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='TYPE' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='true' classifierNameSuffix='-REF'"
	 * @generated
	 */
	DatatypeDefinitionString getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getType <em>Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeDefinitionString value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getType <em>Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(DatatypeDefinitionString)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getType <em>Type</em>}
	 * ' reference is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(DatatypeDefinitionString)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #setDefaultValue(AttributeValueString)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionString_DefaultValue()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='DEFAULT-VALUE' kind='element' namespace='##targetNamespace'" annotation=
	 *        "http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='DEFAULT-VALUE' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	AttributeValueString getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getDefaultValue
	 * <em>Default Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Default Value</em>' containment reference.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AttributeValueString value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getDefaultValue
	 * <em>Default Value</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(AttributeValueString)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString#getDefaultValue
	 * <em>Default Value</em>}' containment reference is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Default Value</em>' containment reference is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(AttributeValueString)
	 * @generated
	 */
	boolean isSetDefaultValue();

} // AttributeDefinitionString
