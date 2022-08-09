package Automation;
//import java.time.Duration;
import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
@Test
public class WorkingwithkeyUpandkeyDownW9 {	
	public void xPath() throws InterruptedException
{
		
		String Xpathint;
SafariDriver driver =new SafariDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		// ass2 W9 D4  Working with web Crawler using Selenium
		
		driver.findElement(By.name("q")).sendKeys("codindojo");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);	
		
	// this for will mover to next page antell arive to  search page 4
		
		for( int i = 1 ; i < 5 ; i++ ) {
		      if(i>1) {

					Xpathint ="//a[@class='fl' and  text()='"+i+"']";
					
				    driver.findElement(By.xpath(Xpathint)).click();
				 
				     Thread.sleep(2000);	

		    	  
             }
	
		  }
	
		}
      }	    
		
		
      //String url = "https://www.tutorialspoint.com/index.htm";
      //driver.get(url);
      
     /*
      // identify element
     driver.findElement(By.id("search-strings")).sendKeys("hello");
      // Actions class
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     // identify element
     WebElement l = driver.findElement(By.id("gsc-i-id1"));
     // Actions class
     Actions a = new Actions(driver);
     // moveToElement() and then click()
     a.moveToElement(l).click();
     //enter text with keyDown() SHIFT key ,keyUp() then build() ,perform()
     a.keyDown(Keys.SHIFT);
     a.sendKeys("hello").keyUp(Keys.SHIFT).build().perform();
     driver.quit();
      */
 
