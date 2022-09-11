package javascriptExcecutor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import calenderexamples.BaseForinheritance;

public class windowssize {
	//in this code we covered two concepts.
	//1.windows size 
	//2.scolling up and down
	BaseForinheritance biw;
	WebDriver getdriver;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		biw = new BaseForinheritance();
		getdriver = biw.getdriver("firefox");
		js = (JavascriptExecutor) getdriver;

	}

	@Test
	public void test() throws InterruptedException {
		js.executeScript("window.location='https://courses.letskodeit.com/practice'");
		// Size of window
		long height = (Long) js.executeScript("return window.innerHeight;");
		long width = (Long) js.executeScript("return window.innerWidth;");

		System.out.println("Height is: " + height);
		System.out.println("Width is: " + width);
        
		//this is for scrolling up and down scenarios
		//scrolling down
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(5000);
		//scrolling up
		js.executeScript("window.scrollBy(0,-1500);");
		WebElement findElement = getdriver.findElement(By.xpath("//*[@id='mousehover'][text()='Mouse Hover']"));
		js.executeScript("arguments[0].scrollIntoView(true);", findElement);
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1000);");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		// getdriver.quit();
	}

}
