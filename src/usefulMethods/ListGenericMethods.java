package usefulMethods;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListGenericMethods {
	WebDriver webdriver;
	String baseUrl;
    private ListGenericMethod2 gm;
	@Before
	public void setUp() throws Exception {
		webdriver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
        
		 gm=new ListGenericMethod2(webdriver);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void test() {
		webdriver.get(baseUrl);
		List<WebElement> elementlist = gm.getElementlist("xpath","//div[@id='table-example-div']//td[@class='author-name']");
		int size=elementlist.size();
		System.out.println("the list of elements xpath "+size);
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		webdriver.quit();
	}
}
