package usefulMethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gettextDemo {
   WebDriver webdriver;
   String baseUrl;
   String string;
	@Before
	public void setUp() throws Exception {
		webdriver=new FirefoxDriver();
		baseUrl="https://courses.letskodeit.com/practice";
		
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}

	@Test
	public void test() {
		webdriver.get(baseUrl);
		
	 WebElement element = webdriver.findElement(By.id("openwindow"));
	 
		System.out.println("text of selected element is "+element.getText());
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		webdriver.quit();
	}

}
