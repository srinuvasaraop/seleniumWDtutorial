package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class searchpagefactory2 {
	WebDriver web;
	searchpagefactory2(WebDriver web)
	{
	  this.web=web;
	  PageFactory.initElements(web, this);
	}
	
	@FindBy(xpath="//a//span[@class='uitk-tab-text'][text()='Flights']")
	WebElement flights_select;
	
	@FindBy(xpath="//a//span[@class='uitk-tab-text'][text()='One-way']")
	WebElement trip;
	
	@FindBy(xpath="//button[@aria-label='Leaving from']")
	WebElement leaving_from;
	
	@FindBy(how = How.ID, using = "location-field-leg1-origin")
	WebElement whreu_leaving;
	
	/*@FindBy(id="location-field-leg1-origin")
	WebElement whreu_leaving;*/
	
	@FindBy(xpath="//button[@aria-label='Going to']")
	WebElement Going_to;
	
	@FindBy(xpath="//input[@id='location-field-leg1-destination']")
	WebElement Going_tocity;
	
	@FindBy(id="d1-btn")
	WebElement date_click;
	
	@FindBy(xpath="//td//button[@aria-label='Jul 17, 2022']")
	WebElement date_select;
	
	@FindBy(xpath="//div//button[@data-stid='apply-date-picker']")
	WebElement done_buttton;
	
	@FindBy(xpath="//div//button[@data-testid='submit-button']")
	WebElement search_button;
	public void flights()
	{  
		flights_select.click();
	}
	
	public void trip()
	{  
		trip.click();
	}
	public void Leavngfrom()
	{  
		leaving_from.click();
	}
	
	public void whereuleaving()
	{
		whreu_leaving.sendKeys("goa",Keys.ENTER);
	}
	public void goingto()
	{
		Going_to.click();
	}
	public void goingtocity()
	{
		Going_tocity.sendKeys("hyderabad",Keys.ENTER);
	}
	public void dateclick()
	{  
		date_click.click();
	}
	public void dateselect()
	{  
		date_select.click();
	}
	public void done()
	{  
		done_buttton.click();
	}
	public void search()
	{  
		search_button.click();
	}
}
