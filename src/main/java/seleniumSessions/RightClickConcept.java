package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");

		Actions act = new Actions(driver);

		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		act.contextClick(rightClick).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("li.context-menu-icon-copy")).click();

//	List<WebElement> rightElements = driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]"));
//		System.out.println(rightElements.size());
//
//		for (WebElement e : rightElements) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("Copy")) {
//				e.click();
//				break;
//			}
//		}
	}
}