/*******************************************************************************
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.configuration.provider;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	ColumnTest.class, 
	ConfigurationUtilTest.class,
	LabelConfigurationTest.class,
	ProrGeneralConfigurationTest.class,
	ProrPresentationConfigurationsTest.class,
	ProrPresentationConfigurationTest.class,
	ProrSpecViewConfigurationTest.class,
	ProrToolExtensionTest.class
	})
public class AllConfigurationTests {
	


}
