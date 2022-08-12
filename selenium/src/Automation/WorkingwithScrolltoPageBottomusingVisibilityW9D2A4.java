package Automation;
//import org.openqa.selenium.By;		
//import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.*;		

public class WorkingwithScrolltoPageBottomusingVisibilityW9D2A4 {				
    public static void main(String[] args) throws InterruptedException {									
    		
    	// declaration and instantiation of objects/variables		
    	SafariDriver driver= new SafariDriver();

	//Navigate to web page 
    driver.navigate().to("https://www.netflix.com/sa-en/");
    driver.manage().window().maximize();
	 
     // scroll down by 400 pixels with Javascript Executor
	 JavascriptExecutor js1 = (JavascriptExecutor)driver;
     js1.executeScript("window.scrollBy(0, 400)");
     Thread.sleep(2000);
     
     //Scroll down till the bottom of the page
     JavascriptExecutor js2 = (JavascriptExecutor) driver;
     js2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     Thread.sleep(2000);
     
     JavascriptExecutor js2 = (JavascriptExecutor) driver;
     js2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     Thread.sleep(2000);
   
     
     driver.close();

	
	
	
	
}
}