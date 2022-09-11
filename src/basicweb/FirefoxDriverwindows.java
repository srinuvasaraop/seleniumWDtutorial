package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver",
		//		"C:\\Users\\srinuvas\\libs\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://amazon.com";
		driver.get(baseURL);

	}

}
