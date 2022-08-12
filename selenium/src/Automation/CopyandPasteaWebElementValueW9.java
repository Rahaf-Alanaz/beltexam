package Automation;

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import org.openqa.selenium.safari.SafariDriver;

	import com.google.common.collect.Iterables;



	public class CopyandPasteaWebElementValueW9 {

		public ChromeDriver driver; 

		@SuppressWarnings("deprecation")
			
			@Test
			public void Chromepage() throws InterruptedException {
			
				SafariDriver driver = new SafariDriver();
				driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-safari-driver");
				
				
				driver.manage().window().maximize();
			     
			     // Find the table element using xpath
			     WebElement table = driver.findElement(By.xpath("(//table[@width='100%'])[2]"));

			     // Go through each major version
			     List<WebElement> mainVersions = table.findElements(By.tagName("tbody"));

			     for(WebElement mver: mainVersions) {
			         for(WebElement ver: mver.findElements(By.tagName("tr"))) {
			             // Get all anchor tags
			             List<WebElement> attributes = ver.findElements(By.tagName("a"));

			             // Find each relevant web element that contains required information
			             WebElement version = attributes.get(0);
			             WebElement repository = attributes.get(1);
			             WebElement usages = attributes.get(2);
			             WebElement date = Iterables.getLast(ver.findElements(By.tagName("td")));

			             System.out.println("Version    : " + version.getText());
			             System.out.println("Repository : " + repository.getText());
			             System.out.println("Usages     : " + usages.getText());
			             System.out.println("Date       : " + date.getText());
			             System.out.println("------------------------------");
			         }}

			     // Close driver
			     driver.quit();  
			            	    
				
				
			   	    
			}
	}
