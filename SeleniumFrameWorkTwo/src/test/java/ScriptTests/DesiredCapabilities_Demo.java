package ScriptTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		DesiredCapabilities caps = new  DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEDriver/IEDriverServer.exe");	    
		@SuppressWarnings("deprecation")
		WebDriver driver = new InternetExplorerDriver(caps);

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.close();
		driver.quit();
	}

}
