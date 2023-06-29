package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IC {
	@Test(invocationCount = 10)
	void register() {
		Reporter.log("registered",true);
	}
}