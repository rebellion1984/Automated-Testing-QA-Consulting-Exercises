package com.autotrader.autotraderwebtesting.AutoTraderTestProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class searchingCar {
	String currentURL = "https://www.autotrader.co.uk/";
	// String url = "https://www.google.co.uk/";
	public WebDriver webDriver;

	@Before
	public void setUp() {
		webDriver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		webDriver.quit();
	}
	
	//slows down browser executions
	public void threadSleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
	}

	@Test
	public void searchBar() {
		webDriver.get(currentURL);

		WebElement enterPostCode = webDriver.findElement(By.id("postcode"));
		threadSleep();
		enterPostCode.sendKeys("nw2 5bj");
		threadSleep();
		
		WebElement selectDistance = webDriver.findElement(By.id("radius"));
		Select distanceDropdown = new Select(selectDistance);
		distanceDropdown.selectByIndex(4);
		threadSleep();
		
		WebElement chooseNewUsed = webDriver.findElement(By.id("oneSearchAdUsed"));
		chooseNewUsed.click();
		threadSleep();
		
		WebElement selectMake = webDriver.findElement(By.id("searchVehiclesMake"));
		Select makeDropdown = new Select(selectMake);
		makeDropdown.selectByIndex(1);
		threadSleep();
		
		WebElement selectModel = webDriver.findElement(By.id("searchVehiclesModel"));
		Select modelDropdown = new Select(selectModel);
		modelDropdown.selectByIndex(3);
		threadSleep();
		
		WebElement minPrice = webDriver.findElement(By.id("searchVehiclesPriceFrom"));
		Select minPriceDropdown = new Select(minPrice);
		minPriceDropdown.selectByIndex(2);
		threadSleep();
		
		WebElement maxPrice = webDriver.findElement(By.id("searchVehiclesPriceTo"));
		Select maxPriceDropdown = new Select(maxPrice);
		maxPriceDropdown.selectByIndex(1);
		threadSleep();
		
		WebElement clickSearchButton = webDriver.findElement(By.id("js-search-button"));
		clickSearchButton.click();
		threadSleep();
	}

}
