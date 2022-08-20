package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	public WebDriver driver;

	public WebDriver initDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("please pass the right browser name");
		}

		return driver;

	}

	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("url is null");
			return;
		} else if (url.indexOf("http") == -1) {
			System.out.println("url is not having http..");
			return;
		}
		driver.get(url);

	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("page url is:" + url);
		return url;
	}

	public boolean isUrlFractionExist(String urlFraction) {
		if (getPageUrl().contains(urlFraction)) {
			return true;
		}
		return false;
	}

	public String getPageSource() {
		String pageSource = driver.getPageSource();
		return pageSource;
	}

	public boolean isInfoExistInPageSource(String info) {
		if (getPageSource().contains(info)) {
			return true;
		}
		return false;
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
