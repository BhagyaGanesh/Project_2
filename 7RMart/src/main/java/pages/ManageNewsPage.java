package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
public WebDriver driver; 
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[7]") WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newnews;
	@FindBy(xpath="//textarea[@id='news']") WebElement enternews;
	@FindBy(xpath="//button[@type='submit']") WebElement savenews;
	
	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickTheMoreInfo() {
		moreinfo.click();
		
	}
	
	public void clickTheNewNews() {
		newnews.click();
		
	}
	
	public void enterNews() {
		enternews.sendKeys("New News");
		
	}
	
	public void saveNews() {
		savenews.click();
		
		
	}

}
