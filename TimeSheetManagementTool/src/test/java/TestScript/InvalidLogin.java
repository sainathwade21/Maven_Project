package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLib.BrowserActions;
import PomPackage.LoginPage;

public class InvalidLogin extends BrowserActions {
	
	@Test
	public void invalidLogin() throws IOException
	{
		int rows = getRowCount(INVALIDLOGIN);

		LoginPage login = new LoginPage(driver);
		
		for(int i=1; i<rows; i++) {
			login.getUsernameTextfield().sendKeys(getExcelValue(INVALIDLOGIN, i, 0));
			login.getPasswordTextfield().sendKeys(getExcelValue(INVALIDLOGIN, i, 1));
			login.getLoginButton().click();
			login.getUsernameTextfield().clear();
	}
}
}
