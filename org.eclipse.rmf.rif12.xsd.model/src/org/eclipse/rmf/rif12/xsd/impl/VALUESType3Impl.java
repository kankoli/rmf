/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif12.xsd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEEMBEDDEDFILE;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEENUMERATION;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEFILEREFERENCE;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESIMPLE;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.VALUESType3;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VALUES Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.VALUESType3Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.VALUESType3Impl#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.VALUESType3Impl#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.VALUESType3Impl#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.VALUESType3Impl#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.VALUESType3Impl#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.VALUESType3Impl#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VALUESType3Impl extends EObjectImpl implements VALUESType3 {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VALUESType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.VALUES_TYPE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, RifPackage.VALUES_TYPE3__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEEMBEDDEDDOCUMENT> getATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return getGroup().list(RifPackage.Literals.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEEMBEDDEDFILE> getATTRIBUTEVALUEEMBEDDEDFILE() {
		return getGroup().list(RifPackage.Literals.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDFILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEENUMERATION> getATTRIBUTEVALUEENUMERATION() {
		return getGroup().list(RifPackage.Literals.VALUES_TYPE3__ATTRIBUTEVALUEENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEFILEREFERENCE> getATTRIBUTEVALUEFILEREFERENCE() {
		return getGroup().list(RifPackage.Literals.VALUES_TYPE3__ATTRIBUTEVALUEFILEREFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUESIMPLE> getATTRIBUTEVALUESIMPLE() {
		return getGroup().list(RifPackage.Literals.VALUES_TYPE3__ATTRIBUTEVALUESIMPLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEXMLDATA> getATTRIBUTEVALUEXMLDATA() {
		return getGroup().list(RifPackage.Literals.VALUES_TYPE3__ATTRIBUTEVALUEXMLDATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.VALUES_TYPE3__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				return ((InternalEList<?>)getATTRIBUTEVALUEEMBEDDEDDOCUMENT()).basicRemove(otherEnd, msgs);
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDFILE:
				return ((InternalEList<?>)getATTRIBUTEVALUEEMBEDDEDFILE()).basicRemove(otherEnd, msgs);
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEENUMERATION:
				return ((InternalEList<?>)getATTRIBUTEVALUEENUMERATION()).basicRemove(otherEnd, msgs);
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEFILEREFERENCE:
				return ((InternalEList<?>)getATTRIBUTEVALUEFILEREFERENCE()).basicRemove(otherEnd, msgs);
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUESIMPLE:
				return ((InternalEList<?>)getATTRIBUTEVALUESIMPLE()).basicRemove(otherEnd, msgs);
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEXMLDATA:
				return ((InternalEList<?>)getATTRIBUTEVALUEXMLDATA()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RifPackage.VALUES_TYPE3__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				return getATTRIBUTEVALUEEMBEDDEDDOCUMENT();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDFILE:
				return getATTRIBUTEVALUEEMBEDDEDFILE();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEENUMERATION:
				return getATTRIBUTEVALUEENUMERATION();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEFILEREFERENCE:
				return getATTRIBUTEVALUEFILEREFERENCE();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUESIMPLE:
				return getATTRIBUTEVALUESIMPLE();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEXMLDATA:
				return getATTRIBUTEVALUEXMLDATA();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RifPackage.VALUES_TYPE3__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				getATTRIBUTEVALUEEMBEDDEDDOCUMENT().clear();
				getATTRIBUTEVALUEEMBEDDEDDOCUMENT().addAll((Collection<? extends ATTRIBUTEVALUEEMBEDDEDDOCUMENT>)newValue);
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDFILE:
				getATTRIBUTEVALUEEMBEDDEDFILE().clear();
				getATTRIBUTEVALUEEMBEDDEDFILE().addAll((Collection<? extends ATTRIBUTEVALUEEMBEDDEDFILE>)newValue);
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEENUMERATION:
				getATTRIBUTEVALUEENUMERATION().clear();
				getATTRIBUTEVALUEENUMERATION().addAll((Collection<? extends ATTRIBUTEVALUEENUMERATION>)newValue);
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEFILEREFERENCE:
				getATTRIBUTEVALUEFILEREFERENCE().clear();
				getATTRIBUTEVALUEFILEREFERENCE().addAll((Collection<? extends ATTRIBUTEVALUEFILEREFERENCE>)newValue);
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUESIMPLE:
				getATTRIBUTEVALUESIMPLE().clear();
				getATTRIBUTEVALUESIMPLE().addAll((Collection<? extends ATTRIBUTEVALUESIMPLE>)newValue);
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEXMLDATA:
				getATTRIBUTEVALUEXMLDATA().clear();
				getATTRIBUTEVALUEXMLDATA().addAll((Collection<? extends ATTRIBUTEVALUEXMLDATA>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RifPackage.VALUES_TYPE3__GROUP:
				getGroup().clear();
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				getATTRIBUTEVALUEEMBEDDEDDOCUMENT().clear();
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDFILE:
				getATTRIBUTEVALUEEMBEDDEDFILE().clear();
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEENUMERATION:
				getATTRIBUTEVALUEENUMERATION().clear();
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEFILEREFERENCE:
				getATTRIBUTEVALUEFILEREFERENCE().clear();
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUESIMPLE:
				getATTRIBUTEVALUESIMPLE().clear();
				return;
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEXMLDATA:
				getATTRIBUTEVALUEXMLDATA().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RifPackage.VALUES_TYPE3__GROUP:
				return group != null && !group.isEmpty();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				return !getATTRIBUTEVALUEEMBEDDEDDOCUMENT().isEmpty();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDFILE:
				return !getATTRIBUTEVALUEEMBEDDEDFILE().isEmpty();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEENUMERATION:
				return !getATTRIBUTEVALUEENUMERATION().isEmpty();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEFILEREFERENCE:
				return !getATTRIBUTEVALUEFILEREFERENCE().isEmpty();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUESIMPLE:
				return !getATTRIBUTEVALUESIMPLE().isEmpty();
			case RifPackage.VALUES_TYPE3__ATTRIBUTEVALUEXMLDATA:
				return !getATTRIBUTEVALUEXMLDATA().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //VALUESType3Impl
