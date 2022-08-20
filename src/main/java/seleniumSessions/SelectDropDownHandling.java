package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandling {

	static WebDriver driver;

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By Country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");

//		if (getDropDownCount(Country) - 1 == 231) {
//			System.out.println("pass");
//		} else {
//			System.out.println("fail");
//		}

		List<String> finaList = getDropDownListValues(Country);

		for (String e : finaList) {
			System.out.println(e);
		}

//		Select select = new Select(driver.findElement(Country));

//		List<WebElement> countryList = select.getOptions();
//		System.out.println("total country " + countryList.size());
//
//		for (WebElement e : countryList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
//		
//		Select select=new Select(driver.findElement(Country));
//		
//		select.selectByIndex(8);
//		select.selectByVisibleText("India");
//		select.selectByValue("Afghanistan");

//		// doSelectByIndex(Country, 10);
//		doSelectByVisbileText(Country, "India");
//		Thread.sleep(2000);
//		doSelectByVisbileText(state,"Maharashtra");
//
	}

//
//	public static void doSelectByIndex(By locator, int Index) {
//		Select select = new Select(getElement(locator));
//		select.selectByIndex(Index);
//	}
//
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
//
//	public static void doSelectByVisbileText(By locator, String visibleText) {
//		Select select = new Select(getElement(locator));
//		select.selectByVisibleText(visibleText);
//	}
//
//	public static void doSelectByValue(By locator, String value) {
//		Select select = new Select(getElement(locator));
//		select.selectByValue(value);
//	}

	public static int getDropDownCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();

	}

	public static List<String> getDropDownListValues(By locator) {
		Select select = new Select(getElement(locator));
		List<String> optionValList = new ArrayList<String>();
		List<WebElement> optionEleList = select.getOptions();

		for (WebElement e : optionEleList) {
			String text = e.getText();
			optionValList.add(text);

		}
		return optionValList;
	}

}
