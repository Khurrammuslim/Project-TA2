package pages;

import static org.testng.Assert.assertEquals;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigUtils;

public class corePage {
	
	public static WebDriver driver;
	@BeforeSuite
//	public static void main (String[] args) throws InterruptedException {
	
	
	public void setup() {
		
	WebDriverManager.chromedriver().setup();
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\khurram.muslim\\eclipse-workspace\\Project-TA\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Properties prop = ConfigUtils.getProps("data");
	
	driver.get(prop.getProperty("URL"));

	driver.manage().window().maximize();

	SubscriptionPage sPage = new SubscriptionPage(driver);
//	sPage.changeCountrySA();
//	//sPage.filtersbyRating();
	
	
	}
	
	@AfterSuite
	public static void teardown() {
		SubscriptionPage.driver.quit();
	}
}
	