package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SanityPractise {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");

		By data = By.cssSelector("img[title='naveenopencart'],input[name='search'],button[type='button']");
		int count = driver.findElements(data).size();

		if (count == 20) {
			System.out.println("all elements are present on the page");
		} else {
			System.out.println("Fail");
		}
	}

}
