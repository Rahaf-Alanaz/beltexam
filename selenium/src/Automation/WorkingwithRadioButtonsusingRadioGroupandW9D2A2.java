    package Automation;
	import org.openqa.selenium.By;		
	//import org.openqa.selenium.WebDriver;		
	import org.openqa.selenium.safari.SafariDriver;
	import org.openqa.selenium.*;		

	public class WorkingwithRadioButtonsusingRadioGroupandW9D2A2 {				
	    public static void main(String[] args) throws InterruptedException {									
	    		
	    	// declaration and instantiation of objects/variables		
	    	SafariDriver driver= new SafariDriver();
	    

	          driver.get("http://demo.guru99.com/test/radio.html");	
	 
	        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
	        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
	        		
	        //Radio Button1 is selected		
	        radio1.click();			
	        System.out.println(" Option 1 Selected");					
	        		
	        //Radio Button1 is de-selected and Radio Button2 is selected		
	        radio2.click();			
	        System.out.println("R Option 2 Selected");					
	        		 
			Thread.sleep(3000);	
	       			
			driver.close();		
	        		
	    }		
	}



