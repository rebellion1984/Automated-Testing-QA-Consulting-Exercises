package com.autotrader.autotraderwebtesting.AutoTraderTestProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebSite {
	
	String url = "https://www.autotrader.co.uk/";
	 WebDriver webDriver;
	
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
		String url = "https://www.autotrader.co.uk/";
		webDriver.get(url);
	}

}
