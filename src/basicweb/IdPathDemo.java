package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\srinuvas\\libs\\drivers\\chromedriver.exe");
		String baseUrl = "https://letskodeit.teachable.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
        driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
        driver.findElement(By.id("email")).sendKeys("p.srinu4b@gmail.com");
        
	}
}
