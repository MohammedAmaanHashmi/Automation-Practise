package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinkElement {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//
//		driver.findElement(By.linkText("MacBook")).click();

//		By linkText = By.linkText("MacBook");
		ElementUtil obj = new ElementUtil(driver);
//		obj.doClick(linkText);
//		
//		String productName= "MacBook";
//		obj.doClick("linkText", productName);

//		By contactSales = By.linkText("CONTACT SALES");
//		obj.doClick(contactSales);
//		
//		String contacSales_text="CONTACT SALES";
//		obj.doClick("linktext", contacSales_text);
//		

//		driver.findElement(By.partialLinkText("CONTACT")).click();

//		By partialLinkText = By.partialLinkText("CONTACT");
//		obj.doClick(partialLinkText);
//		
//		String partialLink_text="CONTACT";
//		obj.doClick("partiallinktext", partialLink_text);
//		
		
		

	}

}
