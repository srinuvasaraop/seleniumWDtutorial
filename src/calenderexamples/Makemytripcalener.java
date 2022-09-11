package calenderexamples;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Makemytripcalener {
  BaseForinheritance bfi;
  String murl;
  WebDriver driver;
  
	@Before
	public void setUp() throws Exception {
		bfi=new BaseForinheritance();
		driver=bfi.getdriver("firefox");
		murl="https://www.makemytrip.com";
	}
   
	@Test
	public void test() throws InterruptedException {
		driver.get(murl);
		WebElement findElement = driver.findElement(By.xpath("//label[@for='departure']"));
		findElement.click();
		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]"));
		   List<WebElement> findElements = driver.findElements(By.tagName("p"));
		   Thread.sleep(3000);
		   for(WebElement web:findElements)
		   {
			  if(web.getText().equals("30")) 
			  {
				  web.click();
				  break;
			  }
		   }
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}

	
}
