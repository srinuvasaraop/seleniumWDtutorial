package usefulMethods;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isElementPresent1 {
	WebDriver webdriver;
	String baseUrl;
    private IsElementPresent2 gm;
	@Before
	public void setUp() throws Exception {
		webdriver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
        
		 gm=new IsElementPresent2(webdriver);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void test() {
		webdriver.get(baseUrl);
		//gm.FindisElementPresent("xpath","//button[@id='openwindow']");
      boolean findisElementPresent = gm.FindisElementPresent("XPATH", "//button[@id='openwindow']");
      System.out.println(findisElementPresent);
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		webdriver.quit();
	}
}
