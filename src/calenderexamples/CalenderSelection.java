package calenderexamples;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderSelection {
	BaseForinheritance bfi;
	WebDriver getdriver;
	  String baseurl;
	@Before
	public void setUp() throws Exception {
		   bfi=new BaseForinheritance();
		   getdriver = bfi.getdriver("firefox");
		    baseurl = "https://www.expedia.com";
		}
	@Test
	public void test() {
		// WebElement findElement = getdriver.findElement(By.id("//input[@id='d1']"));
		getdriver.get(baseurl);
		WebElement findElement = getdriver.findElement(By.id("d1-btn"));
		 findElement.click();
	  WebElement findElement2 = getdriver.findElement(By.xpath("//table[@class='uitk-date-picker-weeks']//button[@aria-label='Jul 30, 2022']"));
	  findElement2.click();
	  WebElement findElement3 = getdriver.findElement(By.xpath("//button[@data-stid='apply-date-picker']"));
	  findElement3.click();
    System.out.println("hi");
    	
	}
	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(2000);
		//getdriver.quit();
	}

	

}
