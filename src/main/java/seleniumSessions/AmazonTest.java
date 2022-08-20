package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchUrl("https://WWW.amazon.com");

		if (brUtil.isUrlFractionExist("amazon")) {
			System.out.println("url is correct with amazon..pass");
		}

		else {
			System.out.println("fail");
		}
		
		brUtil.quitBrowser();
		
		

	}

}
