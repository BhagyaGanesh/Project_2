package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsUpdatePage {
	
    public WebDriver driver; 
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[7]") WebElement moreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/edit?edit=6382&page_ad=1']") WebElement action;
	@FindBy(xpath="//textarea[@id='news']") WebElement news;
	@FindBy(xpath="//button[@type='submit']") WebElement update;
	
	public ManageNewsUpdatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickTheMoreInfo() {
		moreinfo.click();
		
	}
	
	public void clickTheActions() {
		action.click();
		
	}
	
	public void enterNews(String updatenews) {
		news.sendKeys(updatenews);
		
	}
	
	public void saveNews() {
		update.click();
		
		
	}
	
	public boolean isUpdateDislayed() {
		return update.isDisplayed();
	}


}
