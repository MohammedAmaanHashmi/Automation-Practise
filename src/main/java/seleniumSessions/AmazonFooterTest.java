package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

//		String text = driver.findElement(By.xpath(
//				"//a[text()='Careers']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
//				.getText();
//		
//		System.out.println(text);
//		
		System.out.println(getFooterText("Careers"));
		System.out.println(getFooterText("Sell products on Amazon"));
		System.out.println(getFooterText("Reload Your Balance"));
		System.out.println(getFooterText("Amazon and COVID-19"));
		System.out.println(getFooterText("Help"));

	}

	public static String getFooterText(String FooterTextlink) {
		String header = driver.findElement(By.xpath(
				"//a[text()='" + FooterTextlink + "']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
				.getText();
		return header;
	}

}
