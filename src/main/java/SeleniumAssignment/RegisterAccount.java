package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterAccount {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.findElement(By.id("input-firstname")).sendKeys("MohammedAmaan");
		driver.findElement(By.id("input-lastname")).sendKeys("Hashmi");
		driver.findElement(By.id("input-email")).sendKeys("amaanhashmi25@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9867821170");
		driver.findElement(By.id("input-password")).sendKeys("Manny@1998");
		driver.findElement(By.id("input-confirm")).sendKeys("Manny@1998");

	}

}
