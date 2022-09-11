package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class serachpage {
	WebDriver driver;

	public serachpage(WebDriver driver) {
		this.driver = driver;
	}

	public void Lookingstays() {
		driver.findElement(By.xpath("//span[text()='Stays']"));

	}

	public void whreregoing() {
		driver.findElement(By.xpath("//button[@aria-label='Going to']"))
				.click();
		driver.findElement(By.id("location-field-destination")).sendKeys(
				"london", Keys.ENTER);
	}

	public void checkin() {
		driver.findElement(By.id("d1-btn")).click();
		// //table[@class='uitk-date-picker-weeks']//button[@aria-label='Aug 10,
		// 2022']")).click();
		driver.findElement(
				By.xpath("//div[@class='uitk-date-picker-month'][1]//table[@class='uitk-date-picker-weeks']//tr//button[@aria-label='Jul 3, 2022']"))
				.click();
		/*
		 * driver.findElement(
		 * By.xpath("//div//button[@data-stid='apply-date-picker']"))
		 * .sendKeys(Keys.ENTER);
		 */
	}

	public void checkout() {
		// driver.findElement(By.id("d2-btn")).click();
		driver.findElement(
				By.xpath("//table[@class='uitk-date-picker-weeks']//button[@aria-label='Aug 29, 2022']"))
				.click();
		driver.findElement(
				By.xpath("//div//button[@data-stid='apply-date-picker']"))
				.sendKeys(Keys.ENTER);
	}
}
