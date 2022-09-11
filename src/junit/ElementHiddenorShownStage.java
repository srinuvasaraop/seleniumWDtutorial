package junit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementHiddenorShownStage {
	WebDriver driver;
	String baseUrl;
	String baseUrl2;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
		baseUrl2="https://www.expedia.co.in/Flights";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			}

	@Test
	public void test() throws Exception {
		
		driver.get(baseUrl);
		
		WebElement ele=driver.findElement(By.id("displayed-text"));
		//WebElement ele=driver.findElement(By.xpath("//input[@id='displayed-text']"));
		System.out.println("The box is displayed "+ele.isDisplayed());
		
		 Thread.sleep(2000);
		 System.out.println("hide button pressing");
		 driver.findElement(By.id("hide-textbox")).click();
		 System.out.println("Thehide box is displayed "+ele.isDisplayed());
		 
		 Thread.sleep(2000);
		 System.out.println("shown button pressing");
		 driver.findElement(By.id("show-textbox")).click();
		 System.out.println("The box is displayed "+ele.isDisplayed());
	}
	@Test
	public void test2() throws Exception {
    driver.get(baseUrl2);
	WebElement e2=driver.findElement(By.xpath("//select[@id='child-age-input-0-0']"));
	System.out.println("The box is displayed "+e2.isDisplayed());
	}
@After
public void tearDown() throws Exception {
	Thread.sleep(1000);
	driver.quit();
}
}