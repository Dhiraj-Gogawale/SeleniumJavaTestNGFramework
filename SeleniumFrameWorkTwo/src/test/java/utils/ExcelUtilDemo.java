package utils;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath +"\\excel\\data.xlsx", "Sheet1");
        
		excel.getRowCount();
		excel.getColCount();
		//Here (0,0) means row number 0 and column number 0 of sheet
		excel.getCellDataString(0,0);
		//Here (1,1) means row number 1 and column number 1 sheet
		excel.getCellDataNumber(1,1);
				

	}

}
