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

package org.eclipse.rmf.rif11.xsd.validation;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType;
import org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1;
import org.eclipse.rmf.rif11.xsd.SPECGROUPSType1;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1;
import org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1;
import org.eclipse.rmf.rif11.xsd.SPECRELATIONSType;
import org.eclipse.rmf.rif11.xsd.SPECTYPESType1;


/**
 * A sample validator interface for {@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ACCESSPOLICYValidator {
	boolean validate();

	boolean validateDESC(String value);
	boolean validateIDENTIFIER(String value);
	boolean validateLASTCHANGE(XMLGregorianCalendar value);
	boolean validateLONGNAME(String value);
	boolean validateACCESSMODE(ACCESSPOLICYACCESSMODEENUM value);
	boolean validateATTRIBUTEDEFINITIONS(ATTRIBUTEDEFINITIONSType value);
	boolean validateATTRIBUTEVALUES(ATTRIBUTEVALUESType value);
	boolean validateDATATYPEDEFINITIONS(DATATYPEDEFINITIONSType value);
	boolean validateRELATIONGROUPS(RELATIONGROUPSType1 value);
	boolean validateSPECGROUPS(SPECGROUPSType1 value);
	boolean validateSPECHIERARCHIES(SPECHIERARCHIESType value);
	boolean validateSPECHIERARCHYROOTS(SPECHIERARCHYROOTSType1 value);
	boolean validateSPECOBJECTS(SPECOBJECTSType1 value);
	boolean validateSPECRELATIONS(SPECRELATIONSType value);
	boolean validateSPECTYPES(SPECTYPESType1 value);
}
