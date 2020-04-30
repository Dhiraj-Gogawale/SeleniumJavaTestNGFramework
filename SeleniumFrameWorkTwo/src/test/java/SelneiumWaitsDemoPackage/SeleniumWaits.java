//Code to set Implicit Wait

package SelneiumWaitsDemoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class SeleniumWaits {

	@Test
	public void SeleniumWait () {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	  
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys(" Automation Step By Step ");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		//code for explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abc")));
		
		driver.findElement(By.name("abc")).click();
		
		
		driver.close();
		driver.quit();
		
		

	}
}