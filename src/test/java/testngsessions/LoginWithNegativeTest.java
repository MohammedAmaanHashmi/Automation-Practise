package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithNegativeTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

	@DataProvider
	public Object[][] getNegativeLoginData() {
		return new Object[][] { { "test2gmai.com", "test215" }, 
			    { "test2gmai.com", "amaan" },
				{ "amaan@gmail.com", "amaan123" }, 
				{ "   ", "pds123" },

		};
	}

	@Test(dataProvider = "getNegativeLoginData")
	public void loginNegativeTest(String username, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String errorMessage = driver.findElement(By.cssSelector("div.alert-dismissible")).getText().trim();
		Assert.assertEquals(errorMessage, "Warning: No match for E-Mail Address and/or Password.");
	}

}
