package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 extends NewTest{
	@Test
	void test1() {
		  Reporter.log("test 1",true);
	}
}