package Automation;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class CSSSelectorusingStartsWithEndsWithContains {
		public WebDriver driver;
	@Test
	 public void chromepage() throws InterruptedException  {
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\seham\\Desktop\\SU\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.navigate().to("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     WebElement hindi =driver.findElement(By.cssSelector("a._sv4[title='Hindi']"));
	     hindi.click();    	    
	}
	}


