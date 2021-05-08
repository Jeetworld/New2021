package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstClass {
	
	
	@Test
	public void MobilefirstClassMethod1()
	{
		
			System.out.println("firstClassMethod1 execued by TestNG by JW");
		
		
	}
	
	
	@BeforeTest
	public void beforeClassMethod()
	{
		
		System.out.println("****************BeforeTest : executed before first and second class!!****************");
		
		
	}
	
	@AfterTest
	public void afterClassMethod()
	{
		
		
		System.out.println("****************AfterTest : executed after first and second class!!****************");
		
	}
	
	
	@Test
	public void MobilefirstClassMethod2()
	{
		
			System.out.println("firstClassMethod2 execued by TestNG by JW");
		
		
	}
	
	@Test
	public void firstClassMethod2()
	{
		
			System.out.println("firstClassMethod2 execued by TestNG");
		
		
	}

}
