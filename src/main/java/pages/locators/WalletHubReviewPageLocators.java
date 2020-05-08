package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WalletHubReviewPageLocators {
	
	@FindBy(how=How.XPATH,using = "//*[@class='rvs-svg']//*[@class='rvs-star-svg']")
	public WebElement whReviewStarsselect;
	
	@FindBy(how=How.XPATH,using = "//*[@class='dropdown second opened']")
	public WebElement whPolicyDropdownclick;
	
	
	@FindBy(how=How.XPATH,using = "//li[text()='Health Insurance']")
	public WebElement whPolicyDropdownselect;
	
	
	@FindBy(how=How.XPATH,using = "//textarea[contains(@placeholder,'Write your review')]")
	public WebElement whReviewtxt;
	
	@FindBy(how=How.XPATH,using = "//div[text()='Submit']")
	public WebElement whReviewSubmitbtn;
	
	
	
	
	
	
	
	
}
