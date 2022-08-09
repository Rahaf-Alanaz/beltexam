package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Sameattribute {	
	@Test
	public void xPath() throws InterruptedException
{
	
		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://store.ashley.sa/sfGuardAuthClient/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		
		//multiple attribute 
	
		WebElement lastname = driver.findElement(By.xpath("//input[@name='register[lastname]' and @id='register_lastname' ]"));
	    lastname.sendKeys("alanazi ");
	    Thread.sleep(2000);
		
		
		//By order
		WebElement Email = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
		Email.sendKeys("rahaf@gmail.com");
		Thread.sleep(2000);
		
}
	}
