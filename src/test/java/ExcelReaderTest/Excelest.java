package ExcelReaderTest;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import ExcelReader.ReadExcel;

public class Excelest {
  @Test
	public void f() throws IOException {
		ReadExcel ex = new ReadExcel("C:\\Users\\BHAWUK\\Documents\\Source1.xls", "Team1");
		Map<String, Map<String, String>> excelData = null;
		try {
			excelData = ex.getExcelAsMap();
			System.out.println("Excel Data for 2nd row and column- salary : " + excelData.get("E1001").get("salary"));			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ReadExcel ex2 = new ReadExcel("C:\\Users\\BHAWUK\\Documents\\Source2.xls", "Team2");
		Map<String, Map<String, String>> excelData2 = null;
		try {
			excelData2 = ex2.getExcelAsMap();
			//System.out.println("Excel Data for 2nd row and column- salary : " + excelData2.get("1003").get("salary"));			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ex row count : " + ex.totolRowCount());
		System.out.println("ex column count : " + ex.totolColumnCount());
		System.out.println("ex sheet count : " + ex.getSheetCount());
		System.out.println("excelData as Map: " + excelData);
		
		System.out.println("ex2 row count : " + ex2.totolRowCount());
		System.out.println("ex2 column count : " + ex2.totolColumnCount());
		System.out.println("ex2 sheet count : " + ex2.getSheetCount());
		System.out.println("excelData2 as Map: " + excelData2);
		
		System.out.println(excelData.equals(excelData2));
		System.out.println(excelData.keySet());
	}
}
