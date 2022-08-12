package Automation;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenumgride {

	
	selenumgride selenium = new DefaultSelenium(“localhost”, 4444, “*firefox”, “https://www.browserstack.com”);


		DesiredCapabilities capability = DesiredCapabilities.firefox();

	WebDriver driver1 = new FirefoxDriver();

		WebDriver driver = new RemoteWebDriver(new URL("https://localhost:4444/wd/hub"), capability);

}
