package GenericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class CustomListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		String methodName = result.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot) BrowserActions.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+methodName+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("Screenshot Taken Successfully",true);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub	
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
}
