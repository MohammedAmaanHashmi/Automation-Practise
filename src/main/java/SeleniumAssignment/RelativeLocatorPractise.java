package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorPractise {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		By BaseElement = By.linkText("Privacy Policy");
//		driver.findElement(with(By.name("agree")).toRightOf(BaseElement)).click();

		By baseElement = By.linkText("First Name");
		driver.findElement(with(By.id("input-firstname")).toRightOf(baseElement)).sendKeys("Hashmi");

	}
}