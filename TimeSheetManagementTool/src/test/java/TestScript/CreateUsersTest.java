package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLib.WorkLib;
import PomPackage.CreateNewUserPage;
import PomPackage.HomePage;
import PomPackage.UsersPage;
import Rough.ValidLogin;

public class CreateUsersTest extends ValidLogin{
	
	@Test
	public void createUser() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.getUsersElement().click();
		
		UsersPage up = new UsersPage(driver);
		up.getCreateNewUserElement().click();
		
		WorkLib lib = new WorkLib();
		int num = lib.randomNum();
		
		CreateNewUserPage cnu = new CreateNewUserPage(driver);
		cnu.getUsernamTextfield().sendKeys(getExcelValue(USERS, 1, 0)+num);
		cnu.getFirstNameTextfield().sendKeys(getExcelValue(USERS, 1, 1)+num);
		cnu.getLastNameTextfield().sendKeys(getExcelValue(USERS, 1, 2)+num);
		cnu.getPasswordTextfield().sendKeys(getExcelValue(USERS, 1, 3)+num);
		cnu.getPasswordRetypeTextfield().sendKeys(getExcelValue(USERS, 1, 3)+num);
		cnu.getCreateUserButtonTextfield().click();
	}
}

