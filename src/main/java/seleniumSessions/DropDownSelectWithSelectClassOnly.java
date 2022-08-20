package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectWithSelectClassOnly {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By Country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");

//		driver.findElement(Country).sendKeys("India");

		doSelectValueUsingOptions(Country, "India");

//		Select select = new Select(driver.findElement(Country));
//		List<WebElement> optionList = select.getOptions();
//
//		for (WebElement e : optionList) {
//			String text = e.getText();
//			System.out.println(text);
//
//			if (text.equals("India")) {
//				e.click();
//				break;
//			}
//
//		}

	}

	public static void doSelectValueUsingOptions(By locator, String Value) {
		Select select = new Select(driver.findElement(locator));
		List<WebElement> optionList = select.getOptions();

		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(Value)) {
				e.click();
				break;
			}

		}
	}
	
	public static void doSelectValuefromDropdown(By locator, String Value) {

		List<WebElement> optionList = driver.findElements(locator);

		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(Value)) {
				e.click();
				break;
			}

		}
	}

}
