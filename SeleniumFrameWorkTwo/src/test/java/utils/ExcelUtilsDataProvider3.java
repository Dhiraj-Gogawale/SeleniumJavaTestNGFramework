//Run ExcelUtilDemo
package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsDataProvider3 {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	//String excelPath will ask for the project path and String sheetName will ask for the sheet name
	public ExcelUtilsDataProvider3(String excelPath, String sheetName) {
		
		try {			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		
		}catch(Exception e) {
		e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		getRowCountD();
		getColCountD();
		//Here (0,0) means row number 0 and column number 0 of sheet
		getCellDataStringD(0,0);
		//Here (1,1) means row number 1 and column number 1 sheet
		getCellDataNumberD(1,1);
	}
	
	
	public static int getRowCountD() {
		int rowCount=0;
		try {
		//sheet.getPhysicalNumberOfRows() will give us the total numbers of row in sheet
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows : "+rowCount);
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
		
	}
	
	
public static int getColCountD() {
	    int colCount=0;
		try {
		//sheet.getPhysicalNumberOfRows() will give us the total numbers of row in sheet
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of Column : "+colCount);
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}
		
		
		
		public static String getCellDataStringD(int rowNum, int colNum) {
			String cellData=null;
			try {
			
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
			return cellData;
	}
		
		public static void getCellDataNumberD(int rowNum, int colNum) {
			
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
