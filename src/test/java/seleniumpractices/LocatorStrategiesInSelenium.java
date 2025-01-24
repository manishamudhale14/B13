package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStrategiesInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement userNameTextBox = driver.findElement(By.name("userid"));
		
		userNameTextBox.sendKeys("welcome to codemind");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		
		textAreaField.sendKeys("by using id locator strategy");
		
		WebElement title=driver.findElement(By.className("title"));
		
		System.out.println(title.getText());
		
	//	WebElement selenium143Link = driver.findElement(By.linkText("http://www.Selenium143.blogspot.com"));
		
	//	selenium143Link.click();
		
		
        WebElement selenium143Link = driver.findElement(By.partialLinkText("Selenium143.blogspot.com"));
		
		selenium143Link.click();
		
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		
		System.out.println("Number of buttons = " +buttons.size());
		
		
		
	}

}
