//Code to read the data from Excel

package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils2 {
	
	
	public ExcelUtils2() {
		
		
		
	}
	
	public static void main(String[] args) {
		excelOperationsHardCode();
		//here (0,0) means we are passing the rownumber and coloum number in excelOperationsWithoutHardCode Function
		excelOperationsWithoutHardCode(0, 0);
	}
	
	
	public static void excelOperationsHardCode() {
		
		try {
		// System.getProperty will give us the location of the framework where ever it is located.	
		String projectPath = System.getProperty("user.dir");			
		XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
	    
		//sheet.getPhysicalNumberOfRows() will give us the total numbers of row in sheet
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows : "+rowCount);
		
		//getRow(0).getCell(0).getStringCellValue() will give or print string value whatever is their in Cell 0,0
		//Here we are actully hardcoding the Row number and cell number which is not a good practice 
		String cellDataForStringValue = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellDataForStringValue);
		//getRow(1).getCell(1).getNumericCellValue() will give or print numeric value whatever is their in Cell 1,1
		//Here we are actully hardcoding the Row number and cell number which is not a good practice
		double cellDataForNumericValue = sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(cellDataForNumericValue);
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
		
		
		
		public static void excelOperationsWithoutHardCode(int rownum, int colnum) {
			
			try {
			// System.getProperty will give us the location of the framework where ever it is located.	
			String projectPath = System.getProperty("user.dir");			
			XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
		    
			//sheet.getPhysicalNumberOfRows() will give us the total numbers of row in sheet
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Rows : "+rowCount);
			
			//getRow(0).getCell(0).getStringCellValue() will give or print string value whatever is their in Cell 0,0
			 
			String cellDataForStringValue = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(cellDataForStringValue);
			//getRow(1).getCell(1).getNumericCellValue() will give or print numeric value whatever is their in Cell 1,1
			
			//double cellDataForNumericValue = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			//System.out.println(cellDataForNumericValue);
			
			
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
	}
	

}
