//Run ExcelUtilDemo
package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	//String excelPath will ask for the project path and String sheetName will ask for the sheet name
	public ExcelUtils(String excelPath, String sheetName) {
		
		try {			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		
		}catch(Exception e) {
		e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		getRowCount();
		//Here (0,0) means row number 0 and column number 0 of sheet
		getCellDataString(0,0);
		//Here (1,1) means row number 1 and column number 1 sheet
		getCellDataNumber(1,1);
	}
	
	
	public static void getRowCount() {
		
		try {
		//sheet.getPhysicalNumberOfRows() will give us the total numbers of row in sheet
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows : "+rowCount);
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	
public static void getColCount() {
		
		try {
		//sheet.getPhysicalNumberOfRows() will give us the total numbers of row in sheet
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of Column : "+colCount);
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
		
		
		
		public static void getCellDataString(int rowNum, int colNum) {
			
			try {
			
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
	}
		
		public static void getCellDataNumber(int rowNum, int colNum) {
			
			try {
			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
			}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
	

   }
}
