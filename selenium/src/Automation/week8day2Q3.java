package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

	
	public class week8day2Q3 {
		

		@Test
			public void xPath() throws InterruptedException {

				SafariDriver	driver =new SafariDriver();
				driver.navigate().to("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&prevRID=2T4S8YD3E0826EZHR0MB&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				//input by id
			    driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("rahaf al3nzi");	
				Thread.sleep(3000);	
			
				//input by name
			    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rahaf@gmail.com");	
				Thread.sleep(3000);	
	
}
}