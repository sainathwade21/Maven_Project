package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTaskPage {
	
	public CreateNewTaskPage(WebDriver driver){
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@name='customerId']")
	private WebElement customerDropdown;

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}
}
