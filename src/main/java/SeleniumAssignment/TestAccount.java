package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestAccount {
	static WebDriver driver;

	public static void main(String[] args) {

		By firstname = By.id("input-firstname");
		By Lastname = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");

		AssignmentUtil obj = new AssignmentUtil(driver);
		obj.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

}
