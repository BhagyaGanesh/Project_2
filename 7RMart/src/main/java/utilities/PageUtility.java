package utilities;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByVisibleText(WebElement element,String visibleText) {
		Select select =new Select(element);
		select.selectByVisibleText(visibleText);;
		
	}
	
	public void selectByIndex(WebElement element,int index) {
		Select select =new Select(element);
		select.selectByIndex(index);
		
	}
	
	public void selectByValue(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByValue(value);
		
	}
	
	public void drapAndDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
	}
	
	public void contextClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}
	
	public void moveToElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}
	
	public void singleClick(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.click(element).build().perform();
	}
	
    public void simple(WebDriver driver) {
		driver.switchTo().alert().accept();
		
		
	}
	
	public void confirmation(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	
	public void prompt(WebDriver driver) {
		driver.switchTo().alert().sendKeys(null);
		driver.switchTo().alert().accept();
	}
	
	public void frame(WebDriver driver, String frameName) {
		driver.switchTo().frame(frameName);
		
	}
	
	public void parentHandle(WebDriver driver) {
		String parenthandle = driver.getWindowHandle();
	}
	
	public void childHandle(WebDriver driver) {
		Set<String> childhandle = driver.getWindowHandles();
		for(String set:childhandle) {
			System.out.println("window handle"+ set);
			driver.switchTo().window(set);
		}
	}
	
	public void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	public void javaSriptClick(WebDriver  driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}

}
