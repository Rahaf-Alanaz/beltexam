package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

@Test
public class containwithandor {	
	public void xPath() throws InterruptedException
{

		
		
		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
		
		
		//button register
		driver.findElement(By.xpath("//input[contains(@id,'txtUsername') and contains(@name,'txtUsername')]"))
		.sendKeys("RAHAF@gmail.com");	
	Thread.sleep(3000);	
		
		
	
	
	
	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class invokechromedriver {

		public ChromeDriver driver; 

		
			
			@Test
			public void Chromepage() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\selunume-j\\chromedriver_win32\\chromedriver.exe");
				ChromeDriver driver =new ChromeDriver();
				driver.navigate().to("https://www.facebook.com");
				

			     // Type in email
			     driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("maialshamsi.ksaksa@gmail.com");//by class
			     Thread.sleep(1000);
			     
			    // Type in password input
			     driver.findElement(By.cssSelector("input#pass")).sendKeys("r");//by id
			     Thread.sleep(1000);
			   
			   //Typr in login button
			     driver.findElement(By.cssSelector("button[id*='u_0_5']")).click(); //by start
			     Thread.sleep(1000); 	    
				    	    
	}
	}
}
}



