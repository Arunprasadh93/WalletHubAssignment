package pages.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.SeleniumDriver;
import pages.locators.WalletHubReviewPageLocators;

public class WalletHubReviewPageActions {

	
	
	WalletHubReviewPageLocators wallethubeviewpagelocators= null;
	
	public WalletHubReviewPageActions() {
		
		wallethubeviewpagelocators = new WalletHubReviewPageLocators();
		
		PageFactory.initElements(SeleniumDriver.getDriver(), wallethubeviewpagelocators);
	}
	
	public void walletHubReview() throws InterruptedException
	{
		
		
			
			WebDriver driver = SeleniumDriver.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 30); 
			
			
			driver.findElement(By.xpath("//span[@class='nav-txt'][contains(text(),'Reviews')]")).click();

			List<WebElement> stars = driver
					.findElements(By.xpath("//*[@class='rvs-svg']//*[@class='rvs-star-svg']"));
			
			Actions action = new Actions(driver);
			
			action.moveToElement(wait.until(ExpectedConditions.visibilityOf(stars.get(5)))).build().perform();
			
			WebElement Star = driver.findElement(By.xpath("//review-star[@class='rvs-svg']//*[local-name()='svg'][4]"));
			action.click(Star).build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown second']"))).click();
			driver.findElement(By.xpath("//li[contains(text(),'Health Insurance')]")).click();
			driver.findElement(By.xpath("//textarea[contains(@placeholder,'Write your review')]")).sendKeys(
					"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
					+ " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
	        driver.findElement(By.xpath("//div[@class='sbn-action semi-bold-font btn fixed-w-c tall']")).click(); 
	        
		
	}
	
	
	
	public void verifyReview(String reviewTitle) {
		
		WebDriver driver = SeleniumDriver.getDriver();
		Actions action = new Actions(driver);
		
		WebElement successmessage =driver.findElement(By.xpath("//h4[contains(text(),'Your review has been posted.')]"));
        String Actual = successmessage.getText();
        String Expected = "Your review has been posted.";
        Assert.assertEquals(Actual, Expected);
		WebElement profile= driver.findElement(By.xpath("//div[@class='brgm-button brgm-user brgm-list-box']/span[@class ='brgm-list-title']"));
		action.moveToElement(profile).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@class='brgm-list-it'][contains(text(),'Profile')]"))).click().build().perform();
       String Act= driver.findElement(By.xpath("//a[contains(text(),'"+reviewTitle+"')]")).getText();
       String Exp = reviewTitle;
       Assert.assertEquals(Act, Exp);
	}
		//fbhomepageLocators.fbPostbtn.click();
	}
	
	
	

