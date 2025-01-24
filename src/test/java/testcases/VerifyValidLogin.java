package testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import Util.Utilities;

import newtours.HomePage;
import newtours.LoginSuccessPage;

public class VerifyValidLogin extends BaseTest {
	HomePage homePage;
    LoginSuccessPage loginSuccessPage;   
		

	

	
	@Test
	public  void VerifyValidLogin () {
		homePage=new HomePage(driver);
		loginSuccessPage=new LoginSuccessPage(driver);
		homePage.setUserNameTextField(Utilities.getProperty("username"));
		homePage.setpasswordTextField(Utilities.getProperty("password"));
		homePage.clickOnSubmitBtn();
	    Assert.assertEquals(loginSuccessPage.getLoginsuccessfullyMsg(), "Login Successfully","Login suvvessfully msg is incorrect");
	    Assert.assertTrue(loginSuccessPage.getCopyrightMsgText().contains("2005"),"copywrite year is incorrect");
	    
		
		
		
		
	}
	
	
	
	

}
