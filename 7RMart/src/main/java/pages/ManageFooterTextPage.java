package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {

	public WebDriver driver;

	
	@FindBy(xpath = "//i[@class='fas fa-edit']")
	WebElement action;
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement address;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement update;

	public ManageFooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public ManageFooterTextPage clickTheAction() {
		action.click();
		return this;

	}

	public ManageFooterTextPage addAddress(String useraddress) {
		address.clear();
		address.sendKeys(useraddress);
		return this;

	}

	public ManageFooterTextPage addEmail(String useremail) {
		email.clear();
		email.sendKeys(useremail);
		return this;

	}

	public ManageFooterTextPage addPhone(String userphone) {
		phone.clear();
		phone.sendKeys(String.valueOf(userphone));
		return this;

	}

	public ManageFooterTextPage clickUpdate() {

		update.click();
		return this;
	}

}
