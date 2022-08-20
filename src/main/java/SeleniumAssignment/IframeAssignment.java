package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeAssignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

		By vehicleYear = By.xpath("//label[@class='question top_question']/following-sibling::input");
		doSendkeys(vehicleYear, "2022");
		By vehicleMake = By.xpath("(//label[@class='question top_question'])[2]/following-sibling::input");
		doSendkeys(vehicleMake, "Honda");
		By vehicleModel = By.xpath("(//label[@class='question top_question'])[3]/following-sibling::input");
		doSendkeys(vehicleModel, "City");
		By colour = By.xpath("(//label[@class='question top_question'])[4]/following-sibling::input");
		doSendkeys(colour, "Red");

		By mileage = By.xpath("(//label[@class='question top_question'])[5]/following-sibling::input");
		doSendkeys(mileage, "36");

		By VIN = By.xpath("(//label[@class='question top_question'])[6]/following-sibling::input");
		doSendkeys(VIN, "3665984");
		By name = By.xpath("(//label[@class='question top_question'])[7]/following-sibling::input");
		doSendkeys(name, "Mohammed Amaan Hashmi");
		By address = By.xpath("(//label[@class='question top_question'])[8]/following-sibling::input");
		doSendkeys(address, "Test");
		By city = By.xpath("(//label[@class='question top_question'])[9]/following-sibling::input");
		doSendkeys(city, "Mumbai");
		By state = By.xpath("//select[@id='RESULT_RadioButton-12']");
		doSelect(state, "Arizona");

		By zip = By.xpath("(//label[@class='question top_question'])[11]/following-sibling::input");
		doSendkeys(zip, "40070");
		By phoneNumber = By.xpath("(//label[@class='question top_question'])[12]/following-sibling::input");
		doSendkeys(phoneNumber, "9867821170");
		By emailID = By.xpath("(//label[@class='question top_question'])[13]/following-sibling::input");
		doSendkeys(emailID, "amaan@gmail.com");

	}

	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelect(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

}
