package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base{
	
	@Test
	public void verifyUserIsAbleToLogout() throws IOException {
		
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		
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
