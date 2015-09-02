package pageObjects;

import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.*;

public class LogIn_Page {
	
	private static WebElement element = null;
	//private static String title = null;
	
	//methods that verify log in page elements
	
	/**
	public static String SignInPageTitle(WebDriver driver) {
		title = driver.getTitle();
		return title;
	}
	
	
	public static WebElement SignInPageText(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.reg-headline-container h2.reg-headline"));
		return element;
	}
	*/
	
	public static WebElement logInOverlayValidation(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div#outermost div.headline"));
		return element;
	}
	
	public static WebElement logInEmail(WebDriver driver) {
		element = driver.findElement(By.cssSelector("form#login-form input[id=login-email]"));
		return element;
	}
	
	public static WebElement logInPassword(WebDriver driver) {
		element = driver.findElement(By.cssSelector("form#login-form input[id=login-password]"));
		return element;
	}
	
	public static WebElement logInSubmit(WebDriver driver) {
		element = driver.findElement(By.cssSelector("form#login-form button[type=submit]"));
		return element;
	}

}
