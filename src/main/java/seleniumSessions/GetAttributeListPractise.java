package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeListPractise {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		System.out.println(getAttributeList(links,"href").size());
		

	}

	public static List<String> getAttributeList(By locator, String attrName) {
		
		List<WebElement> eleList = getElements(locator);
		System.out.println(eleList.size());
		List<String> eleAttrVarList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			System.out.println(attrValue);
			eleAttrVarList.add(attrValue);

		}
		return eleAttrVarList;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
