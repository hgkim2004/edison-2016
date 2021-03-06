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

package org.kisti.edison.science.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import org.kisti.edison.science.service.persistence.CommonLibPK;

import java.io.Serializable;

/**
 * The base model interface for the CommonLib service. Represents a row in the &quot;EDAPP_CommonLib&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.kisti.edison.science.model.impl.CommonLibModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.kisti.edison.science.model.impl.CommonLibImpl}.
 * </p>
 *
 * @author EDISON
 * @see CommonLib
 * @see org.kisti.edison.science.model.impl.CommonLibImpl
 * @see org.kisti.edison.science.model.impl.CommonLibModelImpl
 * @generated
 */
public interface CommonLibModel extends BaseModel<CommonLib> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a common lib model instance should use the {@link CommonLib} interface instead.
	 */

	/**
	 * Returns the primary key of this common lib.
	 *
	 * @return the primary key of this common lib
	 */
	public CommonLibPK getPrimaryKey();

	/**
	 * Sets the primary key of this common lib.
	 *
	 * @param primaryKey the primary key of this common lib
	 */
	public void setPrimaryKey(CommonLibPK primaryKey);

	/**
	 * Returns the lib name of this common lib.
	 *
	 * @return the lib name of this common lib
	 */
	@AutoEscape
	public String getLibName();

	/**
	 * Sets the lib name of this common lib.
	 *
	 * @param libName the lib name of this common lib
	 */
	public void setLibName(String libName);

	/**
	 * Returns the lib path of this common lib.
	 *
	 * @return the lib path of this common lib
	 */
	@AutoEscape
	public String getLibPath();

	/**
	 * Sets the lib path of this common lib.
	 *
	 * @param libPath the lib path of this common lib
	 */
	public void setLibPath(String libPath);

	/**
	 * Returns the library version of this common lib.
	 *
	 * @return the library version of this common lib
	 */
	@AutoEscape
	public String getLibraryVersion();

	/**
	 * Sets the library version of this common lib.
	 *
	 * @param libraryVersion the library version of this common lib
	 */
	public void setLibraryVersion(String libraryVersion);

	/**
	 * Returns the c lib ver of this common lib.
	 *
	 * @return the c lib ver of this common lib
	 */
	@AutoEscape
	public String getCLibVer();

	/**
	 * Sets the c lib ver of this common lib.
	 *
	 * @param cLibVer the c lib ver of this common lib
	 */
	public void setCLibVer(String cLibVer);

	/**
	 * Returns the sys arch of this common lib.
	 *
	 * @return the sys arch of this common lib
	 */
	@AutoEscape
	public String getSysArch();

	/**
	 * Sets the sys arch of this common lib.
	 *
	 * @param sysArch the sys arch of this common lib
	 */
	public void setSysArch(String sysArch);

	/**
	 * Returns the kernel ver of this common lib.
	 *
	 * @return the kernel ver of this common lib
	 */
	@AutoEscape
	public String getKernelVer();

	/**
	 * Sets the kernel ver of this common lib.
	 *
	 * @param kernelVer the kernel ver of this common lib
	 */
	public void setKernelVer(String kernelVer);

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
	public int compareTo(org.kisti.edison.science.model.CommonLib commonLib);

	@Override
	public int hashCode();

	@Override
	public CacheModel<org.kisti.edison.science.model.CommonLib> toCacheModel();

	@Override
	public org.kisti.edison.science.model.CommonLib toEscapedModel();

	@Override
	public org.kisti.edison.science.model.CommonLib toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}