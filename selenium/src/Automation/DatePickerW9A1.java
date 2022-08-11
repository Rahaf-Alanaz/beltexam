package Automation;

import java.time.Duration;
//import java.util.Calendar;
import java.util.List;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePickerW9A1 {
    String year = "2021";
    String month = "April";
    String day = "15";
    
	@Test
	public void datepicker() throws InterruptedException{

		SafariDriver driver =new SafariDriver();
	      
	      driver.get("https://jqueryui.com/datepicker/#date−range");
	      // wait of 4 seconds
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      // maximize browser
	      driver.manage().window().maximize();
	      // identify frame and switch to it
	      WebElement e = driver.findElement(By.xpath("//*[@id='content']/iframe"));
	      driver.switchTo().frame(e);
	      // choose from date
	      driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	      Thread.sleep(1000);
	      // choose month and Year
	      String monthYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	      while(!monthYear.equals(month+" " +year)){
		      System.out.println("B: "+monthYear);
		      driver.findElement(By.cssSelector(".ui-datepicker-prev.ui-corner-all")).click();
		
		     monthYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	      }
	      List<WebElement> days = driver.findElements(By.className("ui-state-default"));

	      System.out.println("D: "+days.size());

	      for(WebElement da:days) {
	    	  if(da.getText().equals(day)) {
			      System.out.println("D1: "+da.getText());

	    		  da.click();
	    		  break;
	    	  }
	      }

	   }
}