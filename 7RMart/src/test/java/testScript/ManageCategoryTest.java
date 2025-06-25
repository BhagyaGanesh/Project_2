package testScript;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;

public class ManageCategoryTest extends Base{
	
	@Test
	public void addCategory() throws AWTException {
		
		String username = "admin";
		String password = "admin";
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
