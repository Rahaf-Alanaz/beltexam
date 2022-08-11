package Automation;

import java.net.MalformedURLException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class RemoteWebDriverW10 {

	/* Create a Firefox DesiredCapabilities Object*/
	 DesiredCapabilities firefoxDC = DesiredCapabilities.firefox();
	 /* Create Remote Web Driver object to communicate to Selenium Grid Hub*/
	 WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxDC);
	
	
	 
	 @BeforeClass
	 /* Create and initiate a Firefox web browser and maximize it. */
	 public static void initiate() throws MalformedURLException {
	 /* Create a DesiredCapabilities object which required a Selenium 
	    Grid Node that can run Firefox. */
	 DesiredCapabilities firefoxDC = DesiredCapabilities.firefox();
	 
	 /* Connect to the Selenium Grid Hub server with the capabilities object, 
	   Selenium Grid Hub will transfer the request to a Node that matches the capabilities. In this example, Selenium Grid Hub run on the local machine,
	   You can replace the localhost to your machine IP to run it on any machine as you like. */
	 driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxDC);
	 
	 /* Maximize the Firefox web browser window on the Selenium Grid Node. */
	 driver .manage().window().maximize();
	 }
	 
	 @Test
	 /* Verify Yahoo home page title use Firefox web browser on one of the 
	    Nodes. Actions in bellow java code will be run in 
	    Selenium Grid Hub selected Node that matches the capabilities you 
	    desired in initiate() method.
	 */
	 public void verifyYahooPageTitle() {
	 System.out.println("*** Browse yahoo home page ***");
	 /* Go to the yahoo home page. */
	 driver.navigate().to(appURL);
	 
	 /* Get Yahoo homepage title. */
	 String strPageTitle = driver.getTitle();
	 System.out.println("*** Verifying yahoo homepage title ***");
	 
	 /* Check whether the home page title match or not. */
	 Assert.assertTrue("Home Page title unmatch.", strPageTitle.equalsIgnoreCase("Yahoo"));
	 
	 System.out.println("*** Yahoo homepage title match. ***");
	 }
	 
	 @AfterClass
	 /* Quit and close the Firefox Web Browser after run the test. */
	 public static void quit() {
	 /* Quit and close Web Browser in the Selenium Grid Node 
	    if the driver is not null. */
	 if (driver != null) {
	 driver.quit();
	 }
	 }  
     }
