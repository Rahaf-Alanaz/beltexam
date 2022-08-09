package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

@Test
public class XPathTextFunctionwwek8day4Q2 {	
	public void xPath() throws InterruptedException
{

		
		SafariDriver driver =new SafariDriver();
		driver.navigate().to("https://www.codingdojo.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();	
		Thread.sleep(5000);
		
		
		
		/*SafariDriver driver =new SafariDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);	*/
	
		
		//TEXT()
	/*driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();	
		Thread.sleep(5000);*/
		
		
		
		
		//a[starts-with(     

				/*driver.findElement(By.xpath("//img[starts-with(@alt ,'LinkedIn OrangeHRM group')]")).click();	
				Thread.sleep(5000);*/
		
				
				
				
				
				
				
		
		
		
		 
		
		
		//AbsolutValu 
	
		/*driver.findElement(By.xpath("//html/body/div[1]/div/div[5]/div[2]/a[1]/img")).click();	
		Thread.sleep(5000);*/
		
		
}



}