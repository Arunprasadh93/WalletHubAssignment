package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBHomePageLocators {
	
	@FindBy(how=How.XPATH,using = "//textarea")
	public WebElement fbPostClicktxt	;
	
	@FindBy(how=How.XPATH,using = "//*[contains(text(),'Write something here')]")
	public WebElement fbPostEntertxt;
	
	
	@FindBy(how=How.XPATH,using = "//span[text()='Post']")
	public WebElement fbPostbtn;
	
	
	
	
}
