package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://omayo.blogspot.com/");
	    	
	    	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
	    	
	    	//how to scroll vertically horizontally by using pixels
	    	
	    	//javascriptExecutor.executeScript("window.scrollBy(0,1000)", "");
	    	
	    	//Thread.sleep(2000);
	    	
	    	//javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");
	    	
	    	//Thread.sleep(2000);
	    	
	    	//javascriptExecutor.executeScript("window.scrollBy(100,0)", "");
	    	
	    	//Thread.sleep(2000);
	    	
	    	//javascriptExecutor.executeScript("window.scrollBy(-100,0)", "");
	    	
	    	//javascriptExecutor.executeScript("window.scrollBy (0,document.body.scrollHeight)");
	    	
	    	//Thread.sleep(2000);
	    	
	    	//javascriptExecutor.executeScript("window.scrollBy (document.body.scrollWidth, 0)");
	    	
	    	Thread.sleep(2000);
	    	
	    	javascriptExecutor.executeScript("arguments[0].scrollIntoView();",
	    			driver.findElement(By.xpath("//button[@value='LogIn']")));
	    	
	    	javascriptExecutor.executeScript("arguments[0].click();",
	    			driver.findElement(By.xpath("//a[text()='Open a popup window']")));
	    	
	    	
	    	

	}

}
