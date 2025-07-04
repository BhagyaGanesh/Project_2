package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	
	public ManageNewsPage managenewspage;
	public HomePage homepage;

	@Test
	public void addNews() throws IOException {
		// String username = "admin";
		// String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		managenewspage = homepage.clickTheMoreInfo();
		managenewspage.clickTheNewNews().enterNews().saveNews();
		
		
		
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
