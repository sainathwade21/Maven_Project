package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserPage {

	public CreateNewUserPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernamTextfield;
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstNameTextfield;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastNameTextfield;
	@FindBy(xpath = "//input[@name='passwordText']")
	private WebElement passwordTextfield;
	@FindBy(xpath = "//input[@name='passwordTextRetype']")
	private WebElement passwordRetypeTextfield;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createUserButtonTextfield;
	public WebElement getUsernamTextfield() {
		return usernamTextfield;
	}
	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}
	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}
	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}
	public WebElement getPasswordRetypeTextfield() {
		return passwordRetypeTextfield;
	}
	public WebElement getCreateUserButtonTextfield() {
		return createUserButtonTextfield;
	}
	
	
	
}