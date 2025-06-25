package testScript;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterTextPage;

public class ManageFooterTextTest extends Base{
	
	@Test
	public void updateDetails() {
		
		String username = "admin";
		String password = "admin";
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
