//Code to put data from Properties file

package config;


import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class SetDataInPropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			setProperties();

		}
		
		public static void setProperties() {
			try {
				
				//Create a object of class Properties (Example --> Properties prop = new Properties())
				Properties prop = new Properties(); 
				
				//Create a object of class OutputStream (Example OutputStream Output = new FileInputStream)	
				String projectPath = System.getProperty("user.dir");
				OutputStream output = new FileOutputStream(projectPath+"\\src\\test\\java\\config\\setvalueinconfigfile.properties");
				
				//set (value) properties using the setProperty method
				prop.setProperty("browser", "chrome");
				
				//Store values in Property file using prop.store()
				prop.store(output, null);
				
				
			}
			    catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();

		}
    }
}
