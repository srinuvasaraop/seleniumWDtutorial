package keypress;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staeException2 {
	WebDriver ste2driver;
	String ste2url;

	@Before
	public void setUp() throws Exception {
		ste2driver = new ChromeDriver();
		ste2driver.manage().window().maximize();
		// if we comment implicit wait will get nosuchelement error
		ste2driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ste2url = "https://www.southwest.com";
	}

	@Test
	public void test() {
		try
		{
			ste2driver.get(ste2url);
			ste2driver.findElement(
					By.id("LandingAirBookingSearchForm_originationAirportCode"))
					.sendKeys("new york");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<WebElement> list_ele = ste2driver
					.findElements(By
							.xpath("//ul[@id='LandingAirBookingSearchForm_originationAirportCode--menu']/li"));
			int i = 0;
			for (WebElement webElement : list_ele) {
				i = i + 1;
				String eletext = ste2driver
						.findElement(
								By.xpath("//ul[@id='LandingAirBookingSearchForm_originationAirportCode--menu']/li["
										+ i + "]/button[@type='button']"))
						.getText();
				System.out.println(eletext);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}

	@After
	public void tearDown() throws Exception {

	}

}
