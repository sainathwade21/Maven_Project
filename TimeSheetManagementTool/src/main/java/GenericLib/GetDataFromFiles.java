package GenericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromFiles implements ConstantData{
	
	public String getPropertyValue(String Key) throws IOException
	{
		// Fetching the particular Property file
		FileInputStream fis = new FileInputStream(propertyFile);
		Properties properties = new Properties();
		
		// Loading all the values which is present inside the file
		properties.load(fis);
		
		// Accessing the particular value by passing key
		String Value = properties.getProperty(Key);
		
		return Value;	
	}
	
	public String getExcelValue( String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelFile);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
	}
	
	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelFile);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		int count = sheet.getLastRowNum();
		return count;
	}

	public int getCellCount(String sheetName,int rowNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelFile);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		int count = row.getLastCellNum();
		return count;
	}

}
