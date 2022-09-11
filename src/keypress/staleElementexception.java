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

public class staleElementexception {
	WebDriver stedriver;
	String steurl;

	@Before
	public void setUp() throws Exception {
		stedriver = new ChromeDriver();
		stedriver.manage().window().maximize();
		// if we comment implicit wait will get nosuchelement error
		stedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		steurl = "https://courses.letskodeit.com/practice";
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		stedriver.quit();
	}
	@Test
	public void test() {
		stedriver.get(steurl);
		WebElement findElement = stedriver.findElement(By
				.xpath("//input[@id='bmwcheck' and @value='bmw']"));
		// after finding checkbox the page was reloaded so STATE ELEMENT REFERENCE EXCEPTION CAME.
		
		 //stedriver.get(stedriver.getCurrentUrl());
		findElement.click();
	}
}
