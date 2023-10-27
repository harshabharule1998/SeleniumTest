package SeleniumProject.SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		List<WebElement> list=driver.findElements(By.tagName("iframe"));//no of frames present in webpage
		System.out.println(list.size());
		//1st method
//		driver.switchTo().frame(0);
//		WebElement element = driver.findElement(By.xpath("//*[@id='draggable']"));
//		System.out.println(element.getText());
//		driver.switchTo().defaultContent();// from where its call, it will calling back a webpage 
//		WebElement pageElement=driver.findElement(By.xpath("//*[@id='content']/h1"));
//		System.out.println(pageElement.getText());
		
		//2nd method
		WebElement frame =driver.findElement(By.xpath("//*[@id='content']/iframe"));
		System.out.println(frame.getText());
	}

}
