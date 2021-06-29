package com.Ecomm.geneealUtility;

import java.io.FileInputStream;
import java.util.Properties;


public class PropertyFileUtility {

	
	/**
	 *    used to read the common data from properties file based  on key
	 * @param key
	 * @return
	 * @throws Throwable
	 */

	public String readDataFromPropertyFfile(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./TestData/Data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
