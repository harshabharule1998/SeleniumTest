package SeleniumProject.SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']")).click();
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[1]"));
        List<WebElement> list =dropdown.findElements(By.tagName("option"));
        System.out.println(list.size());
	}

}
