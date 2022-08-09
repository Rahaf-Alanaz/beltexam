package Automation;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

	
	public class Week9D2 {
		

		@Test
			public void xPath() throws InterruptedException {

				SafariDriver driver =new SafariDriver();
				driver.navigate().to("https://www.tutorialspoint.com/about/about_careers.htm");
				Thread.sleep(2000);
				
				
      //String u = "https://www.tutorialspoint.com/about/about_careers.htm"driver.get(u);
      
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      // identify element
      WebElement t=driver.findElement(By.xpath("//img[@class='tp-logo']"));
      // get src attribute with getAttribute()
      System.out.println("Src attribute is : " + t.getAttribute("src"));
      driver.close();
   }
}