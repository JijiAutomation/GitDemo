package CucumberProj.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	
	public static WebDriver getDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jiji\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");       
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Jiji\\eclipse-workspace\\Selenium\\src\\test\\java\\CucumberProj\\Selenium\\global.properties");
		prop.load(fis);
		
		driver.get(prop.getProperty("url"));
		
		
		return driver;
	}

}
