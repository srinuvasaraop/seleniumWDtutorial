package waitTypes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Explicitlywait2 {
	private WebDriver driver;
	private String baseUrl;
	Ecplicitlywait1 wt;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com";
		wt = new Ecplicitlywait1(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		WebElement element=wt.waitForElement(By.id("email"), 10);
		element.sendKeys("hello");
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}
}
