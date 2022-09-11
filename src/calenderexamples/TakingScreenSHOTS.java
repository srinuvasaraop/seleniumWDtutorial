package calenderexamples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TakingScreenSHOTS extends BaseForinheritance{
  String furl="https://www.facebook.com";
  WebDriver fweb;
	@Before
	public void setUp() throws Exception {
		TakingScreenSHOTS tsch=new TakingScreenSHOTS();
		fweb=tsch.getdriver("firefox");
	}
	@Test
	public void test() {
		fweb.get(furl);
		WebElement findElement = fweb.findElement(By.name("login"));
		findElement.click();
	}
	@After
	public void tearDown() throws Exception {
		//getrandom(int size)
		//here int is how many  letters take create  new  name.
	  String filename=getRandomName(10) + ".png";
	  String directory=System.getProperty("user.dir")+"//screenshots//";
	  File sourceFile = ((TakesScreenshot)fweb).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(sourceFile, new File(directory + filename));
	  fweb.quit();
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
