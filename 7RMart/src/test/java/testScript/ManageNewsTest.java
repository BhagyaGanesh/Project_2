package testScript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base{
	
	@Test
	public void addNews() {
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickTheMoreInfo();
		managenewspage.clickTheNewNews();
		managenewspage.enterNews();
		managenewspage.saveNews();

}
}
