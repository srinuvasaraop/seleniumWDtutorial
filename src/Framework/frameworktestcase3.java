package Framework;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameworktestcase3 {
	WebDriver fwftdriver3;
	  String Fwfturl3;
		@Before
		public void setUp() throws Exception {
			fwftdriver3=new FirefoxDriver();
			Fwfturl3="https://www.expedia.com/";
		  fwftdriver3.manage().window().maximize();
		  fwftdriver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		fwftdriver3.quit();
	}

	@Test
	public void test(){
		fwftdriver3.get("https://artoftesting.com/sampleSiteForSelenium");
		List<WebElement> findElements = fwftdriver3.findElements(By.tagName("a"));
		System.out.println(findElements.size());
		for(WebElement element:findElements)
		{
			System.out.println("links are  "+element.getText()+"   "+element.getAttribute("href"));
		}
	}

}
