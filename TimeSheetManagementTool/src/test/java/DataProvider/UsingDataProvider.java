package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLib.GetDataFromFiles;

public class UsingDataProvider extends GetDataFromFiles {
	
	@DataProvider(name = "Invalid")
	public static Object[][] getMultipleDataFromExcelSheet() throws EncryptedDocumentException, IOException {
		
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
	
	
	@Test(dataProvider = "Invalid")
	public void invalid(String username, String password) {
		
		System.out.println(username);
		System.out.println(password);
	}


}
