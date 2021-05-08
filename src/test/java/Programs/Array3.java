package Programs;

import java.util.Scanner;

public class Array3 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {13,45,33};
		
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		
		
	for(int i =0 ; i< arr.length ; i++)
	{
		
		
		if(num==arr[i])
		{
			System.out.println("index is "+i);
			
		}
	}
	


	}

}
