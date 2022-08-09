package Automation;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ImplicitandExlicitWEEK9D1Discotion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		SafariDriver driver =new SafariDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
	//Verifying Whether a Button is Enabled or Disabled Q3 WEEK9
				
		String url =
			      "https://www.tutorialspoint.com/tutor_connect/index.php";
			      // to verify if a static dropdown is selected with option isSelected()
			      boolean drpdwnStatus = driver.findElement(By.xpath("//select[@name=’selType’]"))
			      .isSelected();
			      // to verify if an element is present on page with isDisplayed()
			      boolean editStatus = driver.findElement(By.xpath("//input[@id=’txtSearchText’]"))
			      .isDisplayed();
			      // to verify if a button is enabled with isEnabled()
			      boolean butnStatus = driver.findElement(By.xpath("//input[@id=’searchSubmit’]"))
			      .isEnabled();
			      System.out.println("The button status is " + butnStatus);
			      System.out.println
			      ("The dropdown selected status is" + drpdwnStatus);
			      System.out.println("The edit box display status is " + editStatus);
			      driver.close();
			   }
		
		/*
		//FIRST COODE How to Return Key after Entering a Value in Text
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com"); 
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Rinu Rajan");
        element.submit();
	  driver.quit();
                  
                 
                  /Secand COODE How to Return Key after Entering a Value in Text
		driver.get("https://www.tutorialspoint.com/index.htm");
	      // identify element
	      WebElement m=driver.findElement(By.id("gsc−i−id1"));
	      m.sendKeys("Java");
	      // type enter with sendKeys method and pass Keys.RETURN
	      m.sendKeys(Keys.RETURN);
	      driver.quit();	
                  
                  
        /*	
		//launching the specified URL
		driver.get("https://www.google.com/");

		//Locating the elements using name locator for the text box
		driver.findElement(By.name("q")).sendKeys("YouTube");

		//name locator for google search button
         driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
         
         driver.findElement(By.name("abdc")).click();
         
        driver.close();
         driver.quit();
         
		*/
		
		
		
		
		
		
		
	}

	
	


