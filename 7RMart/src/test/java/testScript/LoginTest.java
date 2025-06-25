package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base{
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() {
		
		
		String username = "admin";
		String password = "admin";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		boolean dashboardloaded = loginpage.isDashboardDisplayed();
		Assert.assertTrue(dashboardloaded);
	}
	
	
	@Test
	public void verifyAlertMessageIsComingOnGivingInvalidUsername() {
		
		String username = "admin405";
		String password = "admin";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		boolean alertmsgappear = loginpage.isAlertMsgDislayed();
		Assert.assertTrue(alertmsgappear);
		
	}
	
	@Test
	public void verifyAlertMessageIsComingOnGivingInvalidPassword() {
		
		String username = "admin";
	    String password = "admin563";
	    
	    LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		boolean alertmsgappear = loginpage.isAlertMsgDislayed();
		Assert.assertTrue(alertmsgappear);
		
	}
	
	@Test
	public void verifyAlertMessageIsComingOnGivingInvalidCredentials() {

		String username = "admin743";
		String password = "admin563";
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		boolean alertmsgappear = loginpage.isAlertMsgDislayed();
		Assert.assertTrue(alertmsgappear);
	}

}
