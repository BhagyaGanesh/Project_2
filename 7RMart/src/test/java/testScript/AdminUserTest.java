package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends Base{
	
	@Test
    public void addAdmin() throws IOException {
		
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		
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