package Rough;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLib.BrowserActions;

public class abc{
	@Test
	public void name() throws EncryptedDocumentException, IOException {

		BrowserActions bcActions = new BrowserActions();
		System.out.println((bcActions.getExcelValue(bcActions.CUSTOMERS, 1, 0)));
	}

}
