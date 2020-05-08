package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.support.PageFactory;

import base.SeleniumDriver;
import pages.locators.FBLoginPageLocators;

public class FBLoginPageActions {

	
	
	FBLoginPageLocators fbloginpageLocators= null;
	
	public FBLoginPageActions() {
		
		fbloginpageLocators = new FBLoginPageLocators();
		
		PageFactory.initElements(SeleniumDriver.getDriver(), fbloginpageLocators);
	}
	
	public void loginFB(String username , String password) throws InterruptedException
	{
		
		Thread.sleep(3000);
		WebDriver driver = SeleniumDriver.getDriver();
		WebElement email = fbloginpageLocators.fbUserNametxt;
//	    email.clear();
//	    email.sendKeys(username);
//
//	    WebElement password1 = driver.findElement(By.name("pass"));
//	    password1.clear();
//	    password1.sendKeys(password);
//
//	    WebElement loginbutton = driver.findElement(By.id("loginbutton"));
//	    loginbutton.click();
//
//	    System.out.println("done!");
		
		
		email.sendKeys(username);
		fbloginpageLocators.fbPasswordtxt.sendKeys(password);
		fbloginpageLocators.fbUserLoginbtn.click();
	}
	
	
	
}
