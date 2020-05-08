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


public class FBLoginnPOST {

	
	
	@BeforeClass
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
	
	@Test
	public void launchandLogin() throws InterruptedException {
		FBLoginPageActions fblogin = new FBLoginPageActions();
		FBHomePageActions fbhomePageactions = new FBHomePageActions();
		
		SeleniumDriver.openPage("https://www.facebook.com");
		fblogin.loginFB("arunprasadh.sj@gmail.com", "chelseamay2020");
		fbhomePageactions.postFB("Hellow World!");
	}
	
	@AfterClass
    public static void tearDown(Scenario scenario) {
    	
    
    	
    SeleniumDriver.tearDown();
    }
	
}
