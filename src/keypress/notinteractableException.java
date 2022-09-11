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

public class notinteractableException {
	WebDriver niedriver;
	String nieurl;
	@Before
	public void setUp() throws Exception {
		niedriver = new ChromeDriver();
		niedriver.manage().window().maximize();
		// if we comment implicit wait will get nosuchelement error
		niedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		nieurl = "https://www.expedia.com/";
	}
	/*
	 * @Test public void test() { niedriver.get(nieurl); //WebElement
	 * findElement = niedriver.findElement(By.linkText("Login"));
	 * //findElement.sendKeys("helo"); //input[@type='submit'] WebElement
	 * findElement = niedriver.findElement(By.xpath("//input[@type='submit']"));
	 * findElement.sendKeys("helo");
	 */
	@Test
	public void test2() {
		
		niedriver.get(nieurl);
		WebElement findElement = niedriver.findElement(By.xpath("//span[text()='Flights']"));
		findElement.click();
		//WebElement findElement1 = niedriver.findElement(By.className("uitk-field-input is-hidden"));
		//findElement1.sendKeys("helo");
		//here one input tag is hiiden condition so not getting output,
		//then we tried for another way press the button then will get another input tag there we got output.
		//this is real time scenario
	     niedriver.findElement(By.xpath("//button[@data-stid='location-field-leg1-origin-menu-trigger']")).click();;
		WebElement findElement1 = niedriver.findElement(By.id("location-field-leg1-origin"));
		findElement1.sendKeys("SFO");
				
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		// niedriver.quit();
	}

}
