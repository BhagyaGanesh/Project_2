package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import contants.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	
	public ManageNewsPage managenewspage;
	public HomePage homepage;

	@Test(description="To verify that an authorized user is able to successfully Enter the 'News' information")
	public void addNews() throws IOException {
		
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		managenewspage = homepage.clickTheMoreInfo();
		managenewspage.clickTheNewNews().enterNews().saveNews();
		boolean alertmsg = managenewspage.isAlertMsgDisplayed();
		Assert.assertTrue(alertmsg,Constants.MANAGENEWSTESTENTERNEWS);
		
		
		
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickTheMoreInfo();
		managenewspage.clickTheNewNews();
		managenewspage.enterNews();
		managenewspage.saveNews();*/

	}
}
