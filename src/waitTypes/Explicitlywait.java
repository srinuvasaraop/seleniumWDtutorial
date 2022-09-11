package waitTypes;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait {
 WebDriver webdriver;
	String baseUrl;
   
	@Before
	public void setUp() throws Exception {
		webdriver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com";
        
		 
		webdriver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		webdriver.quit();
	}

	@Test
	public void test() {
	   webdriver.get(baseUrl);
	   webdriver.findElement(By.linkText("SIGN IN")).click();;
	   WebDriverWait wait=new WebDriverWait(webdriver, Duration.ofSeconds(3));
	   
	   
	   WebElement emailfield=wait.until(
			   ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	   emailfield.sendKeys("hii");;
	   
	   
	}

}
