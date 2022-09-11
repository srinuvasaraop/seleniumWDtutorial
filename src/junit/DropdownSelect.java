package junit;

import static org.junit.Assert.*;

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

public class DropdownSelect {
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
		WebElement element=driver.findElement(By.id("carselect"));
		Select sel=new Select(element);
		
		Thread.sleep(2000);
		System.out.println("Select Honda by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select bmw by value");
		sel.selectByValue("bmw");
		
		Thread.sleep(2000);
		System.out.println("Select Benz by visible text");
		sel.selectByVisibleText("Benz");
		
		Thread.sleep(2000);
		System.out.println("Select available optioins");
		List<WebElement> options=sel.getOptions();
		int size=options.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
