package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

@Test
public class Relative {	
	public void xPath() throws InterruptedException
{

		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://letcode.in/test");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
	
		
		driver.findElement(By.xpath("//a[text()='Dialog']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
}
	}
