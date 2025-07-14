package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import contants.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsUpdatePage;
import utilities.ExcelUtility;

public class ManageNewsUpdateTest extends Base {
	
	public ManageNewsUpdatePage managenewsupdatepage;
	public HomePage homepage;

	@Test(description="To verify that an authorized user is able to successfully update the 'News' information")
	public void updateNews() throws IOException {

		// String username = "admin";
		// String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		managenewsupdatepage = homepage.clickNewsUpdateMoreInfo();
		String updatenews = "latest";
		managenewsupdatepage.clickTheActions().enterNews(updatenews).saveNews();
		boolean alertmsg = managenewsupdatepage.isAlertMsgDisplayed();
		Assert.assertTrue(alertmsg,Constants.MANAGENEWSTESTUPDATENEWS);
		
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		
		ManageNewsUpdatePage newsupdate = new ManageNewsUpdatePage(driver);
		newsupdate.clickTheMoreInfo();
		newsupdate.clickTheActions();
		newsupdate.enterNews(updatenews);
		newsupdate.saveNews();*/

	}

	@Test
	public void isUpdateDisplayed() {

		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		homepage = loginpage.clickOnSignin();
		managenewsupdatepage = homepage.clickNewsUpdateMoreInfo();
		managenewsupdatepage.clickTheActions();
		
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		ManageNewsUpdatePage newsupdate = new ManageNewsUpdatePage(driver);
		newsupdate.clickTheMoreInfo();
		newsupdate.clickTheActions();*/

		boolean updatednews = managenewsupdatepage.isUpdateDislayed();
		Assert.assertTrue(updatednews,Constants.MANAGENEWSTESTUPDATENEWS);

	}

}
