package TestNGMultiBrowserDemo;

import org.apache.logging.log4j.util.PerformanceSensitive;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMultipalBrowsersDemo {
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	//In setup method we have taken browserName as a input veriable. & base on what ever value is in browserName (Veriable) we will set multipal browser
	public void setup(String browserName) {
		
		System.out.println(" Browser Name is  :  "+browserName);
        
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath+"/drivers/ChromeTwoThreeSix/IEDriverServer.exe");	    
			driver = new InternetExplorerDriver();
		}
		
		
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://google.com");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println(" Test Completed Successfully ");
		
	}

}
