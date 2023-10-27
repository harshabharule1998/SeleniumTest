package SeleniumProject.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Introduction {

	public static void main(String[] args) {
		
		//invoke driver
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());


	}

}
