package seleniumpractices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTestPlan()
	{
		System.out.println("Before test plan");
	}
	
	@AfterTest
	public void aftearTestPlan()
	{
		System.out.println("After test plan");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method");
	}
	
	@Test
	public void verifyValidLogin()
	{
		System.out.println("Test case");
	}
	

}
