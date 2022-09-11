package waitTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecplicitlywait1 {
	WebDriver driver;
	Ecplicitlywait1(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement waitForElement(By locator,int timeout)
	{
		WebElement until=null;
		try{
			System.out.println("Waiting for max:: " + timeout + " seconds for element to be available");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout ));
			until = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element appeared on the web page"+locator);
			//return until;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return until;
	}
	
}
