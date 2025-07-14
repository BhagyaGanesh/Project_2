package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import contants.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
	
	public AdminUserPage adminuserpage;
	public HomePage homepage;

	@Test(description = "Verify that an authorized user can create a new Admin account via user management.")
	public void addAdmin() throws IOException {

		// String username = "admin";
		// String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		adminuserpage = homepage.clickMoreInfo();
		FakerUtility fakerutility = new FakerUtility();
		String adminusername = fakerutility.creatARandomFirstName();
		String adminpassword = fakerutility.creatARandomFirstName();
		adminuserpage.clickNewAdmin().giveAdminName(adminusername).giveAdminPass(adminpassword).admintype().saveAdmin();
		boolean alertmsg = adminuserpage.isAlertMsgDisplayed();
		Assert.assertTrue(alertmsg,Constants.ADMINUSERSTESTCREATEUSERS);
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		String adminusername = "First user";
		String adminpassword = "First password";
		AdminUserPage adminuserpage = new AdminUserPage(driver);
		adminuserpage.clickMoreInfo();
		adminuserpage.clickNewAdmin();
		adminuserpage.giveAdminName(adminusername);
		adminuserpage.giveAdminPass(adminpassword);
		adminuserpage.admintype();
		adminuserpage.saveAdmin();*/

	}
}