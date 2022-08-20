package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");
		waitForPageLoad(10);

		By locator = By.linkText("MacBook");
		retryingElement(locator, 10, 2000).click();
		waitForPageLoad(5);

	}

	public static void waitForPageLoad(int timeOut) {
		long endTime = System.currentTimeMillis() + timeOut;

		while (System.currentTimeMillis() < endTime) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String pageState = js.executeScript("return document.readyState").toString();

			System.out.println("page loading state: " + pageState);
			if (pageState.equals("complete")) {
				System.out.println("page is fullyloaded with all scripts, images, css...");
				break;
			}
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(By locator, int timeOut) {
		WebElement element = null;
		int attempts = 0;

		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found.....in attempt:" + (attempts + 1));

				try {
					Thread.sleep(500);// default time
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			attempts++;
		}

		if (element == null) {
			try {
				throw new Exception("ELEMENTISNOTFOUNDEXCEPTION");

			} catch (Exception e) {
				System.out.println(
						"element is not found...tried for" + timeOut + "secs" + "with the interval of: " + 500 + "ms");
			}
		}
		return element;
	}

	public static WebElement retryingElement(By locator, int timeOut, int pollingTime) {
		WebElement element = null;
		int attempts = 0;

		while (attempts < timeOut) {
			try {
				element = getElement(locator);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("element is not found.....in attempt:" + (attempts + 1));

				try {
					Thread.sleep(pollingTime);// interval time
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			attempts++;
		}

		if (element == null) {
			try {
				throw new Exception("ELEMENTISNOTFOUNDEXCEPTION");

			} catch (Exception e) {
				System.out.println(
						"element is not found...tried for" + timeOut + "secs" + "with the interval of: " + 500 + "ms");
			}
		}
		return element;
	}

	public static void shortWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mediumWait() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void longWait() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void waitFor(int timeOut) {
		try {
			Thread.sleep(timeOut*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
