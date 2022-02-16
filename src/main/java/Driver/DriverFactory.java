package Driver;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

	public static WebDriver pegaDriver() {
		if (webDriver.get()==null) {
			webDriver.set(criarDriver());
		}
		return webDriver.get();
	}
	public static WebDriver criarDriver()   {
		WebDriver driver = null;


		switch (pegaTipoBrowser()) {

		case "chrome": {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			ChromeOptions chormeoptions = new ChromeOptions();
			chormeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new ChromeDriver(chormeoptions);
			break;
		}
		case "firefox": {
		
			System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
			FirefoxOptions firefoxoptions = new FirefoxOptions();
			firefoxoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new FirefoxDriver(firefoxoptions);
			break;
		}

		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static String pegaTipoBrowser()  {
		String browserTipo=null;
	
		try {
			
			Properties properties = new Properties();
			FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"/src/main//java/properties/config.properties");
			properties.load(file);
			browserTipo= properties.getProperty("browser").toLowerCase().trim();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		return browserTipo;
	
	
	}
	
	public static void limpaDriver() {
		webDriver.get().quit();
		webDriver.remove();
	} 

}
