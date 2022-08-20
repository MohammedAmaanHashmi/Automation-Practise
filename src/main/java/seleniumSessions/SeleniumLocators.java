package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("pds123");

//		By emailId = By.name("email");
//		By passwordId = By.name("password");

		ElementUtil obj = new ElementUtil(driver);

//		obj.doSendKeys(emailId, "test@gmail.com");
//		obj.doSendKeys(passwordId, "pds123");

//		String email = "email";
//		String password = "password";
//
//		obj.doSendKeys("name", email, "test@gmail.com");
//		obj.doSendKeys("name", password, "pds@123");

//		driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");

//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

//		By emailId = By.xpath("//*[@id=\"input-email\"]");
//		String password_xpath = "//*[@id=\"input-password\"]";
//		By loginBtn=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		obj.doClick(loginBtn);

		// driver.findElement(By.cssSelector("#Form_submitForm_Name")).sendKeys("test");

//		By firstName = By.cssSelector("#Form_submitForm_Name");
//		obj.doSendKeys(firstName, "test");
		
		String firstName="#Form_submitForm_Name";
		obj.doSendKeys("cssSelector", firstName, "Amaan");
		

	}

}
