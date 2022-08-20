package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanaguageLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		String text = driver.findElement(By.id("SIvCob")).getText();
//		System.out.println(text);
		// By.xpath("//div[@id='SIvCob']/a");
//		By.xpath("//div[@class='footer-main']//a")
		// aside[@id='column-right']//a

		List<WebElement> sugglist = driver.findElements(By.xpath("//aside[@id='column-right']//a"));

		for (WebElement e : sugglist) {
			String text = e.getText();
			System.out.println(text);

//			if (text.contains("తెలుగు")) {
//				e.click();
//				break;
//			}
		}

	}

}
