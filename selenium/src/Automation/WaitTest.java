package Automation;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitTest {

private WebDriver driver;
private String baseUrl;
private WebElement element;

@BeforeMethod
public void setUp() throws Exception {
driver = new SafariDriver();
baseUrl = "http://www.google.com";
Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Test
public void testUntitled() throws Exception {
driver.get(baseUrl);
element = driver.findElement(By.id("lst-ib"));
element.sendKeys("Selenium WebDriver Interview questions");
element.sendKeys(Keys.RETURN);
List<WebElement> list = driver.findElements(By.className("_Rm"));
System.out.println(list.size());

}

@AfterMethod
public void tearDown() throws Exception {
driver.quit();
}
}




/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

@Test
public class xpath {	
	public void xPath() throws InterruptedException
{
/*
		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://login.aramco.com/vpn/tmindex.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
		*/
		
		

	
		//sendkay example
		/*WebElement LoanAmount= driver.findElement(By.name("Loan_Amount"));
		LoanAmount.sendKeys("500000");
		Thread.sleep(5000);

		//clear example
		WebElement LoanAmount1 = driver.findElement(By.name("Loan_Amount"));
		LoanAmount1 .clear();
		Thread.sleep(5000);

		//getting and print value
		WebElement fullname = driver.findElement(By.id("Loan_Amount"));
		
		
		//button register
		/*driver.findElement(By.xpath("//*[@id='Enter user name']//following::input[1]")).click();	
		Thread.sleep(5000); */
		
	/*
	SafariDriver	driver =new SafariDriver();
	driver.navigate().to("https://login.aramco.com/vpn/tmindex.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);	

	*/
		
		
		
		

		







//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("rahaf");	
//Thread.sleep(3000);	


//forgetting password link
 //driver.findElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']")).click();	
	//Thread.sleep(5000);


//a[@href='/index.php/auth/requestPasswordResetCode']