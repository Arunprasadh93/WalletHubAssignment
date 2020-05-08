package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.SeleniumDriver;
import pages.locators.FBHomePageLocators;

public class FBHomePageActions {

	
	
	FBHomePageLocators fbhomepageLocators= null;
	
	public FBHomePageActions() {
		
		fbhomepageLocators = new FBHomePageLocators();
		
		PageFactory.initElements(SeleniumDriver.getDriver(), fbhomepageLocators);
	}
	
	public void postFB(String postText) throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		
		WebDriver driver = SeleniumDriver.getDriver();


		WebElement TextArea = driver.findElement(By.xpath("//textarea[@name='xhpc_message']"));
		Thread.sleep(2000);
		TextArea.click();
		TextArea.sendKeys("Hello World");
		
		
		SeleniumDriver.waitForElement(fbhomepageLocators.fbPostbtn);
		
		fbhomepageLocators.fbPostbtn.click();
	}
	
	
	
}
