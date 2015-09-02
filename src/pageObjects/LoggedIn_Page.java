package pageObjects;

import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.*;

public class LoggedIn_Page {
	
	private static WebElement element = null;
	
	public static WebElement logOutFromEmail(WebDriver driver) {
		element = driver.findElement(By.cssSelector("ul#logout div.center"));
		return element;
	}

}
