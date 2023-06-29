package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution {
	@Test(groups = {"smoke"})
	void userReg() {
		Reporter.log("user reg",true);
	}
	@Test(groups = {"reg"})
	void userLogin() {
		Reporter.log("user login",true);
	}
	@Test(groups = {"ft"})
	void userUpdate() {
		Reporter.log("user update",true);
	}
	@Test(groups = {"smoke"})
	void custReg() {
		Reporter.log("cust reg",true);
	}
	@Test(groups = {"reg"})
	void custLogin() {
		Reporter.log("cust login",true);
	}
	@Test(groups = {"ft"})
	void custUpdate() {
		Reporter.log("cust update",true);
	}
}