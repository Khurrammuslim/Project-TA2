package pages;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SubscriptionPage {
	
	public static WebDriver driver;
	
	static By currentCountry = By.cssSelector(".head-links > div.country-current");
	static By typeLite = By.cssSelector("#name-lite");
	static By typePriceLite = By.id("currency-lite");  
	static By typeClassic = By.cssSelector("#name-classic");
	static By typePriceClassic = By.id("currency-classic");  
	static By typePremium = By.cssSelector("#name-premium");
	static By typePricePremium = By.id("currency-premium");
	static By countryChangeDropdown = By.id("arrow");
	static By selectCountryBH = By.id("bh-contry-flag");
	static By selectCountrySA = By.id("sa-contry-flag");
	static By selectCountryKW = By.id("kw-contry-flag");
		
	
	public SubscriptionPage(WebDriver driver){
		this.driver = driver;
	}
	
	public static void changeCountrySA() {
		//driver.switchTo().frame("iframe");
		driver.findElement(countryChangeDropdown).click();
		driver.findElement(selectCountrySA).click();
	}
	
	public static void changeCountryBH() {
		//driver.switchTo().frame("iframe");
		driver.findElement(countryChangeDropdown).click();
		driver.findElement(selectCountryBH).click();
	}
	
	public static void changeCountryKW() {
		//driver.switchTo().frame("iframe");
		driver.findElement(countryChangeDropdown).click();
		driver.findElement(selectCountryKW).click();
	}
	
	public static void typesOfSubscription() {
		String Lite = driver.findElement(typeLite).getText();
		assertEquals("LITE" , Lite);
		
		String Classic = driver.findElement(typeClassic).getText();
		assertEquals("CLASSIC" , Classic);
		
		String Premium = driver.findElement(typePremium).getText();
		assertEquals("PREMIUM" , Premium);
		
	}
	
	public static void PriceAndCurrencyOfSubscriptionOfSA() {
		String LitePrice = driver.findElement(typePriceLite).getText();
		assertTrue(LitePrice.contains("15 SAR/month"));
		String ClassicPrice = driver.findElement(typePriceClassic).getText();
		assertTrue(ClassicPrice.contains("25 SAR/month"));
		String PremiumPrice = driver.findElement(typePricePremium).getText();
		assertTrue(PremiumPrice.contains("60 SAR/month"));
	}
	
	public static void PriceAndCurrencyOfSubscriptionOfBH() {
		String LitePrice = driver.findElement(typePriceLite).getText();
		assertTrue(LitePrice.contains("2 BHD/month"));
		String ClassicPrice = driver.findElement(typePriceClassic).getText();
		assertTrue(ClassicPrice.contains("3 BHD/month"));
		String PremiumPrice = driver.findElement(typePricePremium).getText();
		assertTrue(PremiumPrice.contains("6 BHD/month"));
	}
	
	public static void PriceAndCurrencyOfSubscriptionOfKW() {
		String LitePrice = driver.findElement(typePriceLite).getText();
		assertTrue(LitePrice.contains("1.2 KWD/month"));
		String ClassicPrice = driver.findElement(typePriceClassic).getText();
		assertTrue(ClassicPrice.contains("2.5 KWD/month"));
		String PremiumPrice = driver.findElement(typePricePremium).getText();
		assertTrue(PremiumPrice.contains("4.8 KWD/month"));
	}
	
}
