package calenderexamples;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoSelect extends BaseForinheritance {
	String Aurl = "https://www.goibibo.com";
	WebDriver adriver;

	@Before
	public void setUp() throws Exception {
		AutoSelect aa = new AutoSelect();
		adriver = aa.getdriver("chrome");
	}

	@Test
	public void test() throws InterruptedException {
		adriver.get(Aurl);
		String parttext = "hyd";
		String texttoSelect = "Hamburg";

		WebElement findElement = adriver
				.findElement(By
						.xpath("//span[text()='From']/following-sibling::p[text()='Enter city or airport']"));
		findElement.click();
		WebElement findElement2 = adriver.findElement(By
				.xpath("//input[@type='text']"));
		findElement2.sendKeys(parttext);
		WebElement findElement3 = adriver.findElement(By
				.id("autoSuggest-list"));
		Thread.sleep(2000);
		String st = findElement3.getAttribute("innerHTML");
		Thread.sleep(2000);
		System.out.println(st);

		List<WebElement> findElements = findElement3.findElements(By
				.tagName("li"));
		Thread.sleep(2000);
		for (WebElement web : findElements) {
			System.out.println(web.getText());
			if (web.getText().contains(texttoSelect))
			{
				System.out.println("the selected text "+web.getText());
				web.click();
				break;
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		String filename=getRandomName(10) + ".png";
		  String directory=System.getProperty("user.dir")+"//screenshots//";
		  File sourceFile = ((TakesScreenshot)adriver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(sourceFile, new File(directory + filename));
		 // adriver.quit();
		  	}
		public static String getRandomName(int ilegthofname)
		{
			StringBuilder sb=new StringBuilder();
			String letterstopick="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
			for(int i=0;i<ilegthofname;i++)
			{
				int index=(int) (Math.random()*letterstopick.length());
				sb.append(letterstopick.charAt(index));
			}
			return sb.toString();
		}

	}