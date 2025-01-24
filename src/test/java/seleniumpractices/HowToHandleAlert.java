package seleniumpractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleAlert {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://omayo.blogspot.com/");
	    	
	    	driver.findElement(By.cssSelector("input#prompt")).click();
	    	
	    	Alert alt = driver.switchTo().alert();
	    	
	    	 String s = alt.getText();
             alt.sendKeys("Codemind");
             System.out.println(s);
             alt.accept();
             
              //alt.dismiss();
              
              driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome to codemind");
              
	}

}
