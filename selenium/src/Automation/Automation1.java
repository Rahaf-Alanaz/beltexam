package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Automation1 {
	
//all assiment week8		

@Test
	public void xPath() throws InterruptedException {

		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://login.salesforce.com/?locale=eu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//input by class
		   driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).submit();	
			Thread.sleep(3000);	
		
		
		
		//input by id
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rah@gmail.com");	
		Thread.sleep(3000);	
	
		//input by name
	    driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("12345678");	
		Thread.sleep(3000);	
	
		
		

		//input by LinkText
	   driver.findElement(By.xpath("//a[text()[normalize-space(.)='Forgot Your Password?']]")).click();	
		Thread.sleep(5000);
		
		// //*[@id="loginPanel"]/p[2]/a
		
		
		driver.close();
	}
}
