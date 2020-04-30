package ScriptTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GoogleSearchPageObject;

public class GoogleSearchPageTest {

	static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleSearchTestscript();
	}
	
	public static void GoogleSearchTestscript() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
		WebDriver driver = new ChromeDriver();
		
		
		
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		driver.get("http://google.com/");
		
		searchPageObj.setTextInSearchBox("Automation Step By Step");
		searchPageObj.clickSearchButton();
		driver.close();
	}

}
