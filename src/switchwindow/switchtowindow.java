package switchwindow;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import calenderexamples.BaseForinheritance;

public class switchtowindow {
	BaseForinheritance bsfw;
	WebDriver swdriver;
	String swurl;

	@Before
	public void setUp() throws Exception {
		bsfw = new BaseForinheritance();
		swdriver = bsfw.getdriver("firefox");
		swurl = "https://courses.letskodeit.com/practice";
	}

	@Test
	public void test() throws InterruptedException {
		swdriver.get(swurl);
		Thread.sleep(3000);
		String parentWindowHandle = swdriver.getWindowHandle();
		System.out.println(parentWindowHandle);
		WebElement findElement = swdriver.findElement(By.id("openwindow"));
		findElement.click();
		Thread.sleep(3000);
		// if we unblock below code and check result that y we r mvng to
		// handlers concept
		/*
		 * WebElement findElement2 =
		 * swdriver.findElement(By.className("form-control find-input dynamic-text"
		 * )); findElement2.sendKeys("python"); Thread.sleep(3000); WebElement
		 * findElement3 =
		 * swdriver.findElement(By.xpath("//button[@type='submit']"));
		 * findElement3.click();
		 */

		Set<String> allWindowHandles = swdriver.getWindowHandles(); // which
		System.out.println(allWindowHandles);

		for (String str : allWindowHandles) {
			if (!parentWindowHandle.equals(str)) {
				swdriver.switchTo().window(str);
				System.out.println(swdriver.switchTo().window(str).getTitle());
				swdriver.manage().window().maximize();
				WebElement findElement2 = swdriver.findElement(By.xpath("//div//input[@id='search'][@name='course']"));
				Thread.sleep(3000);
				System.out.println("hi");
				findElement2.sendKeys("python");
				Thread.sleep(3000);
				WebElement findElement3 = swdriver.findElement(By.xpath("//button[@class='find-course search-course']"));
				findElement3.click();
				Thread.sleep(3000);
				swdriver.close();
				break;
			}
			
		}
		swdriver.switchTo().window(parentWindowHandle);
		WebElement findElement2 = swdriver.findElement(By.xpath("//fieldset//input[@id='name']"));
		findElement2.sendKeys("parameswara");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		swdriver.quit();
	}

}
