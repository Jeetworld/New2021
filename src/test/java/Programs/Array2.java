package Programs;

import java.util.Scanner;

public class Array2 {
	
	
	
	
	//find the specific number in array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,2,5};
		
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		boolean result =false;
		
		for(int number : arr)
		{
			if(number == num)
			{
				result =true;
				//System.out.println("Yes there is a number");
				
				
			}
					
			
		}
		
		if(result==true)
			System.out.println("Your number is there");
		else
			System.out.println("sorry");
		
		
		
		
		

	}

}
