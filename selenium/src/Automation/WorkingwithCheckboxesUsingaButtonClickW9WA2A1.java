package Automation;
import org.openqa.selenium.By;		
//import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.*;		

public class WorkingwithCheckboxesUsingaButtonClickW9WA2A1 {				
    public static void main(String[] args) throws InterruptedException {									
    		
    	// declaration and instantiation of objects/variables		
    	SafariDriver driver= new SafariDriver();
    

          .get("http://demo.guru99.com/test/radio.html");	
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		driver
         
		Thread.sleep(3000);	

            	
       			
		driver.close();		
        		
    }		
}
