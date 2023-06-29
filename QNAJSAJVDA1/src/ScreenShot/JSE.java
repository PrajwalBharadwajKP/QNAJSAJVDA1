package ScreenShot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actimind.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<=500;i++)
			js.executeScript("window.scrollBy(0,10)");
		for(int i=0;i<=500;i++)
			js.executeScript("window.scrollBy(0,-10)");
	}
}