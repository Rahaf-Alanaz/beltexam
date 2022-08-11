package W10;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HowToRunestCasesInSeleniumGridW10 {

	/* Create a Firefox DesiredCapabilities Object*/
	 DesiredCapabilities firefoxDC = DesiredCapabilities.firefox();
	 /* Create Remote Web Driver object to communicate to Selenium Grid Hub*/
	 WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxDC);
	
	
	
	
	
	
	
}
