package com.liferay.portal.image;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContext;

import com.liferay.portal.kernel.image.SpriteProcessor;

public class SpriteProcessorImpl implements SpriteProcessor {

	@Override
	public Properties generate(ServletContext servletContext, List<URL> imageURLs,
			String spriteRootDirName, String spriteFileName,
			String spritePropertiesFileName, String rootPath, int maxHeight,
			int maxWidth, int maxSize) throws IOException {

		return null;
		
	}

}