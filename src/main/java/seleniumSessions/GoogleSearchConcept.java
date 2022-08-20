package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class GoogleSearchConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		By search = By.id("search_query_top");
		By suggestionList = By.xpath("//div[@class='ac_results']//li[@class='ac_even']");

		performSearch(search, "dress", suggestionList, "Summer Dresses > Printed Summer ");

	}

	public static void performSearch(By search, String searchKeys, By suggestionList, String suggName)
			throws InterruptedException {
		doSendKeys(search, searchKeys);
		Thread.sleep(2000);
		List<WebElement> suggList = getElements(suggestionList);
		System.out.println("total suggs " + suggList);
		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(suggName)) {
				e.click();
				break;
			}
		}

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
