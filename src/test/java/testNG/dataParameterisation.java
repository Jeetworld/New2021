package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataParameterisation {
	
		
	@Test(dataProvider="b")
	public void a(String username, String password)
	{
		System.out.println("username is = "+username);
		System.out.println("password is = "+password);
		
		
	}
	
	@DataProvider
	@Test
	public Object[][] b()
	{
		
		Object[][] obj = new Object[3][2];
		
		obj[0][0]="Nishu";
		obj[0][1]="Kamal";
		
		obj[1][0]="Kamal";
		obj[1][1]="Nishu";
		
		obj[2][0]="Kamal";
		obj[2][1]="JW";
		
		return obj; 
		
	}
	

}
