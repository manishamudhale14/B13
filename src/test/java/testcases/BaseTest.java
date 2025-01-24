package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Util.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void setUp()
	{
		browserUtil(Utilities.getProperty("browser"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(Utilities.getProperty("timeout"))));
		driver.get(Utilities.getProperty("url"));
		
	}
		
		public static WebDriver  browserUtil(String browser) {
			WebDriver driver = null;
			if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			if(browser.equalsIgnoreCase("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			return driver;
		
	}
	@AfterMethod(alwaysRun= true)
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
