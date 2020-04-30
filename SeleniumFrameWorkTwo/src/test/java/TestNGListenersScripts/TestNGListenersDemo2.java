//In below script we have use TestNG Listners at class level.
package TestNGListenersScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNGListenersDemo2 {
	
	@Test
	public void Test4() {
		System.out.println(" I am inside Test4 ");
	}
	
	@Test
	public void Test5() {
		
		System.out.println(" I am inside Test5 ");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://google.com/");
		
       try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		WebElement myElement = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		myElement.sendKeys("Automation Step by Step");
		myElement.sendKeys(Keys.ENTER);
		
		driver.close();
       	}
	
	@Test
	public void Test6() {
		System.out.println(" I am inside Test6 ");
	}
	
	

}
