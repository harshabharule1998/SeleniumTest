package com.autospace.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.autospace.common.BaseClass;

public class ProfilePage extends BaseClass{

	String bookStoreButton = "//button[@id='gotoStore']";
	public void gotoBookStore() throws InterruptedException {
		WebElement bookstoreButton = driver.findElement(By.xpath(bookStoreButton));
		clickByJavascript(bookstoreButton);
		Thread.sleep(5000);
	}
}
