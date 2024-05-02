package Rough;

import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GenericLib.BrowserActions;
import PomPackage.CreateNewTaskPage;
import PomPackage.HomePage;
import PomPackage.LoginPage;

public class CreateNewTask {
	
	WebDriver driver;
	
	@BeforeMethod
	public void login() throws IOException
	{
		BrowserActions bs = new BrowserActions();
		//driver = bs.launchBrowser();
		
		LoginPage login = new LoginPage(driver);
		login.getUsernameTextfield().sendKeys(bs.getPropertyValue("username"));
		login.getPasswordTextfield().sendKeys(bs.getPropertyValue("password"));
		login.getLoginButton().click();
	}
	
	@Test
	public void createTask()
	{
		HomePage home = new HomePage(driver);
		home.getCreateNewTask().click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String window : windowHandles) {
			if (window==driver.getWindowHandle()) {
				continue;
			}
			else {
				driver.switchTo().window(window);
			}
		}
		CreateNewTaskPage task = new CreateNewTaskPage(driver);
		task.getCustomerDropdown().click();	
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
