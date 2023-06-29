package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Prajwal/Desktop/dropdown.html");
		WebElement city = driver.findElement(By.id("beverage"));
		Select select=new Select(city);
		System.out.println(select.isMultiple());
		Thread.sleep(3000);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByValue("1");
		Thread.sleep(3000);
		select.selectByVisibleText("Coffee");
		Thread.sleep(3000);
		select.deselectByVisibleText("Coffee");
		Thread.sleep(3000);
		select.deselectByValue("1");
		Thread.sleep(3000);
		select.deselectByIndex(2);
	}
}