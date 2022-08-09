package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

@Test
public class AbsoluteXPath {	
	public void xPath() throws InterruptedException
{

		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
		
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//<a href="register.htm;jsessionid=F491201E836C555C5FBA715E030E1BA6">Register</a>
	       // driver.findElement(By.linkText("Register")).click();					
	       // System.out.println( driver.getTitle());							
	      //  driver.close();	
		
		
		
		
		//Relative
		//relative
				//driver.findElement(By.xpath("{//a[@class='login')[4]")).click();	
				//driver.manage().window().maximize();
				//Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("//a[text()[normalize-space(.)='login']]")).click();	
		//Thread.sleep(5000);
		
		
		
}



}