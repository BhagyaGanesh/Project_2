package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//p[text()='Manage Contact']") WebElement managecontact;
	@FindBy(xpath="//i[@class='fas fa-edit']") WebElement action;
	@FindBy(xpath="//input[@id='phone']") WebElement phone;
	@FindBy(xpath="//input[@id='email']") WebElement email;
	@FindBy(xpath="//textarea[@id='content']") WebElement address;
	@FindBy(xpath="//textarea[@name='del_time']") WebElement deliverytime;
	@FindBy(xpath="//input[@name='del_limit']") WebElement deliverycharge;
	@FindBy(xpath="//button[@type='submit']") WebElement update;
	
	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickManageContact() {
		managecontact.click();
		
	}
	
	public void clickTheAction() {
		action.click();
		
	}
	
	public void addPhoneNo(String userphone) {
		phone.clear();
		phone.sendKeys(userphone);
		
	}
	
	public void addEmail(String useremail) {
		email.clear();
		email.sendKeys(useremail);
		
	}
	
	public void addAddress(String useraddress) {
		address.clear();
		address.sendKeys(useraddress);
		
		
	}
	public void addDeliveryTime(String time) {
		
		deliverytime.clear();
		deliverytime.sendKeys(time);
	}
	
    public void addDeliveryCharge(String charge) {
		
    	deliverycharge.clear();
    	deliverycharge.sendKeys(charge);
	}
    
   public void clickUpdate() {
	   
	   PageUtility page=new PageUtility();
	   page.javaSriptClick(driver, update);
	   //update.click();
    	
	}
   
   public boolean isUpdateDislayed() {
		return update.isDisplayed();
	}

}
