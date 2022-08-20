package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchFirefox {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\amaan\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://www.google.com");

//		driver.get("https://www.google.com");
//		String title = driver.getTitle();
//		System.out.println(title);

	}

}
