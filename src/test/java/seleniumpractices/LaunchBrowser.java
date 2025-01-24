package seleniumpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("Webdriver.chrome.driver","src/test/java/seleniumpractices/LaunchBrowser.java");
		
		
		// WebDriverManager.edgedriver().setup();
	    // WebDriver driver = new EdgeDriver();
	    //driver.get("https://www.google.com");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.quit();
       
	}

}
