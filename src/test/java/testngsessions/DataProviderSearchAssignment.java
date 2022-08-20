package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderSearchAssignment {
	WebDriver driver;

	@BeforeTest

	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}

	@DataProvider
	public Object[][] searchData() {

		return new Object[][] { { "macbook" }, { "iphone" }, { "LCD" },

		};
	}

	@Test(dataProvider = "searchData")
	public void search(String product) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(product);
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	}

}
