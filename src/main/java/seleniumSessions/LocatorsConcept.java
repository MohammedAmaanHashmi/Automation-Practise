package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.CaseFormat;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// 1st
//		driver.findElement(By.id("input-email")).sendKeys("amaanhashmi25@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Manny1998");

		// 2nd
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//
//		emailId.sendKeys("amaanhashmi25@gmail.com");
//		password.sendKeys("Manny1998");

		// 3rd By locator
//		By emailId1 = By.id("input-email");
//		By password2 = By.id("input-password");
//
//		WebElement emailEle = driver.findElement(emailId1);
//		WebElement pwdfile = driver.findElement(password2);
//		
//		emailEle.sendKeys("amaanhashmi25@gmail.com");
//		pwdfile.sendKeys("Manny1998");
//		
		// 4th By locator+generic function.
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		getElement(emailId).sendKeys("amaanhashmi25@gmail.com");
//		getElement(password).sendKeys("pds123");

		// 5th
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(emailId, "test@gmail.com");
//		doSendKeys(password, "pds123");
//
//	}
//
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}
//
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId, "test@gmail.com");
//		eleUtil.doSendKeys(password, "pds123");

//		String email_id = "input-email";
//		String Password_id = "input-password";
//
//		By email = By.id(email_id);
//		By password = By.id(Password_id);
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(email, "test@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");

		String email_id = "input-email";
		String Password_id = "input-password";

		doSendKeys("id", email_id, "test@gmail.com");
		doSendKeys("id", Password_id, "pds@123");

	}

	public static By getBy(String locatorType, String Selector) {
		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":

			locator = By.id(Selector);

			break;

		default:
			break;

		}
		return locator;
	}

	public static void doSendKeys(String locatorType, String Selector, String value) {
		By locator = getBy(locatorType, Selector);
		getElement(locator).sendKeys(value);

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}