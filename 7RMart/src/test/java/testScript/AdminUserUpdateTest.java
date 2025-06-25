package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUserUpdatePage;
import pages.LoginPage;
import pages.ManageNewsUpdatePage;

public class AdminUserUpdateTest extends Base{
	
	@Test
	public void updateAdmin() {
		
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		String adminusername = "Dell";
		String adminpassword = "Laptop";
		AdminUserUpdatePage updateadmin = new AdminUserUpdatePage(driver);
		updateadmin.clickMoreInfo();
		updateadmin.clickAction();
		updateadmin.giveAdminName(adminusername);
		updateadmin.giveAdminPass(adminpassword);
		updateadmin.saveAdmin();
	}
	
	@Test
	public void isUpdateDisplayed() {
		
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		
		AdminUserUpdatePage adminupdate = new AdminUserUpdatePage(driver);
		adminupdate.clickMoreInfo();
		adminupdate.clickAction();
		
		boolean updatedadmin = adminupdate.isUpdateDislayed();
		Assert.assertTrue(updatedadmin);
		
	}

}
