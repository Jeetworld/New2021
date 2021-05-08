package testNG;

import org.testng.annotations.Test;

public class fifthClass {

	@Test
	public void fifthMethod1()
	{
		
		System.out.println("first method of fifth class executed!!");
	}
	
	@Test(groups= {"firstGroup"})
	public void fifthMethod2()
	{
		
		System.out.println("second method of fifth class executed!!");
	}
	
	
}
