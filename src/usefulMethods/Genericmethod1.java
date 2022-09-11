package usefulMethods;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import usefulMethods.GenericMethod2;

public class Genericmethod1 {
	WebDriver webdriver;
	String baseUrl;
    private GenericMethod2 gm;
	@Before
	public void setUp() throws Exception {
		webdriver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
        
		 gm=new GenericMethod2(webdriver);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
	webdriver.get(baseUrl);
	WebElement element = gm.getElement("id","name");
	element.sendKeys("hellow");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		webdriver.quit();
	}

}
