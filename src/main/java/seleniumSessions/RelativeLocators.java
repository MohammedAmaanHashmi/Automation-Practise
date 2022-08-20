package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocators {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.aqi.in/dashboard/canada");

		By baseElement = By.linkText("Barrie, Canada");

		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(baseElement)).getText();
		System.out.println(rightIndex);

		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(baseElement)).getText();
		System.out.println(leftRank);

		String belowElement = driver.findElement(with(By.tagName("a")).below(baseElement)).getText();
		System.out.println(belowElement);
		String aboveElement = driver.findElement(with(By.tagName("a")).above(baseElement)).getText();
		System.out.println(aboveElement);

		String nearElement = driver.findElement(with(By.tagName("a")).near(baseElement)).getText();
		System.out.println(nearElement);
	}

}
