package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

@Test
public class Absoluteweek8day4Q4 {	
	public void xPath() throws InterruptedException
{

		SafariDriver	driver =new SafariDriver();
		driver.navigate().to("https://www.tools4testing.com/contents/selenium/absolute-xpath-in-selenium");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
	
		
		driver.findElement(By.xpath("html/body/table/tr[1]/td[1]|html/body/table/tr[2]/td[1]"));	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/table/tr[1]/td[1]|html/body/table/tr[2]/td[1]"));	
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"leftSideBarTemplate\"]/div[1]/ul/li[2]/ul/li[1]/span/a")).click();	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/table/tr[1]|html/body/table/tr[2]/td[1]\n"+ ""));
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/table/tr[1]|html/body/table/tr[2]/td[2]"));	
		Thread.sleep(5000);
	
		
		
		//button register
				/*driver.findElement(By.xpath("")).click();	
				Thread.sleep(5000);*/
		
}
}