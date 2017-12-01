package com.autotrader.autotraderwebtesting.AutoTraderTestProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateYourAd {
	WebDriver webDriver;
	String url = "https://www.autotrader.co.uk/";

	public void threadSleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
	}

	@Before
	public void setUp() {
		webDriver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		webDriver.quit();
	}
	@Test
	public void createAd() {
		webDriver.get(url);
		
		WebElement carRegistration = webDriver.findElement(By.name("reg"));
		carRegistration.sendKeys("BK06 ZFL");
		threadSleep();
		WebElement carMileage = webDriver.findElement(By.name("mileage"));
		carMileage.sendKeys("75000");
		threadSleep();
		
		WebElement createAdButton = webDriver.findElement(By.cssSelector("#js-sell-module > form > button"));
		createAdButton.click();
		threadSleep();
		
		WebElement nextStepButton = webDriver.findElement(By.cssSelector("#submitPage"));
		nextStepButton.click();
		threadSleep();
		
		WebElement askPrice = webDriver.findElement(By.name("askingPrice.price"));
		askPrice.sendKeys("1250");
		threadSleep();
		
		WebElement continueButton = webDriver.findElement(By.id("setPriceButton"));
		continueButton.click();
		threadSleep();
	}
	
}
