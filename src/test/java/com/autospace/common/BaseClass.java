package com.autospace.common;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	String driverPath = "E:\\chromedriver.exe";
    public static WebDriver driver;
    
    public void launchBrowser(String baseUrl)
    {
    	System.setProperty("webdriver.chrome.driver",driverPath);  
		driver =  new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get(baseUrl);

		
    }
    
    public void clickByJavascript(WebElement element) throws InterruptedException
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);	
		Thread.sleep(1000);	
		element.click();
    }
    
    public void quitbrowser() {
    	driver.quit();
    	System.out.println("Browser quit");
    }
   
}
