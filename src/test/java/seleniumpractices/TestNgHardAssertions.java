package seleniumpractices;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgHardAssertions {
	
	@Test
	public void verifyValidLogin()
	{
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/test/newtours/index.php");
			
			WebElement userNameTextField = driver.findElement(By.xpath("//input[@name='userName']"));
			
			WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='password']"));
			
			WebElement submitBtn = driver.findElement(By.xpath("//input[@name='submit']"));
			
			
			userNameTextField.sendKeys("Admin");
			passwordTextField.sendKeys("Admin");
			submitBtn.click();
			
			WebElement loginSuccessfulMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
			
			String loginSuccMsgText = loginSuccessfulMsg.getText();
			
			
			
			assertEquals(loginSuccMsgText,"Login Successfully");
			
			assertTrue(loginSuccMsgText.equals("Login Successfully"));
			
			WebElement copyeriteYear=driver.findElement(By.xpath("//div[contains(text(),'2005')]"));
			
			 String msg = copyeriteYear.getText();
			 
			 String a[]=msg.split(" ");
			 
			 System.out.println("copywrite year=" + a[1].replace(",",""));
			 
			assertNotEquals(a[1].replace(",",""), "2004");
			
			assertFalse(a[1].replace(",","").equals("2024"));
			
			
			
			
	}

}
