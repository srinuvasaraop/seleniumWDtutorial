package Framework;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectmodel {
	WebDriver pomdriver;
	String pomurl;

	@Before
	public void setUp() throws Exception {
		pomdriver = new ChromeDriver();
		pomdriver.manage().window().maximize();
		// if we comment implicit wait will get nosuchelement error
		pomdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pomurl = "https://www.expedia.com/";
		pomdriver.get(pomurl);
	}
	@Test
	public void test() throws InterruptedException {
		
		serachpage serachpage_obj=new serachpage(pomdriver);
		serachpage_obj.Lookingstays();
		Thread.sleep(3000);
		serachpage_obj.whreregoing();
		Thread.sleep(3000);
		serachpage_obj.checkin();
		Thread.sleep(3000);
		serachpage_obj.checkout();
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//pomdriver.quit();
	}

	

}
