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

package org.kisti.edison.virtuallaboratory.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for VirtualLabUserTemp. This utility wraps
 * {@link org.kisti.edison.virtuallaboratory.service.impl.VirtualLabUserTempLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author EDISON
 * @see VirtualLabUserTempLocalService
 * @see org.kisti.edison.virtuallaboratory.service.base.VirtualLabUserTempLocalServiceBaseImpl
 * @see org.kisti.edison.virtuallaboratory.service.impl.VirtualLabUserTempLocalServiceImpl
 * @generated
 */
public class VirtualLabUserTempLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.kisti.edison.virtuallaboratory.service.impl.VirtualLabUserTempLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the virtual lab user temp to the database. Also notifies the appropriate model listeners.
	*
	* @param virtualLabUserTemp the virtual lab user temp
	* @return the virtual lab user temp that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp addVirtualLabUserTemp(
		org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp virtualLabUserTemp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVirtualLabUserTemp(virtualLabUserTemp);
	}

	/**
	* Creates a new virtual lab user temp with the primary key. Does not add the virtual lab user temp to the database.
	*
	* @param virtualLabUserTempPK the primary key for the new virtual lab user temp
	* @return the new virtual lab user temp
	*/
	public static org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp createVirtualLabUserTemp(
		org.kisti.edison.virtuallaboratory.service.persistence.VirtualLabUserTempPK virtualLabUserTempPK) {
		return getService().createVirtualLabUserTemp(virtualLabUserTempPK);
	}

	/**
	* Deletes the virtual lab user temp with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param virtualLabUserTempPK the primary key of the virtual lab user temp
	* @return the virtual lab user temp that was removed
	* @throws PortalException if a virtual lab user temp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp deleteVirtualLabUserTemp(
		org.kisti.edison.virtuallaboratory.service.persistence.VirtualLabUserTempPK virtualLabUserTempPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVirtualLabUserTemp(virtualLabUserTempPK);
	}

	/**
	* Deletes the virtual lab user temp from the database. Also notifies the appropriate model listeners.
	*
	* @param virtualLabUserTemp the virtual lab user temp
	* @return the virtual lab user temp that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp deleteVirtualLabUserTemp(
		org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp virtualLabUserTemp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteVirtualLabUserTemp(virtualLabUserTemp);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.kisti.edison.virtuallaboratory.model.impl.VirtualLabUserTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.kisti.edison.virtuallaboratory.model.impl.VirtualLabUserTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp fetchVirtualLabUserTemp(
		org.kisti.edison.virtuallaboratory.service.persistence.VirtualLabUserTempPK virtualLabUserTempPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchVirtualLabUserTemp(virtualLabUserTempPK);
	}

	/**
	* Returns the virtual lab user temp with the primary key.
	*
	* @param virtualLabUserTempPK the primary key of the virtual lab user temp
	* @return the virtual lab user temp
	* @throws PortalException if a virtual lab user temp with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp getVirtualLabUserTemp(
		org.kisti.edison.virtuallaboratory.service.persistence.VirtualLabUserTempPK virtualLabUserTempPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVirtualLabUserTemp(virtualLabUserTempPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the virtual lab user temps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.kisti.edison.virtuallaboratory.model.impl.VirtualLabUserTempModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of virtual lab user temps
	* @param end the upper bound of the range of virtual lab user temps (not inclusive)
	* @return the range of virtual lab user temps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp> getVirtualLabUserTemps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVirtualLabUserTemps(start, end);
	}

	/**
	* Returns the number of virtual lab user temps.
	*
	* @return the number of virtual lab user temps
	* @throws SystemException if a system exception occurred
	*/
	public static int getVirtualLabUserTempsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVirtualLabUserTempsCount();
	}

	/**
	* Updates the virtual lab user temp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param virtualLabUserTemp the virtual lab user temp
	* @return the virtual lab user temp that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp updateVirtualLabUserTemp(
		org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp virtualLabUserTemp)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVirtualLabUserTemp(virtualLabUserTemp);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp addVirtualLabUserTemp(
		java.util.Map<java.lang.String, java.lang.Object> params)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVirtualLabUserTemp(params);
	}

	public static org.kisti.edison.virtuallaboratory.model.VirtualLabUserTemp removeVirtualLabUserTemp(
		java.util.Map<java.lang.String, java.lang.Object> params)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.kisti.edison.virtuallaboratory.NoSuchVirtualLabUserTempException {
		return getService().removeVirtualLabUserTemp(params);
	}

	public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getListVirtualLabUserTemp(
		java.util.Map<java.lang.String, java.lang.Object> params)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.lang.NumberFormatException {
		return getService().getListVirtualLabUserTemp(params);
	}

	public static java.util.Map<java.lang.String, java.lang.Object> getVirtualLabUserTemp(
		java.lang.Long seqNo, java.lang.Long virtualLabId,
		java.lang.Long classId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVirtualLabUserTemp(seqNo, virtualLabId, classId);
	}

	public static void clearService() {
		_service = null;
	}

	public static VirtualLabUserTempLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VirtualLabUserTempLocalService.class.getName());

			if (invokableLocalService instanceof VirtualLabUserTempLocalService) {
				_service = (VirtualLabUserTempLocalService)invokableLocalService;
			}
			else {
				_service = new VirtualLabUserTempLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(VirtualLabUserTempLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(VirtualLabUserTempLocalService service) {
	}

	private static VirtualLabUserTempLocalService _service;
}