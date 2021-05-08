package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fourthClass {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method is executed!!");
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method is executed!!");
		
	}
		
	@Test(groups= {"firstGroup"})
	public void first()
	{
		System.out.println("firt method of fourth class is executed!!");
		
	}
	
	@Test
	public void second()
	{
		System.out.println("second method of fourth class is executed!!");
		
	}
	
	@Test
	public void third()
	{
		System.out.println("third method of fourth class is executed!!");
		
	}
	
	
	
}
