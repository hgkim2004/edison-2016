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

package org.kisti.edison.science.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AppTestHistoryService}.
 *
 * @author EDISON
 * @see AppTestHistoryService
 * @generated
 */
public class AppTestHistoryServiceWrapper implements AppTestHistoryService,
	ServiceWrapper<AppTestHistoryService> {
	public AppTestHistoryServiceWrapper(
		AppTestHistoryService appTestHistoryService) {
		_appTestHistoryService = appTestHistoryService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _appTestHistoryService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_appTestHistoryService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _appTestHistoryService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AppTestHistoryService getWrappedAppTestHistoryService() {
		return _appTestHistoryService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAppTestHistoryService(
		AppTestHistoryService appTestHistoryService) {
		_appTestHistoryService = appTestHistoryService;
	}

	@Override
	public AppTestHistoryService getWrappedService() {
		return _appTestHistoryService;
	}

	@Override
	public void setWrappedService(AppTestHistoryService appTestHistoryService) {
		_appTestHistoryService = appTestHistoryService;
	}

	private AppTestHistoryService _appTestHistoryService;
}