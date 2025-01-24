package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleFrame {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://omayo.blogspot.com/");
	    	
	    	//driver.switchTo().frame(0);
	    	
	    	//driver.switchTo().frame("navbar-iframe");
	    	
	    	WebElement frame=driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
	    	
	    	driver.switchTo().frame(frame);
	    	
	    	driver.findElement(By.xpath("//input[@id='b-query']")).sendKeys("Codemind");
	    	
	    	driver.switchTo().defaultContent();
	    	
	    	driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome to codemind");
	    	
	    	driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("Welcome to codemind");
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	

	}

}
