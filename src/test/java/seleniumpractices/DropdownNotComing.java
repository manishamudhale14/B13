package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownNotComing {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://omayo.blogspot.com/");
		WebElement elm = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		
		elm.click();
		
		Thread.sleep(5000);
		
		List<WebElement> dropdownOptions   = driver.findElements(By.xpath("//div[@id='myDropdown']/a"));
		
		for(WebElement option : dropdownOptions) {
			if(option.getText().equals("Flipkart"));{
				
				option.click();
				
			}
			
		}
		
		
		
		
		
		

	}

}
