package testScript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base{
	
	@Test
	public void addCategory() throws AWTException, IOException {
		
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSignin();
		
		String newcategory = "gem stone";
		ManageCategoryPage managecategory = new ManageCategoryPage(driver);
		managecategory.clickMoreInfo();
		managecategory.clickNew();
		managecategory.EnterCategory(newcategory);
		managecategory.selectGroup();
		managecategory.chooseImage();
		managecategory.clickSave();
	}

}
