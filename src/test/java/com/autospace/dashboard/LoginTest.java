package com.autospace.dashboard;

import org.testng.annotations.Test;



import com.autospace.pageobject.LoginPage;
import com.autospace.pageobject.ProfilePage;
import com.autospace.pageobject.SearchPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LoginTest  {
	//String driverPath = "C:\\Users\\ASUS\\Downloads\\chromedriver1\\chromedriver.exe";
	String baseUrl = "https://demoqa.com/login";
	LoginPage loginPage;
	ProfilePage profilePage ;
	SearchPage searchPage;
	@BeforeTest
	public void init()
	{
		loginPage = new LoginPage();
		profilePage = new ProfilePage();
		searchPage  = new SearchPage();
		System.out.println("before test");
	}
	//WebDriver driver;
	@Test
	public void login() throws InterruptedException {

		loginPage.launchBrowser(baseUrl);

		loginPage.enterUsernameAndPassowrd();
		loginPage.submitLoginForm();
		loginPage.verifyLoginSuccessfully();
		profilePage.gotoBookStore();
		searchPage.searchByBookTitle("JavaScript");
		searchPage.verifyBookTitle("JavaScript");

		
		Thread.sleep(2000);

		//js.executeScript("arguments[0].scrollIntoView(true);", loginButton);

		

		//WebDriverWait wait = new WebDriverWait(driver,null);	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='gotoStore']")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='gotoStore']")));

	/*	Thread.sleep(5000);


	
*/
	}
	@AfterTest
	public void afterTest() {
		loginPage.quitbrowser();
	}

}
