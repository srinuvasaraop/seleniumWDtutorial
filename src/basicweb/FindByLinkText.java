package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     String baseUrl="https://letskodeit.teachable.com";
     WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.get(baseUrl);
     driver.findElement(By.linkText("Practice")).click();
     Thread.sleep(3000);
     driver.findElement(By.linkText("Login")).click();  
     driver.findElement(By.name("email")).sendKeys("hsaljhdg");
     driver.findElement(By.name("password")).sendKeys("fsalk");
  }

}
