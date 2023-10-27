package com.autospace.dashboard;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.autospace.common.BaseClass;

public class Homepage extends BaseClass {

	//String driverPath = "C:\\Users\\ASUS\\Downloads\\chromedriver1\\chromedriver.exe";
	String baseUrl = "https://www.javatpoint.com/";
   // WebDriver driver;
    
	@Test
	public void verifyPageTitle() {

	
		launchBrowser(baseUrl);
		String pageTitle = driver.getTitle();
		String expectedTitle ="Tutorials List - Javatpoint";
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, expectedTitle);
	}
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
	
}
