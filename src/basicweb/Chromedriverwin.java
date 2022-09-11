package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriverwin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver",
	//			"C:\\Users\\srinuvas\\libs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://www.letskodeit.com";
		driver.get(baseURL);
	}

}
