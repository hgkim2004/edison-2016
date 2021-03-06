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

package com.kisti.science.platform.app.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CommonModule service. Represents a row in the &quot;ScienceApp_CommonModule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.kisti.science.platform.app.model.impl.CommonModuleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.kisti.science.platform.app.model.impl.CommonModuleImpl}.
 * </p>
 *
 * @author Jerry H. Seo & Young Suh
 * @see CommonModule
 * @see com.kisti.science.platform.app.model.impl.CommonModuleImpl
 * @see com.kisti.science.platform.app.model.impl.CommonModuleModelImpl
 * @generated
 */
public interface CommonModuleModel extends BaseModel<CommonModule>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a common module model instance should use the {@link CommonModule} interface instead.
	 */

	/**
	 * Returns the primary key of this common module.
	 *
	 * @return the primary key of this common module
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this common module.
	 *
	 * @param primaryKey the primary key of this common module
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the group ID of this common module.
	 *
	 * @return the group ID of this common module
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this common module.
	 *
	 * @param groupId the group ID of this common module
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this common module.
	 *
	 * @return the company ID of this common module
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this common module.
	 *
	 * @param companyId the company ID of this common module
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this common module.
	 *
	 * @return the user ID of this common module
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this common module.
	 *
	 * @param userId the user ID of this common module
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this common module.
	 *
	 * @return the user uuid of this common module
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this common module.
	 *
	 * @param userUuid the user uuid of this common module
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this common module.
	 *
	 * @return the user name of this common module
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this common module.
	 *
	 * @param userName the user name of this common module
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this common module.
	 *
	 * @return the create date of this common module
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this common module.
	 *
	 * @param createDate the create date of this common module
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this common module.
	 *
	 * @return the modified date of this common module
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this common module.
	 *
	 * @param modifiedDate the modified date of this common module
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the module name of this common module.
	 *
	 * @return the module name of this common module
	 */
	@AutoEscape
	public String getModuleName();

	/**
	 * Sets the module name of this common module.
	 *
	 * @param moduleName the module name of this common module
	 */
	public void setModuleName(String moduleName);

	/**
	 * Returns the module root dir of this common module.
	 *
	 * @return the module root dir of this common module
	 */
	@AutoEscape
	public String getModuleRootDir();

	/**
	 * Sets the module root dir of this common module.
	 *
	 * @param moduleRootDir the module root dir of this common module
	 */
	public void setModuleRootDir(String moduleRootDir);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.kisti.science.platform.app.model.CommonModule commonModule);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.kisti.science.platform.app.model.CommonModule> toCacheModel();

	@Override
	public com.kisti.science.platform.app.model.CommonModule toEscapedModel();

	@Override
	public com.kisti.science.platform.app.model.CommonModule toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}