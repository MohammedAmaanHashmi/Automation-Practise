package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitle {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		By locator = By.linkText("Mobiles");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(locator)).click().build().perform();

		String title = waitForTitleContains("tertst", 10);

		System.out.println(title);

	}

	public static String waitForTitleContains(String titlefractionValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(titlefractionValue))) {

				return driver.getTitle();
			}
		} catch (Exception e) {
			System.out.println("Title is not found");
			
		}
		return null;
	}

	public static String waitForTitleToBe(String titleValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		if (wait.until(ExpectedConditions.titleContains(titleValue))) {

			return driver.getTitle();
		} else {
			System.out.println("Title is not found");
			return null;
		}

	}

}
