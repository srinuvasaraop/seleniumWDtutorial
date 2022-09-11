package switchwindow;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import calenderexamples.BaseForinheritance;

public class switchToIframe {
	BaseForinheritance bsifw;
	WebDriver swidriver;
	String swiurl;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		bsifw = new BaseForinheritance();
		swidriver = bsifw.getdriver("firefox");
		swiurl = "https://courses.letskodeit.com/practice";
		js = (JavascriptExecutor) swidriver;
	}

	@Test
	public void test() throws InterruptedException {
		swidriver.get(swiurl);
		Thread.sleep(3000);
		// this commented code not working because source code in <iframe>
		// WebElement findElement =
		// swidriver.findElement(By.xpath("//div//input[@id='search'][@placeholder='Search Course']"));

		List<WebElement> iframeElements = swidriver.findElements(By
				.tagName("iframe"));
		System.out.println("The total number of iframes are "
				+ iframeElements.size());
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,800);");
		Thread.sleep(5000);
		// scrolling up
		//js.executeScript("window.scrollBy(0,-1500);");
		swidriver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement findElement = swidriver.findElement(By
				.xpath("//div//input[@id='search']"));
		findElement.sendKeys("python");
		WebElement findElement2 = swidriver.findElement(By
				.xpath("//button[@type='submit']"));
		findElement2.click();

		swidriver.switchTo().defaultContent();
		Thread.sleep(6000);
		swidriver.findElement(By.xpath("//input[@id='name'][@placeholder='Enter Your Name']")).sendKeys("Test Successful");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		// swidriver.quit();
	}

}
