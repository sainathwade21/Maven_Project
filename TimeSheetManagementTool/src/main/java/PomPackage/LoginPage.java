package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(name="username")
		private WebElement usernameTextfield;
		
		@FindBy(name="pwd")
		private WebElement passwordTextfield;

		@FindBy(id="keepLoggedInCheckBox")
		private WebElement checkbox;
		
		@FindBy(id="loginButton")
		private WebElement loginButton;

		public WebElement getUsernameTextfield() {
			return usernameTextfield;
		}
		public WebElement getPasswordTextfield() {
			return passwordTextfield;
		}
		public WebElement getCheckbox() {
			return checkbox;
		}
		public WebElement getLoginButton() {
			return loginButton;
		}
		
}
