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

package org.kisti.edison.project.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for HistoryAppSimulation. This utility wraps
 * {@link org.kisti.edison.project.service.impl.HistoryAppSimulationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author EDISON
 * @see HistoryAppSimulationLocalService
 * @see org.kisti.edison.project.service.base.HistoryAppSimulationLocalServiceBaseImpl
 * @see org.kisti.edison.project.service.impl.HistoryAppSimulationLocalServiceImpl
 * @generated
 */
public class HistoryAppSimulationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.kisti.edison.project.service.impl.HistoryAppSimulationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the history app simulation to the database. Also notifies the appropriate model listeners.
	*
	* @param historyAppSimulation the history app simulation
	* @return the history app simulation that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.project.model.HistoryAppSimulation addHistoryAppSimulation(
		org.kisti.edison.project.model.HistoryAppSimulation historyAppSimulation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addHistoryAppSimulation(historyAppSimulation);
	}

	/**
	* Creates a new history app simulation with the primary key. Does not add the history app simulation to the database.
	*
	* @param historyAppSimulationPK the primary key for the new history app simulation
	* @return the new history app simulation
	*/
	public static org.kisti.edison.project.model.HistoryAppSimulation createHistoryAppSimulation(
		org.kisti.edison.project.service.persistence.HistoryAppSimulationPK historyAppSimulationPK) {
		return getService().createHistoryAppSimulation(historyAppSimulationPK);
	}

	/**
	* Deletes the history app simulation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param historyAppSimulationPK the primary key of the history app simulation
	* @return the history app simulation that was removed
	* @throws PortalException if a history app simulation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.project.model.HistoryAppSimulation deleteHistoryAppSimulation(
		org.kisti.edison.project.service.persistence.HistoryAppSimulationPK historyAppSimulationPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteHistoryAppSimulation(historyAppSimulationPK);
	}

	/**
	* Deletes the history app simulation from the database. Also notifies the appropriate model listeners.
	*
	* @param historyAppSimulation the history app simulation
	* @return the history app simulation that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.project.model.HistoryAppSimulation deleteHistoryAppSimulation(
		org.kisti.edison.project.model.HistoryAppSimulation historyAppSimulation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteHistoryAppSimulation(historyAppSimulation);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.kisti.edison.project.model.impl.HistoryAppSimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.kisti.edison.project.model.impl.HistoryAppSimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.kisti.edison.project.model.HistoryAppSimulation fetchHistoryAppSimulation(
		org.kisti.edison.project.service.persistence.HistoryAppSimulationPK historyAppSimulationPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchHistoryAppSimulation(historyAppSimulationPK);
	}

	/**
	* Returns the history app simulation with the primary key.
	*
	* @param historyAppSimulationPK the primary key of the history app simulation
	* @return the history app simulation
	* @throws PortalException if a history app simulation with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.project.model.HistoryAppSimulation getHistoryAppSimulation(
		org.kisti.edison.project.service.persistence.HistoryAppSimulationPK historyAppSimulationPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getHistoryAppSimulation(historyAppSimulationPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the history app simulations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.kisti.edison.project.model.impl.HistoryAppSimulationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of history app simulations
	* @param end the upper bound of the range of history app simulations (not inclusive)
	* @return the range of history app simulations
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.kisti.edison.project.model.HistoryAppSimulation> getHistoryAppSimulations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHistoryAppSimulations(start, end);
	}

	/**
	* Returns the number of history app simulations.
	*
	* @return the number of history app simulations
	* @throws SystemException if a system exception occurred
	*/
	public static int getHistoryAppSimulationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHistoryAppSimulationsCount();
	}

	/**
	* Updates the history app simulation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param historyAppSimulation the history app simulation
	* @return the history app simulation that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.kisti.edison.project.model.HistoryAppSimulation updateHistoryAppSimulation(
		org.kisti.edison.project.model.HistoryAppSimulation historyAppSimulation)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateHistoryAppSimulation(historyAppSimulation);
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

	public static void clearService() {
		_service = null;
	}

	public static HistoryAppSimulationLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					HistoryAppSimulationLocalService.class.getName());

			if (invokableLocalService instanceof HistoryAppSimulationLocalService) {
				_service = (HistoryAppSimulationLocalService)invokableLocalService;
			}
			else {
				_service = new HistoryAppSimulationLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(HistoryAppSimulationLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(HistoryAppSimulationLocalService service) {
	}

	private static HistoryAppSimulationLocalService _service;
}