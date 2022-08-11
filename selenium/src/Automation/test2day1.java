
package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test2day1 {
@Test
public void xPath() throws InterruptedException {

SafariDriver	driver =new SafariDriver();

driver.navigate().to("https://login.codingdojo.com/login");
driver.manage().window().maximize();
Thread.sleep(2000);

driver.findElement(By.name("email")).sendKeys("rabab.a1@gmail.com"); 
Thread.sleep(3000); 

driver.findElement(By.name("password")).sendKeys("123442356"); 
Thread.sleep(3000); 

driver.findElement(By.className("btn btn-primary")).click(); 
Thread.sleep(3000); 


WebElement error =driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/form/div[1]/p")); 
Thread.sleep(3000); 
boolean e = error.isDisplayed();
System.out.println("error massage"+e);
String r =  error.getText();
System.out.println("error massage"+r);

Assert.assertEquals(e, "User not found in our database. Make sure your application was accepted");
driver.close();

}



}
