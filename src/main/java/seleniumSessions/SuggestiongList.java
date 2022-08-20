package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class SuggestiongList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ChromeDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//li[text()='Casual Dresses > Printed
		// ']")).click();

		selectElement("Casual Dresses > Printed ");

	}

	public static void selectElement(String productName) {
		driver.findElement(By.xpath("//li[text()='" + productName + "']")).click();
	}

}
