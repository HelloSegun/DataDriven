package pageObjects;

import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.*;

public class Home_Page {
	
	private static WebElement element = null;
	private static String title = null;
	
	//methods that verify home page elements
	
	public static String homePageTitle(WebDriver driver) {
		title = driver.getTitle();
		return title;
	}
	
	public static WebElement emailHeaderElement(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div#outermost a[href='http://www.mail.com/mail/#.7518-header-nav1-1']"));
		return element;
	}
	
	public static WebElement newsHeaderElement(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div#outermost a[href='http://www.mail.com/news/#.7518-header-nav1-2']"));
		return element;
	}
	
	public static WebElement logInHeaderElement(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div#outermost a[id=login-button]"));
		return element;
	}

}
