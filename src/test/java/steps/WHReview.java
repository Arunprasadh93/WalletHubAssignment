package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.SeleniumDriver;
import cucumber.api.Scenario;
import pages.actions.FBHomePageActions;
import pages.actions.FBLoginPageActions;
import pages.actions.WalletHubReviewPageActions;


public class WHReview {

	
	
	@BeforeClass
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
	
	@Test
	public void launchandLogin() throws InterruptedException {
		WalletHubReviewPageActions wallethubreview = new WalletHubReviewPageActions();
		
		
		
		SeleniumDriver.openPage("https://wallethub.com/profile/test-insurance-company-13732055i");
		wallethubreview.walletHubReview();
		wallethubreview.verifyReview("Test Insurance Company");
	}
	
	@AfterClass
    public static void tearDown(Scenario scenario) {
    	
    
    	
    SeleniumDriver.tearDown();
    }
	
}
