package usefulMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethod2 {
	WebDriver driver;

	public GenericMethod2(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getElement(String type, String locator) {
		String lower = type.toLowerCase();
		if (lower=="id") {
			WebElement findElement = driver.findElement(By.id(locator));
			System.out.println("element found with id "+ locator);
			// return this.driver.findElement(By.id(locator));
			return findElement;
		} else {
			System.out.println("Locator type not supported");
			return null;
		}
	}
}
