package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath=" //input[@name='username']") WebElement user;
	@FindBy(xpath="//input[@name='password']") WebElement pass;
	@FindBy(xpath="//button[@type='submit']") WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertmsg;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterTheUsername(String username) {
		user.sendKeys(username);
		
	}
	
    public void enterThePassword(String password) {
    	pass.sendKeys(password);
		
	}
    
    public void clickOnSignin() {
    	signin.click();
		
	}
    
    public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
		
	}
	
	public boolean isAlertMsgDislayed() {
		return alertmsg.isDisplayed();
	}

}
