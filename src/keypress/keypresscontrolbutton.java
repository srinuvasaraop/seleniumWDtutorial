package keypress;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import calenderexamples.BaseForinheritance;

public class keypresscontrolbutton {
	BaseForinheritance kpbpa;
	WebDriver kpbdriver;
	String kpburl;
	Alert kpbalert;

	@Before
	public void setUp() throws Exception {
		kpbpa = new BaseForinheritance();
		kpbdriver = kpbpa.getdriver("firefox");
		kpburl = "https://courses.letskodeit.com/practice";
	}
	@Test
	public void test() throws InterruptedException {
		kpbdriver.get(kpburl);
		Thread.sleep(2000);
		
		//first way
		//WebElement ele=kpbdriver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL);
		//kpbdriver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		
		//second way
		/*Actions action = new Actions(kpbdriver); 
		  action.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).perform();*/
		
		 //3rd way
		//kpbdriver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a" + Keys.CONTROL);
		
		//4th way
		Actions action = new Actions(kpbdriver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
	}

	

}
