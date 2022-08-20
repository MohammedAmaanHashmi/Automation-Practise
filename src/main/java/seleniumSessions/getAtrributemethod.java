package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAtrributemethod {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String placeHolder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		System.out.println(placeHolder);
//
//		String loginUrl = driver.findElement(By.linkText("Login")).getAttribute("href");
//		System.out.println(loginUrl);
//	
		By fn = By.id("input-firstname");
		By login = By.linkText("Login");

		String placeholderVal = doGetAttribute(fn, "placeHolder");
		String LoginURL = doGetAttribute(login, "href");

		System.out.println(placeholderVal);
		System.out.println(LoginURL);

	}

	public static String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
