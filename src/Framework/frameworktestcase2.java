package Framework;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import waitTypes.ImplicitWait;

public class frameworktestcase2 {
  WebDriver fwftdriver;
  String Fwfturl;
	@Before
	public void setUp() throws Exception {
	  fwftdriver=new FirefoxDriver();
	  Fwfturl="https://www.expedia.com/";
	  fwftdriver.manage().window().maximize();
	  fwftdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	@Test
	public void test() throws InterruptedException {
		fwftdriver.get(Fwfturl);
		searchpagefactory2 search_fact=new searchpagefactory2(fwftdriver);
		search_fact.flights();
		Thread.sleep(3000);
		search_fact.trip();
		Thread.sleep(3000);
		search_fact.Leavngfrom();
		Thread.sleep(3000);
		search_fact.whereuleaving();
		Thread.sleep(3000);
		search_fact.goingto();
		Thread.sleep(3000);
		search_fact.goingtocity();
		Thread.sleep(3000);
		search_fact.dateclick();
		Thread.sleep(3000);
		search_fact.dateselect();
		Thread.sleep(3000);
		search_fact.done();
		Thread.sleep(3000);
		search_fact.search();
		
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//fwftdriver.quit();
	}

	

}
