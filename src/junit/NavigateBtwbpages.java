package junit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBtwbpages {
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title=driver.getTitle();
		System.out.println(title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		String Urltonavigate="https://sso.teachable.com/secure/42299/identity/login/password?wizard_id=sh8QkUu50pO3OS_FDxQNCj6TXNflo-W_yAqlG6fV0aae9Jva0suomuml3K1pNdLPF8IGi4I_VkP0Hx7ncxk2ig";
		driver.navigate().to(Urltonavigate);
		currentUrl=driver.getCurrentUrl();
		System.out.println("navigated url");
		System.out.println(currentUrl);
		
		
		Thread.sleep(200);
		driver.navigate().back();
		currentUrl=driver.getCurrentUrl();
		System.out.println("naviagted back");
		System.out.println(currentUrl);
		
		Thread.sleep(200);
		currentUrl=driver.getCurrentUrl();
		System.out.println("naviagted back");
		System.out.println(currentUrl);

		Thread.sleep(200);
		currentUrl=driver.getCurrentUrl();
		System.out.println("naviagted back");
		System.out.println(currentUrl);

		driver.navigate().forward();
		currentUrl=driver.getCurrentUrl();
		System.out.println("naviagted forword");
		System.out.println(currentUrl);
		
		driver.navigate().refresh();
		System.out.println("refreshing the page");
		
		driver.get(currentUrl);
		System.out.println("again refreshing");
		
		//String pagesourse=driver.getPageSource();
		//System.out.println(pagesourse);
		
		
	}
	@After
	public void tearDown() throws Exception {	
	}
}
