package ScriptTests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googleSearch();

	}
	
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step By Step");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(5000);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();				
	}

}
