package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.name("field-keywords"));
		System.out.println("element identified");
	}
}