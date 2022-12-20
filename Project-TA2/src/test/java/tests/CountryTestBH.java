package tests;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.SubscriptionPage;
import pages.corePage;



public class CountryTestBH extends corePage {
	public WebDriver driver;


@Test
	
	public void Test2() {
		
		SubscriptionPage.changeCountryBH();
		SubscriptionPage.typesOfSubscription();
		SubscriptionPage.PriceAndCurrencyOfSubscriptionOfBH();

	}
}
