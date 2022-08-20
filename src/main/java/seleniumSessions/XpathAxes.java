package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/india-in-ireland-2022-1303299/ireland-vs-india-2nd-t20i-1303308/full-scorecard");

		/*
		 * String wicketTaker = driver .findElement(By.
		 * xpath("//span[text()='Harshal Patel']/ancestor::td/following-sibling::td")).
		 * getText(); System.out.println(wicketTaker);
		 */

	//	System.out.println(getWicketTackerName("Harshal Patel"));
		
		System.out.println(getPlayerScoreCardList("Harshal Patel"));
	}

	public static String getWicketTackerName(String playerName) {
		String wicketTaker = driver
				.findElement(By.xpath("//span[text()='" + playerName + "']/ancestor::td/following-sibling::td"))
				.getText();
		return wicketTaker;
	}

	public static List<String> getPlayerScoreCardList(String playerName) {
		List<WebElement> scoreCardList = driver
				.findElements(By.xpath("//span[text()='" + playerName + "']/ancestor::td/following-sibling::td"));
		
		List<String> scoreList=new ArrayList<String>();

		for (WebElement e : scoreCardList) {
			String text = e.getText();
			scoreList.add(text);
			
		}
		
		return scoreList;
	}

}
