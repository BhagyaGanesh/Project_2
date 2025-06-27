package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsUpdatePage;
import utilities.ExcelUtility;

public class ManageNewsUpdateTest extends Base{
	
	@Test
	public void updateNews() throws IOException {
		
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
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
