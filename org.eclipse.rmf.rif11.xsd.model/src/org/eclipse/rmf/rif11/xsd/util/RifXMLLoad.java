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
package org.eclipse.rmf.rif11.xsd.util;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;

public class RifXMLLoad extends XMLLoadImpl {

	public RifXMLLoad(XMLHelper helper) {
		super(helper);
	}

/*	@Override
	protected DefaultHandler makeDefaultHandler() {
		return new RifSAXXMLHandler(resource, helper, options);
	}*/

}
