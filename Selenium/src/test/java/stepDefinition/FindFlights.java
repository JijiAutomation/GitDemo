package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CucumberProj.Selenium.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FindFlightsPage;

public class FindFlights extends Base{
	
	WebDriver driver;
	FindFlightsPage oFindFlights = new FindFlightsPage(driver);
	
	@Given("^User has navigated to Flipkart website and closes alert window$")
    public void user_has_navigated_to_musafir_website() throws Throwable {	
		oFindFlights.closePopUpDisplayed();
    }

    @When("^User enters (.+) in search box$")
    public void user_enters_source_as_and_destination_as(String search) throws Throwable {
       oFindFlights.enterSearchValueInSearchBox(search);
    }

    @And("^User clicks Search button$")
    public void user_selects_travel_date() throws Throwable {
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        Thread.sleep(2000);
    }

}
