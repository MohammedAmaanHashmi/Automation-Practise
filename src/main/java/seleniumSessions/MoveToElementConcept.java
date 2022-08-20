package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("http://mrbool.com/");

//		WebElement parentMenu = driver.findElement(By.className("menulink"));

//		Actions act=new Actions(driver);
//		act.moveToElement(parentMenu).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("COURSES")).click();
//		
//		By menuLink = By.className("menulink");
//		By COURSES=By.linkText("COURSES");

		driver.get("https://www.bigbasket.com/cl/beverages/?nc=nb");

//		By parentElement = By.xpath("//div[text()='Add-ons']");
//		By childElement = By.xpath("(//div[text()='SpicePlus'])[1]");
//		
//		By parentElement = By.xpath("//div[text()='SpiceClub']");
//		By childElement = By.xpath("//div[text()='Tiers']");

//		handleTwoElementItems(parentElement, childElement);
		By parentElement1 = By.xpath("//a[@class='dropdown-toggle meganav-shop']");

		By parentElement2 = By.xpath("(//a[text()='Beverages'])[2]");

		By ChildElement1 = By.xpath("(//a[text()='Tea'])[3]");
		By ChildElement2 = By.xpath("(//a[text()='Tea Bags'])[2]");
		By childElement3 = By.xpath("(//a[text()='Red Label'])[2]");

		handleMultipleElements(parentElement1, parentElement2, ChildElement1, ChildElement2, childElement3);
	}

	public static void handleTwoElementItems(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parentMenu)).build().perform();
		Thread.sleep(2000);
		driver.findElement(childMenu).click();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void handleMultipleElements(By parentMenu1, By parentMenu2, By childMenu1, By childMenu2,
			By childMenu3) throws InterruptedException {
		Actions act = new Actions(driver);
		getElement(parentMenu1).click();
		act.moveToElement(getElement(parentMenu2)).build().perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(childMenu1)).build().perform();
		Thread.sleep(3000);
		act.moveToElement(getElement(childMenu2)).build().perform();
		Thread.sleep(3000);
		getElement(childMenu3).click();
	}

}
