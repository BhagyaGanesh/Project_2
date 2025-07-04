package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.AdminUserUpdatePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsUpdatePage;
import utilities.ExcelUtility;

public class AdminUserUpdateTest extends Base {
	
	public AdminUserUpdatePage adminuserupdatepage;
	public HomePage homepage;

	@Test
	public void updateAdmin() throws IOException {

		// String username = "admin";
		// String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		adminuserupdatepage = homepage.clickadminMoreInfo();
		String adminusername = "Dell";
		String adminpassword = "Laptop";
		adminuserupdatepage.clickAction().giveAdminName(adminusername).giveAdminPass(adminpassword).saveAdmin();
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

	@Test
	public void isUpdateDisplayed() {

		String username = "admin";
		String password = "admin";
		
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
		Assert.assertTrue(updatedadmin);

	}

}
