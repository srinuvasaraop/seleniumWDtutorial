package keypress;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import calenderexamples.BaseForinheritance;

public class elementNotclickable {
	BaseForinheritance enc;
	WebDriver encdriver;
	String encurl;

	@Before
	public void setUp() throws Exception {
		encdriver = new ChromeDriver();
		encdriver.manage().window().maximize();
		encdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		encurl = "https://ui.freecrm.com";
		
		
	}

	@Test
	public void test() {
		encdriver.get(encurl);
		//for this code real time(https://ui.freecrm.com )example code was changed so not able to work.
		//so stopped writing code
		encdriver.findElement(By.xpath("//div//input[@type='text' and @placeholder='E-mail address']")).sendKeys("harasambo");
		encdriver.findElement(By.xpath("//div[text()='Login']")).click();
		
	}

	@After
	public void tearDown() throws Exception {
	}

}
