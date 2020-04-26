package Com.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;

public class Browsers {
	
	WebDriver driver;
	Steps steps = new Steps();



		@Parameters("browser")
		@Test
		public WebDriver getBrowsers(String browser) 
		{
			try
			{
			
			if (browser.equalsIgnoreCase("FF"))
			{
				/*String myProxy = "10.10.17.25:3128";  //example: proxy host=localhost port=7777
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.PROXY,
				                           new Proxy().setHttpProxy(myProxy));				
				//System.setProperty("webdriver.firefox.marionette", "E:\\GP\\Selenium Jars\\geckodriver.exe");
				driver = new FirefoxDriver(capabilities);
				*/
				
				driver = new FirefoxDriver();
			}			
			else if (browser.equalsIgnoreCase("IE"))
			{
				driver = new InternetExplorerDriver();	
			}		
			else if (browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "E:\\F\\ESIC\\Automation\\TestingPurpose\\Resources\\geckodriver.exe");
				driver = new ChromeDriver();
			}
			
			else
			{
				System.out.println("Invalid Browser");
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//driver.manage().timeouts().setScriptTimeout(90, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			//driver.manage().setSpeed(Speed.SLOW);
			
			//Selenium.setSpeed("2000");
			
			
		}
			
			
			catch (Exception e)
			{
				System.out.println("Not able to Open Browser");
				
				steps.logger("Browser","getBrowsers", "Not able to Open Browser : :" + e);

			}
			return driver;
}
}
