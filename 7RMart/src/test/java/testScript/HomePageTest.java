package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import contants.Constants;
import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtility;

public class HomePageTest extends Base {
	
	public HomePage homepage;

	@Test(description="Verify user can log out and is redirected to the login page.")
	public void verifyUserIsAbleToLogout() throws IOException {

		
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		homepage.chooseAdmin().chooseLogout();
		
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		HomePage homepage = new HomePage(driver);
		logoutpage.chooseAdmin();
		logoutpage.chooseLogout();*/

		boolean signpage = homepage.signinPageDisplayed();
		Assert.assertTrue(signpage,Constants.HOMEPAGETESTCHECKLOGOUT);
	}

}
