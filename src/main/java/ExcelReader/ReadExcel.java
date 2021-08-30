package ExcelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Columns;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ReadExcel {
	private String filePath;
	private String sheetName;

	public ReadExcel(String filePath, String sheetName) {
		super();
		this.filePath = filePath;
		this.sheetName = sheetName;
	}

	private HSSFSheet getSheet() throws IOException {
		// To read the excel sheet first we have to load an excel sheet using File Input
		// stream
		FileInputStream fis = new FileInputStream(filePath);

		// Then we have to create workbook object and pass input stream as input
		// parameter
		//use HSSF for .xls excel files
		//use 
		HSSFWorkbook workbook = new HSSFWorkbook(fis);

		// Now access desired sheet using sheet index. To access sheet use method
		// getSheetAt method
		// HSSFSheet sheet = workbook.getSheetAt(sheetIndex);//to get sheet using index
		HSSFSheet sheet = workbook.getSheet(sheetName);// to get sheet using name

		return sheet;

	}

	// This method reads any cell type data
	// Pass get Cell object as a parameter and it will return String of any type of Cell Data
	private String getCellValueAsString(Cell cell) {
		//String cellValue = null;
		String cellValue = "";
		try {
			switch (cell.getCellType()) {
			case NUMERIC:
				cellValue = String.valueOf(cell.getNumericCellValue());
				break;
			case STRING:
				cellValue = cell.getStringCellValue();
				break;
			case BOOLEAN:
				cellValue = String.valueOf(cell.getBooleanCellValue());
				break;
			case FORMULA:
				cellValue = cell.getCellFormula();
			case BLANK:
				cellValue = "";			
			default:
				cellValue = "DEFAULT";
			}
		}
		catch(NullPointerException e) {
			cellValue = "";
		}
		System.out.println("cellValue : " + cellValue);
		return cellValue;
	}

	public Map<String, Map<String, String>> getExcelAsMap() throws IOException {
		HSSFSheet sheet = getSheet();

		// Use ArrayList to store column Header
		List<String> columnHeader = new ArrayList<String>();

		// Create a nested Map to store complete excel sheet Data
		Map<String, Map<String, String>> completeSheetData = new HashMap<String, Map<String, String>>();

		// Now make row Object using getRow(0); As Row 0 is used for column Header
		Row row = sheet.getRow(0);

		// Iterate cell over the first Row and get Cell Value as String and Add-in above
		// ArrayList
		// This code adds all the column headers in ArrayList.
		Iterator<Cell> cellIterator = row.cellIterator();
		while (cellIterator.hasNext()) {
			columnHeader.add(cellIterator.next().getStringCellValue());
		}

		int rowCount = totolRowCount();
		System.out.println("rowCount : " + rowCount);
		
		int columnCount = totolColumnCount();
		System.out.println("columnCount : " + columnCount);
		
		// iterate over each row and each Cell
		for (int i = 1; i < rowCount; i++) {
			Map<String, String> singleRowData = new HashMap<String, String>();
			Row row1 = sheet.getRow(i);
			//for (int j = 0; j < columnCount; j++) {//first column is unique identifier
			for (int j = 1; j < columnCount; j++) {
				// Make Cell object, get cell text and add in rowMap
				Cell cell = row1.getCell(j);
				singleRowData.put(columnHeader.get(j), getCellValueAsString(cell));
			}
			// Add each rowMap in complete excelData Map
			//completeSheetData.put(String.valueOf(i), singleRowData);
			completeSheetData.put(getCellValueAsString(row1.getCell(0)), singleRowData);
		}

		return completeSheetData;
	}
	
    public String getSheetName(int index) throws IOException {
        FileInputStream file = new FileInputStream(filePath);
		HSSFWorkbook workbook = new HSSFWorkbook(file);
        String sheet = workbook.getSheetName(index);
        return sheet;
    }
    
    public int getSheetCount() throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        HSSFWorkbook workbook = new HSSFWorkbook(file);
        int sheetCount = workbook.getNumberOfSheets();
        return sheetCount;
    }
    
    public int totolColumnCount() throws IOException {
        HSSFSheet sheet = getSheet();
        Row row = sheet.getRow(0);
        int lastColumnNum = row.getLastCellNum();
        return lastColumnNum;
    }
    
    public int totolRowCount() throws IOException {
        HSSFSheet sheet = getSheet();
        int lastColumnNum = sheet.getLastRowNum()+1;
        return lastColumnNum;
    }
}
