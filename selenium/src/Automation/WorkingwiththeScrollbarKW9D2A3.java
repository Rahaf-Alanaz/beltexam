package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WorkingwiththeScrollbarKW9D2A3 {

	public class Scrollbar {
		
		public WebDriver driver;
		@Test
		
		public void chromepage () throws InterruptedException {
			
		
	    // Set the path of Chrome_Driver
			SafariDriver driver =new SafariDriver();
	    
	    // Navigate to web page 
	    driver.navigate().to("https://www.uopeople.edu/blog/punctuation-marks/");
	    driver.manage().window().maximize();
	    
	    // Page Down
	    Actions act = new Actions(driver);
	    act.sendKeys(Keys.PAGE_DOWN).build().perform();
	    System.out.println("Scroll down perfomed");
	    Thread.sleep(2000);
	    
	    // Page Up
	    act.sendKeys(Keys.PAGE_UP).build().perform();       
	    System.out.println("Scroll up perfomed");
	    Thread.sleep(2000);
	    
	    // will take me to the bottom of the page
	    driver.findElement(By.tagName("body")).sendKeys(Keys.END);  
	    Thread.sleep(2000);
	     
	    driver.close();
	  }}

	
	
	
	
}
