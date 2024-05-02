package TestScript;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PomPackage.HomePage;
import PomPackage.UsersPage;

public class DeleteUsers extends ValidLogin{
	
	@Test
	public void deleteUser() {
		HomePage hp = new HomePage(driver);
		hp.getUsersElement().click();
		
		UsersPage up = new UsersPage(driver);
	
		List<WebElement> users = up.getUserElement();
		for (WebElement user : users) {
			
			String name = user.getText();
			if (name.contains("Administrator")) {
				continue;
			}
			else {
				user.click();
				driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
				Alert alt = driver.switchTo().alert();
				alt.accept();
			}
			break;
		}
	}
}

