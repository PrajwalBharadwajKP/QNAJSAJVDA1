package CloseAndQuit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close4 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.fb.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.close();
	}
}