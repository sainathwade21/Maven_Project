package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage {
	
	public CreateNewCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement customerNameTextfield;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createCustomerButton;

	public WebElement getCustomerNameTextfield() {
		return customerNameTextfield;
	}
	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}
}
