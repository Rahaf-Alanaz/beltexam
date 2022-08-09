package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class W9D3AS1{
public WebDriver driver;
	
	
	@Test
	public void xPath() throws InterruptedException
	{
		SafariDriver driver =new SafariDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/login.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
	

	
    ///enter the User Name///
	WebElement userName=driver.findElement(By.cssSelector("input[name=userName]"));
	userName.sendKeys("rahaf-alanazi");
	Thread.sleep(2000);
	
			
    ///enter the password ///
	WebElement password=driver.findElement(By.cssSelector("input[name=password]"));
	password.sendKeys("1231234");
	Thread.sleep(2000);
	
	
    ///enter the Submit ///
	WebElement Submit=driver.findElement(By.cssSelector("input[value='Submit']"));
	Submit.click();
	Thread.sleep(3000);
	
    driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*			SafariDriver	driver =new SafariDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);	
		
		
	
		
        ///enter the email PhoneNumber///
		WebElement emailPhoneNumber=driver.findElement(By.cssSelector("input[name='email']"));
		emailPhoneNumber.sendKeys("Tester");
		Thread.sleep(2000);
		

				
        ///enter the password ///
		WebElement password=driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys("Bester");
		Thread.sleep(2000);
		
		
		
        ///enter the login ///
		WebElement login=driver.findElement(By.cssSelector("button[value='1']"));
		login.click();
		Thread.sleep(3000);
		
		
	    driver.close();
*/
		
	}
	
}