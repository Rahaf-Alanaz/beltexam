package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

@Test
public class contain {	
	public void xPath() throws InterruptedException
{

		
		
		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
		
		
		//button register
		driver.findElement(By.xpath("//a[contains(text(),'SAP MM')]")).click();	
		Thread.sleep(5000);
		
		
}
}