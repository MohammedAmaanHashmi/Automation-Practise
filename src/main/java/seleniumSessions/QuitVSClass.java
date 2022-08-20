package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amaan\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title  is " + title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

	//	driver.quit();
		driver.close();
		driver.getTitle();

	}

}
