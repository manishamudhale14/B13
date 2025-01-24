package seleniumpractices;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownCommingUnderSelect {
public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://omayo.blogspot.com/");
	    	
	    	WebElement singleSelectDropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
	    	
	    	
	    	Select select = new Select(singleSelectDropdown);
	    	
	    	List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
	    	
	    	for(WebElement  option:allSelectedOptions)
	    	{
	    		System.out.println(option.getText());
	    		
	    		System.out.println("######################################################");
	    		
	    		WebElement firstSelectedOption=select.getFirstSelectedOption();
	    		
	    		System.out.println(firstSelectedOption.getText());
	    		
	    		System.out.println("######################################################");
	    		
	    		List<WebElement> allOptionsFromDropdown = select.getOptions();
	    		for(WebElement option1:allOptionsFromDropdown) {
	    			System.out.println(option1.getText());
	    		}
	    		System.out.println("######################################################");
	    		
	    		System.out.println("Multi select allowed = " +select.isMultiple());
	    		
	    		System.out.println("######################################################");
	    		
	    		select.selectByIndex(3);
	    		
	    		Thread.sleep(2000);
	    		
	    		select.selectByValue("def");
	    		Thread.sleep(2000);
	    		select.selectByVisibleText("doc 4");
	    		
	    		System.out.println("####################################################");
	    		
	    		 WebElement multiSelectDropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
	    		
	    		Select select1=new Select(multiSelectDropdown);
	    		
	    		select1.selectByIndex(0);
	    		
	    		select1.selectByValue("Hyundaix");
	    		
	    		select1.selectByVisibleText("Audi");
	    		
	    		
	    		List<WebElement> allSelectedOptions1 = select1.getAllSelectedOptions();
	    		for(WebElement option1:allSelectedOptions1) {
	    			System.out.println(option1.getText());
	    		}
	    		
	    		System.out.println("####################################################");
	    		
               WebElement firstSelectedOption1=select1.getFirstSelectedOption();
	    		
	    		System.out.println(firstSelectedOption1.getText());
	    		
	    		System.out.println("####################################################");
	    		
	    		List<WebElement> allOptionsFromDropdown1 = select.getOptions();
	    		for(WebElement option1:allOptionsFromDropdown1) {
	    			System.out.println(option1.getText());
	    		
	    		
	    		}
	    		
	    		System.out.println("#########################################################");
	    		
	    		
                 System.out.println("Multi select allowed = " +select1.isMultiple());
	    		
	    		System.out.println("######################################################");
	    		
	    		
	    		
	    		
			}
}
}	    		
	    		
	
   	
	    	
	    	
	    	
	    	
	    	
	


