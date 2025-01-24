package newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSuccessPage {
	
	
	//webdriver reference variable
	WebDriver driver;
	
	WebElement loginsuccessfullyMsg;
	WebElement copyrightTextMsg;
	
	public LoginSuccessPage(WebDriver driver) { 
		
	  this.driver = driver; 
       
	}

	public WebElement getLoginsuccessfullyMsg() {
		return driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	}
	
	public String  getLoginSuccessfullyMsgText() {
		 return getLoginsuccessfullyMsg().getText();
	}

	public WebElement getCopyrightTextMsg() {
		return driver.findElement(By.xpath("//div[contains(text(),'2005')]"));
	}
	
	public String getCopyrightMsgText()
	{
		return getCopyrightTextMsg().getText();
	}
	
}


