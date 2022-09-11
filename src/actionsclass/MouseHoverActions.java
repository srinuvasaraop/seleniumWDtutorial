package actionsclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import calenderexamples.BaseForinheritance;

public class MouseHoverActions {
	BaseForinheritance bsmsh;
	WebDriver modriver;
	String mourl;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		bsmsh = new BaseForinheritance();
		modriver = bsmsh.getdriver("firefox");
		mourl = "https://courses.letskodeit.com/practice";
		js = (JavascriptExecutor) modriver;
	}

	@Test
	public void test() throws InterruptedException {
		modriver.get(mourl);
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,600);");
		Thread.sleep(3000);
		
		WebElement ele = modriver.findElement(By.id("mousehover"));
		Actions action = new Actions(modriver);
		action.moveToElement(ele).perform();
         
		// Locating the element from Sub Menu
		WebElement subMenu = modriver.findElement(By
				.xpath("//div//a[text()='Top']"));

		// To mouseover on sub menu
		action.moveToElement(subMenu).click().perform();

		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		modriver.quit();
	}

}
