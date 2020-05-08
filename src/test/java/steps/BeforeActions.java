package steps;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import base.SeleniumDriver;



public class BeforeActions  {

	@BeforeClass
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
}
