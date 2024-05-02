package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	
	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Projects & Customers']")
	private WebElement projectAndCustomersElement;

	public WebElement getProjectAndCustomersElement() {
		return projectAndCustomersElement;
	}

}
