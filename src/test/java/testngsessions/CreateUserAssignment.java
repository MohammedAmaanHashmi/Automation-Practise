package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateUserAssignment {

	static WebDriver driver;

	@Test(priority = 1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

	@Test(priority = 2)
	public void userCreationTest()  {
		driver.findElement(By.id("input-firstname")).sendKeys("MohammedAmaan");
		driver.findElement(By.id("input-lastname")).sendKeys("Hashmi");
		driver.findElement(By.id("input-email")).sendKeys("amaanhashmi9875565@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9867821170");
		driver.findElement(By.id("input-password")).sendKeys("Manny@1998");

		driver.findElement(By.id("input-confirm")).sendKeys("Manny@1998");

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String userCreationMessage = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']"))
				.getText().trim();
		
		Assert.assertEquals(userCreationMessage, "Your Account Has Been Created!");

	}

}
