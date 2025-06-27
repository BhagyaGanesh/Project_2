package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	
	@Test(retryAnalyzer=retry.Retry.class,groups= {"Regression"})
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {
		
		
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		boolean dashboardloaded = loginpage.isDashboardDisplayed();
		Assert.assertTrue(dashboardloaded);
	}
	
	
	@Test
	public void verifyAlertMessageIsComingOnGivingInvalidUsername() throws IOException {
		
		//String username = "admin405";
		//String password = "admin";
		String username = ExcelUtility.getStringData(2, 0, "loginpage");
		String password = ExcelUtility.getStringData(2, 1, "loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		boolean alertmsgappear = loginpage.isAlertMsgDislayed();
		Assert.assertTrue(alertmsgappear);
		
	}
	
	@Test
	public void verifyAlertMessageIsComingOnGivingInvalidPassword() throws IOException {
		
		//String username = "admin";
	    //String password = "admin563";
	    String username = ExcelUtility.getStringData(3, 0, "loginpage");
		String password = ExcelUtility.getStringData(3, 1, "loginpage");
	    
	    LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		boolean alertmsgappear = loginpage.isAlertMsgDislayed();
		Assert.assertTrue(alertmsgappear);
		
	}
	
	@Test
	public void verifyAlertMessageIsComingOnGivingInvalidCredentials() throws IOException {

		//String username = "admin743";
		//String password = "admin563";
		String username = ExcelUtility.getStringData(4, 0, "loginpage");
		String password = ExcelUtility.getStringData(4, 1, "loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		boolean alertmsgappear = loginpage.isAlertMsgDislayed();
		Assert.assertTrue(alertmsgappear);
	}

}
