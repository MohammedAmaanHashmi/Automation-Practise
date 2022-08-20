package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.name("proceed")).click();
//		Thread.sleep(2000);

//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();

		String text = alert.getText();
		System.out.println(text);

		alert.sendKeys("Jarvis");
//		alert.accept();
		alert.dismiss();

//		System.out.println(driver.findElement(By.id("result")).getText());

//		alert.accept();
//		alert.dismiss();
	}

}
