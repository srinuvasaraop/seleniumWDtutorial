package calenderexamples;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseForinheritance {
     // need to ask chinna how to access these variable othe class
	//public String baseurl = "https://www.expedia.com"; 
	
	public WebDriver getdriver(String browser) {
	  WebDriver web = null;
		if (browser.equals("chrome")) {
			web = new ChromeDriver();
			web.manage().window().maximize();
			web.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			  
		} else if (browser.equals("firefox")) {

			web = new FirefoxDriver();
			web.manage().window().maximize();
			web.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
					}
		return web;

	}

}