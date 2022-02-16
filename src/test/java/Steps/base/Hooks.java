package Steps.base;

import static Driver.DriverFactory.pegaDriver;

import java.sql.Timestamp;

import static Driver.DriverFactory.limpaDriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
//import io.cucumber.messages.types.Timestamp;


public class Hooks {
	
	//public WebDriver driver;
		
		@Before()
		public void setup()  {
			pegaDriver();
		}
		
		@AfterStep
		public void capituraImagemPasso(Scenario scenario){
			if (scenario.isFailed()) {
				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				String timeMillieseconds= Long.toString(timestamp.getTime());
			
				byte[] screenshot = ((TakesScreenshot)pegaDriver()).getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(screenshot, "image/png", timeMillieseconds);
			}
		}
		
		@After()
		public void tearDown() {

			//limpaDriver();
		}
}
