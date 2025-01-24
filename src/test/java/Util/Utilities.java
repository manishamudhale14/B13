package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilities {

	
	public static String getProperty(String key) {
		
		File file = new File("src/test/resources/data.properties");
		FileInputStream fileInputStream;
		Properties properties = null;
		try {
			fileInputStream = new FileInputStream(file);
			 properties = new Properties();
			properties.load(fileInputStream);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
		
		
		
	}
}
