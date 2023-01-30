package com.test.utility;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	
	static Xls_Reader reader;
	

	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try {
			reader = new Xls_Reader("C:\\Users\\Anagha K\\eclipse-workspace\\SeleniumSessions\\src\\com\\testdata\\FlipkartTestdata.xlsx");	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum=2 ;rowNum<=reader.getRowCount("RegTestdata");rowNum++) {
			//System.out.println(reader.getRowCount("RegTestdata"));
			String name = reader.getCellData("RegTestdata", "name", rowNum);
			String mob = reader.getCellData("RegTestdata", "mob", rowNum);
			String pincode = reader.getCellData("RegTestdata", "pincode", rowNum);
			String locality = reader.getCellData("RegTestdata", "locality", rowNum);
			String address = reader.getCellData("RegTestdata", "address", rowNum);
			String state = reader.getCellData("RegTestdata", "state", rowNum);
			String home_work = reader.getCellData("RegTestdata", "home_work", rowNum);
			
			Object ob[] = {name,mob,pincode,locality,address,home_work,state};
			
			myData.add(ob);
			
			
		}
		
		return myData;
		
	}
	
}
