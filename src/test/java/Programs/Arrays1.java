package Programs;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Arrays1 {
	
	
	//to sort the array
	
	@Test(enabled = false)
	public static void ab()
	{
		int[] arr = {1,2,3,1,5,55,33,2};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
				
		
	}
	
	@Test
	public void sumofarray()
	{
		
		
		int[] arr = {1,2,3};
		
		int Sum= 0;
		
		for(int i =0 ;i <arr.length ; i++)
		{
			
			Sum = Sum + arr[i];
		}
		
		System.out.println(Sum);
		
		System.out.println(Sum/(arr.length));
	}
	
	
	

}
