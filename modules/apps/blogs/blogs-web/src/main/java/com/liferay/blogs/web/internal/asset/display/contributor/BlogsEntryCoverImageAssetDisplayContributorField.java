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

package com.liferay.blogs.web.internal.asset.display.contributor;

import com.liferay.asset.display.contributor.AssetDisplayContributorField;
import com.liferay.blogs.model.BlogsEntry;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

import java.util.Locale;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

/**
 * @author Alejandro Tardín
 */
@Component(
	property = "model.class.name=com.liferay.blogs.model.BlogsEntry",
	service = AssetDisplayContributorField.class
)
public class BlogsEntryCoverImageAssetDisplayContributorField
	implements AssetDisplayContributorField<BlogsEntry> {

	@Override
	public String getKey() {
		return "coverImage";
	}

	@Override
	public String getLabel(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			locale, getClass());

		return LanguageUtil.get(resourceBundle, "cover-image");
	}

	@Override
	public String getType() {
		return "image";
	}

	@Override
	public String getValue(BlogsEntry blogsEntry, Locale locale) {
		ThemeDisplay themeDisplay = _getThemeDisplay();

		if (themeDisplay != null) {
			try {
				return blogsEntry.getCoverImageURL(themeDisplay);
			}
			catch (PortalException pe) {
				_log.error(pe, pe);

				return null;
			}
		}
		else {
			return blogsEntry.getCoverImageURL();
		}
	}

	private ThemeDisplay _getThemeDisplay() {
		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		if (serviceContext != null) {
			return serviceContext.getThemeDisplay();
		}

		return null;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		BlogsEntryCoverImageAssetDisplayContributorField.class);

}