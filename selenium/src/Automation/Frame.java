package Automation;


import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Frame {

static WebDriver driver;

@Test
public void Test(){
	SafariDriver driver =new SafariDriver();
driver.get("http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
//identifying the frame using locator or say using webelement
driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='eduFooterWrap']//iframe[1]")));
driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SoftwareTestingHelp.com");
} 
}
