package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends Base{
	
	@Test
	public void verifyUserIsAbleToLogout() {
		
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.chooseAdmin();
		logoutpage.chooseLogout();
		
		boolean signpage=logoutpage.signinPageDisplayed();
		Assert.assertTrue(signpage);
	}

}
