package junit;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//div[@id='navbar']//a[contains(text(),'Login')]")).click();
		System.out.println("Clicked on login");
		driver.findElement(By.id("email")).sendKeys("test@email.com");
		System.out.println("Sending keys to username field");
		driver.findElement(By.id("password")).sendKeys("test");
		System.out.println("Sending keys to password field");
	driver.findElement(By.id("email")).clear();
		System.out.println("Clearing the username field");
	}

	@After
	public void tearDown() throws Exception {
		
System.out.println("after done");
	}

}
