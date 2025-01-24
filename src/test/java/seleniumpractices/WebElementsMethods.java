package seleniumpractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
	    	driver.get("https://omayo.blogspot.com/");
	    	
	    WebElement textAreaField2 =driver.findElement(By.xpath("//textarea[@cols='30']"));
	    
	 //   If this element is a form entry element, this will reset its value.
	    
	    	textAreaField2.clear();
      
	    	Thread.sleep(1000);

      //Use this method to simulate typing into an element, which may set its value. 

	    	textAreaField2.sendKeys("Welcome to codemind");
	    	
	    	Thread.sleep(1000);
	    	
	    	textAreaField2.clear();
	    	
	    	//Get the value of the given attribute of the element.
	    	String colsValue = textAreaField2.getAttribute("cols");
	    	System.out.println("cols attribute value = " + colsValue);
	    	
	    	
	    	
	    	
	    	File textAreaField2Screenshot =textAreaField2.getScreenshotAs(OutputType.FILE);
	    	
	    	FileUtils.copyFile(textAreaField2Screenshot, new File("src/main/resources/test.png"));
	    	
	    	//Get the tag name of this element.
	         String tagName = textAreaField2.getTagName();
	    	System.out.println("Tag name = "+ tagName);
	    	
	    	 WebElement button1 = driver.findElement(By.cssSelector("#but1"));
	    	 
	    	 System.out.println(button1.getText());
	    	 
	    	 //Is this element displayed or not
	    	 System.out.println("textarea2 is displayed =" +textAreaField2.isDisplayed());
	    	 System.out.println("button1 is displayed =" + button1.isDisplayed());
	    	 Thread.sleep(25000);
	    	 WebElement hiddenElement=driver.findElement(By.cssSelector("*[id='deletesuccess']"));
	    	 System.out.println("hiddenElement is displayed = " + hiddenElement.isDisplayed());
	    	 
	    	 System.out.println("textArea Field is enabled = " + textAreaField2.isEnabled());
	    	 
	    	 System.out.println("button1 is enabled = " +button1.isEnabled());
	    	 
	    	 WebElement  maleRadioBtn = driver.findElement(By.cssSelector("input#radio1"));
	    	 
	    	 System.out.println("Male radio btn is selected = "+maleRadioBtn.isSelected());
	    	 
	    	 
	    	 WebElement  femaleRadioBtn = driver.findElement(By.cssSelector("input#radio2"));
	    	 
	    	 femaleRadioBtn.click();
	    	 
	    	 System.out.println("Female radio btn is selected = "+femaleRadioBtn.isSelected());
	    	 
	    	 WebElement  orangeCheckbox = driver.findElement(By.cssSelector("input#checkbox1"));
	    	 
	    	 System.out.println("Orange checkbox is selected = "+orangeCheckbox.isSelected());
	    	 
	    	 
	    	 WebElement  blueCheckbox = driver.findElement(By.cssSelector("input#checkbox2"));
	    	 
	    	 System.out.println("blueCheckbox  is selected = "+blueCheckbox.isSelected());
	    	 
	    	System.out.println("manisha");
	    	 
	    	 
	    	 
	    	 
	}

}
