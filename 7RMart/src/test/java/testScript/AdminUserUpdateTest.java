package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import contants.Constants;
import pages.AdminUserPage;
import pages.AdminUserUpdatePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsUpdatePage;
import utilities.ExcelUtility;

public class AdminUserUpdateTest extends Base {
	
	public AdminUserUpdatePage adminuserupdatepage;
	public HomePage homepage;

	@Test(description = "Verify that an authorized user can update a new Admin account via user management.")
	public void updateAdmin() throws IOException {

		
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		adminuserupdatepage = homepage.clickadminMoreInfo();
		String adminusername = ExcelUtility.getStringData(1, 0, "loginpage");
		String adminpassword = ExcelUtility.getStringData(1, 1, "loginpage");
		adminuserupdatepage.clickAction().giveAdminName(adminusername).giveAdminPass(adminpassword).saveAdmin();
		boolean alertmsg = adminuserupdatepage.isAlertMsgDisplayed();
		Assert.assertTrue(alertmsg,Constants.ADMINUSERSTESTUPDATEUSERS);
		
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		
		AdminUserUpdatePage updateadmin = new AdminUserUpdatePage(driver);
		updateadmin.clickMoreInfo();
		updateadmin.clickAction();
		updateadmin.giveAdminName(adminusername);
		updateadmin.giveAdminPass(adminpassword);
		updateadmin.saveAdmin();*/
	}

	@Test(description="To verify that update button is displayed")
	public void isUpdateDisplayed() throws IOException {

		
		
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		adminuserupdatepage = homepage.clickadminMoreInfo();
		adminuserupdatepage.clickAction();
		
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		AdminUserUpdatePage adminupdate = new AdminUserUpdatePage(driver);
		adminupdate.clickMoreInfo();
		adminupdate.clickAction();*/

		boolean updatedadmin = adminuserupdatepage.isUpdateDislayed();
		Assert.assertTrue(updatedadmin,Constants.ADMINUSERTESTUPDATETDISPLAY);

	}

}
