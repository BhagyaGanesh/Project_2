package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserUpdatePage {

	public WebDriver driver;

	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=14664&page_ad=1']")
	WebElement action;
	@FindBy(xpath = "//input[@id='username']")
	WebElement adminname;
	@FindBy(xpath = "//input[@id='password']")
	WebElement adminpass;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement admintype;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement updateadmin;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;

	public AdminUserUpdatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public AdminUserUpdatePage clickAction() {
		action.click();
		return this;

	}

	public AdminUserUpdatePage giveAdminName(String adminusername) {

		adminname.clear();
		adminname.sendKeys(adminusername);
		return this;
	}

	public AdminUserUpdatePage giveAdminPass(String adminpassword) {

		adminpass.clear();
		adminpass.sendKeys(adminpassword);
		return this;
	}

	public AdminUserUpdatePage admintype() {
		PageUtility pageutility = new PageUtility();
		pageutility.selectByIndex(admintype, 1);
		return this;
	}

	public AdminUserUpdatePage saveAdmin() {

		PageUtility page = new PageUtility();
		page.javaSriptClick(driver, updateadmin);
		// updateadmin.click();
		return this;
	}

	public boolean isUpdateDislayed() {
		return updateadmin.isDisplayed();
	}
	public boolean isAlertMsgDisplayed() {
		return alertmsg.isDisplayed();
	}

}
