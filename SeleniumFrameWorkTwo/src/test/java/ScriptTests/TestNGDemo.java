package ScriptTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.GoogleSearchPageObject;

public class TestNGDemo {

	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
		driver = new ChromeDriver();
	}
	
	@Test
	public  void GoogleSearchTestscript() {
		
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		driver.get("http://google.com/");
		
		searchPageObj.setTextInSearchBox("Automation Step By Step");
		searchPageObj.clickSearchButton();
		
	}

	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	
		
	}
}
