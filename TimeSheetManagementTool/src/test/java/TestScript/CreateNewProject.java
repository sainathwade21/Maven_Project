package TestScript;

import org.testng.annotations.Test;

import PomPackage.CreateNewProjectPage;
import PomPackage.HomePage;
import PomPackage.ProjectsAndCustomers;
import PomPackage.TasksPage;

public class CreateNewProject extends ValidLogin {

	@Test
	public void createProject() {
		
		HomePage hp = new HomePage(driver);
		hp.getTasksElement().click();
		
		TasksPage tp = new TasksPage(driver);
		tp.getProjectAndCustomersElement().click();
		
		ProjectsAndCustomers pac = new ProjectsAndCustomers(driver);
		pac.getCreateNewProject().click();
		
		CreateNewProjectPage cnpp = new CreateNewProjectPage(driver);
		cnpp.getCustomerDropdown();
		
	}
}
