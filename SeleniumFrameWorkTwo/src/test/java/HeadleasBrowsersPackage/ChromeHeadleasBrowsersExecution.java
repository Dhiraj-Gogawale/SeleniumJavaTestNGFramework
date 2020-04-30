//Headless browser execution means You cannot see anything on your screen, programs runs at backend. This is achive by using ChromeOptions class

package HeadleasBrowsersPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadleasBrowsersExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();

	}

	public static void test() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys(" Automation Step By Step ");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);


		
		System.out.println("Test Completed ");


		driver.close();
		driver.quit();
	}

}
