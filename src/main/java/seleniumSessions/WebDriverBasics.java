package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amaan\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String title = driver.getTitle();

		System.out.println("page title is " + title);

		if (title.equalsIgnoreCase("google"))

		{
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		if (url.contains("google.com")) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		driver.quit();

	}

}
