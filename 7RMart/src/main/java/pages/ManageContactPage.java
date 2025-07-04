package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {

	public WebDriver driver;

	
	@FindBy(xpath = "//i[@class='fas fa-edit']")
	WebElement action;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//textarea[@id='content']")
	WebElement address;
	@FindBy(xpath = "//textarea[@name='del_time']")
	WebElement deliverytime;
	@FindBy(xpath = "//input[@name='del_limit']")
	WebElement deliverycharge;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement update;

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public ManageContactPage clickTheAction() {
		action.click();
		return this;

	}

	public ManageContactPage addPhoneNo(String userphone) {
		phone.clear();
		phone.sendKeys(userphone);
		return this;

	}

	public ManageContactPage addEmail(String useremail) {
		email.clear();
		email.sendKeys(useremail);
		return this;

	}

	public ManageContactPage addAddress(String useraddress) {
		address.clear();
		address.sendKeys(useraddress);
		return this;

	}

	public ManageContactPage addDeliveryTime(String time) {

		deliverytime.clear();
		deliverytime.sendKeys(time);
		return this;
	}

	public ManageContactPage addDeliveryCharge(String charge) {

		deliverycharge.clear();
		deliverycharge.sendKeys(charge);
		return this;
	}

	public ManageContactPage clickUpdate() {

		PageUtility page = new PageUtility();
		page.javaSriptClick(driver, update);
		// update.click();
		return this;

	}

	public boolean isUpdateDislayed() {
		return update.isDisplayed();
	}

}
