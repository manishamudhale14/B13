package seleniumpractices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleWidows {

	
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://omayo.blogspot.com/");
	    	
	    	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	    	 
	    	String currentlyFocusedWindowHandle = driver.getWindowHandle();
	    	
	    	Set<String> windowHandles = driver.getWindowHandles();
	    	
	    	for(String handle:windowHandles) {
	    	
	    	if(handle!=currentlyFocusedWindowHandle) {
	    		
	    		driver.switchTo().window(handle);
	    		
	    	}
	    	
	    	
	    	} 	  	
	    	String titleOfNewWindow = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
	    	
	    	System.out.println(titleOfNewWindow);
	    	
	    	driver.close();
	    	
	    	driver.switchTo().window(currentlyFocusedWindowHandle);
	    	
	    	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Codemind");
	    	
	    	driver.quit();
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	

	}

}
