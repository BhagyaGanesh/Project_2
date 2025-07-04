package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class HomePage {

	public WebDriver driver;

	@FindBy(xpath = "//li[@class='nav-item dropdown']")
	WebElement admin;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")
	WebElement logout;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signinpage;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement moreinfo;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[7]")
	WebElement moreinfonews;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[9]")
	WebElement moreinfocategory;
	@FindBy(xpath = "//p[text()='Manage Contact']")
	WebElement managecontact;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[8]")
	WebElement moreinfofooter;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement moreinfoadmin;
	@FindBy(xpath = "(//a[@class='small-box-footer'])[7]")
	WebElement moreinfonewsupdate;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ManageNewsUpdatePage clickNewsUpdateMoreInfo() {
		moreinfonewsupdate.click();
		return new ManageNewsUpdatePage(driver);

	}
	
	public AdminUserUpdatePage clickadminMoreInfo() {
		moreinfoadmin.click();
		return new AdminUserUpdatePage(driver);
	}
	
	public ManageFooterTextPage clickFooterMoreInfo() {
		moreinfofooter.click();
		return new ManageFooterTextPage(driver);

	}

	
	public ManageContactPage clickManageContact() {
		managecontact.click();
		return new ManageContactPage(driver);

	}
	
	public ManageCategoryPage clickCateMoreInfo() {
		moreinfocategory.click();
		return new ManageCategoryPage(driver);

	}

	public ManageNewsPage clickTheMoreInfo() {
		moreinfonews.click();
		return new ManageNewsPage(driver);

	}
	
	public AdminUserPage clickMoreInfo() {
		moreinfo.click();
		return new AdminUserPage(driver);
	}

	public HomePage chooseAdmin() {
		admin.click();
		return this;
	}

	public HomePage chooseLogout() {
		logout.click();
		return this;
	}

	public boolean signinPageDisplayed() {
		return signinpage.isDisplayed();
	}

}
