package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScirpExecuterConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
//		jsUtil.refreshBrowserByJS();
//		String innerText = jsUtil.getPageInnerText();
//		System.out.println(innerText);
//
//		if (innerText.contains("Import & Export")) {
//			System.out.println("Pass");
//		}
//
//		if (innerText.contains("Companies & Contacts")) {
//			System.out.println("pass-1");
//		}
		// jsUtil.generateAlert("we were on a break");

//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		String title = js.executeScript("return document.title").toString();
//
//		System.out.println(title);
//		
//		js.executeScript("alert('we were on a break')");

//		By border = By.xpath("//input[@value='Login']");
//
//		jsUtil.drawBorder(driver.findElement(By.xpath("//input[@value='Login']")));
//
//		jsUtil.drawBorder(driver.findElement(By.xpath("(//div[@class='well'])[2]")));
//		Thread.sleep(5000);
//		jsUtil.scrollPageDown();
//		Thread.sleep(5000);
//		jsUtil.scrollPageUp();

//		WebElement ele = driver.findElement(By.xpath("//span[text()='Popular products in PC internationally']"));
//		jsUtil.scrollIntoView(ele);

//		WebElement ele =driver.findElement(By.linkText("Amazon Science"));
//		jsUtil.clickElementByJS(ele);

		// jsUtil.sendKeysUsingWithID("input-email", "Tom@gmail.com");

		driver.findElement(By.id("input-email")).sendKeys("Amaan@gmail.com");
		String text = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(text);
	}

}
