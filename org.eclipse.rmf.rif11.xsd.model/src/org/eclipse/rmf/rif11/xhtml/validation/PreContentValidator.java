/*******************************************************************************
 * Copyright (c) 2011, 2012 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif11.xhtml.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.rmf.rif11.xhtml.AType;
import org.eclipse.rmf.rif11.xhtml.AbbrType;
import org.eclipse.rmf.rif11.xhtml.AcronymType;
import org.eclipse.rmf.rif11.xhtml.BType;
import org.eclipse.rmf.rif11.xhtml.BigType;
import org.eclipse.rmf.rif11.xhtml.BrType;
import org.eclipse.rmf.rif11.xhtml.CiteType;
import org.eclipse.rmf.rif11.xhtml.CodeType;
import org.eclipse.rmf.rif11.xhtml.DelType;
import org.eclipse.rmf.rif11.xhtml.DfnType;
import org.eclipse.rmf.rif11.xhtml.EmType;
import org.eclipse.rmf.rif11.xhtml.IType;
import org.eclipse.rmf.rif11.xhtml.InsType;
import org.eclipse.rmf.rif11.xhtml.KbdType;
import org.eclipse.rmf.rif11.xhtml.QType;
import org.eclipse.rmf.rif11.xhtml.SampType;
import org.eclipse.rmf.rif11.xhtml.SmallType;
import org.eclipse.rmf.rif11.xhtml.SpanType;
import org.eclipse.rmf.rif11.xhtml.StrikeType;
import org.eclipse.rmf.rif11.xhtml.StrongType;
import org.eclipse.rmf.rif11.xhtml.SubType;
import org.eclipse.rmf.rif11.xhtml.SupType;
import org.eclipse.rmf.rif11.xhtml.TtType;
import org.eclipse.rmf.rif11.xhtml.UType;
import org.eclipse.rmf.rif11.xhtml.VarType;


/**
 * A sample validator interface for {@link org.eclipse.rmf.rif11.xhtml.PreContent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PreContentValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateGroup(FeatureMap value);
	boolean validateA(EList<AType> value);
	boolean validateTt(EList<TtType> value);
	boolean validateI(EList<IType> value);
	boolean validateB(EList<BType> value);
	boolean validateBig(EList<BigType> value);
	boolean validateSmall(EList<SmallType> value);
	boolean validateU(EList<UType> value);
	boolean validateStrike(EList<StrikeType> value);
	boolean validateEm(EList<EmType> value);
	boolean validateStrong(EList<StrongType> value);
	boolean validateDfn(EList<DfnType> value);
	boolean validateCode(EList<CodeType> value);
	boolean validateQ(EList<QType> value);
	boolean validateSamp(EList<SampType> value);
	boolean validateKbd(EList<KbdType> value);
	boolean validateVar(EList<VarType> value);
	boolean validateCite(EList<CiteType> value);
	boolean validateAbbr(EList<AbbrType> value);
	boolean validateAcronym(EList<AcronymType> value);
	boolean validateSub(EList<SubType> value);
	boolean validateSup(EList<SupType> value);
	boolean validateBr(EList<BrType> value);
	boolean validateSpan(EList<SpanType> value);
	boolean validateIns(EList<InsType> value);
	boolean validateDel(EList<DelType> value);
}
