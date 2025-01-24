package newtours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	//webdriver instance member
	WebDriver driver;
	
	//webelements instance members
	WebElement userNameTextField;
	WebElement passwordTextField;
	WebElement submitBtn;
	
	//constructor to initialize driver
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
	}

    //webelement related getter method
	public WebElement getUserNameTextField() {
		return driver.findElement(By.xpath("//input[@name='username']"));
	}


	public WebElement getPasswordTextField() {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}


	public WebElement getSubmitBtn() {
		return driver.findElement(By.xpath("//input[@name='submit']"));
	}
	
	//webelements related method
	public void setUserNameTextField(String username) {
		getUserNameTextField().sendKeys(username);
		
	}
	public void setpasswordTextField(String password) {
		getPasswordTextField().sendKeys(password);
		
	}
	
	public void clickOnSubmitBtn()
	{
		getSubmitBtn().click();
	}

}
