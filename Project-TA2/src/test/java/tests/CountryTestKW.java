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



public class CountryTestKW extends corePage {
	public WebDriver driver;

@Test

public void Test3() {
	
	SubscriptionPage.changeCountryKW();
	SubscriptionPage.typesOfSubscription();
	SubscriptionPage.PriceAndCurrencyOfSubscriptionOfKW();

}

}
