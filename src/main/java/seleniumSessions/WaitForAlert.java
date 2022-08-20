package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlert {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//	driver.findElement(By.name("proceed")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

	}
	
	public static Alert waitForAlet() {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText() {
		return waitForAlet().getText();
	}
	
	public static void acceptAlert()
	{
		waitForAlet().accept();
	}
	public static void dismissAlert()
	{
		waitForAlet().dismiss();
	}
	public static void alertSendKeys(String value)
	{
		waitForAlet().sendKeys(value);
	}

}
