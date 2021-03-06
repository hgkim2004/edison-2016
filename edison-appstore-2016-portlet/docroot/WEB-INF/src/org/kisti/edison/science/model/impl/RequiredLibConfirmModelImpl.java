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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.kisti.edison.science.model.RequiredLibConfirm;
import org.kisti.edison.science.model.RequiredLibConfirmModel;
import org.kisti.edison.science.model.RequiredLibConfirmSoap;
import org.kisti.edison.science.service.persistence.RequiredLibConfirmPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the RequiredLibConfirm service. Represents a row in the &quot;EDAPP_RequiredLibConfirm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.kisti.edison.science.model.RequiredLibConfirmModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RequiredLibConfirmImpl}.
 * </p>
 *
 * @author EDISON
 * @see RequiredLibConfirmImpl
 * @see org.kisti.edison.science.model.RequiredLibConfirm
 * @see org.kisti.edison.science.model.RequiredLibConfirmModel
 * @generated
 */
@JSON(strict = true)
public class RequiredLibConfirmModelImpl extends BaseModelImpl<RequiredLibConfirm>
	implements RequiredLibConfirmModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a required lib confirm model instance should use the {@link org.kisti.edison.science.model.RequiredLibConfirm} interface instead.
	 */
	public static final String TABLE_NAME = "EDAPP_RequiredLibConfirm";
	public static final Object[][] TABLE_COLUMNS = {
			{ "requiredLibId", Types.BIGINT },
			{ "scienceAppId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "requiredDate", Types.TIMESTAMP },
			{ "confirmDate", Types.TIMESTAMP },
			{ "libraryName", Types.VARCHAR },
			{ "libraryVersion", Types.VARCHAR },
			{ "requiredContent", Types.VARCHAR },
			{ "requiredState", Types.VARCHAR },
			{ "confirmContent", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table EDAPP_RequiredLibConfirm (requiredLibId LONG not null,scienceAppId LONG not null,companyId LONG,userId LONG,requiredDate DATE null,confirmDate DATE null,libraryName VARCHAR(75) null,libraryVersion VARCHAR(75) null,requiredContent VARCHAR(75) null,requiredState VARCHAR(75) null,confirmContent VARCHAR(75) null,primary key (requiredLibId, scienceAppId))";
	public static final String TABLE_SQL_DROP = "drop table EDAPP_RequiredLibConfirm";
	public static final String ORDER_BY_JPQL = " ORDER BY requiredLibConfirm.id.requiredLibId ASC, requiredLibConfirm.id.scienceAppId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY EDAPP_RequiredLibConfirm.requiredLibId ASC, EDAPP_RequiredLibConfirm.scienceAppId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.kisti.edison.science.model.RequiredLibConfirm"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.kisti.edison.science.model.RequiredLibConfirm"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.kisti.edison.science.model.RequiredLibConfirm"),
			true);
	public static long SCIENCEAPPID_COLUMN_BITMASK = 1L;
	public static long REQUIREDLIBID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static RequiredLibConfirm toModel(RequiredLibConfirmSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		RequiredLibConfirm model = new RequiredLibConfirmImpl();

		model.setRequiredLibId(soapModel.getRequiredLibId());
		model.setScienceAppId(soapModel.getScienceAppId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setRequiredDate(soapModel.getRequiredDate());
		model.setConfirmDate(soapModel.getConfirmDate());
		model.setLibraryName(soapModel.getLibraryName());
		model.setLibraryVersion(soapModel.getLibraryVersion());
		model.setRequiredContent(soapModel.getRequiredContent());
		model.setRequiredState(soapModel.getRequiredState());
		model.setConfirmContent(soapModel.getConfirmContent());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<RequiredLibConfirm> toModels(
		RequiredLibConfirmSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<RequiredLibConfirm> models = new ArrayList<RequiredLibConfirm>(soapModels.length);

		for (RequiredLibConfirmSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.kisti.edison.science.model.RequiredLibConfirm"));

	public RequiredLibConfirmModelImpl() {
	}

	@Override
	public RequiredLibConfirmPK getPrimaryKey() {
		return new RequiredLibConfirmPK(_requiredLibId, _scienceAppId);
	}

	@Override
	public void setPrimaryKey(RequiredLibConfirmPK primaryKey) {
		setRequiredLibId(primaryKey.requiredLibId);
		setScienceAppId(primaryKey.scienceAppId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new RequiredLibConfirmPK(_requiredLibId, _scienceAppId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((RequiredLibConfirmPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return RequiredLibConfirm.class;
	}

	@Override
	public String getModelClassName() {
		return RequiredLibConfirm.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("requiredLibId", getRequiredLibId());
		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("requiredDate", getRequiredDate());
		attributes.put("confirmDate", getConfirmDate());
		attributes.put("libraryName", getLibraryName());
		attributes.put("libraryVersion", getLibraryVersion());
		attributes.put("requiredContent", getRequiredContent());
		attributes.put("requiredState", getRequiredState());
		attributes.put("confirmContent", getConfirmContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long requiredLibId = (Long)attributes.get("requiredLibId");

		if (requiredLibId != null) {
			setRequiredLibId(requiredLibId);
		}

		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date requiredDate = (Date)attributes.get("requiredDate");

		if (requiredDate != null) {
			setRequiredDate(requiredDate);
		}

		Date confirmDate = (Date)attributes.get("confirmDate");

		if (confirmDate != null) {
			setConfirmDate(confirmDate);
		}

		String libraryName = (String)attributes.get("libraryName");

		if (libraryName != null) {
			setLibraryName(libraryName);
		}

		String libraryVersion = (String)attributes.get("libraryVersion");

		if (libraryVersion != null) {
			setLibraryVersion(libraryVersion);
		}

		String requiredContent = (String)attributes.get("requiredContent");

		if (requiredContent != null) {
			setRequiredContent(requiredContent);
		}

		String requiredState = (String)attributes.get("requiredState");

		if (requiredState != null) {
			setRequiredState(requiredState);
		}

		String confirmContent = (String)attributes.get("confirmContent");

		if (confirmContent != null) {
			setConfirmContent(confirmContent);
		}
	}

	@JSON
	@Override
	public long getRequiredLibId() {
		return _requiredLibId;
	}

	@Override
	public void setRequiredLibId(long requiredLibId) {
		_requiredLibId = requiredLibId;
	}

	@JSON
	@Override
	public long getScienceAppId() {
		return _scienceAppId;
	}

	@Override
	public void setScienceAppId(long scienceAppId) {
		_columnBitmask |= SCIENCEAPPID_COLUMN_BITMASK;

		if (!_setOriginalScienceAppId) {
			_setOriginalScienceAppId = true;

			_originalScienceAppId = _scienceAppId;
		}

		_scienceAppId = scienceAppId;
	}

	public long getOriginalScienceAppId() {
		return _originalScienceAppId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public Date getRequiredDate() {
		return _requiredDate;
	}

	@Override
	public void setRequiredDate(Date requiredDate) {
		_requiredDate = requiredDate;
	}

	@JSON
	@Override
	public Date getConfirmDate() {
		return _confirmDate;
	}

	@Override
	public void setConfirmDate(Date confirmDate) {
		_confirmDate = confirmDate;
	}

	@JSON
	@Override
	public String getLibraryName() {
		if (_libraryName == null) {
			return StringPool.BLANK;
		}
		else {
			return _libraryName;
		}
	}

	@Override
	public void setLibraryName(String libraryName) {
		_libraryName = libraryName;
	}

	@JSON
	@Override
	public String getLibraryVersion() {
		if (_libraryVersion == null) {
			return StringPool.BLANK;
		}
		else {
			return _libraryVersion;
		}
	}

	@Override
	public void setLibraryVersion(String libraryVersion) {
		_libraryVersion = libraryVersion;
	}

	@JSON
	@Override
	public String getRequiredContent() {
		if (_requiredContent == null) {
			return StringPool.BLANK;
		}
		else {
			return _requiredContent;
		}
	}

	@Override
	public void setRequiredContent(String requiredContent) {
		_requiredContent = requiredContent;
	}

	@JSON
	@Override
	public String getRequiredState() {
		if (_requiredState == null) {
			return StringPool.BLANK;
		}
		else {
			return _requiredState;
		}
	}

	@Override
	public void setRequiredState(String requiredState) {
		_requiredState = requiredState;
	}

	@JSON
	@Override
	public String getConfirmContent() {
		if (_confirmContent == null) {
			return StringPool.BLANK;
		}
		else {
			return _confirmContent;
		}
	}

	@Override
	public void setConfirmContent(String confirmContent) {
		_confirmContent = confirmContent;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public RequiredLibConfirm toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (RequiredLibConfirm)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RequiredLibConfirmImpl requiredLibConfirmImpl = new RequiredLibConfirmImpl();

		requiredLibConfirmImpl.setRequiredLibId(getRequiredLibId());
		requiredLibConfirmImpl.setScienceAppId(getScienceAppId());
		requiredLibConfirmImpl.setCompanyId(getCompanyId());
		requiredLibConfirmImpl.setUserId(getUserId());
		requiredLibConfirmImpl.setRequiredDate(getRequiredDate());
		requiredLibConfirmImpl.setConfirmDate(getConfirmDate());
		requiredLibConfirmImpl.setLibraryName(getLibraryName());
		requiredLibConfirmImpl.setLibraryVersion(getLibraryVersion());
		requiredLibConfirmImpl.setRequiredContent(getRequiredContent());
		requiredLibConfirmImpl.setRequiredState(getRequiredState());
		requiredLibConfirmImpl.setConfirmContent(getConfirmContent());

		requiredLibConfirmImpl.resetOriginalValues();

		return requiredLibConfirmImpl;
	}

	@Override
	public int compareTo(RequiredLibConfirm requiredLibConfirm) {
		RequiredLibConfirmPK primaryKey = requiredLibConfirm.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RequiredLibConfirm)) {
			return false;
		}

		RequiredLibConfirm requiredLibConfirm = (RequiredLibConfirm)obj;

		RequiredLibConfirmPK primaryKey = requiredLibConfirm.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public void resetOriginalValues() {
		RequiredLibConfirmModelImpl requiredLibConfirmModelImpl = this;

		requiredLibConfirmModelImpl._originalScienceAppId = requiredLibConfirmModelImpl._scienceAppId;

		requiredLibConfirmModelImpl._setOriginalScienceAppId = false;

		requiredLibConfirmModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<RequiredLibConfirm> toCacheModel() {
		RequiredLibConfirmCacheModel requiredLibConfirmCacheModel = new RequiredLibConfirmCacheModel();

		requiredLibConfirmCacheModel.requiredLibId = getRequiredLibId();

		requiredLibConfirmCacheModel.scienceAppId = getScienceAppId();

		requiredLibConfirmCacheModel.companyId = getCompanyId();

		requiredLibConfirmCacheModel.userId = getUserId();

		Date requiredDate = getRequiredDate();

		if (requiredDate != null) {
			requiredLibConfirmCacheModel.requiredDate = requiredDate.getTime();
		}
		else {
			requiredLibConfirmCacheModel.requiredDate = Long.MIN_VALUE;
		}

		Date confirmDate = getConfirmDate();

		if (confirmDate != null) {
			requiredLibConfirmCacheModel.confirmDate = confirmDate.getTime();
		}
		else {
			requiredLibConfirmCacheModel.confirmDate = Long.MIN_VALUE;
		}

		requiredLibConfirmCacheModel.libraryName = getLibraryName();

		String libraryName = requiredLibConfirmCacheModel.libraryName;

		if ((libraryName != null) && (libraryName.length() == 0)) {
			requiredLibConfirmCacheModel.libraryName = null;
		}

		requiredLibConfirmCacheModel.libraryVersion = getLibraryVersion();

		String libraryVersion = requiredLibConfirmCacheModel.libraryVersion;

		if ((libraryVersion != null) && (libraryVersion.length() == 0)) {
			requiredLibConfirmCacheModel.libraryVersion = null;
		}

		requiredLibConfirmCacheModel.requiredContent = getRequiredContent();

		String requiredContent = requiredLibConfirmCacheModel.requiredContent;

		if ((requiredContent != null) && (requiredContent.length() == 0)) {
			requiredLibConfirmCacheModel.requiredContent = null;
		}

		requiredLibConfirmCacheModel.requiredState = getRequiredState();

		String requiredState = requiredLibConfirmCacheModel.requiredState;

		if ((requiredState != null) && (requiredState.length() == 0)) {
			requiredLibConfirmCacheModel.requiredState = null;
		}

		requiredLibConfirmCacheModel.confirmContent = getConfirmContent();

		String confirmContent = requiredLibConfirmCacheModel.confirmContent;

		if ((confirmContent != null) && (confirmContent.length() == 0)) {
			requiredLibConfirmCacheModel.confirmContent = null;
		}

		return requiredLibConfirmCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{requiredLibId=");
		sb.append(getRequiredLibId());
		sb.append(", scienceAppId=");
		sb.append(getScienceAppId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", requiredDate=");
		sb.append(getRequiredDate());
		sb.append(", confirmDate=");
		sb.append(getConfirmDate());
		sb.append(", libraryName=");
		sb.append(getLibraryName());
		sb.append(", libraryVersion=");
		sb.append(getLibraryVersion());
		sb.append(", requiredContent=");
		sb.append(getRequiredContent());
		sb.append(", requiredState=");
		sb.append(getRequiredState());
		sb.append(", confirmContent=");
		sb.append(getConfirmContent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("org.kisti.edison.science.model.RequiredLibConfirm");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>requiredLibId</column-name><column-value><![CDATA[");
		sb.append(getRequiredLibId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>scienceAppId</column-name><column-value><![CDATA[");
		sb.append(getScienceAppId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requiredDate</column-name><column-value><![CDATA[");
		sb.append(getRequiredDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmDate</column-name><column-value><![CDATA[");
		sb.append(getConfirmDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>libraryName</column-name><column-value><![CDATA[");
		sb.append(getLibraryName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>libraryVersion</column-name><column-value><![CDATA[");
		sb.append(getLibraryVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requiredContent</column-name><column-value><![CDATA[");
		sb.append(getRequiredContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requiredState</column-name><column-value><![CDATA[");
		sb.append(getRequiredState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>confirmContent</column-name><column-value><![CDATA[");
		sb.append(getConfirmContent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RequiredLibConfirm.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			RequiredLibConfirm.class
		};
	private long _requiredLibId;
	private long _scienceAppId;
	private long _originalScienceAppId;
	private boolean _setOriginalScienceAppId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _requiredDate;
	private Date _confirmDate;
	private String _libraryName;
	private String _libraryVersion;
	private String _requiredContent;
	private String _requiredState;
	private String _confirmContent;
	private long _columnBitmask;
	private RequiredLibConfirm _escapedModel;
}