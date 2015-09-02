package appModules;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.ExcelUtils;


public class SignIn_Action {
	
	//private static String a = null;

	public static void execute(WebDriver driver) throws Exception{
		// TODO Auto-generated method stub
		/**
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("http://www.mail.com/");
		driver.manage().window().maximize();
		
		
		a = pageObjects.Home_Page.homePageTitle(driver);
		if (a.equals("Get free Email accounts: Web based and secure Email - mail.com")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		a = pageObjects.Home_Page.emailHeaderElement(driver).getText();
		if (a.equals("Email")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		a = pageObjects.Home_Page.newsHeaderElement(driver).getText();
		if (a.equals("News")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		pageObjects.Home_Page.logInHeaderElement(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		a = pageObjects.LogIn_Page.LogInOverlayValidation(driver).getText();
		System.out.println(a);
		if (a.equals("Log in")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		*/
		
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num) to getCellData method
		String sUserName = ExcelUtils.getCellData(1, 1);
		String sPassword = ExcelUtils.getCellData(1, 2);
		
		pageObjects.Home_Page.logInHeaderElement(driver).click();
		LogIn_Page.logInEmail(driver).sendKeys(sUserName);
		LogIn_Page.logInPassword(driver).sendKeys(sPassword);
		LogIn_Page.logInSubmit(driver).click();
		
		/**
		pageObjects.Home_Page.signupHeaderElement(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		a = pageObjects.LogIn_Page.logInPageTitle(driver);
		if (a.equals("Free Webmail and Email by mail.com | Sign Up Now!")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		

		a = pageObjects.LogIn_Page.logInPageText(driver).getText();
		System.out.println(a);
		if (a.equals("Create" + "\n" + "a new email account")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		*/
		
		
		

	}

}
