package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		String actualTitle = driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		if(actualTitle.equals(expectedTitle))
			System.out.println("page displayed");
		else
			System.out.println("page not displayed");
	}

}
