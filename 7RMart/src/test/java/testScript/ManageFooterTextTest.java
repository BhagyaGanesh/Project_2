package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import contants.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	
	public ManageFooterTextPage managefootertextpage;
	public HomePage homepage;

	@Test(description="To verify that an authorized user is able to successfully update the 'Manage Footer Text' information")
	public void updateDetails() throws IOException {

		// String username = "admin";
		// String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		managefootertextpage = homepage.clickFooterMoreInfo();
		String useraddress = "FlatNo.300 Trivandrum";
		String useremail = "sony@gmail.com";
		String userphone = "2345654356";
		managefootertextpage.clickTheAction().addAddress(useraddress).addEmail(useremail).addPhone(userphone).clickUpdate();
		boolean alertmsg = managefootertextpage.isAlertMsgDisplayed();
		Assert.assertTrue(alertmsg,Constants.MANAGEFOOTERTESTUPDATEFOOTER);
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		
		ManageFooterTextPage managefooter = new ManageFooterTextPage(driver);
		managefooter.clickTheMoreInfo();
		managefooter.clickTheAction();
		managefooter.addAddress(useraddress);
		managefooter.addEmail(useremail);
		managefooter.addPhone(userphone);
		managefooter.clickUpdate();*/
	}

}
