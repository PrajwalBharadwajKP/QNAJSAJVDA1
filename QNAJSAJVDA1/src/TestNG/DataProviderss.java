package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderss {
	@DataProvider
	Object[] data() {
		Object[] s= {"Prajwal",'B',1,true,4.8};
		return s;
	}
	@Test(dataProvider = "data")
	void register(Object s) {
		Reporter.log(s+" registered",true);
	}
}