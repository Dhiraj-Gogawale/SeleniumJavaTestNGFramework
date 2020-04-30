package ScriptTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWithTestNG {

	static WebDriver driver = null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;


	@BeforeTest
	public void setUp() {

		//start reports
		htmlReporter = new ExtentHtmlReporter("extent.html");

		//create ExtentReports and attach reports(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
		driver = new ChromeDriver();

	}

	@Test(priority = 1) 
	public void test1() {
		//create a toggle for the given test, adds all log events under it
		ExtentTest test1 = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");
		//log(status, details)
		test1.log(Status.INFO, "Starting Test Case");
		
        driver.get("https://google.com");
        test1.pass("Navigated to Goolge.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation Step by step");
        test1.pass("Enter Text in search box");
        
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        test1.pass("Able to search the enter text");
        
        //driver.close();
        
        //driver.quit();
        //test1.pass("Close the browser");
        test1.info("Test1 completed");
		
	}
	
	
	
	@Test(priority = 2) 
	public void test2() {
		//create a toggle for the given test, adds all log events under it
		ExtentTest test2 = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");
		//log(status, details)
		test2.log(Status.INFO, "Starting Test Case");
		
        driver.get("https://google.com");
        test2.pass("Navigated to Goolge.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation Step by step");
        test2.pass("Enter Text in search box");
        
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        test2.pass("Able to search the enter text");
        
        driver.close();
        
        driver.quit();
        test2.pass("Close the browser");
        test2.info("Test2 completed");
		
	}

	@AfterTest
	public void tearDown() {
		extent.flush();

	}

}
