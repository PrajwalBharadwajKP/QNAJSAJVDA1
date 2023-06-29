package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PreCondition {
	@BeforeMethod
	void openBrowser() {
		Reporter.log("open browser",true);
	}
	@Test(priority=2)
	void edit() {
		Reporter.log("user edited",true);
	}
	@Test(priority=1)
	void register() {
		Reporter.log("user registered",true);
	}
	@AfterMethod
	void closeBrowser() {
		Reporter.log("close browser",true);
	}
}