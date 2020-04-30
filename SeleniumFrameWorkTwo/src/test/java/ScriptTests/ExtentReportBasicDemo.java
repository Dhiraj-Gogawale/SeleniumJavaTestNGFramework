package ScriptTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//start reports
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		//create ExtentReports and attach reports(s)
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
        //create a toggle for the given test, adds all log events under it
        ExtentTest test1 = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");
        
        String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
		driver = new ChromeDriver();
		//log(status, details)
		test1.log(Status.INFO, "Starting Test Case");
		
        driver.get("https://google.com");
        test1.pass("Navigated to Goolge.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation Step by step");
        test1.pass("Enter Text in search box");
        
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        test1.pass("Able to search the enter text");
        
        driver.close();
        
        driver.quit();
        test1.pass("Close the browser");
        test1.info("Text completed");
	
        //calling flush writers everthing in a log file
        extent.flush();
        
	}

}
