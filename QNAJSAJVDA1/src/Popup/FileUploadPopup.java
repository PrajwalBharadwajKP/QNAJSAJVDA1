package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Prajwal\\Desktop\\Prajwal\\Selenium Class\\questions/procedure.txt");
	}
}