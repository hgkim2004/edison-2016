/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.kisti.edison.science.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import org.kisti.edison.science.model.RequiredModule;
import org.kisti.edison.science.service.RequiredModuleLocalServiceUtil;

/**
 * The extended model base implementation for the RequiredModule service. Represents a row in the &quot;EDAPP_RequiredModule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RequiredModuleImpl}.
 * </p>
 *
 * @author EDISON
 * @see RequiredModuleImpl
 * @see org.kisti.edison.science.model.RequiredModule
 * @generated
 */
public abstract class RequiredModuleBaseImpl extends RequiredModuleModelImpl
	implements RequiredModule {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a required module model instance should use the {@link RequiredModule} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RequiredModuleLocalServiceUtil.addRequiredModule(this);
		}
		else {
			RequiredModuleLocalServiceUtil.updateRequiredModule(this);
		}
	}
}