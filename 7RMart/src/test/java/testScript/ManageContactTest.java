package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base{
	
	@Test
	public void addContactInfo() throws IOException {
		
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		String userphone = "2345654356";
		String useremail = "sony@gmail.com";
		String useraddress = "FlatNo.300 Trivandrum";
		String time = "1-2pm";
		String charge = "20";
		ManageContactPage managecontact = new ManageContactPage(driver);
		managecontact.clickManageContact();
		managecontact.clickTheAction();
		managecontact.addPhoneNo(userphone);
		managecontact.addEmail(useremail);
		managecontact.addAddress(useraddress);
		managecontact.addDeliveryTime(time);
		managecontact.addDeliveryCharge(charge);
		managecontact.clickUpdate();
			
	}
	
	@Test
	public void isUpdateDisplayed() {
		
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		ManageContactPage managecontact = new ManageContactPage(driver);
		managecontact.clickManageContact();
		managecontact.clickTheAction();
		
		
		boolean updatepresent = managecontact.isUpdateDislayed();
		Assert.assertTrue(updatepresent);
		
	}

}
