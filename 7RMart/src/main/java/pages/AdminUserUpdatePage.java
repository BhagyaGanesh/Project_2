package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserUpdatePage {
	

    public WebDriver driver;
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement moreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=14556&page_ad=1']") WebElement action;
	@FindBy(xpath="//input[@id='username']") WebElement adminname;
	@FindBy(xpath="//input[@id='password']") WebElement adminpass;
	@FindBy(xpath="//select[@id='user_type']") WebElement admintype;
	@FindBy(xpath="//button[@name='Update']") WebElement updateadmin;
	
	public AdminUserUpdatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickMoreInfo() {
		moreinfo.click();
	}
	
	public void clickAction() {
		action.click();
		
	}
	
	public void giveAdminName(String adminusername) {
		
		adminname.clear();
		adminname.sendKeys(adminusername);
	}
	
	public void giveAdminPass(String adminpassword) {
		
		adminpass.clear();
		adminpass.sendKeys(adminpassword);
	}
	
	public void admintype() {
		PageUtility pageutility = new PageUtility();
		pageutility.selectByIndex(admintype, 1);
	}
	
	public void saveAdmin() {
		
		PageUtility page=new PageUtility();
		page.javaSriptClick(driver, updateadmin);
		//updateadmin.click();
	}
	
	public boolean isUpdateDislayed() {
		return updateadmin.isDisplayed();
	}



}
