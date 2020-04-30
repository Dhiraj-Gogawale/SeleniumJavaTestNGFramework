//Code to get data from Properties file

package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
		

	}
	
	public static void getProperties() {
		try {
			
			//Create a object of class Properties (Example --> Properties prop = new Properties())
			Properties prop = new Properties(); 
			
			//Create a object of class InputStream (Example InputStream input = new FileInputStream)	
			String projectPath = System.getProperty("user.dir");
			InputStream input = new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
			
			//Load the properties file.
			prop.load(input);
			//get the property from property file(config.property).
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			
		}
		
	}

}
