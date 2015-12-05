package org.xtext.example.mydsl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConfigReader {
	
	private InputStream inputStream;
	private static final String CONFIG_FILE_NAME = "config.properties";
	
	public String getPropValues(String propertyId) throws IOException {
		
			inputStream = new FileInputStream(CONFIG_FILE_NAME);
	
			try {
				Properties prop = new Properties();
	 
	 
				if (inputStream != null) {
					prop.load(inputStream);
				} else {
					throw new FileNotFoundException("property file '" + CONFIG_FILE_NAME + "' not found in the classpath");
				}	 
				// get the property value and print it out
				return prop.getProperty(propertyId);
	
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			} finally {
				inputStream.close();
			}
			
			return "";
	
		}


}
