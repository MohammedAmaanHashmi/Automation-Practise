package SeleniumAssignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageState {
	static WebDriver driver;
	static String pageState;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		String state = waitForPageLoad(10);
		System.out.println(state);

	}

	public static String waitForPageLoad(int timeOut) {
		long endTime = System.currentTimeMillis() + timeOut;

		while (System.currentTimeMillis() < endTime) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String pageState = js.executeScript("return document.readyState").toString();

			System.out.println("page loading state: " + pageState);

			switch (pageState) {
			case "loading":
				System.out.println("Page state is loading");
				break;
			case "interactive":
				System.out.println("Page state is interactive");
				break;
			case "complete":
				System.out.println("Page state is complete");
				break;

			}

		}
		return pageState;

	}
}