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

public class ElementState {

	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://google.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	@Test
	public void test()
	{
		/*WebElement e1=driver.findElement(By.xpath("//div/input[@role='combobox']"));
		e1.sendKeys("facebook");
*/		
	     try
	     {
	    	//System.out.println(e1.isEnabled());  
	 		WebElement e1=driver.findElement(By.className("gLFyf gsfi"));
	 		e1.sendKeys("facebook");
	 	     // WebElement e2=driver.findElement(By.className("a4bIc"));
	 	      System.out.println("e1 : "+e1.isEnabled());
	 	      
	 	      WebElement e3=driver.findElement(By.className("dRYYxd"));
	 	      System.out.println("e3 : "+e3.isEnabled());
	 	      
	 	      
	 	      WebElement e4=driver.findElement(By.className("o3j99 ikrT4e om7nvf"));
	 	      System.out.println("e4 : "+e4.isEnabled());
	     }
	     catch(Exception ex)
	     {
	    	 System.out.println(ex.getMessage());
	     }
		
		
	}
	@After
	public void tearDown() throws Exception {
	}
}
