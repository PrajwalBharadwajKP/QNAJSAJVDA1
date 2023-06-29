package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	void register() {
		Reporter.log("registered",true);
	}
	@Test(priority=2)
	void login() {
		Reporter.log("logged in",true);
	}
	@Test(priority=3)
	void edit() {
		Reporter.log("edited",true);
	}
	@Test(priority=4)
	void delete() {
		Reporter.log("deleted",true);
	}
}