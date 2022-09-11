package usefulMethods;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getatrributeDemo {
	WebDriver webdriver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		webdriver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";

		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
     webdriver.get(baseUrl);
     
     WebElement findElement = webdriver.findElement(By.id("name"));
     String attribute = findElement.getAttribute("placeholder");
     
     System.out.println("element is" +attribute);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		webdriver.quit();
	}

}
