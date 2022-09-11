package usefulMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListGenericMethod2 {
	WebDriver driver;

	public ListGenericMethod2(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getElementlist(String type, String locator) {
		String lower = type.toLowerCase();
		if (lower == "xpath") {
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
}