package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBLoginPageLocators {
	
	@FindBy(how=How.NAME,using = "email")
	public WebElement fbUserNametxt;
	
	@FindBy(how=How.NAME,using = "pass")
	public WebElement fbPasswordtxt;
	
	
	@FindBy(how=How.CSS,using = "input[value='Log In']")
	public WebElement fbUserLoginbtn;
	
	
	
	
}
