package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TotalLink {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		System.out.println("total links: " + linksList.size());

//		for (int i = 0; i < linksList.size(); i++) {
//			String text = linksList.get(i).getText();
//
//			if (!text.isEmpty()) {
//				System.out.println(i+" :"+text);
//			}

//			if (text.length() != 0) {
//				System.out.println(text);
//			}

//	}
//		int count = 0;
//		for (WebElement e : linksList) {
//			String text = e.getText();
//
//			if (!text.isEmpty()) {
//				System.out.println(count + " :" + text);
//			}
//			count++;
//		}

		By links = By.tagName("a");
		By images = By.tagName("img");

		int totalLinks = getPageElemntsCount(links);
		System.out.println(totalLinks);

		int totalImages = getPageElemntsCount(images);
		System.out.println(totalImages);

		List<String> linksTextLink = getElementTextList(links);
		System.out.println(linksTextLink);
		if (linksTextLink.contains("Careers")) {
			System.out.println("Pass");

			System.out.println("non blank list :" + getElementTextCount(links));

		}

	}

	public static int getElementTextCount(By locator) {
		return getElementTextList(locator).size();
	}

	public static int getEmptyTextList(By locator) {
		int totalLink = getPageElemntsCount(locator);
		int totalNonEmptyLinks = getElementTextCount(locator);
		return totalLink-totalNonEmptyLinks;
	}

	public static List<String> getElementTextList(By locator) {
		List<WebElement> elelist = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();

		for (WebElement e : elelist) {
			String text = e.getText();

			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;

	}

	public static int getPageElemntsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
