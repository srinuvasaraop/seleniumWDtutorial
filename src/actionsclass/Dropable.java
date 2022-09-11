package actionsclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import calenderexamples.BaseForinheritance;

public class Dropable {
	BaseForinheritance drmsh;
	WebDriver drdriver;
	String drurl;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		drmsh = new BaseForinheritance();
		drdriver = drmsh.getdriver("firefox");
		drurl = "https://jqueryui.com/droppable";
		js = (JavascriptExecutor) drdriver;
	}

	@Test
	public void test() throws InterruptedException {
		drdriver.get(drurl);
		js.executeScript("window.scrollBy(0,100);");
		Thread.sleep(3000);
		int size = drdriver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		drdriver.switchTo().frame(0);
		
		//Element which needs to drag.
		WebElement From=drdriver.findElement(By.xpath("//div[@id='draggable']/p[text()='Drag me to my target']"));
		//Element on which need to drop.	
		
        WebElement To=drdriver.findElement(By.id("droppable"));
      //Using Action class for drag and drop.		
        Actions act=new Actions(drdriver);
      //Dragged and dropped.		
        //act.dragAndDrop(From, To).build().perform(); 
        
        act.clickAndHold(From).moveToElement(To).release().build().perform();
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		drdriver.quit();
	}

}
