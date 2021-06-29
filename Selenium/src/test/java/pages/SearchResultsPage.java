package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CucumberProj.Selenium.Base;

public class SearchResultsPage extends Base{
	
public WebDriver driver;
	
	public SearchResultsPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyIfNavigatedToSearchPage () throws InterruptedException {
		Thread.sleep(2000);
		 Assert.assertTrue(driver.findElement(By.xpath("//button[text()='✕']")).isDisplayed());
	}

}
