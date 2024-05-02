package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProjectPage {
	
	public CreateNewProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath = "//select[@name='customerId']"), @FindBy(name = "customerId")})
	private WebElement customerDropdown;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement projectNameTextfield;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createProjectButton;
	
	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}
	public WebElement getProjectNameTextfield() {
		return projectNameTextfield;
	}
	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}
	
	

}
