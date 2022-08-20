package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=43");
//		String prName = driver.findElement(By.tagName("h1")).getText();

		// System.out.println(prName);

		ElementUtil obj = new ElementUtil(driver);
		By productHeader = By.tagName("h1");
		String actPrName = doElementGetText(productHeader);
		if (actPrName.equals("macbook")) {
			System.out.println("product name is correct..PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		return eleText;
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
