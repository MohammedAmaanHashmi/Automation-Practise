package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String url = driver.getCurrentUrl();

		if (url.contains("account/login")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		String title = driver.getTitle();

		if (title.contains("Account Login")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.quit();

	}

}
