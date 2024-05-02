package Rough;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLib.GetDataFromFiles;


public class dataProvider extends GetDataFromFiles {
	
	
	public void name() {
		
		Object[][] test = new Object[5][2];
		
	}
	
	@Test
	public void getCellCount() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelFile);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(INVALIDLOGIN);
		Row row = sheet.getRow(0);
		int count = row.getLastCellNum();
		int count1 = row.getPhysicalNumberOfCells();
		int row0 = sheet.getLastRowNum();
		int row1 = sheet.getPhysicalNumberOfRows();
		System.out.println(count);
		System.out.println(count1);
		System.out.println(row0);
		System.out.println(row1);
	}
	
	
	@DataProvider(name = "invalid")
	public static Object[][] getMultipleDataFromExcelSheet()
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelFile);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(INVALIDLOGIN);
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		Object[][] test = new Object[row][cell];
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < cell; j++) {
				test[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}

		return test;

	}
	
	
	@Test(dataProvider = "invalid")
	public void invalid(String username, String password) {
		
		System.out.println(username);
		System.out.println(password);
	}


}
