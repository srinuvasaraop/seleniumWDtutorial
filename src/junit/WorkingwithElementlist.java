package junit;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithElementlist {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://courses.letskodeit.com/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	@Test
	public void test() throws InterruptedException {
		boolean isChecked = false;
		List<WebElement> radioButtons = driver
				.findElements(By
						.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		/*List<WebElement> radioButtons = driver
				.findElements(By.name("cars"));*/
		
		int size = radioButtons.size();
		System.out.println("Size of the list: " + size);
		for (int i = 0; i < size; i++) {
			isChecked = radioButtons.get(i).isSelected();
			if (!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(2000);
			}
		}
	}
	@After
	public void tearDown()  {
	}
}
