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

public class keypress1 {
	BaseForinheritance kbpa;
	WebDriver kpdriver;
	String kpurl;
	Alert kpalert;

	@Before
	public void setUp() throws Exception {
		kbpa = new BaseForinheritance();
		kpdriver = kbpa.getdriver("firefox");
		kpurl = "https://courses.letskodeit.com/login";
	}

	@Test
	public void test() throws InterruptedException {
		kpdriver.get(kpurl);
		kpdriver.findElement(By.xpath("//input[@id='email' and @placeholder='Email Address']")).sendKeys("helo@gmail.com");
		Thread.sleep(2000);
		kpdriver.findElement(By.xpath("//input[@id='email' and @placeholder='Email Address']")).sendKeys(Keys.TAB);
		//using ENTER key
		/*kpdriver.findElement(By.xpath("//input[@id='password' and @placeholder='Password']")).sendKeys("helo");
		Thread.sleep(3000);
		
		kpdriver.findElement(By.xpath("//div//input[@type='submit']")).sendKeys(Keys.ENTER);;*/
		
		/*Thread.sleep(3000);
		Actions action = new Actions(kpdriver);
		action.sendKeys(Keys.ENTER);*/
		System.out.println("hi");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//kpdriver.quit();
	}

}
