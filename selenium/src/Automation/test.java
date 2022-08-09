package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class test {
	
//all assiment week8		

@Test
	public void xPath() throws InterruptedException {

	
	//https://www.perfecto.io/
	//https://www.perfecto.io/free-trial
		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='txtPassword]")).sendKeys("admin123");	
		Thread.sleep(5000);	 
		
		
	//driver.findElement(By.xpath("//input[@id='txtUsername")).sendKeys("Admin");	
		Thread.sleep(5000);	

		
		
		//driver.findElement(By.xpath("//input[@id='txtUsername'  and @name='txtUsername']")).sendKeys("Admin");	

		/*driver.findElement(By.xpath("//input[@id='txtPassword'  or @name='off']")).sendKeys("admin123");	
		Thread.sleep(5000);	 */
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,250)", "");
		
		//driver.findElement(By.xpath("//input[@id='FirstName' or @name='FirstName']")).sendKeys("rah@gmail.com");	
		//Thread.sleep(5000);	
		
		driver.close();
		
		
		//https://demo.guru99.com/test/selenium-xpath.html
	}
}



