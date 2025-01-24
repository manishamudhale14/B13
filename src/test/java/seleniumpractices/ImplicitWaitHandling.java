package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitHandling {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://omayo.blogspot.com/");
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	
	    	driver.findElement(By.xpath("//button[@id='3454355345fg']"));

	}

}
