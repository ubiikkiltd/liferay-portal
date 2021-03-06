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

package com.liferay.opensocial.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.opensocial.model.OAuthToken;
import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the o auth token service. This utility wraps <code>com.liferay.opensocial.service.persistence.impl.OAuthTokenPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OAuthTokenPersistence
 * @generated
 */
@ProviderType
public class OAuthTokenUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(OAuthToken oAuthToken) {
		getPersistence().clearCache(oAuthToken);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, OAuthToken> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OAuthToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OAuthToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OAuthToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OAuthToken> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OAuthToken update(OAuthToken oAuthToken) {
		return getPersistence().update(oAuthToken);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OAuthToken update(
		OAuthToken oAuthToken, ServiceContext serviceContext) {

		return getPersistence().update(oAuthToken, serviceContext);
	}

	/**
	 * Returns all the o auth tokens where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @return the matching o auth tokens
	 */
	public static List<OAuthToken> findByG_S(
		String gadgetKey, String serviceName) {

		return getPersistence().findByG_S(gadgetKey, serviceName);
	}

	/**
	 * Returns a range of all the o auth tokens where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuthTokenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param start the lower bound of the range of o auth tokens
	 * @param end the upper bound of the range of o auth tokens (not inclusive)
	 * @return the range of matching o auth tokens
	 */
	public static List<OAuthToken> findByG_S(
		String gadgetKey, String serviceName, int start, int end) {

		return getPersistence().findByG_S(gadgetKey, serviceName, start, end);
	}

	/**
	 * Returns an ordered range of all the o auth tokens where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuthTokenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param start the lower bound of the range of o auth tokens
	 * @param end the upper bound of the range of o auth tokens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching o auth tokens
	 */
	public static List<OAuthToken> findByG_S(
		String gadgetKey, String serviceName, int start, int end,
		OrderByComparator<OAuthToken> orderByComparator) {

		return getPersistence().findByG_S(
			gadgetKey, serviceName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the o auth tokens where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuthTokenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param start the lower bound of the range of o auth tokens
	 * @param end the upper bound of the range of o auth tokens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching o auth tokens
	 */
	public static List<OAuthToken> findByG_S(
		String gadgetKey, String serviceName, int start, int end,
		OrderByComparator<OAuthToken> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByG_S(
			gadgetKey, serviceName, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	 * Returns the first o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o auth token
	 * @throws NoSuchOAuthTokenException if a matching o auth token could not be found
	 */
	public static OAuthToken findByG_S_First(
			String gadgetKey, String serviceName,
			OrderByComparator<OAuthToken> orderByComparator)
		throws com.liferay.opensocial.exception.NoSuchOAuthTokenException {

		return getPersistence().findByG_S_First(
			gadgetKey, serviceName, orderByComparator);
	}

	/**
	 * Returns the first o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching o auth token, or <code>null</code> if a matching o auth token could not be found
	 */
	public static OAuthToken fetchByG_S_First(
		String gadgetKey, String serviceName,
		OrderByComparator<OAuthToken> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			gadgetKey, serviceName, orderByComparator);
	}

	/**
	 * Returns the last o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o auth token
	 * @throws NoSuchOAuthTokenException if a matching o auth token could not be found
	 */
	public static OAuthToken findByG_S_Last(
			String gadgetKey, String serviceName,
			OrderByComparator<OAuthToken> orderByComparator)
		throws com.liferay.opensocial.exception.NoSuchOAuthTokenException {

		return getPersistence().findByG_S_Last(
			gadgetKey, serviceName, orderByComparator);
	}

	/**
	 * Returns the last o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching o auth token, or <code>null</code> if a matching o auth token could not be found
	 */
	public static OAuthToken fetchByG_S_Last(
		String gadgetKey, String serviceName,
		OrderByComparator<OAuthToken> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			gadgetKey, serviceName, orderByComparator);
	}

	/**
	 * Returns the o auth tokens before and after the current o auth token in the ordered set where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * @param oAuthTokenId the primary key of the current o auth token
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next o auth token
	 * @throws NoSuchOAuthTokenException if a o auth token with the primary key could not be found
	 */
	public static OAuthToken[] findByG_S_PrevAndNext(
			long oAuthTokenId, String gadgetKey, String serviceName,
			OrderByComparator<OAuthToken> orderByComparator)
		throws com.liferay.opensocial.exception.NoSuchOAuthTokenException {

		return getPersistence().findByG_S_PrevAndNext(
			oAuthTokenId, gadgetKey, serviceName, orderByComparator);
	}

	/**
	 * Removes all the o auth tokens where gadgetKey = &#63; and serviceName = &#63; from the database.
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 */
	public static void removeByG_S(String gadgetKey, String serviceName) {
		getPersistence().removeByG_S(gadgetKey, serviceName);
	}

	/**
	 * Returns the number of o auth tokens where gadgetKey = &#63; and serviceName = &#63;.
	 *
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @return the number of matching o auth tokens
	 */
	public static int countByG_S(String gadgetKey, String serviceName) {
		return getPersistence().countByG_S(gadgetKey, serviceName);
	}

	/**
	 * Returns the o auth token where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; or throws a <code>NoSuchOAuthTokenException</code> if it could not be found.
	 *
	 * @param userId the user ID
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param moduleId the module ID
	 * @param tokenName the token name
	 * @return the matching o auth token
	 * @throws NoSuchOAuthTokenException if a matching o auth token could not be found
	 */
	public static OAuthToken findByU_G_S_M_T(
			long userId, String gadgetKey, String serviceName, long moduleId,
			String tokenName)
		throws com.liferay.opensocial.exception.NoSuchOAuthTokenException {

		return getPersistence().findByU_G_S_M_T(
			userId, gadgetKey, serviceName, moduleId, tokenName);
	}

	/**
	 * Returns the o auth token where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param moduleId the module ID
	 * @param tokenName the token name
	 * @return the matching o auth token, or <code>null</code> if a matching o auth token could not be found
	 */
	public static OAuthToken fetchByU_G_S_M_T(
		long userId, String gadgetKey, String serviceName, long moduleId,
		String tokenName) {

		return getPersistence().fetchByU_G_S_M_T(
			userId, gadgetKey, serviceName, moduleId, tokenName);
	}

	/**
	 * Returns the o auth token where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param moduleId the module ID
	 * @param tokenName the token name
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching o auth token, or <code>null</code> if a matching o auth token could not be found
	 */
	public static OAuthToken fetchByU_G_S_M_T(
		long userId, String gadgetKey, String serviceName, long moduleId,
		String tokenName, boolean retrieveFromCache) {

		return getPersistence().fetchByU_G_S_M_T(
			userId, gadgetKey, serviceName, moduleId, tokenName,
			retrieveFromCache);
	}

	/**
	 * Removes the o auth token where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param moduleId the module ID
	 * @param tokenName the token name
	 * @return the o auth token that was removed
	 */
	public static OAuthToken removeByU_G_S_M_T(
			long userId, String gadgetKey, String serviceName, long moduleId,
			String tokenName)
		throws com.liferay.opensocial.exception.NoSuchOAuthTokenException {

		return getPersistence().removeByU_G_S_M_T(
			userId, gadgetKey, serviceName, moduleId, tokenName);
	}

	/**
	 * Returns the number of o auth tokens where userId = &#63; and gadgetKey = &#63; and serviceName = &#63; and moduleId = &#63; and tokenName = &#63;.
	 *
	 * @param userId the user ID
	 * @param gadgetKey the gadget key
	 * @param serviceName the service name
	 * @param moduleId the module ID
	 * @param tokenName the token name
	 * @return the number of matching o auth tokens
	 */
	public static int countByU_G_S_M_T(
		long userId, String gadgetKey, String serviceName, long moduleId,
		String tokenName) {

		return getPersistence().countByU_G_S_M_T(
			userId, gadgetKey, serviceName, moduleId, tokenName);
	}

	/**
	 * Caches the o auth token in the entity cache if it is enabled.
	 *
	 * @param oAuthToken the o auth token
	 */
	public static void cacheResult(OAuthToken oAuthToken) {
		getPersistence().cacheResult(oAuthToken);
	}

	/**
	 * Caches the o auth tokens in the entity cache if it is enabled.
	 *
	 * @param oAuthTokens the o auth tokens
	 */
	public static void cacheResult(List<OAuthToken> oAuthTokens) {
		getPersistence().cacheResult(oAuthTokens);
	}

	/**
	 * Creates a new o auth token with the primary key. Does not add the o auth token to the database.
	 *
	 * @param oAuthTokenId the primary key for the new o auth token
	 * @return the new o auth token
	 */
	public static OAuthToken create(long oAuthTokenId) {
		return getPersistence().create(oAuthTokenId);
	}

	/**
	 * Removes the o auth token with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oAuthTokenId the primary key of the o auth token
	 * @return the o auth token that was removed
	 * @throws NoSuchOAuthTokenException if a o auth token with the primary key could not be found
	 */
	public static OAuthToken remove(long oAuthTokenId)
		throws com.liferay.opensocial.exception.NoSuchOAuthTokenException {

		return getPersistence().remove(oAuthTokenId);
	}

	public static OAuthToken updateImpl(OAuthToken oAuthToken) {
		return getPersistence().updateImpl(oAuthToken);
	}

	/**
	 * Returns the o auth token with the primary key or throws a <code>NoSuchOAuthTokenException</code> if it could not be found.
	 *
	 * @param oAuthTokenId the primary key of the o auth token
	 * @return the o auth token
	 * @throws NoSuchOAuthTokenException if a o auth token with the primary key could not be found
	 */
	public static OAuthToken findByPrimaryKey(long oAuthTokenId)
		throws com.liferay.opensocial.exception.NoSuchOAuthTokenException {

		return getPersistence().findByPrimaryKey(oAuthTokenId);
	}

	/**
	 * Returns the o auth token with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oAuthTokenId the primary key of the o auth token
	 * @return the o auth token, or <code>null</code> if a o auth token with the primary key could not be found
	 */
	public static OAuthToken fetchByPrimaryKey(long oAuthTokenId) {
		return getPersistence().fetchByPrimaryKey(oAuthTokenId);
	}

	/**
	 * Returns all the o auth tokens.
	 *
	 * @return the o auth tokens
	 */
	public static List<OAuthToken> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the o auth tokens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuthTokenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o auth tokens
	 * @param end the upper bound of the range of o auth tokens (not inclusive)
	 * @return the range of o auth tokens
	 */
	public static List<OAuthToken> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the o auth tokens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuthTokenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o auth tokens
	 * @param end the upper bound of the range of o auth tokens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of o auth tokens
	 */
	public static List<OAuthToken> findAll(
		int start, int end, OrderByComparator<OAuthToken> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the o auth tokens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>OAuthTokenModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of o auth tokens
	 * @param end the upper bound of the range of o auth tokens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of o auth tokens
	 */
	public static List<OAuthToken> findAll(
		int start, int end, OrderByComparator<OAuthToken> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the o auth tokens from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of o auth tokens.
	 *
	 * @return the number of o auth tokens
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OAuthTokenPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OAuthTokenPersistence)PortletBeanLocatorUtil.locate(
				com.liferay.opensocial.service.ServletContextUtil.
					getServletContextName(),
				OAuthTokenPersistence.class.getName());

			ReferenceRegistry.registerReference(
				OAuthTokenUtil.class, "_persistence");
		}

		return _persistence;
	}

	private static OAuthTokenPersistence _persistence;

}