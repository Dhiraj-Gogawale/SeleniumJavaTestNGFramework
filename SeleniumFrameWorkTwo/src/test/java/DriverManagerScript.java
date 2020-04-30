//With the help of WebDriverManager in our script we can manage the driver (chrome, IE, Firefox) hence we do not have to set the properties for it( System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe"); ).

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class DriverManagerScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		/*Tag for any specific version of a Driver
		WebDriverManager.chromedriver().version("2.36").setup();*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		try {
			Thread.sleep(5000);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
        driver.close();

	}

}
