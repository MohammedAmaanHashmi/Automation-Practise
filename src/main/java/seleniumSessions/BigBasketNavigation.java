package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketNavigation {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		Thread.sleep(5000);

		By mainCart = By.xpath("//a[@qa='categoryDD']");
		By category1 = By.xpath("(//a[text()='Cleaning & Household'])[2]");
		By category2 = By.linkText("Stationery");
		By cateogry3 = By.linkText("Games & Calculators");
		By category4 = By.linkText("Pencil");

		selectLevel4Product(mainCart, category1, category2, cateogry3, category4);

	}

	public static void selectLevel4Product(By mainCart, By category1, By category2, By cateogry3, By category4)
			throws InterruptedException {
		WebElement mainCategory = driver.findElement(mainCart);

		Actions act = new Actions(driver);

		act.moveToElement(mainCategory).perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(category1)).perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(category2)).perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(cateogry3)).perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(category4)).click().build().perform();
		Thread.sleep(2000);
	}

}
