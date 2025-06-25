package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LogoutPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//li[@class='nav-item dropdown']") WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']") WebElement logout;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signinpage;
	
	
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void chooseAdmin() {
		admin.click();
	}
	public void chooseLogout() {
		logout.click();
	}
	
	public boolean signinPageDisplayed()
	{
		return signinpage.isDisplayed();
	}

}
