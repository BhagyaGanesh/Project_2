package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

	public WebDriver driver;

	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newnews;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement enternews;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savenews;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public ManageNewsPage clickTheNewNews() {
		newnews.click();
		return this;
		

	}

	public ManageNewsPage enterNews() {
		enternews.sendKeys("New News");
		return this;

	}

	public ManageNewsPage saveNews() {
		savenews.click();
		return this;

	}

}
