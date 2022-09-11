package keypress;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import calenderexamples.BaseForinheritance;

public class nosuchElementexception {
	BaseForinheritance nsee;
	WebDriver nseedriver;
	String nseurl;
	
	@Before
	public void setUp() throws Exception {
		nseedriver = new ChromeDriver();
		nseedriver.manage().window().maximize();
		//if we comment implicit wait will get nosuchelement error
		nseedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     nseurl = "https://learn.letskodeit.com";
	}
	@Test
	public void test() 
	{
		//nseedriver.get(nseurl);
		//nseedriver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		// 1. Timing Issues
		//nseedriver.findElement(By.xpath("//input[@type='email' and @id='email']")).sendKeys("helo@gmail.com");
		/*WebDriverWait wait=new WebDriverWait(nseedriver,Duration.ofSeconds(3));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email' and @id='email']")));
		until.sendKeys("helo@gmail.com");*/
		// 2. Incorrect locator or type of locator
		//nseedriver.findElement(By.xpath("//div//input[@type='email' and @id='email']")).sendKeys("helo@gmail.com");
		
		// 3. Element is in iFrame
		nseedriver.get("https://courses.letskodeit.com/practice");
		nseedriver.switchTo().frame("courses-iframe");
		 nseedriver.findElement(By.xpath("//input[@id='search' and @name='course']")).sendKeys("python");
		 nseedriver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER); 
		 //switching out of iframe
		 nseedriver.switchTo().defaultContent();
		 nseedriver.findElement(By.xpath("//fieldset//input[@id='name']")).sendKeys("helo");
		 
				}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		
	}
}
