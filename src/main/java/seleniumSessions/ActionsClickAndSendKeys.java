package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		By emailID = By.id("input-email");

		By pwd = By.id("input-password");

		By loginBtn = By.xpath("//input[@value='Login']");

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		Actions act = new Actions(driver);
//
//		act.sendKeys(driver.findElement(emailID)).build().perform();
//		act.sendKeys(driver.findElement(pwd)).build().perform();
//		act.click(driver.findElement(loginBtn)).build().perform();
		
		doActionSendKeys(emailID, "test@gmail.com");
		doActionSendKeys(pwd, "test@gmail.com");
		doActionsClick(loginBtn);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value);
	}

	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	
	

}
