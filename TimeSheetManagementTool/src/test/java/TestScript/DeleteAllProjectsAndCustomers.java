package TestScript;

import org.testng.annotations.Test;

import PomPackage.HomePage;
import PomPackage.ProjectsAndCustomers;
import PomPackage.TasksPage;

public class DeleteAllProjectsAndCustomers extends ValidLogin{
	
	@Test
	public void deleteCustomer() {
		
		HomePage hp = new HomePage(driver);
		hp.getTasksElement().click();
		
		TasksPage tp = new TasksPage(driver);
		tp.getProjectAndCustomersElement().click();
		
		ProjectsAndCustomers pac = new ProjectsAndCustomers(driver);
		pac.getAllElement().click();
		pac.getDeleteSelectedElement().click();
		pac.getPopupAccept().click();
	}

}
