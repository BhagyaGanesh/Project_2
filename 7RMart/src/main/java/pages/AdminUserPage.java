package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserPage {
	
    public WebDriver driver;
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newadmin;
	@FindBy(xpath="//input[@id='username']") WebElement adminname;
	@FindBy(xpath="//input[@id='password']") WebElement adminpass;
	@FindBy(xpath="//select[@id='user_type']") WebElement admintype;
	@FindBy(xpath="//button[@name='Create']") WebElement saveadmin;
	
	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickMoreInfo() {
		moreinfo.click();
	}
	
	public void clickNewAdmin() {
		newadmin.click();
	}
	
	public void giveAdminName(String adminusername) {
		adminname.sendKeys(adminusername);
	}
	
	public void giveAdminPass(String adminpassword) {
		adminpass.sendKeys(adminpassword);
	}
	
	public void admintype() {
		PageUtility pageutility = new PageUtility();
		pageutility.selectByIndex(admintype, 1);
	}
	
	public void saveAdmin() {
		saveadmin.click();
	}

}
