package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sixthClass {
	
		@Parameters({"username"})
		@Test
		public void sixthClassMethod1(String usernamee)
		{
			System.out.println(" 6th class method 1 executed !!"+usernamee);
			
		}
		
		@Test
		public void sixthClassMethod2()
		{
			System.out.println(" 6th class method 2 executed !!");
			
		}
		
		@Test(dependsOnMethods= {"sixthClassMethod2" , "sixthClassMethod1"})
		public void sixthClassMethod3()
		{
			System.out.println(" 6th class method 3 executed !!");
			
		}
		
		@Test(enabled= false)	//use to skip the method
		public void sixthClassMethod4()
		{
			System.out.println(" 6th class method 4 executed !!");
			
		}

}
