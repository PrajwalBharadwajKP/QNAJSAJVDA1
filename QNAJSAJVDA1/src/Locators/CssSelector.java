package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./msedgedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.findElement(By.cssSelector("input[type=\"hidden\"][name='jazoest']"));
		System.out.println("element identified");
	}

}
