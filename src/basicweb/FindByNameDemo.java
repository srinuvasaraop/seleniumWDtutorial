package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String baseUrl="https://courses.letskodeit.com/practice";
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.get(baseUrl);
       driver.findElement(By.name("enter-name")).sendKeys("hellow");
       
	}

}
