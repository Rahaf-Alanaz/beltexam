package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

@Test
public class containwithandor {	
	public void xPath() throws InterruptedException
{

		
		
		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
		
		
		//button register
		driver.findElement(By.xpath("//input[contains(@id,'txtUsername') and contains(@name,'txtUsername')]")).sendKeys("RAHAF@gmail.com");	
		Thread.sleep(3000);	
		
		
}
}