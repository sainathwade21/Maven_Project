package Rough;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GenericLib.BrowserActions;
import PomPackage.LoginPage;

public class ValidLogin extends BrowserActions {
	
	@BeforeMethod
	public void login() throws IOException
	{
		LoginPage login = new LoginPage(driver);
		login.getUsernameTextfield().sendKeys(getExcelValue(VALIDLOGIN,1, 0));
		login.getPasswordTextfield().sendKeys(getExcelValue(VALIDLOGIN, 1, 1));
		login.getLoginButton().click();		
	}
	
	
	@Test(dataProvider = "invalid")
	public void iLogin(String username, String password)
	{
		LoginPage login = new LoginPage(driver);
		login.getUsernameTextfield().sendKeys(username);
		login.getPasswordTextfield().sendKeys(password);
		login.getLoginButton().click();		
	}

}
