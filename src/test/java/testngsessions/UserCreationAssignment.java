package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserCreationAssignment {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

	@DataProvider
	public Object[][] userLoginData() {
		return new Object[][]

		{ { "MohammedAmaan", "Hashmi", "amaanhashmi98777776y@gmail.com", "9867821170", "Manny@1998", "Manny@1998" },

				{ "Abbas", "Dabir", "abbas45987776yf@gmail.com", "9867821170", "Manny@1998", "Manny@1998" },

		};

	}

	@Test(dataProvider = "userLoginData")
	public void userCreation(String firstName, String lastName, String emailId, String telephone, String password,
			String confirmPassword) throws InterruptedException {
		driver.findElement(By.id("input-firstname")).clear();

		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(emailId);
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(confirmPassword);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String text = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText().trim();

		Assert.assertEquals(text, "Your Account Has Been Created!");
		Thread.sleep(5000);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
}
