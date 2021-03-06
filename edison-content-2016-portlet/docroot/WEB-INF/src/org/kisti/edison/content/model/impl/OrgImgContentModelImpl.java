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

package org.kisti.edison.content.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.kisti.edison.content.model.OrgImgContent;
import org.kisti.edison.content.model.OrgImgContentModel;
import org.kisti.edison.content.model.OrgImgContentSoap;
import org.kisti.edison.content.service.persistence.OrgImgContentPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the OrgImgContent service. Represents a row in the &quot;EDMED_OrgImgContent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.kisti.edison.content.model.OrgImgContentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OrgImgContentImpl}.
 * </p>
 *
 * @author EDISON
 * @see OrgImgContentImpl
 * @see org.kisti.edison.content.model.OrgImgContent
 * @see org.kisti.edison.content.model.OrgImgContentModel
 * @generated
 */
@JSON(strict = true)
public class OrgImgContentModelImpl extends BaseModelImpl<OrgImgContent>
	implements OrgImgContentModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a org img content model instance should use the {@link org.kisti.edison.content.model.OrgImgContent} interface instead.
	 */
	public static final String TABLE_NAME = "EDMED_OrgImgContent";
	public static final Object[][] TABLE_COLUMNS = {
			{ "orgImgSeq", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "order_", Types.BIGINT },
			{ "orgNm", Types.VARCHAR },
			{ "orgLink", Types.VARCHAR },
			{ "fileEntryId", Types.BIGINT },
			{ "insertId", Types.BIGINT },
			{ "insertDate", Types.TIMESTAMP },
			{ "updateId", Types.BIGINT },
			{ "updateDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table EDMED_OrgImgContent (orgImgSeq LONG not null,groupId LONG not null,order_ LONG,orgNm VARCHAR(75) null,orgLink VARCHAR(75) null,fileEntryId LONG,insertId LONG,insertDate DATE null,updateId LONG,updateDate DATE null,primary key (orgImgSeq, groupId))";
	public static final String TABLE_SQL_DROP = "drop table EDMED_OrgImgContent";
	public static final String ORDER_BY_JPQL = " ORDER BY orgImgContent.order ASC";
	public static final String ORDER_BY_SQL = " ORDER BY EDMED_OrgImgContent.order_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.kisti.edison.content.model.OrgImgContent"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.kisti.edison.content.model.OrgImgContent"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.kisti.edison.content.model.OrgImgContent"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long ORDER_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static OrgImgContent toModel(OrgImgContentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		OrgImgContent model = new OrgImgContentImpl();

		model.setOrgImgSeq(soapModel.getOrgImgSeq());
		model.setGroupId(soapModel.getGroupId());
		model.setOrder(soapModel.getOrder());
		model.setOrgNm(soapModel.getOrgNm());
		model.setOrgLink(soapModel.getOrgLink());
		model.setFileEntryId(soapModel.getFileEntryId());
		model.setInsertId(soapModel.getInsertId());
		model.setInsertDate(soapModel.getInsertDate());
		model.setUpdateId(soapModel.getUpdateId());
		model.setUpdateDate(soapModel.getUpdateDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<OrgImgContent> toModels(OrgImgContentSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<OrgImgContent> models = new ArrayList<OrgImgContent>(soapModels.length);

		for (OrgImgContentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.kisti.edison.content.model.OrgImgContent"));

	public OrgImgContentModelImpl() {
	}

	@Override
	public OrgImgContentPK getPrimaryKey() {
		return new OrgImgContentPK(_orgImgSeq, _groupId);
	}

	@Override
	public void setPrimaryKey(OrgImgContentPK primaryKey) {
		setOrgImgSeq(primaryKey.orgImgSeq);
		setGroupId(primaryKey.groupId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new OrgImgContentPK(_orgImgSeq, _groupId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((OrgImgContentPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return OrgImgContent.class;
	}

	@Override
	public String getModelClassName() {
		return OrgImgContent.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orgImgSeq", getOrgImgSeq());
		attributes.put("groupId", getGroupId());
		attributes.put("order", getOrder());
		attributes.put("orgNm", getOrgNm());
		attributes.put("orgLink", getOrgLink());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("insertId", getInsertId());
		attributes.put("insertDate", getInsertDate());
		attributes.put("updateId", getUpdateId());
		attributes.put("updateDate", getUpdateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long orgImgSeq = (Long)attributes.get("orgImgSeq");

		if (orgImgSeq != null) {
			setOrgImgSeq(orgImgSeq);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long order = (Long)attributes.get("order");

		if (order != null) {
			setOrder(order);
		}

		String orgNm = (String)attributes.get("orgNm");

		if (orgNm != null) {
			setOrgNm(orgNm);
		}

		String orgLink = (String)attributes.get("orgLink");

		if (orgLink != null) {
			setOrgLink(orgLink);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Long insertId = (Long)attributes.get("insertId");

		if (insertId != null) {
			setInsertId(insertId);
		}

		Date insertDate = (Date)attributes.get("insertDate");

		if (insertDate != null) {
			setInsertDate(insertDate);
		}

		Long updateId = (Long)attributes.get("updateId");

		if (updateId != null) {
			setUpdateId(updateId);
		}

		Date updateDate = (Date)attributes.get("updateDate");

		if (updateDate != null) {
			setUpdateDate(updateDate);
		}
	}

	@JSON
	@Override
	public long getOrgImgSeq() {
		return _orgImgSeq;
	}

	@Override
	public void setOrgImgSeq(long orgImgSeq) {
		_orgImgSeq = orgImgSeq;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getOrder() {
		return _order;
	}

	@Override
	public void setOrder(long order) {
		_columnBitmask = -1L;

		_order = order;
	}

	@JSON
	@Override
	public String getOrgNm() {
		if (_orgNm == null) {
			return StringPool.BLANK;
		}
		else {
			return _orgNm;
		}
	}

	@Override
	public void setOrgNm(String orgNm) {
		_orgNm = orgNm;
	}

	@JSON
	@Override
	public String getOrgLink() {
		if (_orgLink == null) {
			return StringPool.BLANK;
		}
		else {
			return _orgLink;
		}
	}

	@Override
	public void setOrgLink(String orgLink) {
		_orgLink = orgLink;
	}

	@JSON
	@Override
	public long getFileEntryId() {
		return _fileEntryId;
	}

	@Override
	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	@JSON
	@Override
	public long getInsertId() {
		return _insertId;
	}

	@Override
	public void setInsertId(long insertId) {
		_insertId = insertId;
	}

	@JSON
	@Override
	public Date getInsertDate() {
		return _insertDate;
	}

	@Override
	public void setInsertDate(Date insertDate) {
		_insertDate = insertDate;
	}

	@JSON
	@Override
	public long getUpdateId() {
		return _updateId;
	}

	@Override
	public void setUpdateId(long updateId) {
		_updateId = updateId;
	}

	@JSON
	@Override
	public Date getUpdateDate() {
		return _updateDate;
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		_updateDate = updateDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public OrgImgContent toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (OrgImgContent)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OrgImgContentImpl orgImgContentImpl = new OrgImgContentImpl();

		orgImgContentImpl.setOrgImgSeq(getOrgImgSeq());
		orgImgContentImpl.setGroupId(getGroupId());
		orgImgContentImpl.setOrder(getOrder());
		orgImgContentImpl.setOrgNm(getOrgNm());
		orgImgContentImpl.setOrgLink(getOrgLink());
		orgImgContentImpl.setFileEntryId(getFileEntryId());
		orgImgContentImpl.setInsertId(getInsertId());
		orgImgContentImpl.setInsertDate(getInsertDate());
		orgImgContentImpl.setUpdateId(getUpdateId());
		orgImgContentImpl.setUpdateDate(getUpdateDate());

		orgImgContentImpl.resetOriginalValues();

		return orgImgContentImpl;
	}

	@Override
	public int compareTo(OrgImgContent orgImgContent) {
		int value = 0;

		if (getOrder() < orgImgContent.getOrder()) {
			value = -1;
		}
		else if (getOrder() > orgImgContent.getOrder()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrgImgContent)) {
			return false;
		}

		OrgImgContent orgImgContent = (OrgImgContent)obj;

		OrgImgContentPK primaryKey = orgImgContent.getPrimaryKey();

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
		OrgImgContentModelImpl orgImgContentModelImpl = this;

		orgImgContentModelImpl._originalGroupId = orgImgContentModelImpl._groupId;

		orgImgContentModelImpl._setOriginalGroupId = false;

		orgImgContentModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<OrgImgContent> toCacheModel() {
		OrgImgContentCacheModel orgImgContentCacheModel = new OrgImgContentCacheModel();

		orgImgContentCacheModel.orgImgSeq = getOrgImgSeq();

		orgImgContentCacheModel.groupId = getGroupId();

		orgImgContentCacheModel.order = getOrder();

		orgImgContentCacheModel.orgNm = getOrgNm();

		String orgNm = orgImgContentCacheModel.orgNm;

		if ((orgNm != null) && (orgNm.length() == 0)) {
			orgImgContentCacheModel.orgNm = null;
		}

		orgImgContentCacheModel.orgLink = getOrgLink();

		String orgLink = orgImgContentCacheModel.orgLink;

		if ((orgLink != null) && (orgLink.length() == 0)) {
			orgImgContentCacheModel.orgLink = null;
		}

		orgImgContentCacheModel.fileEntryId = getFileEntryId();

		orgImgContentCacheModel.insertId = getInsertId();

		Date insertDate = getInsertDate();

		if (insertDate != null) {
			orgImgContentCacheModel.insertDate = insertDate.getTime();
		}
		else {
			orgImgContentCacheModel.insertDate = Long.MIN_VALUE;
		}

		orgImgContentCacheModel.updateId = getUpdateId();

		Date updateDate = getUpdateDate();

		if (updateDate != null) {
			orgImgContentCacheModel.updateDate = updateDate.getTime();
		}
		else {
			orgImgContentCacheModel.updateDate = Long.MIN_VALUE;
		}

		return orgImgContentCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{orgImgSeq=");
		sb.append(getOrgImgSeq());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", order=");
		sb.append(getOrder());
		sb.append(", orgNm=");
		sb.append(getOrgNm());
		sb.append(", orgLink=");
		sb.append(getOrgLink());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append(", insertId=");
		sb.append(getInsertId());
		sb.append(", insertDate=");
		sb.append(getInsertDate());
		sb.append(", updateId=");
		sb.append(getUpdateId());
		sb.append(", updateDate=");
		sb.append(getUpdateDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.kisti.edison.content.model.OrgImgContent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>orgImgSeq</column-name><column-value><![CDATA[");
		sb.append(getOrgImgSeq());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>order</column-name><column-value><![CDATA[");
		sb.append(getOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgNm</column-name><column-value><![CDATA[");
		sb.append(getOrgNm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgLink</column-name><column-value><![CDATA[");
		sb.append(getOrgLink());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insertId</column-name><column-value><![CDATA[");
		sb.append(getInsertId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>insertDate</column-name><column-value><![CDATA[");
		sb.append(getInsertDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateId</column-name><column-value><![CDATA[");
		sb.append(getUpdateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateDate</column-name><column-value><![CDATA[");
		sb.append(getUpdateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = OrgImgContent.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			OrgImgContent.class
		};
	private long _orgImgSeq;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _order;
	private String _orgNm;
	private String _orgLink;
	private long _fileEntryId;
	private long _insertId;
	private Date _insertDate;
	private long _updateId;
	private Date _updateDate;
	private long _columnBitmask;
	private OrgImgContent _escapedModel;
}