package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.fb.com");
		URL url =new URL("htpps://www.amazon.in");
		driver.navigate().to(url);
		driver.get("https://demowebshop.tricentis.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}