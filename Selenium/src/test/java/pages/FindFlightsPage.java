package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CucumberProj.Selenium.Base;

public class FindFlightsPage extends Base{
	
	public WebDriver driver;
	
	public FindFlightsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (xpath = "//button[text()='✕']")
	WebElement closeButton;
	
	@FindBy (xpath = "//input[@type='text']")
	WebElement searchBox;
	
	
	public void closePopUpDisplayed () throws InterruptedException {
		driver.findElement((By) closeButton).click();
		Thread.sleep(2000);
	}
	
	public void enterSearchValueInSearchBox(String search) throws InterruptedException {
		driver.findElement((By) searchBox).click();
	    driver.findElement((By) searchBox).sendKeys(search);
	    Thread.sleep(2000);
	}

}
