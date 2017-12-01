package com.autotrader.autotraderwebtesting.AutoTraderTestProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {
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
	public void openAutoTraderWebsite() {
		webDriver.get(url);
		
		WebElement signInSection = webDriver.findElement(By.className("is-not-signed-in"));
		signInSection.click();
		threadSleep();
		
		WebElement signUPTab = webDriver.findElement(By.cssSelector("#js-social__signin-tab > span"));
		signUPTab.click();
		threadSleep();
		
		WebElement enterEmailAddress = webDriver.findElement(By.id("signin-email"));
		enterEmailAddress.sendKeys("K1122499@kingston.ac.uk");
		threadSleep();
		
		WebElement enterPassword = webDriver.findElement(By.id("signin-password"));
		enterPassword.sendKeys("RobelBeyene@159");
		threadSleep();
		
		WebElement signINButton = webDriver.findElement(By.id("signInSubmit"));
		signINButton.click();
		threadSleep();
		
	}


}
