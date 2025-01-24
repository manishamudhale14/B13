package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgSoftAssertions {
	
	
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
		
		SoftAssert verify = new SoftAssert();
		
		verify.assertEquals(loginSuccMsgText,"Login Successfully");
		
		verify.assertTrue(loginSuccMsgText.equals("Login Successfully"),"Assert true related assertion failed at line number 42");
		
		WebElement copyeriteYear=driver.findElement(By.xpath("//div[contains(text(),'2005')]"));
		
		 String msg = copyeriteYear.getText();
		 
		 String a[]=msg.split(" ");
		 
		 System.out.println("copywrite year=" + a[1].replace(",",""));
		 
		verify.assertNotEquals(a[1].replace(",",""), "2004");
		
		verify.assertFalse(a[1].replace(",","").equals("2024"));
		
		verify.assertAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}