import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowsersTest {

	public static void main(String[] args) {
		
		//Below we are using a reletive location so that if in case the code is move to other machine we do not have to change the driver path
		//user.dir will give location for the project(Path of the project)
		//the path upto project name is save in pojectpath
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Eclicpse Selenium WorkSpace\\SeleniumFrameWorkTwo\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEDriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
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
