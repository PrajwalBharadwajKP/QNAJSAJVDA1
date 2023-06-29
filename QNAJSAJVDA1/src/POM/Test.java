package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demo.actitime.com/login.do");
	LoginPage lp=new LoginPage(driver);
	lp.getUsername().sendKeys("jhbfgjg");
	lp.getPassword().sendKeys("sdhfhsg");
	lp.getLoginBTN().click();
	Thread.sleep(3000);
	lp.getUsername().sendKeys("admin");
	lp.getPassword().sendKeys("manager");
	lp.getLoginBTN().click();
	}

}
