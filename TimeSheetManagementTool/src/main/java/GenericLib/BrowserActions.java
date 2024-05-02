package GenericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Listeners(CustomListener.class)
public class BrowserActions extends GetDataFromFiles {
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	@Parameters("browser")
	@BeforeClass
	public WebDriver launchBrowser(@Optional ("chrome") String browser) throws IOException
	{
		//String browser = this.getPropertyValue("browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invali Browser");
		}
		sdriver=driver;
		Reporter.log("------------Launching "+browser+" Browser------------",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
		String url = this.getPropertyValue("url");
		driver.get(url);
		return driver;
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
