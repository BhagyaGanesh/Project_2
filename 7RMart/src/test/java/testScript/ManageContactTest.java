package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import contants.Constants;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	
	public ManageContactPage managecontactpage;
	public HomePage homepage;

	@Test(description="To verify that an authorized user is able to successfully update the 'Contact Us' information")
	public void addContactInfo() throws IOException {

		
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		managecontactpage = homepage.clickManageContact();
		
		String userphone = ExcelUtility.getStringData(1, 0, "managecontactpage");
		String useremail = ExcelUtility.getStringData(1, 1, "managecontactpage");
		String useraddress = ExcelUtility.getStringData(1, 2, "managecontactpage");
		String time = ExcelUtility.getStringData(1, 3, "managecontactpage");
		String charge = ExcelUtility.getStringData(1, 4, "managecontactpage");
		
		managecontactpage.clickTheAction().addPhoneNo(userphone).addEmail(useremail).addAddress(useraddress).addDeliveryTime(time).addDeliveryCharge(charge).clickUpdate();
		boolean alertmsg = managecontactpage.isAlertMsgDisplayed();
		Assert.assertTrue(alertmsg,Constants.MANAGECONTACTTESTUPDATECONTACT);
		
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		
		ManageContactPage managecontact = new ManageContactPage(driver);
		managecontact.clickManageContact();
		managecontact.clickTheAction();
		managecontact.addPhoneNo(userphone);
		managecontact.addEmail(useremail);
		managecontact.addAddress(useraddress);
		managecontact.addDeliveryTime(time);
		managecontact.addDeliveryCharge(charge);
		managecontact.clickUpdate();*/

	}

	@Test(description="To verify that an authorized user is able to successfully display the 'Contact Us' information")
	public void isUpdateDisplayed() throws IOException {

		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		homepage = loginpage.clickOnSignin();
		managecontactpage = homepage.clickManageContact();
		managecontactpage.clickTheAction();
		
		/*loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();

		ManageContactPage managecontact = new ManageContactPage(driver);
		managecontact.clickManageContact();
		managecontact.clickTheAction();*/

		boolean updatepresent = managecontactpage.isUpdateDislayed();
		Assert.assertTrue(updatepresent,Constants.MANAGECONTACTTESTDISPLAYCONTACT);

	}

}
