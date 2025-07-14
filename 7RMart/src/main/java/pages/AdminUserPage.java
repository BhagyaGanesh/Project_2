package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserPage {

	public WebDriver driver;

	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newadmin;
	@FindBy(xpath = "//input[@id='username']")
	WebElement adminname;
	@FindBy(xpath = "//input[@id='password']")
	WebElement adminpass;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement admintype;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement saveadmin;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmsg;

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public AdminUserPage clickNewAdmin() {
		newadmin.click();
		return this;
	}

	public AdminUserPage giveAdminName(String adminusername) {
		adminname.sendKeys(adminusername);
		return this;
	}

	public AdminUserPage giveAdminPass(String adminpassword) {
		adminpass.sendKeys(adminpassword);
		return this;
	}

	public AdminUserPage admintype() {
		PageUtility pageutility = new PageUtility();
		pageutility.selectByIndex(admintype, 1);
		return this;
	}

	public AdminUserPage saveAdmin() {
		saveadmin.click();
		return this;
	}
	public boolean isAlertMsgDisplayed() {
		return alertmsg.isDisplayed();
	}

}
