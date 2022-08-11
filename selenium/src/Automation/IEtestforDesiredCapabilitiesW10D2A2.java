package Automation;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.safari.SafariDriver;

	public class IEtestforDesiredCapabilitiesW10D2A2 {
	  
	 public static void main(String[] args) {

	//it is used to define IE capability 
	 DesiredCapabilities capabilities = DesiredCapabilities.SafariDriver();
	  
		SafariDriver driver =new SafariDriver();

	 
	 
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
	capabilities.setCapability(InternetExplorerDriver.
	  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);


	System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
	  
	 //it is used to initialize the IE driver
	 WebDriver driver = new SafariDriver(capabilities);
	  
	 driver.manage().window().maximize();

	 driver.get("http://gmail.com");
	  
	 driver.quit();
	 }
	  
	}
	
	

