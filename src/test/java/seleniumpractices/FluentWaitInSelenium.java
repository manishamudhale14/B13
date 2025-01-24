package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
    	driver.get("https://omayo.blogspot.com/");
    	
    	WebElement delayedText = driver.findElement(By.cssSelector("#delayedText"));
    	
    	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(11))
    			.ignoring(TimeoutException.class)
    			.pollingEvery(Duration.ofMillis(100));
    	
    	System.out.println("Element visible before explicit = "+delayedText.isDisplayed());
    	
        wait.until(ExpectedConditions.visibilityOf(delayedText));
        
        System.out.println("Element visible before explicit = "+delayedText.isDisplayed());
        

	}

}
