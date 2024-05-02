package TestScript;

import org.testng.annotations.Test;

import PomPackage.HomePage;

public class Logout extends ValidLogin {
	
	@Test
	public void logout() {
		
		HomePage hp = new HomePage(driver);
		hp.getLogout().click();
	}

}
