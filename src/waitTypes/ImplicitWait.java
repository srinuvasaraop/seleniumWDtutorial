package waitTypes;

import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {
	WebDriver webdriver;
	String baseUrl;
   
	@Before
	public void setUp() throws Exception {
		webdriver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com";
        
		 
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void test() {
		webdriver.get(baseUrl);
		webdriver.findElement(By.linkText("SIGN IN")).click();
		webdriver.findElement(By.id("email")).sendKeys("asdhj");
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		webdriver.quit();
		
	}

	

}
