package switchwindow;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import calenderexamples.BaseForinheritance;

public class switchalert {
	BaseForinheritance bsa;
	WebDriver sadriver;
	String saurl,alertMessage;
	Alert alert;
	@Before
	public void setUp() throws Exception {
		bsa = new BaseForinheritance();
		sadriver = bsa.getdriver("firefox");
		saurl = "https://courses.letskodeit.com/practice";
		
	}
	@Test
	public void test() throws InterruptedException {
		sadriver.get(saurl);
		sadriver.findElement(By.xpath("//input[@id='name'][@placeholder='Enter Your Name']")).sendKeys("haha hara mahadeva");
		Thread.sleep(3000);
		sadriver.findElement(By.id("alertbtn")).click();
		// altert class for popup 
		Thread.sleep(3000);
		alertMessage= sadriver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage);
		Thread.sleep(3000);
		alert = sadriver.switchTo().alert();
		alert.accept();
	}
	@Test
	public void test2() throws InterruptedException {
		sadriver.get(saurl);
		sadriver.findElement(By.xpath("//input[@id='name'][@placeholder='Enter Your Name']")).sendKeys("haha hara mahadeva");
		sadriver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		// altert class for popup 
		alertMessage= sadriver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage);
		Thread.sleep(3000);
		alert = sadriver.switchTo().alert();
		alert.accept();
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
	}

	

}
