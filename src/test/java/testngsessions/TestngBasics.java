package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS-connectWithDB");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT-createUser");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-launchBrowser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM-login");
	}

	@Test
	public void homePageTest() {
		System.out.println("home page test");
	}

	@Test
	public void searchTest() {
		System.out.println("search test");
	}

	@Test
	public void addToCart() {
		System.out.println("add to cart test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM--logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--closeBrowser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AC--deleteUser");
	}

	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS--disconnectWithDB");
	}

}
