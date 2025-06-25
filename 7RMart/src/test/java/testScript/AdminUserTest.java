package testScript;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;

public class AdminUserTest extends Base{
	
	@Test
    public void addAdmin() {
		
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
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
		adminuserpage.saveAdmin();

}
}