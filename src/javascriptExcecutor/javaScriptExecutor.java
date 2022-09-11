package javascriptExcecutor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import calenderexamples.BaseForinheritance;

public class javaScriptExecutor {
	private static final String WebElement = null;
	BaseForinheritance bf;
	WebDriver jsdriver;
	String jsurl;
	JavascriptExecutor js;
	@Before
	public void setUp() throws Exception {
		    bf=new BaseForinheritance();
		    jsdriver = bf.getdriver("firefox");
		    //jsurl="https://courses.letskodeit.com/practice";
		    
	}
	@Test
	public void test() throws InterruptedException {
		//jsdriver.get(jsurl);
		
		 js = (JavascriptExecutor) jsdriver;
		js.executeScript("window.location='https://courses.letskodeit.com/practice'");
		Thread.sleep(5000);
		WebElement textBox= (WebElement) js.executeScript("return document.getElementById('name[0]');");
		textBox.sendKeys("test");
	}
		@After
	public void tearDown() throws Exception {
			
	}

	

}
