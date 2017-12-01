package com.autotrader.autotraderwebtesting.AutoTraderTestProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
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
		//String url = "https://www.autotrader.co.uk/";
		webDriver.get(url);
		
		WebElement signInSection = webDriver.findElement(By.className("is-not-signed-in"));
		signInSection.click();
		threadSleep();
		
		WebElement signUPSection = webDriver.findElement(By.cssSelector("#js-social__signup-tab > span"));
		signUPSection.click();
		threadSleep();
		
		WebElement enterEmailAddress = webDriver.findElement(By.id("email"));
		enterEmailAddress.sendKeys("K1122499@kingston.ac.uk");
		
		WebElement enterPassword = webDriver.findElement(By.id("password"));
		enterPassword.sendKeys("RobelBeyene@159");
		
		WebElement signUPButton = webDriver.findElement(By.id("social--signup--submit"));
		signUPButton.click();
		threadSleep();
		
		/*WebElement message = webDriver.findElement(By.cssSelector("#js-social__signup > div > form > span:nth-child(9) > div"));
		String errorMessage = message.getText();
		
		String expectedMessage = "Your password must be at least 8 characters long, containing at least one letter and at least one number or special character.";
		
		Assert.assertEquals(errorMessage,expectedMessage);*/
		
	}

}
