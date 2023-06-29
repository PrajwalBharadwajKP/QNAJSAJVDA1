package Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWH {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/SOFTSPUN-Microfiber-Cleaning-Detailing-Polishing/dp/B077BFH786/?_encoding=UTF8&pd_rd_w=KuJel&content-id=amzn1.sym.5be00a25-c89b-4943-9633-5318ac211c08&pf_rd_p=5be00a25-c89b-4943-9633-5318ac211c08&pf_rd_r=Y18ZZ378SR3BR6FTQHKM&pd_rd_wg=Ad2F5&pd_rd_r=1f3a8fb8-5a8b-456c-a035-f5abb8ab3ea0&ref_=pd_gw_trq_ed_k8diynfn");
		driver.findElement(By.xpath("//div[text()='Bluehunt Microfiber Cleaning Cloth 4PCS 40 * 40 600 GSM Multi-Color Highly Absorben...']")).click();
		Set<String> allTabs = driver.getWindowHandles();
		for(String tab:allTabs)
			driver.switchTo().window(tab);
		driver.close();
	}
}