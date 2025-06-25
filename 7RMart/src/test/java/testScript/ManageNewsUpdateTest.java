package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsUpdatePage;

public class ManageNewsUpdateTest extends Base{
	
	@Test
	public void updateNews() {
		
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		String updatenews = "latest";
		ManageNewsUpdatePage newsupdate = new ManageNewsUpdatePage(driver);
		newsupdate.clickTheMoreInfo();
		newsupdate.clickTheActions();
		newsupdate.enterNews(updatenews);
		newsupdate.saveNews();
		
	}
	
	@Test
	public void isUpdateDisplayed() {
		
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		
		ManageNewsUpdatePage newsupdate = new ManageNewsUpdatePage(driver);
		newsupdate.clickTheMoreInfo();
		newsupdate.clickTheActions();
		
		boolean updatednews = newsupdate.isUpdateDislayed();
		Assert.assertTrue(updatednews);
		
	}

}
