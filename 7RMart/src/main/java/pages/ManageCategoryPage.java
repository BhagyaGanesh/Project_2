package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import contants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;


public class ManageCategoryPage {
	
    public WebDriver driver;
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[9]") WebElement moreinfo;
	@FindBy(xpath="//i[@class='fas fa-edit']") WebElement newlist;
	@FindBy(xpath="//input[@id='category']") WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']") WebElement group;
	@FindBy(xpath="//input[@id='main_img']") WebElement image;
	@FindBy(xpath="//button[@type='submit']") WebElement save;
	
	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMoreInfo() {
		moreinfo.click();
		
	}
	
	public void clickNew() {
		newlist.click();
		
	}
	
	public void EnterCategory(String newcategory) {
		
		category.sendKeys(newcategory);
		
	}
	
	public void selectGroup() {
		
		group.click();
		
	}
	
	public void chooseImage() throws AWTException {
		
		/*WaitUtility wait = new WaitUtility();
		wait.waitForElementToBeClickable(driver, image);*/
		
		FileUploadUtility uploadimage = new FileUploadUtility();
		uploadimage.fileUploadUsingSendKeys(image, Constants.IMAGE);
		//uploadimage.fileuploadUsingRobertClass(image, Constants.IMAGE);
		
		
	}
	
   public void clickSave() {
	   
	   PageUtility page=new PageUtility();
		page.javaSriptClick(driver, save);
	   //save.click();
    	
	}
	
	
}
