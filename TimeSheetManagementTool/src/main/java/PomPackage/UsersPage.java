package PomPackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	public UsersPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement createNewUserElement;
	@FindBy(xpath = "//td[@nowrap='1']")
	private List<WebElement> userElement;

	public List<WebElement> getUserElement() {
		return userElement;
	}

	public WebElement getCreateNewUserElement() {
		return createNewUserElement;
	}

}
