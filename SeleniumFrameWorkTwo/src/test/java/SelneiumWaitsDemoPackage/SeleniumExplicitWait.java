//Code to set Implicit Wait

package SelneiumWaitsDemoPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SeleniumExplicitWait {

	@Test
	public void SeleniumWait () {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	  
		ChromeDriver driver = new ChromeDriver();
		
		//Here we are seating implicit wait of 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys(" Automation Step By Step ");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		
		driver.findElement(By.name("abc")).click();
		
		
		driver.close();
		driver.quit();
		
		

	}
}