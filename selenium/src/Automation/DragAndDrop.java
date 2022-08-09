package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

//Use "draganddropby" in any HTML Page

public class DragAndDrop {				

    WebDriver driver;			

    @Test		
    public void DragnDrop()					
    {						
 		SafariDriver driver =new SafariDriver();
         driver.get("http://demo.guru99.com/test/drag_drop.html");					
         
		    //Element which needs to drag.    		
        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));					
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	     //Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();		
      
         
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,250)", "");
         
         
         
         
	}		
}



