package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[8]") WebElement moreinfo;
	@FindBy(xpath="//i[@class='fas fa-edit']") WebElement action;
	@FindBy(xpath="//textarea[@name='address']") WebElement address;
	@FindBy(xpath="//input[@id='email']") WebElement email;
	@FindBy(xpath="//input[@id='phone']") WebElement phone;
	@FindBy(xpath="//button[@type='submit']") WebElement update;
	
	public ManageFooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickTheMoreInfo() {
		moreinfo.click();
		
	}
	
	public void clickTheAction() {
		action.click();
		
	}
	
	public void addAddress(String useraddress) {
		address.clear();
		address.sendKeys(useraddress);
		
	}
	
	public void addEmail(String useremail) {
		email.clear();
		email.sendKeys(useremail);
		
	}
	
	public void addPhone(String userphone) {
		phone.clear();
		phone.sendKeys(String.valueOf(userphone));
		
		
	}
	public void clickUpdate() {
		
		update.click();
	}


}
