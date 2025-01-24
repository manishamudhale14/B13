package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadInSelenium {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://omayo.blogspot.com/");
	    	
	    	WebElement fileUploader = driver.findElement(By.xpath("//input[@id='uploadfile']"));
	    	
	    	fileUploader.sendKeys("C:/Users/hunde/Downloads/8.CC Data NOV 24.xlsx");
	}

}
