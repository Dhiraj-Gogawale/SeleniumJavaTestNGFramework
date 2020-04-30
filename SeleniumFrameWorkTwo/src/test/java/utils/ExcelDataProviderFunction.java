//How to create Excel Data Provider function and user TestNG @DataProvider annotation.

package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ExcelDataProviderFunction {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/ChromeTwoThreeSix/chromedriver.exe");	    
		driver = new ChromeDriver();
	}

	@Test(dataProvider="test1data")
	public void test1(String username, String Password) throws InterruptedException {
		System.out.println(username+ " | " +Password);
	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Thread.sleep(2000);
		//driver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(2000);
	}
	
	/*public static void main(String[] args) {
		String excelPath = "C:\\Eclicpse Selenium WorkSpace\\SeleniumFrameWorkTwo\\excel\\data.xlsx";
		testData(excelPath, "Sheet1");
	}*/
    
	//call the excel data provider function with excel and sheet name.	
	@DataProvider(name="test1data")
	public Object[][] getData() {
		String excelPath = "C:\\Eclicpse Selenium WorkSpace\\SeleniumFrameWorkTwo\\excel\\data.xlsx";
		Object data[][] = testData(excelPath, "Sheet1");
		return data;
	}

	//Create a funciton and create object for ExcelUtilsDataProvider3 Class where we have keep our functions for reading excel files
	public Object[][] testData(String excelPath, String sheetName) {

		//Create Object for ExcelUtilsDataProvider3 class. Here you will see that ExcelUtilsDataProvider3 will ask for a excelPath and SheetName as we have created constructor of ExcelUtils in ExcelUtils class which take to string parameter which are excelPath, SheetName. 
		//hence we have taken excelPath and SheetName as a input to above testData function
		ExcelUtilsDataProvider3 excel = new ExcelUtilsDataProvider3(excelPath, sheetName);

		//Get Row and Coloum Count
		int rowCount = excel.getRowCountD();
		int colCount = excel.getColCountD();

		//Running below loop and geting data in Objcet Array.
		//Below we have created 2dimentional array of Object type because our sheet can have string, integer data.
		Object data[][] = new Object[rowCount-1][colCount];

		//Creating Forloop
		//First For loop is for Row it will start from one to less then row count & Second for loop is for coloum which will run from zero col to less then col count
		for (int row=1; row<rowCount; row++)
		{
			for (int col=0; col<colCount; col++) {
				String cellData =	excel.getCellDataStringD(row, col);
				//System.out.print(cellData+" | ");
				data[row-1][col]=cellData;
			}

			//System.out.println();
		}
		return data;
	}
}
