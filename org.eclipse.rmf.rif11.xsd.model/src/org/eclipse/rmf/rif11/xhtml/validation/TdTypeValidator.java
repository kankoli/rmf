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

import java.math.BigInteger;
import java.util.List;

import org.eclipse.rmf.rif11.xhtml.AlignType;
import org.eclipse.rmf.rif11.xhtml.Scope;
import org.eclipse.rmf.rif11.xhtml.ValignType;


/**
 * A sample validator interface for {@link org.eclipse.rmf.rif11.xhtml.TdType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TdTypeValidator {
	boolean validate();

	boolean validateAbbr1(String value);
	boolean validateAlign(AlignType value);
	boolean validateAxis(Object value);
	boolean validateChar(String value);
	boolean validateCharoff(String value);
	boolean validateClass(List<String> value);
	boolean validateColspan(BigInteger value);
	boolean validateHeaders(List<String> value);
	boolean validateId(String value);
	boolean validateRowspan(BigInteger value);
	boolean validateScope(Scope value);
	boolean validateStyle(String value);
	boolean validateTitle(String value);
	boolean validateValign(ValignType value);
}
