import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingLocaters {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://google.com/");
		
		Thread.sleep(2000);
		
		WebElement myElement = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		myElement.sendKeys("Automation Step by Step");
		myElement.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//input[@value='Google Search' and @data-ved='0ahUKEwjWrLHo5OnoAhXjzDgGHUKTDD0Q4dUDCAs']"));
		//myElement.sendKeys(Keys.ENTER);
		
		
		List<WebElement> listofInputElements = driver.findElements(By.xpath("//input"));
		int count = listofInputElements.size();
		System.out.println(" Count of Input Elements is" +count);
		
		try {
			Thread.sleep(5000);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
        driver.close();
	}

}
