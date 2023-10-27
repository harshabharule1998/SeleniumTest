package com.autospace.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.autospace.common.BaseClass;

public class LoginPage extends BaseClass {
	
	String usernameLocator = "//input[@id='userName']";
	String passwordLocator = "//input[@id='password']";
	String loginButtonLocator = "//button[@id='login']";
	
	public void enterUsernameAndPassowrd() {
		WebElement userName = driver.findElement(By.xpath(usernameLocator));
		WebElement password = driver.findElement(By.xpath(passwordLocator));
		userName.sendKeys("testauto");
		password.sendKeys("testAuto@123");
	}
	public void submitLoginForm() {
		WebElement loginButton = driver.findElement(By.xpath(loginButtonLocator));

		loginButton.click();
	}
	public void	verifyLoginSuccessfully() {}
}
