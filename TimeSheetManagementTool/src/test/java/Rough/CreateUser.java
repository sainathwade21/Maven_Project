package Rough;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPackage.CreateNewUserPage;
import PomPackage.HomePage;
import PomPackage.UsersPage;

public class CreateUser extends ValidLogin{
	
	@Test
	public void createUser() throws IOException {
		HomePage hp = new HomePage(driver);
		hp.getUsersElement().click();
		
		UsersPage up = new UsersPage(driver);
		up.getCreateNewUserElement().click();
		
		CreateNewUserPage cnu = new CreateNewUserPage(driver);
		cnu.getUsernamTextfield().sendKeys(getExcelValue(USERS, 1, 0));
		cnu.getFirstNameTextfield().sendKeys(getExcelValue(USERS, 1, 1));
		cnu.getLastNameTextfield().sendKeys(getExcelValue(USERS, 1, 2));
		cnu.getPasswordTextfield().sendKeys(getExcelValue(USERS, 1, 3));
		cnu.getPasswordRetypeTextfield().sendKeys(getExcelValue(USERS, 1, 3));
		cnu.getCreateUserButtonTextfield().click();
	}

}
