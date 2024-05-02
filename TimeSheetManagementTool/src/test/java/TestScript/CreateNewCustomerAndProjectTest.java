package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericLib.WorkLib;
import PomPackage.CreateNewCustomerPage;
import PomPackage.CreateNewProjectPage;
import PomPackage.HomePage;
import PomPackage.ProjectsAndCustomers;
import PomPackage.TasksPage;

public class CreateNewCustomerAndProjectTest extends ValidLogin{
	
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		
		HomePage hp = new HomePage(driver);
		hp.getTasksElement().click();
		
		TasksPage tp = new TasksPage(driver);
		tp.getProjectAndCustomersElement().click();
		
		ProjectsAndCustomers pac = new ProjectsAndCustomers(driver);
		pac.getCreateNewCustomer().click();
		
		CreateNewCustomerPage cnc = new CreateNewCustomerPage(driver);
		WorkLib lib = new WorkLib();
		String customerName = getExcelValue(CUSTOMERS, 1, 0)+lib.randomNum();
		System.out.println(customerName);
		cnc.getCustomerNameTextfield().sendKeys(customerName);
		cnc.getCreateCustomerButton().click();
		
		pac.getCreateNewProject().click();
		CreateNewProjectPage cnpp = new CreateNewProjectPage(driver);
		WebElement dropdown = cnpp.getCustomerDropdown();
		System.out.println(dropdown);
		lib.selectDropdownValue(dropdown, customerName);
		
		cnpp.getProjectNameTextfield().sendKeys(getExcelValue(CUSTOMERS, 1, 1)+lib.randomNum());
		cnpp.getCreateProjectButton().click();
		
		
	}
}
