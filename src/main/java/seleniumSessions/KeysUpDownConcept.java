package seleniumSessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysUpDownConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		Actions act = new Actions(driver);
//
//		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
//		Thread.sleep(2000);
//		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();

	}

}
