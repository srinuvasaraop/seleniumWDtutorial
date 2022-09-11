package junit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectMultioleOptions {
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
	public void selectmultipleoptions() throws InterruptedException {
		 
			   WebElement element=driver.findElement(By.id("multiple-select-example"));
		       Select sel=new Select(element);
		       sel.selectByValue("apple");
		       System.out.println("selected by value");
		       
		       sel.selectByVisibleText("Orange");
		       System.out.println("selected by text");
		       
		       sel.selectByIndex(2);
		       System.out.println("selected by index");
		       
		       sel.deselectByIndex(0);
		        System.out.println("deselected by index"); 
		        
		         /* sel.deselectByValue("orange");
		       System.out.println("deselected by value");*/
		       
		    /*   sel.deselectByVisibleText("Peach");
		       System.out.println("deselected by visible");*/
		       
		         Thread.sleep(2000);
				System.out.println("Print all selected options");
				List<WebElement> selectedOptions = sel.getAllSelectedOptions();
			
				for(WebElement e1:selectedOptions)
				{
					System.out.println("selected options is "+e1.getText());
				}
				
			//	Thread.sleep(2000);
				System.out.println("De-select all selected options");
				sel.deselectAll();
		
		 
	}	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
