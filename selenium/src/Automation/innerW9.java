package Automation;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.WindowType;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class innerW9 {
		
		public WebDriver driver;
		@Test
		
		public void chromepage () throws InterruptedException {
			
		   // Set the path of the Google_Chrome Driver	
		   System.setProperty("webdriver.chrome.driver", "//Users/reham/Desktop/chromedriver");
		   driver =new ChromeDriver ();
	     		
		   // Navigate to the website
		   driver.navigate().to("https://www.zara.com/");  
		   driver.manage().window().maximize();
		   
		   //WindowType to create a new tab is TAB.
		   WebDriver newTab=driver.switchTo().newWindow(WindowType.WINDOW);
		   newTab.get("https://www.facebook.com/");	
		   System.out.println(driver.getTitle());
		   

		   // Enter email/phone number
		   WebElement username = driver.findElement(By.cssSelector("input[name*='email']"));
		   username.sendKeys("rahaf4@gmail.com");
		   Thread.sleep(2000);	
			
		   // Enter the password 
		   WebElement pass = driver.findElement(By.cssSelector("input[name^='pass']"));
		   pass.sendKeys("your password");
		   Thread.sleep(2000);
			
		   // Enter Login 
		   WebElement login = driver.findElement(By.cssSelector("button[type$='submit']"));
		   login.click();
		   Thread.sleep(2000);
			
			
		   driver.quit();	 
	   }
	}


