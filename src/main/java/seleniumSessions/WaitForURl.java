package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForURl {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.linkText("Register")).click();

		String url = waitForUrl(5, "account/register");
		System.out.println(url);

	}

//	public static String waitForUrl(int timeOut, String urlFractionValue) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
//		if (wait.until(ExpectedConditions.urlContains(urlFractionValue))) {
//			return driver.getCurrentUrl();
//		} else {
//			System.out.println("url is not found");
//			return null;
//		}
//	}

	public static String waitForUrl(int timeOut, String urlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.urlContains(urlFractionValue))) {
			return driver.getCurrentUrl();
		}
		}
		catch(Exception e)
		{
			System.out.println("url is not found");
		}
		return null;
		}

	
	


}
