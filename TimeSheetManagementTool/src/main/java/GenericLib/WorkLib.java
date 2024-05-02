package GenericLib;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WorkLib {
	
	public int randomNum() {
		
		Random ram = new Random();
		return ram.nextInt(1000);
	}
	
	public void selectDropdownValue(WebElement dropdown, String visibleText) {
		
		Select s = new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}

}
