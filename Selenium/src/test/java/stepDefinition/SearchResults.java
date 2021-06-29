package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import CucumberProj.Selenium.Base;
import io.cucumber.java.en.Then;
import pages.SearchResultsPage;

public class SearchResults extends Base{
	
	SearchResultsPage oSearchResult = new SearchResultsPage(driver);
	
	 @Then("^User has navigated to search result page$")
	 public void user_has_navigated_to_flight_search_options() throws Throwable {
		 oSearchResult.verifyIfNavigatedToSearchPage();
	 }

}
