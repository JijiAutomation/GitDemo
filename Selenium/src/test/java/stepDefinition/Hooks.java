package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import CucumberProj.Selenium.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	
	WebDriver driver;
	
	@Before("@Selenium")
	public void BeforeSeleniumTest() throws InterruptedException, IOException {
		driver = Base.getDriver();
		Thread.sleep(2000);
	}
	
	@After("@Selenium")
	public void AfterSeleniumTest() {
		 driver.close();
		 
	}

}
