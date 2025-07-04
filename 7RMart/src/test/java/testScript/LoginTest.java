package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import contants.Constants;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	public HomePage homepage;

	@Test(retryAnalyzer = retry.Retry.class, groups = {"Regression"})
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {

		// String username = "admin";
		// String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();*/
		boolean dashboardloaded = loginpage.isDashboardDisplayed();
		Assert.assertTrue(dashboardloaded, Constants.LOGINTESTVALIDCREDENTIALS);
	}

	@Test(description = "Login on giving username incorrect")
	public void verifyAlertMessageIsComingOnGivingInvalidUsername() throws IOException {

		// String username = "admin405";
		// String password = "admin";
		String username = ExcelUtility.getStringData(2, 0, "loginpage");
		String password = ExcelUtility.getStringData(2, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();*/
		boolean alertmsgappear = loginpage.isAlertMsgDislayed();
		Assert.assertTrue(alertmsgappear, "Home page is loaded with incorrect password");

	}

	@Test(description = "Login on giving password incorrect")
	public void verifyAlertMessageIsComingOnGivingInvalidPassword() throws IOException {

		// String username = "admin";
		// String password = "admin563";
		String username = ExcelUtility.getStringData(3, 0, "loginpage");
		String password = ExcelUtility.getStringData(3, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();*/
		boolean alertmsgappear = loginpage.isAlertMsgDislayed();
		Assert.assertTrue(alertmsgappear, "Home page is loaded with incorrect password");

	}

	@Test(dataProvider="logindataprovider",description = "Login on giving both username and password incorrect")
	public void verifyAlertMessageIsComingOnGivingInvalidCredentials(String username,String password) throws IOException {

		// String username = "admin743";
		// String password = "admin563";
		//String username = ExcelUtility.getStringData(4, 0, "loginpage");
		//String password = ExcelUtility.getStringData(4, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();*/
		boolean alertmsgappear = loginpage.isAlertMsgDislayed();
		Assert.assertTrue(alertmsgappear, "Home page is loaded with incorrect password");
	}
	
	@DataProvider(name = "logindataprovider")
	public Object[][] dpmethod(){
		return new Object[][] {
			{"Ada","Ala"},{"mai","har"},{"sos","rai"}
			
		};
	}

}
