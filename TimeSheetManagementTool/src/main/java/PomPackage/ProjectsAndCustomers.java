package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectsAndCustomers {
	
	public ProjectsAndCustomers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Create New Customer']")
	private WebElement createNewCustomer;
	@FindBy(xpath = "//input[@value='Create New Project']")
	private WebElement createNewProject;
	@FindBy(xpath = "//a[text()='All']")
	private WebElement allElement;
	@FindBy(xpath = "//input[@value='Delete Selected']")
	private WebElement deleteSelectedElement;
	@FindBy(xpath = "//input[@value='Delete These Customers']")
	private WebElement popupAccept;

	
	public WebElement getCreateNewProject() {
		return createNewProject;
	}
	public WebElement getCreateNewCustomer() {
		return createNewCustomer;
	}
	public WebElement getAllElement() {
		return allElement;
	}
	public WebElement getDeleteSelectedElement() {
		return deleteSelectedElement;
	}
	public WebElement getPopupAccept() {
		return popupAccept;
	}
	

	
}
