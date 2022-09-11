package usefulMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IsElementPresent2 {
	WebDriver driver;
	public IsElementPresent2(WebDriver driver)
	{
		this.driver=driver;
	}
	public List<WebElement> getElementlist(String type, String locator) {
		 type = type.toLowerCase();
		if (type.equals("xpath")) {
			List<WebElement> findElement = driver.findElements(By.xpath(locator));
			System.out.println("element found with id " + locator);
			// return this.driver.findElement(By.id(locator));
			return findElement;
		}

		else {
			System.out.println("Locator type not supported");
			return null;
		}
	}
	public boolean FindisElementPresent(String type,String locator)
	{
		List<WebElement> elementlist = getElementlist(type,locator);
		int size = elementlist.size();
		if(size>0)
		{
			return true;
		}
		else{
			return false;
		}
		
	}
}
