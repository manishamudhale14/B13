package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementAndFindElementsMethodUse {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement textField = driver.findElement(By.id("ta1"));
	textField.sendKeys("codemind");
	//driver.findElement(By.xpath("//a[@href and @id")).click();
	
	List<WebElement> elements =driver.findElements(By.id("xyz"));
	System.out.println("Number of elements = " +elements.size());
	
	
	List<WebElement> buttons =driver.findElements(By.tagName("button"));
	System.out.println("Number of buttons = " +buttons.size());
	
	}

}
