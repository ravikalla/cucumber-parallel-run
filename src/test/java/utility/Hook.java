
package utility;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Hook {
	
	
	   private static Hook instance = new Hook();
	
	   public static Hook getInstance()
	   {
	      return instance;
	   }
	   
		public  WebDriver createNewDriver(){
			
				   	  		WebDriver driver = null;
				   	  		DesiredCapabilities cap = null;
				   	  		cap = DesiredCapabilities.chrome();
							System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WorkSpace\\CucumberFramework-master\\drivers\\chromedriver.exe");
							ChromeOptions options = new ChromeOptions();
							//options.addArguments("no-sandbox");
							//options.addArguments("start-maximized");
							//options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation")); 
							driver = new ChromeDriver(options);
							//ManagerDriver.getInstance().setWebDriver(driver);
							return driver;
							
			   }
}
