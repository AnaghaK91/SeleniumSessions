package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {


		Xls_Reader reader =  new Xls_Reader("C:\\Users\\Anagha K\\eclipse-workspace\\SeleniumSessions\\src\\com\\testdata\\FlipkartTestdata.xlsx");
		
		if(!reader.isSheetExist("HomePage")) {
			reader.addSheet("HomePage");
			reader.addColumn("HomePage","username");
			reader.addColumn("HomePage", "password");
		}
		else if (reader.isSheetExist("HomePage")){
			reader.removeSheet("HomePage");
			reader.addSheet("Home_New");
			reader.addColumn("Home_New","username");
			reader.addColumn("Home_New", "password");
		}
			
		
		
		int rowCount = reader.getRowCount("RegTestData");
		System.out.println(rowCount);
		int colCount = reader.getColumnCount("RegTestData");
		System.out.println("Total coulumn present in RegTestData sheet is " + colCount);
		int cellRowNum = reader.getCellRowNum("RegTestData", "name", "Anupama K");
		System.out.println("cell row number is " + cellRowNum);
		
		for (int i=0;i<=colCount;i++) {
			reader.removeColumn("Home_New", i);
		}
		
	

		
		

		
		

	}

}
