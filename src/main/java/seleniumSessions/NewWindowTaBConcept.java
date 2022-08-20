package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowTaBConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://naveenautomationlabs.com/opencart/");
		

		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
