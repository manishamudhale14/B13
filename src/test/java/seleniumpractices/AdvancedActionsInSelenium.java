package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvancedActionsInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
    	driver.get("https://www.google.com/");
    	
    	Actions actions = new Actions(driver);
    	
    	WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
    	
    	actions.keyDown(searchBox, Keys.SHIFT).keyDown("m")
    	.keyUp(Keys.SHIFT).keyUp("m").keyDown("d").keyUp("d").build().perform();
    	
    	actions.doubleClick(searchBox).build().perform();
    	
    	actions.contextClick(searchBox).build().perform();
    	
    	actions.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Google apps']"))).build().perform();
    	
    	driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");
    	
    	WebElement sourElement=driver.findElement(By.cssSelector("div#draggable"));
    	
    	WebElement targetElement=driver.findElement(By.cssSelector("div#droppable"));
    	
    	actions.dragAndDrop(sourElement, targetElement).build().perform();

	}

}
