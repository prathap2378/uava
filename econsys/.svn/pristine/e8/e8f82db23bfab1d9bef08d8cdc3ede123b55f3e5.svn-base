package com.econsys.Projects;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	private static Properties properties = new Properties();
	static {
		String propFileNameCommon = "Common.properties";
		String propFileNameDBscripts = "DBscripts.properties";
		try {
			InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(propFileNameCommon);
			InputStream inputStream1 = PropertiesUtil.class.getClassLoader().getResourceAsStream(propFileNameDBscripts);
			properties.load(inputStream);
			properties.load(inputStream1);
			if (inputStream == null) {
				throw new FileNotFoundException("property file '" + propFileNameCommon + "' not found in the classpath");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getPropValues(String strPropKey) {
		String value = properties.getProperty(strPropKey);
		
		return value;
	}
}