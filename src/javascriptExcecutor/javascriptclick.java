package javascriptExcecutor;

import static org.junit.Assert.fail;

import javax.swing.text.Document;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import calenderexamples.BaseForinheritance;

public class javascriptclick {
	BaseForinheritance bjsc;
	WebDriver jscdriver;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		bjsc = new BaseForinheritance();
		jscdriver = bjsc.getdriver("chrome");
		js = (JavascriptExecutor) jscdriver;

	}

	@Test
	public void test() throws InterruptedException {
		js.executeScript("window.location='https://courses.letskodeit.com/practice'");
		Thread.sleep(2000);
		WebElement web = jscdriver.findElement(By.id("bmwcheck"));
		js.executeScript("arguments[0]. click();", web);
	}

	@After
	public void tearDown() throws Exception {
          Thread.sleep(2000);
          jscdriver.quit();
	}

}
