package Rough;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public interface Login_Logout {

	@BeforeMethod
	public void login() throws IOException;
	
	@AfterMethod
	public void logout();
}
