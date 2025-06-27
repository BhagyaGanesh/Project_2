package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base{
	
	@Test
	public void updateDetails() throws IOException {
		
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		
		String useraddress = "FlatNo.300 Trivandrum";
		String useremail = "sony@gmail.com";
		String userphone = "2345654356";
		ManageFooterTextPage managefooter = new ManageFooterTextPage(driver);
		managefooter.clickTheMoreInfo();
		managefooter.clickTheAction();
		managefooter.addAddress(useraddress);
		managefooter.addEmail(useremail);
		managefooter.addPhone(userphone);
		managefooter.clickUpdate();
	}

}
