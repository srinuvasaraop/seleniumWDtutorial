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

public class RadioandChecknuttons {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	@Test
	public void test() throws InterruptedException {
		WebElement bmwbutton=driver.findElement(By.id("bmwradio"));
		bmwbutton.click();
		System.out.println("bmw radio button selected");
		
		Thread.sleep(2000);
		WebElement beznradio=driver.findElement(By.id("benzradio"));
		beznradio.click();
		System.out.println("benz radio button selected");
		
		Thread.sleep(2000);
		WebElement bmwcheck=driver.findElement(By.id("bmwcheck"));
		bmwcheck.click();
		System.out.println("bmwcheckbox selected");
		
		Thread.sleep(2000);
		WebElement benzcheck=driver.findElement(By.id("benzcheck"));
		benzcheck.click();
		System.out.println("benzcheckbox selected");
		
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
	}

	

}
